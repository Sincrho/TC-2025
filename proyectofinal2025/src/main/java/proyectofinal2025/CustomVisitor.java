package proyectofinal2025;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import proyectofinal2025.tpfinal2025Parser.ArgumentoContext;
import proyectofinal2025.tpfinal2025Parser.Argumentos_de_funcionContext;
import proyectofinal2025.tpfinal2025Parser.AsignacionContext;
import proyectofinal2025.tpfinal2025Parser.BloqueContext;
import proyectofinal2025.tpfinal2025Parser.DeclaracionContext;
import proyectofinal2025.tpfinal2025Parser.Declaracion_multipleContext;
import proyectofinal2025.tpfinal2025Parser.Definir_funcionContext;
import proyectofinal2025.tpfinal2025Parser.Parametros_de_funcionContext;
import proyectofinal2025.tpfinal2025Parser.ParametroContext;
import proyectofinal2025.tpfinal2025Parser.Estructura_forContext;
import proyectofinal2025.tpfinal2025Parser.Estructura_ifContext;
import proyectofinal2025.tpfinal2025Parser.Estructura_whileContext;
import proyectofinal2025.tpfinal2025Parser.ExpresionContext;
import proyectofinal2025.tpfinal2025Parser.InstruccionContext;
import proyectofinal2025.tpfinal2025Parser.InstruccionesContext;
import proyectofinal2025.tpfinal2025Parser.Llamar_funcionContext;
import proyectofinal2025.tpfinal2025Parser.Operacion_alContext;
import proyectofinal2025.tpfinal2025Parser.ComparacionContext;
import proyectofinal2025.tpfinal2025Parser.ProgramaContext;
import proyectofinal2025.tpfinal2025Parser.RetornoContext;

public class CustomVisitor extends tpfinal2025BaseVisitor{
    // Variables para la generacion de labels
    private int labelsIndex = 0;
    private int tempVarsIndex = 0;

    // Guardado temporal de los labels en medio de una tarea
    private Stack<String> tempLabelStack = new Stack<String>(); 
    private Stack<String> tempVariableStack = new Stack<String>();

    // Mapeo de las funciones a sus labels
    Map<String, String> functionMap = new HashMap<String,String>();

    // Guardado del codigo que se ira generando
    private Stack<String> codeStack = new Stack<String>();

    // Texto final con el codigo generado
    private String finalCode = "";

    public CustomVisitor(){}


    @Override
    public String visitPrograma(ProgramaContext ctx) {
        System.out.println("══════ Inicio Visitor ══════");
        visitAllChildren(ctx);
        return finalCode;
    }

    @Override
    public String visitInstrucciones(InstruccionesContext ctx) {
        visitAllChildren(ctx.getRuleContext());
        return finalCode;
    }

    @Override
    public String visitInstruccion(InstruccionContext ctx) {
        visitAllChildren(ctx);
        return finalCode;
    }

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        String asignacionID = ctx.ID().getText();
        String asignacionASIGNACION = ctx.ASIGNACION().getText();
        
        System.out.println("Entro a asignacion para " + asignacionID);

        visitAllChildren(ctx);
        String operationString = tempVariableStack.pop();

        finalCode = finalCode + asignacionID + " " + asignacionASIGNACION + " " + operationString + "\n";

