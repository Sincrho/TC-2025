package proyectofinal2025.SymbolTable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SymbolTable {
    private static SymbolTable instance;

    private LinkedList <HashMap <String, ID>> workingTable;
    private LinkedList <HashMap <String, ID>> fullTable;

    public static SymbolTable getInstance() {
        if (instance == null){
            instance = new SymbolTable();
        }
        return instance;
    }

    private SymbolTable() {
        workingTable = new LinkedList <HashMap <String, ID>>();
        fullTable = new LinkedList <HashMap <String, ID>>();
    }

    public void addNewContext() {
        HashMap <String, ID> newContext = new HashMap <String, ID>();
        workingTable.add(newContext);  
        fullTable.add(newContext);  
    }

    public void removeContext() {
        workingTable.removeLast();    
    }

    public int getContextCount() {
        return workingTable.size();
    }

    public void addNewID(ID id) {
        HashMap <String, ID> currentWorkingContext =  workingTable.getLast();
        HashMap <String, ID> lastContext =  fullTable.getLast();

        currentWorkingContext.put(id.getToken(), id);
        lastContext.put(id.getToken(), id);
    }

    public ID searchIDByToken(String token) {
        // Encontrar el ID que se busca en base a su token
        for(Map<String, ID> contextMap : workingTable) {
            if(contextMap.containsKey(token)) {
                return contextMap.get(token);
            }
        }
        // Si no se encuentra retornar null 
        return null;
    }

    public ID searchIDByTokenLocalContext(String token) {
        HashMap <String, ID> lastContext =  fullTable.getLast();
        // Encontrar el ID que se busca en base a su token
        if(lastContext.containsKey(token)) {
                return lastContext.get(token);
        }
        // Si no se encuentra retornar null 
        return null;
    }

    @Override
    public String toString() {
        StringBuilder currentWorkingTableString = new StringBuilder();
        currentWorkingTableString.append("════ Tabla de Simbolos ════\n");

        for(int contextIndex = 0; contextIndex < getContextCount(); contextIndex++){
            currentWorkingTableString.append("Context " + (contextIndex+1) + ": \n" + "{ \n");
            HashMap <String, ID> context = workingTable.get(contextIndex);
            for(ID id : context.values()){
                currentWorkingTableString.append("\t" + id.toString() + "\n");
            }

            currentWorkingTableString.append("} \n");
        }

        return currentWorkingTableString.toString();
    }
}
