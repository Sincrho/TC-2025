package proyectofinal2025.SymbolTable;

public abstract class ID {
    protected String token;
    protected Tipos tipoDeDato;
    protected Boolean initialized;
    protected Boolean used;
    
    public ID(String token, Tipos tipoDeDato, Boolean initialized, Boolean used) {
        this.token = token;
        this.tipoDeDato = tipoDeDato;
        this.initialized = initialized;
        this.used = used;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Tipos getTipoDeDato() {
        return tipoDeDato;
    }

    public void setTipoDeDato(Tipos tipoDeDato) {
        this.tipoDeDato = tipoDeDato;
    }

    public Boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }

    public Boolean isUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "ID [token=" + token + ", tipoDeDato=" + tipoDeDato + ", inicialized=" + initialized + ", used=" + used + "]";
    }
}
