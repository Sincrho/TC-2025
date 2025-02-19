package proyectofinal2025.SymbolTable;

import java.util.LinkedList;

public class Function extends ID {
    private LinkedList<Variable> functionParameters;
    
    public Function(String token, Tipos tipoDeDato, Boolean initialized, Boolean used) {
        super(token, tipoDeDato, initialized, used);
    }

    public LinkedList<Variable> getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(LinkedList<Variable> functionParameters) {
        this.functionParameters = functionParameters;
    }

    @Override
    public String toString() {
        return "Function [token=" + token + ", tipoDeDato=" + tipoDeDato + ", inicialized=" + initialized + ", used=" + used + ", parameters=" + functionParameters + "]";
    }
}
