package proyectofinal2025;

import java.util.LinkedList;
import org.antlr.v4.runtime.tree.TerminalNode;

// Paquete que contiene las clases necesarias para usar la tabla de simbolos
import proyectofinal2025.SymbolTable.Function;
import proyectofinal2025.SymbolTable.ID;
import proyectofinal2025.SymbolTable.SymbolTable;
import proyectofinal2025.SymbolTable.Variable;
import proyectofinal2025.SymbolTable.Tipos;

// Paquete de error logger simple
import proyectofinal2025.ErrorHandler.ErrorHandler;

// Importe de las reglas que voy a implementar
import proyectofinal2025.tpfinal2025Parser.ProgramaContext;
import proyectofinal2025.tpfinal2025Parser.BloqueContext;
import proyectofinal2025.tpfinal2025Parser.AsignacionContext;
import proyectofinal2025.tpfinal2025Parser.FactorContext;
import proyectofinal2025.tpfinal2025Parser.DeclaracionContext;
import proyectofinal2025.tpfinal2025Parser.Declarar_funcionContext;
import proyectofinal2025.tpfinal2025Parser.Definir_funcionContext;
import proyectofinal2025.tpfinal2025Parser.Llamar_funcionContext;

// Necesario para manejar declaracion multiple
import proyectofinal2025.tpfinal2025Parser.Declaracion_multipleContext;

// Necesarios para manejo de parametros de funcion
import proyectofinal2025.tpfinal2025Parser.Parametros_de_funcionContext;
import proyectofinal2025.tpfinal2025Parser.ParametroContext;

public class CustomListener extends tpfinal2025BaseListener{

    private SymbolTable symbolTable;
    private ErrorHandler logger;

    public CustomListener() {
        this.symbolTable = SymbolTable.getInstance();
        this.logger = ErrorHandler.getInstance();
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("═════ Inicio Listener ═════");
        this.symbolTable.addNewContext();
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        System.out.println("══════ Fin Listener ═══════");
        System.out.println(symbolTable.toString());
    }

    @Override 
    public void enterBloque(BloqueContext ctx) {
        symbolTable.addNewContext();

        //Manejo del caso de que haya una declaracion de funcion con parametros
        if (!(ctx.getParent() instanceof Definir_funcionContext)) {
            return;
        }

        Definir_funcionContext functionCtx = (Definir_funcionContext) ctx.getParent();
        
        //Obtengo el nombre de la funcion
        String functionToken = functionCtx.ID().getText().toUpperCase();
        ID functionId = symbolTable.searchIDByToken(functionToken);

        //Añadir parametros de la funcion a la tabla de simbolos si los hay 
        addFunctionParametersToSymbolTable(functionId);
    }

    //Funcion auxiliar para el manejo de parametros de la funcion
    private void addFunctionParametersToSymbolTable(ID functionId) {
        if (!(functionId instanceof Function)) {
            return;
        }

        Function function = (Function) functionId;

        for (ID param : function.getFunctionParameters()) {
            param.setInitialized(true);
            symbolTable.addNewID(param);
        }
    }

    @Override 
    public void exitBloque(BloqueContext ctx) { 
        symbolTable.removeContext();
    }

    @Override public void exitAsignacion(AsignacionContext ctx) {
        //Aca debo validar si el ID al que le voy a asignar el valor ya esta presente en el contexto del programa
        String tokenString = ctx.ID().getText().toUpperCase();
        String tokenLine = String.valueOf(ctx.getStop().getLine());

        ID foundId = symbolTable.searchIDByToken(tokenString);

        // Si no lo encuentro
        if (foundId == null) {
            String message = tokenString + "is not declared before use.";
            logger.logError(tokenLine, message);
            return;
        }
        else{
            foundId.setInitialized(true);
        }
    }

