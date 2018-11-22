// Generated from C:/Users/camilo/IdeaProjects/Psicoder-antlr/grammar\Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsicoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsicoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(PsicoderParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#funcion_principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion_principal(PsicoderParser.Funcion_principalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PsicoderParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#retornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornar(PsicoderParser.RetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(PsicoderParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(PsicoderParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(PsicoderParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PsicoderParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(PsicoderParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(PsicoderParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(PsicoderParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#si_no}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_no(PsicoderParser.Si_noContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(PsicoderParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#asignacion_entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_entero(PsicoderParser.Asignacion_enteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#hacer_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras(PsicoderParser.Hacer_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(PsicoderParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#seleccionar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar(PsicoderParser.SeleccionarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(PsicoderParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(PsicoderParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#asignacion_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_id(PsicoderParser.Asignacion_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#leer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeer(PsicoderParser.LeerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(PsicoderParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#romper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRomper(PsicoderParser.RomperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#llamar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamar_funcion(PsicoderParser.Llamar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#pasar_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasar_parametros(PsicoderParser.Pasar_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#expresion_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica(PsicoderParser.Expresion_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#expresion_rop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_rop(PsicoderParser.Expresion_ropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#expresion_roi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_roi(PsicoderParser.Expresion_roiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PsicoderParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(PsicoderParser.TipoContext ctx);
}