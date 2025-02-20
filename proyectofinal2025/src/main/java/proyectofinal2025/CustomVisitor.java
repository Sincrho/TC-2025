package proyectofinal2025;

import proyectofinal2025.tpfinal2025Parser.InstruccionContext;

public class CustomVisitor extends tpfinal2025BaseVisitor {

    @Override
    public Object visitInstruccion(InstruccionContext ctx) {
        // TODO Auto-generated method stub
        // System.out.println("----- Instruccion |"+ ctx.getText() +" |-----");
        // System.out.println("----- Instruccion hijos|"+ ctx.getChildCount() +" |-----");
        return super.visitInstruccion(ctx);
    }
    
}
