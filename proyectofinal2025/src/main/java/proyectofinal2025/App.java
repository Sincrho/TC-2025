package proyectofinal2025;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import proyectofinal2025.ErrorHandler.ErrorHandler;


public class App {
    public static void main(String[] args) throws Exception {
        // Inicializo CharStream que lee el archivo de entrada
        CharStream input = CharStreams.fromFileName("src/codigo_entrada.txt");

        // Logeo del texto de entrada 
        //System.out.println(input);
        
        // Inicializo lexer que se alimenta del CharStream de entrada
        tpfinal2025Lexer lexer = new tpfinal2025Lexer(input);
        
        // Inicializo buffer de tokens a partir del lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Inicializo parser que toma las tokens del buffer
        tpfinal2025Parser parser = new tpfinal2025Parser(tokens);
                
        // Inicializo mi CustomListener
        tpfinal2025BaseListener escucha = new CustomListener();

        // Conecto el Listener al parser
        parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        ParseTree tree =  parser.programa();

        // Incializo el logger de errores
        ErrorHandler logger = ErrorHandler.getInstance();
        Boolean errorListener = logger.isErrorFound();

        if (!errorListener){
            System.out.println("No hubo errores en la etapa de listener");
            //CustomVisitor visitante = new CustomVisitor();
            //visitante.visit(tree);
            //visitante.generateIntermediateCode();
        }  

        // Visualizar el arbol en numeros enteros
        System.out.println("════ Arbol en numeros ═════\n");
        System.out.println(tree.toStringTree());
        System.out.println("═══════════════════════════\n");

        // Visualizar el arbol en modo texto
        System.out.println("═════ Arbol en texto ══════\n");
        System.out.println(tree.toStringTree(parser));
        System.out.println("═══════════════════════════\n");
    }
}
