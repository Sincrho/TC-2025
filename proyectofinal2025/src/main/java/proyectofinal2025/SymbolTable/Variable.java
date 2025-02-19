package proyectofinal2025.SymbolTable;

public class Variable extends ID {

    public Variable(String token, Tipos tipoDeDato, Boolean initialized, Boolean used) {
        super(token, tipoDeDato, initialized, used);
    }

    @Override
    public String toString() {
        return "Variable [token=" + token + ", tipoDeDato=" + tipoDeDato + ", inicialized=" + initialized + ", used=" + used + "]";
    }

    
}
