// Generated from c:/Users/Santiago/Desktop/Personal/Finales 2025/TC 2025/proyectofinal2025/src/main/java/proyectofinal2025/tpfinal2025.g4 by ANTLR 4.13.1
 
package proyectofinal2025;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tpfinal2025Parser}.
 */
public interface tpfinal2025Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(tpfinal2025Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(tpfinal2025Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(tpfinal2025Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(tpfinal2025Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(tpfinal2025Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(tpfinal2025Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(tpfinal2025Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(tpfinal2025Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(tpfinal2025Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(tpfinal2025Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(tpfinal2025Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(tpfinal2025Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#declaracion_multiple}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_multiple(tpfinal2025Parser.Declaracion_multipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#declaracion_multiple}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_multiple(tpfinal2025Parser.Declaracion_multipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#declarar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclarar_funcion(tpfinal2025Parser.Declarar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#declarar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclarar_funcion(tpfinal2025Parser.Declarar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#definir_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinir_funcion(tpfinal2025Parser.Definir_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#definir_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinir_funcion(tpfinal2025Parser.Definir_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#estructura_if}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_if(tpfinal2025Parser.Estructura_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#estructura_if}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_if(tpfinal2025Parser.Estructura_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#estructura_while}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_while(tpfinal2025Parser.Estructura_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#estructura_while}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_while(tpfinal2025Parser.Estructura_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#estructura_for}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_for(tpfinal2025Parser.Estructura_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#estructura_for}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_for(tpfinal2025Parser.Estructura_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(tpfinal2025Parser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(tpfinal2025Parser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(tpfinal2025Parser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(tpfinal2025Parser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_dato(tpfinal2025Parser.Tipo_de_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#tipo_de_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_dato(tpfinal2025Parser.Tipo_de_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#operacion_al}.
	 * @param ctx the parse tree
	 */
	void enterOperacion_al(tpfinal2025Parser.Operacion_alContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#operacion_al}.
	 * @param ctx the parse tree
	 */
	void exitOperacion_al(tpfinal2025Parser.Operacion_alContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(tpfinal2025Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(tpfinal2025Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(tpfinal2025Parser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(tpfinal2025Parser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(tpfinal2025Parser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(tpfinal2025Parser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(tpfinal2025Parser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(tpfinal2025Parser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tpfinal2025Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tpfinal2025Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_funcion(tpfinal2025Parser.Tipo_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_funcion(tpfinal2025Parser.Tipo_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#parametros_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_de_funcion(tpfinal2025Parser.Parametros_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#parametros_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_de_funcion(tpfinal2025Parser.Parametros_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(tpfinal2025Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(tpfinal2025Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(tpfinal2025Parser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(tpfinal2025Parser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#operador_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterOperador_comparacion(tpfinal2025Parser.Operador_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#operador_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitOperador_comparacion(tpfinal2025Parser.Operador_comparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_logico(tpfinal2025Parser.Operador_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#operador_logico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_logico(tpfinal2025Parser.Operador_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#struct_for}.
	 * @param ctx the parse tree
	 */
	void enterStruct_for(tpfinal2025Parser.Struct_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#struct_for}.
	 * @param ctx the parse tree
	 */
	void exitStruct_for(tpfinal2025Parser.Struct_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#incrementar_decrementar}.
	 * @param ctx the parse tree
	 */
	void enterIncrementar_decrementar(tpfinal2025Parser.Incrementar_decrementarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#incrementar_decrementar}.
	 * @param ctx the parse tree
	 */
	void exitIncrementar_decrementar(tpfinal2025Parser.Incrementar_decrementarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#incrementar}.
	 * @param ctx the parse tree
	 */
	void enterIncrementar(tpfinal2025Parser.IncrementarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#incrementar}.
	 * @param ctx the parse tree
	 */
	void exitIncrementar(tpfinal2025Parser.IncrementarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#decrementar}.
	 * @param ctx the parse tree
	 */
	void enterDecrementar(tpfinal2025Parser.DecrementarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#decrementar}.
	 * @param ctx the parse tree
	 */
	void exitDecrementar(tpfinal2025Parser.DecrementarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#argumentos_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_de_funcion(tpfinal2025Parser.Argumentos_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#argumentos_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_de_funcion(tpfinal2025Parser.Argumentos_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tpfinal2025Parser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(tpfinal2025Parser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tpfinal2025Parser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(tpfinal2025Parser.ArgumentoContext ctx);
}