    @Override public void exitFactor(FactorContext ctx) { 
        //Aca debo validar si el ID del factor que voy a usar en una operacion aritmetica ya esta presente en el contexto del programa
        TerminalNode idNode = ctx.ID();
        
        // Valido si factor tiene ID 
        if (idNode != null) {
            String tokenString = ctx.ID().getText().toUpperCase();
            String tokenLine = String.valueOf(ctx.getStop().getLine());

            ID foundId = symbolTable.searchIDByToken(tokenString);

            // Si no lo encuentro
            if (foundId == null) {
                String message = tokenString + " is not declared before use.";
                logger.logError(tokenLine, message);
            }
            else{
                if (foundId.isInitialized()) {
                    foundId.setUsed(true);    
                }
                else {
                    String message = tokenString + "is not initialized before use.";
                    logger.logError(tokenLine, message);
                }
            }
        }
    }

    @Override public void exitDeclaracion(DeclaracionContext ctx) {
        //Aca debo validar si el ID ya esta presente en el contexto del programa
        String tipoDatoString = ctx.tipo_de_dato().getText().toUpperCase();
        String tokenString = ctx.ID().getText().toUpperCase();
        String tokenLine = String.valueOf(ctx.getStop().getLine());

        ID foundId = symbolTable.searchIDByTokenLocalContext(tokenString);
        
        if(foundId != null){
            String message = tokenString + "is already declared in this context.";
            logger.logError(tokenLine, message);
        }
        else{
            // Valido si hay declaracion multiple
            Declaracion_multipleContext declaracionMultiple = ctx.declaracion_multiple();
            //Si no hay
            if (declaracionMultiple.getChildCount() == 0) {
                Variable newVariable = new Variable(tokenString, Tipos.valueOf(tipoDatoString), false, false);
                symbolTable.addNewID(newVariable);
            }
            else{
                // Itero hasta llegar a la condicion vacia
                while (declaracionMultiple.getChildCount() != 0) {
                    String primerChild = declaracionMultiple.getChild(0).getText();
                    
                    if (primerChild.equals("=")) {
                        Variable newVariable = new Variable(tokenString, Tipos.valueOf(tipoDatoString), true, false);
                        symbolTable.addNewID(newVariable);    
                    }

                    if (primerChild.equals(",")) {
                        tokenString = declaracionMultiple.ID().getText().toUpperCase();
                        Variable newVariable = new Variable(tokenString, Tipos.valueOf(tipoDatoString), false, false);
                        symbolTable.addNewID(newVariable);    
                    }
                    
                    // Con esto voy recorriendo en profundidad el arbol
                    declaracionMultiple = declaracionMultiple.declaracion_multiple();
                }
            }    
        }
    }

    @Override public void exitDeclarar_funcion(Declarar_funcionContext ctx) {
        //Aca debo validar si la funcion ya esta declarada en el contexto del programa
        String tipoDatoString = ctx.tipo_de_funcion().getText().toUpperCase();
        String tokenString = ctx.ID().getText().toUpperCase();
        String tokenLine = String.valueOf(ctx.getStop().getLine());
        
        //Preparo donde almacenar los parametros
        LinkedList <Variable> functionParametersList = new LinkedList<Variable>();

        ID foundId = symbolTable.searchIDByToken(tokenString);
        
        if(foundId != null){
            String message = "Function " + tipoDatoString + " " + tokenString + " is already declared.";
            logger.logError(tokenLine, message);
        }
        else {
            Parametros_de_funcionContext functionParameters = ctx.parametros_de_funcion();
            int childrenCount = functionParameters.getChildCount();
            // Verifico si la funcion tiene parametros
            if (childrenCount > 0) {
                // Cargo el primer parametro
                String parameterTipoDato = functionParameters.tipo_de_dato().getText().toUpperCase();
                String parameterID = functionParameters.ID().getText().toUpperCase();
                Variable functionParameter = new Variable(parameterID, Tipos.valueOf(parameterTipoDato), false, false);
                functionParametersList.add(functionParameter);
                    
                ParametroContext multipleParameters = functionParameters.parametro();
                // Itero sobre los parametros de la funcion hasta que no haya mas parametros
                while (multipleParameters.parametro() != null) {
                    parameterTipoDato = multipleParameters.tipo_de_dato().getText().toUpperCase();
                    parameterID = multipleParameters.ID().getText().toUpperCase();
                    functionParameter = new Variable(parameterID, Tipos.valueOf(parameterTipoDato), false, false);
                    functionParametersList.add(functionParameter);
                    // Con esto recorro en profundidad para encontrar los parametros
                    multipleParameters = multipleParameters.parametro();
                }        
            }

            Function newFunction = new Function(tokenString, Tipos.valueOf(tipoDatoString), false, false);
            newFunction.setFunctionParameters(functionParametersList);
            symbolTable.addNewID(newFunction);
        }
    }

