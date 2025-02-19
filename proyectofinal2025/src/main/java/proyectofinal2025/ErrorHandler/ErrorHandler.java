package proyectofinal2025.ErrorHandler;

public class ErrorHandler {
    private static ErrorHandler instance;
    private Boolean errorFound = false;

    public static ErrorHandler getInstance() {
        if (instance == null){
            instance = new ErrorHandler();
        }
        return instance;
    }
    
    private ErrorHandler() {}

    public void logError(String errorLine, String errorDescription){
        errorFound = true;
        System.out.println("[ERROR] [Line " + errorLine + "] - Description: " + errorDescription);
    }

    public Boolean isErrorFound() {
        return errorFound;
    }
}
