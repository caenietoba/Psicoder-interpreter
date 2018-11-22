// Generated from C:/Users/camilo/IdeaProjects/Psicoder-antlr/grammar\Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsicoderParser}.
 */
public interface PsicoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(PsicoderParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(PsicoderParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void enterFuncion_principal(PsicoderParser.Funcion_principalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#funcion_principal}.
	 * @param ctx the parse tree
	 */
	void exitFuncion_principal(PsicoderParser.Funcion_principalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PsicoderParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PsicoderParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#retornar}.
	 * @param ctx the parse tree
	 */
	void enterRetornar(PsicoderParser.RetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#retornar}.
	 * @param ctx the parse tree
	 */
	void exitRetornar(PsicoderParser.RetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(PsicoderParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(PsicoderParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PsicoderParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PsicoderParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(PsicoderParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(PsicoderParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(PsicoderParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(PsicoderParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(PsicoderParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(PsicoderParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#si_no}.
	 * @param ctx the parse tree
	 */
	void enterSi_no(PsicoderParser.Si_noContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#si_no}.
	 * @param ctx the parse tree
	 */
	void exitSi_no(PsicoderParser.Si_noContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(PsicoderParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(PsicoderParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#asignacion_entero}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_entero(PsicoderParser.Asignacion_enteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#asignacion_entero}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_entero(PsicoderParser.Asignacion_enteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void enterHacer_mientras(PsicoderParser.Hacer_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#hacer_mientras}.
	 * @param ctx the parse tree
	 */
	void exitHacer_mientras(PsicoderParser.Hacer_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(PsicoderParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(PsicoderParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar(PsicoderParser.SeleccionarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#seleccionar}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar(PsicoderParser.SeleccionarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasos(PsicoderParser.CasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasos(PsicoderParser.CasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#asignacion_id}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_id(PsicoderParser.Asignacion_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#asignacion_id}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_id(PsicoderParser.Asignacion_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#leer}.
	 * @param ctx the parse tree
	 */
	void enterLeer(PsicoderParser.LeerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#leer}.
	 * @param ctx the parse tree
	 */
	void exitLeer(PsicoderParser.LeerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(PsicoderParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(PsicoderParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#romper}.
	 * @param ctx the parse tree
	 */
	void enterRomper(PsicoderParser.RomperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#romper}.
	 * @param ctx the parse tree
	 */
	void exitRomper(PsicoderParser.RomperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamar_funcion(PsicoderParser.Llamar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#llamar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamar_funcion(PsicoderParser.Llamar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#pasar_parametros}.
	 * @param ctx the parse tree
	 */
	void enterPasar_parametros(PsicoderParser.Pasar_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#pasar_parametros}.
	 * @param ctx the parse tree
	 */
	void exitPasar_parametros(PsicoderParser.Pasar_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica(PsicoderParser.Expresion_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#expresion_logica}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica(PsicoderParser.Expresion_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#expresion_rop}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_rop(PsicoderParser.Expresion_ropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#expresion_rop}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_rop(PsicoderParser.Expresion_ropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#expresion_roi}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_roi(PsicoderParser.Expresion_roiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#expresion_roi}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_roi(PsicoderParser.Expresion_roiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(PsicoderParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(PsicoderParser.TipoContext ctx);
}