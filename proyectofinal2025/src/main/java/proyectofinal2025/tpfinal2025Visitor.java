// Generated from c:/Users/Santiago/Desktop/Personal/Finales 2025/TC 2025/proyectofinal2025/src/main/java/proyectofinal2025/tpfinal2025.g4 by ANTLR 4.13.1
 
package proyectofinal2025;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tpfinal2025Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tpfinal2025Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(tpfinal2025Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(tpfinal2025Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(tpfinal2025Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(tpfinal2025Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(tpfinal2025Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(tpfinal2025Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#declaracion_multiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_multiple(tpfinal2025Parser.Declaracion_multipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#declarar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarar_funcion(tpfinal2025Parser.Declarar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#definir_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinir_funcion(tpfinal2025Parser.Definir_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#estructura_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_if(tpfinal2025Parser.Estructura_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#estructura_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_while(tpfinal2025Parser.Estructura_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#estructura_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_for(tpfinal2025Parser.Estructura_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(tpfinal2025Parser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(tpfinal2025Parser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#tipo_de_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_dato(tpfinal2025Parser.Tipo_de_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#operacion_al}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion_al(tpfinal2025Parser.Operacion_alContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(tpfinal2025Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(tpfinal2025Parser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(tpfinal2025Parser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(tpfinal2025Parser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tpfinal2025Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_funcion(tpfinal2025Parser.Tipo_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#parametros_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_de_funcion(tpfinal2025Parser.Parametros_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(tpfinal2025Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(tpfinal2025Parser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#operador_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_comparacion(tpfinal2025Parser.Operador_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#operador_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_logico(tpfinal2025Parser.Operador_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#struct_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_for(tpfinal2025Parser.Struct_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#incrementar_decrementar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementar_decrementar(tpfinal2025Parser.Incrementar_decrementarContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#incrementar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementar(tpfinal2025Parser.IncrementarContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#decrementar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementar(tpfinal2025Parser.DecrementarContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#argumentos_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_de_funcion(tpfinal2025Parser.Argumentos_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tpfinal2025Parser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(tpfinal2025Parser.ArgumentoContext ctx);
}