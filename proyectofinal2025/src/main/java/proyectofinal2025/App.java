package proyectofinal2025;

//import org.antlr.v4.runtime.tree.ParseTree;

//import proyectofinal2025.ErrorHandler.ErrorHandler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
// import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Inicializo CharStream que lee el archivo de entrada
        CharStream input = CharStreams.fromFileName("src/codigo_entrada.txt");

        System.out.println(input);
        
        // Inicializo lexer que se alimenta del CharStream de entrada
        // programafinaltc2024Lexer lexer = new programafinaltc2024Lexer(input);
        
        // Inicializo buffer de tokens a partir del lexer
        // CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Inicializo parser que toma las tokens del buffer
        // programafinaltc2024Parser parser = new programafinaltc2024Parser(tokens);
                
        // Inicializo mi CustomListener
        // programafinaltc2024BaseListener escucha = new CustomListener();

        // Conecto el Listener al parser
        // parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // ParseTree tree =  parser.programa();

        //ErrorHandler logger = ErrorHandler.getInstance();
        // Boolean errorListener = logger.isErrorFound();

        // if (!errorListener){
        //     System.out.println("No hubo errores en la etapa de listener");
        //     CustomVisitor visitante = new CustomVisitor();
        //     visitante.visit(tree);
        //     //visitante.generateIntermediateCode();
        // }  

        // Visualizar el arbol en numeros enteros
        //System.out.println(tree.toStringTree());
        // Visualizar el arbol en modo texto
        //System.out.println(tree.toStringTree(parser));


    }
}