        return finalCode;
    }

    @Override
    public String visitBloque(BloqueContext ctx) {
        visitAllChildren(ctx);
        return finalCode;
    }

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        String declaracionID = ctx.ID().getText();

        codeStack.push(declaracionID);
        tempVariableStack.push(declaracionID);

        if(ctx.declaracion_multiple() != null){
            visit(ctx.declaracion_multiple());
        }
        
        saveFinalCode();
        codeStack.pop();
        codeStack.pop();

        return finalCode;
    }

    @Override
    public String visitDeclaracion_multiple(Declaracion_multipleContext ctx) {
        if(ctx.ASIGNACION() != null){
            String tempVarName = "t" + tempVarsIndex;
            tempVarsIndex++;
            codeStack.push(tempVarName);
            
            String declaracionMultipleASIGNACION = ctx.ASIGNACION().getText();
            codeStack.push(declaracionMultipleASIGNACION);
            tempVariableStack.push(declaracionMultipleASIGNACION);
            
            if (ctx.operacion_al() != null) {
                visit(ctx.operacion_al());    
            }

            tempVariableStack.push(tempVarName);

            if(ctx.declaracion_multiple() != null  && ctx.declaracion_multiple().getChildCount() > 0){
                visit(ctx.declaracion_multiple());
            }
        }

        if(ctx.COMA() != null){
            saveFinalCode();
            String declaracionMultipleID = ctx.ID().getText();
            codeStack.push(declaracionMultipleID);
            tempVariableStack.push(declaracionMultipleID);
            visit(ctx.declaracion_multiple());
        }

        return finalCode;
    }

    @Override
    public String visitDefinir_funcion(Definir_funcionContext ctx) {
        
        //Genero un nuevo label para luego guardarlo con el nombre de la funcion
        String functionLabel = "l" + labelsIndex++;
        String functionName = ctx.ID().getText();
        
        System.out.println("Entro a definir funcion para " + functionName);

        functionMap.put(functionName, functionLabel);

        String tempVarName = "t" + tempVarsIndex;
        tempVarsIndex++;

        tempVariableStack.push(tempVarName);
        codeStack.push(tempVarName);
        
        finalCode = finalCode + "label " + functionLabel + "\n";

        if(!tempVariableStack.isEmpty()){
            tempVariableStack.pop();
        }

        if (codeStack.size() < 2) {
            System.out.println("Error: La pila codigo no tiene suficientes elementos");
            return finalCode;
        }
        
        String tempCode = codeStack.pop();
        visitAllChildren(ctx);

        finalCode = finalCode + "pop " + tempCode + "\n";
        
        return finalCode;
    }

    @Override
    public String visitParametros_de_funcion(Parametros_de_funcionContext ctx) {
        
        if(ctx.ID() != null){
            String parametroID = ctx.ID().getText();
            String tempVarName = "t" + tempVarsIndex;
            tempVarsIndex++;
            
            finalCode = finalCode + tempVarName + " = " + parametroID + "\n";
            
            if(ctx.parametro() != null){
                visit(ctx.parametro());
            }
                
        }

        return finalCode;
    }

    @Override
    public String visitParametro(ParametroContext ctx) {
        
        if(ctx.ID() != null){
            String parametroID = ctx.ID().getText();
            String tempVarName = "t" + tempVarsIndex;
            tempVarsIndex++;
            
            finalCode = finalCode + tempVarName + " = " + parametroID + "\n";
            
            if(ctx.parametro() != null){
                visit(ctx.parametro());
            }
                
        }

        return finalCode;
    }

    @Override
    public Object visitEstructura_if(Estructura_ifContext ctx) {
        if (ctx.comparacion() != null) {
            visit(ctx.comparacion());   
        }

        String ifLabel = "l" + labelsIndex++;
        tempLabelStack.push(ifLabel);

        String tempCode = codeStack.pop();

        finalCode = finalCode + "ifnjmp " + tempCode + ", " + ifLabel + "\n";

        if (ctx.bloque() != null) {
            visit(ctx.bloque());   
        }

        String tempLabel = tempLabelStack.pop();
        finalCode = finalCode + "label "+ tempLabel + "\n";
        
        return finalCode;
    }

    @Override
    public Object visitEstructura_while(Estructura_whileContext ctx) {
        String inWhileLabel = "l" + labelsIndex++;
        String outWhileLabel = "l" + labelsIndex++;

        finalCode = finalCode + "label " + inWhileLabel + "\n";

        if(ctx.comparacion() != null){
            visit(ctx.comparacion());
        }

        String tempCode = codeStack.pop();

        finalCode = finalCode + "ifnjmp " + tempCode + ", " + outWhileLabel + "\n";
        
        if(ctx.bloque() != null){
            visit(ctx.bloque());
        }

        finalCode = finalCode + "jmp " + inWhileLabel + "\n";
        finalCode = finalCode + "label " + outWhileLabel + "\n";
                
        return finalCode;
    }

    @Override
    public Object visitEstructura_for(Estructura_forContext ctx) {
        String inForLabel = "l" + labelsIndex++;
        String outForLabel = "l" + labelsIndex++;

        if(ctx.struct_for() != null){
            visit(ctx.struct_for());
        }

        finalCode = finalCode + "label " + inForLabel + "\n";
        String tempCode = codeStack.pop();

        finalCode = finalCode + "ifnjmp " + tempCode + "," + outForLabel + "\n";

        if(ctx.bloque() != null){
            visit(ctx.bloque());
        }

        finalCode = finalCode + "jmp " + inForLabel + "\n";
        finalCode = finalCode + "label " + outForLabel + "\n";
        
        return finalCode;
    }

    @Override
    public Object visitLlamar_funcion(Llamar_funcionContext ctx) {
        // Para pasar argumentos
        visitAllChildren(ctx);

        String functionCallName = ctx.ID().getText();
        String calledFunctionLabel = functionMap.get(functionCallName);

        finalCode = finalCode + "jmp " + calledFunctionLabel + "\n";

        return finalCode;
    }

    @Override
    public String visitArgumentos_de_funcion(Argumentos_de_funcionContext ctx) {
        if(ctx.ID() != null){
            String argumentoID = ctx.ID().getText();            
            finalCode = finalCode + "push " + argumentoID + "\n";
            
            if(ctx.argumento() != null){
                visit(ctx.argumento());
            }
                
        }
        
        if(ctx.NRO_ENTERO() != null){
            String argumentoNroEntero = ctx.NRO_ENTERO().getText();
            finalCode = finalCode + "push " + argumentoNroEntero + "\n";
            
            if(ctx.argumento() != null){
                visit(ctx.argumento());
            }
                
        }

        return finalCode;
    }

    @Override
    public String visitArgumento(ArgumentoContext ctx) {
        if(ctx.ID() != null){
            String argumentoID = ctx.ID().getText();            
            finalCode = finalCode + "push " + argumentoID + "\n";
            
            if(ctx.argumento() != null){
                visit(ctx.argumento());
            }
                
        }
        
        if(ctx.NRO_ENTERO() != null){
            String argumentoNroEntero = ctx.NRO_ENTERO().getText();
            finalCode = finalCode + "push " + argumentoNroEntero + "\n";
            
            if(ctx.argumento() != null){
                visit(ctx.argumento());
            }
                
        }

        return finalCode;
    }

    @Override
    public String visitRetorno(RetornoContext ctx) {
        visitAllChildren(ctx);

        String tempCode = codeStack.pop();
        finalCode = finalCode + "push " + tempCode + "\n";

        return finalCode;
    }

    @Override
    public String visitOperacion_al(Operacion_alContext ctx) {
        String operacionAlText = ctx.getText(); 
        codeStack.push(operacionAlText);
        tempVariableStack.push(operacionAlText);

        return finalCode;
    }

    @Override
    public String visitComparacion(ComparacionContext ctx) {
        String ComparacionText = ctx.getText(); 
        codeStack.push(ComparacionText);
        tempVariableStack.push(ComparacionText);

        return finalCode;
    }

    @Override
    public String visitExpresion(ExpresionContext ctx) {
        visitAllChildren(ctx);
        return finalCode;
    }

    public String getFirstElementText(Collection<ParseTree> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        
        Iterator<ParseTree> iterator = collection.iterator();
        return iterator.hasNext() ? iterator.next().getText() : null;
    }

    public String visitAllChildren(RuleContext ctx){
        int childCount = ctx.getChildCount();

        for(int childIndex = 0; childIndex < childCount; childIndex++){
            visit(ctx.getChild(childIndex));
        }
        
        return finalCode;
    }

    private void saveFinalCode() {
        Deque<String> code = new LinkedList<>();

        //Chequeo que la pila de variables temporales no este vacia
        if(tempVariableStack.isEmpty()){
            System.out.println("Error: La pila de variables temporales esta vacia.");
            return;
        }

        //Chequeo que la pila de codigo no este vacia

        if(codeStack.isEmpty()){
            System.out.println("Error: La pila codigo esta vacia.");
            return;
        }

        
        String tempVar = tempVariableStack.pop();

        while (!codeStack.isEmpty() && !tempVar.equals(codeStack.lastElement())) {
            code.addFirst(codeStack.pop());
        }

        String codeString = String.join(" ", code);
        finalCode = finalCode + (tempVar + " " + codeString + "\n");
    }

    @Override
    public String toString() {
        return finalCode;
    }

}