    @Override public void exitDefinir_funcion(Definir_funcionContext ctx) {
        //Aca debo validar si la funcion ya esta definida en el contexto del programa
        String tipoDatoString = ctx.tipo_de_funcion().getText().toUpperCase();
        String tokenString = ctx.ID().getText().toUpperCase();
        String tokenLine = String.valueOf(ctx.getStop().getLine());

        ID foundId = symbolTable.searchIDByToken(tokenString);

        //Checkeo si la funcion ya fue declarada
        if(foundId != null){
            Function foundFunction = (Function) foundId;

            //Checkeo si la funcion ya fue definida
            if(foundFunction.isInitialized()){
                String message = "Function" + tipoDatoString + " " + tokenString + "is already defined.";
                logger.logError(tokenLine, message);
            }
            else {
                foundFunction.setInitialized(true);
            }
            
        }else {
            Parametros_de_funcionContext functionParameters = ctx.parametros_de_funcion();
            //Preparo donde almacenar los parametros
            LinkedList <Variable> functionParametersList = new LinkedList<Variable>();
            
            int childrenCount = functionParameters.getChildCount();

            // Verifico si la funcion tiene parametros
            if (childrenCount > 0) {
                // Cargo el primer parametro
                String parameterTipoDato = functionParameters.tipo_de_dato().getText().toUpperCase();
                String parameterID = functionParameters.ID().getText().toUpperCase();
                Variable functionParameter = new Variable(parameterID, Tipos.valueOf(parameterTipoDato), true, false);
                functionParametersList.add(functionParameter);
                    
                ParametroContext multipleParameters = functionParameters.parametro();
                // Itero sobre los parametros de la funcion hasta que no haya mas parametros
                while (multipleParameters.parametro() != null) {
                    parameterTipoDato = multipleParameters.tipo_de_dato().getText().toUpperCase();
                    parameterID = multipleParameters.ID().getText().toUpperCase();
                    functionParameter = new Variable(parameterID, Tipos.valueOf(parameterTipoDato), true, false);
                    functionParametersList.add(functionParameter);
                    // Con esto recorro en profundidad para encontrar los parametros
                    multipleParameters = multipleParameters.parametro();
                }        
            }

            Function newFunction = new Function(tokenString, Tipos.valueOf(tipoDatoString), true, false);
            newFunction.setFunctionParameters(functionParametersList);
            symbolTable.addNewID(newFunction);
        }
    }

    @Override public void exitLlamar_funcion(Llamar_funcionContext ctx) { 
        //Aca debo validar si la funcion ya esta declarada y definida en el contexto del programa
        String tokenString = ctx.ID().getText().toUpperCase();
        String tokenLine = String.valueOf(ctx.getStop().getLine());

        ID foundId = symbolTable.searchIDByToken(tokenString);
        
        // Verifico si la funcion esta declarada
        if (foundId == null) {
            String message = "Function " + tokenString + "is not declared.";
            logger.logError(tokenLine, message);

        }
        else {
            foundId.setUsed(true);    
        }
    }
}
