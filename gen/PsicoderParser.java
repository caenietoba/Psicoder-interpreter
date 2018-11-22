// Generated from C:/Users/camilo/IdeaProjects/Psicoder-antlr/grammar\Psicoder.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		COMMENT=32, LINE_COMMENT=33, WS=34, PIZQ=35, PDER=36, NEG=37, ROI=38, 
		ROP=39, ROL=40, SMCOLON=41, COMA=42, MULOP=43, SUMOP=44, DOUBLE=45, INT=46, 
		STRING=47, BOOLEANO=48, CONST=49, ID=50;
	public static final int
		RULE_s = 0, RULE_funcion_principal = 1, RULE_funcion = 2, RULE_retornar = 3, 
		RULE_parametros = 4, RULE_estructura = 5, RULE_declaracion = 6, RULE_asignacion = 7, 
		RULE_comandos = 8, RULE_comando = 9, RULE_si = 10, RULE_si_no = 11, RULE_para = 12, 
		RULE_asignacion_entero = 13, RULE_hacer_mientras = 14, RULE_mientras = 15, 
		RULE_seleccionar = 16, RULE_casos = 17, RULE_caso = 18, RULE_asignacion_id = 19, 
		RULE_leer = 20, RULE_imprimir = 21, RULE_romper = 22, RULE_llamar_funcion = 23, 
		RULE_pasar_parametros = 24, RULE_expresion_logica = 25, RULE_expresion_rop = 26, 
		RULE_expresion_roi = 27, RULE_expr = 28, RULE_tipo = 29;
	public static final String[] ruleNames = {
		"s", "funcion_principal", "funcion", "retornar", "parametros", "estructura", 
		"declaracion", "asignacion", "comandos", "comando", "si", "si_no", "para", 
		"asignacion_entero", "hacer_mientras", "mientras", "seleccionar", "casos", 
		"caso", "asignacion_id", "leer", "imprimir", "romper", "llamar_funcion", 
		"pasar_parametros", "expresion_logica", "expresion_rop", "expresion_roi", 
		"expr", "tipo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'funcion_principal'", "'fin_principal'", "'funcion'", "'hacer'", 
		"'fin_funcion'", "'retornar'", "'estructura'", "'fin_estructura'", "'='", 
		"'si'", "'entonces'", "'fin_si'", "'si_no'", "'para'", "'fin_para'", "'entero'", 
		"'mientras'", "'fin_mientras'", "'seleccionar'", "'entre'", "'fin_seleccionar'", 
		"'defecto'", "':'", "'caso'", "'leer'", "'imprimir'", "'romper'", "'caracter'", 
		"'cadena'", "'real'", "'booleano'", null, null, null, "'('", "')'", "'!'", 
		null, null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
		"WS", "PIZQ", "PDER", "NEG", "ROI", "ROP", "ROL", "SMCOLON", "COMA", "MULOP", 
		"SUMOP", "DOUBLE", "INT", "STRING", "BOOLEANO", "CONST", "ID"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsicoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public Funcion_principalContext funcion_principal() {
			return getRuleContext(Funcion_principalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PsicoderParser.EOF, 0); }
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__6) {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(60);
					funcion();
					}
					break;
				case T__6:
					{
					setState(61);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			funcion_principal();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__6) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(68);
					funcion();
					}
					break;
				case T__6:
					{
					setState(69);
					estructura();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Funcion_principalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Funcion_principalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterFuncion_principal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitFuncion_principal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitFuncion_principal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcion_principalContext funcion_principal() throws RecognitionException {
		Funcion_principalContext _localctx = new Funcion_principalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			comandos();
			setState(79);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__2);
			setState(82);
			tipo();
			setState(83);
			match(ID);
			setState(84);
			match(PIZQ);
			setState(85);
			parametros();
			setState(86);
			match(PDER);
			setState(87);
			match(T__3);
			setState(88);
			comandos();
			setState(89);
			retornar();
			setState(90);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornarContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__5);
			setState(93);
			expr(0);
			setState(94);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				tipo();
				setState(97);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(98);
					match(COMA);
					setState(99);
					tipo();
					setState(100);
					match(ID);
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__6);
			setState(111);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << ID))) != 0)) {
				{
				{
				setState(112);
				declaracion();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PsicoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsicoderParser.ID, i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			tipo();
			setState(121);
			match(ID);
			setState(122);
			asignacion();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(123);
				match(COMA);
				setState(124);
				match(ID);
				setState(125);
				asignacion();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__8);
				setState(134);
				expr(0);
				}
				break;
			case SMCOLON:
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandos);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				comando();
				setState(139);
				comandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public Hacer_mientrasContext hacer_mientras() {
			return getRuleContext(Hacer_mientrasContext.class,0);
		}
		public SeleccionarContext seleccionar() {
			return getRuleContext(SeleccionarContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Asignacion_idContext asignacion_id() {
			return getRuleContext(Asignacion_idContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				si();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				para();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				mientras();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				hacer_mientras();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				seleccionar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				declaracion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				asignacion_id();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(151);
				leer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				imprimir();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				llamar_funcion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public Expresion_logicaContext expresion_logica() {
			return getRuleContext(Expresion_logicaContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Si_noContext si_no() {
			return getRuleContext(Si_noContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__9);
			setState(157);
			match(PIZQ);
			setState(158);
			expresion_logica(0);
			setState(159);
			match(PDER);
			setState(160);
			match(T__10);
			setState(161);
			comandos();
			setState(162);
			si_no();
			setState(163);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Si_noContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Si_noContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si_no; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSi_no(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSi_no(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSi_no(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Si_noContext si_no() throws RecognitionException {
		Si_noContext _localctx = new Si_noContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_si_no);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__12);
				setState(166);
				comandos();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParaContext extends ParserRuleContext {
		public Expresion_ropContext expresion_rop() {
			return getRuleContext(Expresion_ropContext.class,0);
		}
		public Asignacion_idContext asignacion_id() {
			return getRuleContext(Asignacion_idContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Asignacion_enteroContext asignacion_entero() {
			return getRuleContext(Asignacion_enteroContext.class,0);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__13);
			setState(171);
			match(PIZQ);
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case SMCOLON:
				{
				setState(172);
				asignacion();
				}
				break;
			case T__15:
				{
				setState(173);
				asignacion_entero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(176);
			match(SMCOLON);
			setState(177);
			expresion_rop();
			setState(178);
			match(SMCOLON);
			setState(179);
			asignacion_id();
			setState(180);
			match(PDER);
			setState(181);
			match(T__3);
			setState(182);
			comandos();
			setState(183);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignacion_enteroContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Asignacion_enteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAsignacion_entero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAsignacion_entero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAsignacion_entero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_enteroContext asignacion_entero() throws RecognitionException {
		Asignacion_enteroContext _localctx = new Asignacion_enteroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacion_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__15);
			setState(186);
			asignacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hacer_mientrasContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Expresion_ropContext expresion_rop() {
			return getRuleContext(Expresion_ropContext.class,0);
		}
		public Hacer_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hacer_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterHacer_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitHacer_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitHacer_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hacer_mientrasContext hacer_mientras() throws RecognitionException {
		Hacer_mientrasContext _localctx = new Hacer_mientrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hacer_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__3);
			setState(189);
			comandos();
			setState(190);
			match(T__16);
			setState(191);
			match(PIZQ);
			setState(192);
			expresion_rop();
			setState(193);
			match(PDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public Expresion_ropContext expresion_rop() {
			return getRuleContext(Expresion_ropContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__16);
			setState(196);
			match(PIZQ);
			setState(197);
			expresion_rop();
			setState(198);
			match(PDER);
			setState(199);
			match(T__3);
			setState(200);
			comandos();
			setState(201);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeleccionarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SeleccionarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterSeleccionar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitSeleccionar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitSeleccionar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionarContext seleccionar() throws RecognitionException {
		SeleccionarContext _localctx = new SeleccionarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seleccionar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__18);
			setState(204);
			match(PIZQ);
			setState(205);
			match(ID);
			setState(206);
			match(PDER);
			setState(207);
			match(T__19);
			setState(208);
			casos();
			setState(209);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasosContext extends ParserRuleContext {
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_casos);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				caso();
				setState(212);
				casos();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__21);
				setState(215);
				match(T__22);
				setState(216);
				comandos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public RomperContext romper() {
			return getRuleContext(RomperContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__23);
			setState(220);
			expr(0);
			setState(221);
			match(T__22);
			setState(222);
			comandos();
			setState(223);
			romper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Asignacion_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Asignacion_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterAsignacion_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitAsignacion_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitAsignacion_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_idContext asignacion_id() throws RecognitionException {
		Asignacion_idContext _localctx = new Asignacion_idContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignacion_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ID);
			setState(226);
			match(T__8);
			setState(227);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitLeer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitLeer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__24);
			setState(230);
			match(PIZQ);
			setState(231);
			match(ID);
			setState(232);
			match(PDER);
			setState(233);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__25);
			setState(236);
			match(PIZQ);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(237);
				expr(0);
				}
				break;
			case 2:
				{
				setState(238);
				llamar_funcion();
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(241);
				match(COMA);
				setState(242);
				expr(0);
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(PDER);
			setState(249);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RomperContext extends ParserRuleContext {
		public RomperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_romper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterRomper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitRomper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitRomper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RomperContext romper() throws RecognitionException {
		RomperContext _localctx = new RomperContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_romper);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__26);
				setState(252);
				match(SMCOLON);
				}
				break;
			case T__21:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamar_funcionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public Pasar_parametrosContext pasar_parametros() {
			return getRuleContext(Pasar_parametrosContext.class,0);
		}
		public Llamar_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamar_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterLlamar_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitLlamar_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitLlamar_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamar_funcionContext llamar_funcion() throws RecognitionException {
		Llamar_funcionContext _localctx = new Llamar_funcionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_llamar_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(ID);
			setState(257);
			match(PIZQ);
			setState(258);
			pasar_parametros();
			setState(259);
			match(PDER);
			setState(260);
			match(SMCOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pasar_parametrosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Pasar_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasar_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPasar_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPasar_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitPasar_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pasar_parametrosContext pasar_parametros() throws RecognitionException {
		Pasar_parametrosContext _localctx = new Pasar_parametrosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pasar_parametros);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
			case DOUBLE:
			case INT:
			case STRING:
			case BOOLEANO:
			case CONST:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expr(0);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(263);
					match(COMA);
					setState(264);
					expr(0);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PDER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresion_logicaContext extends ParserRuleContext {
		public Expresion_ropContext expresion_rop() {
			return getRuleContext(Expresion_ropContext.class,0);
		}
		public Expresion_roiContext expresion_roi() {
			return getRuleContext(Expresion_roiContext.class,0);
		}
		public TerminalNode NEG() { return getToken(PsicoderParser.NEG, 0); }
		public List<Expresion_logicaContext> expresion_logica() {
			return getRuleContexts(Expresion_logicaContext.class);
		}
		public Expresion_logicaContext expresion_logica(int i) {
			return getRuleContext(Expresion_logicaContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROL() { return getToken(PsicoderParser.ROL, 0); }
		public Expresion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpresion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpresion_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpresion_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logicaContext expresion_logica() throws RecognitionException {
		return expresion_logica(0);
	}

	private Expresion_logicaContext expresion_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_logicaContext _localctx = new Expresion_logicaContext(_ctx, _parentState);
		Expresion_logicaContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expresion_logica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(274);
				expresion_rop();
				}
				break;
			case 2:
				{
				setState(275);
				expresion_roi();
				}
				break;
			case 3:
				{
				setState(276);
				match(NEG);
				setState(277);
				expresion_logica(2);
				}
				break;
			case 4:
				{
				setState(278);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica);
					setState(281);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(282);
					match(ROL);
					setState(283);
					expresion_logica(6);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_ropContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ROP() { return getToken(PsicoderParser.ROP, 0); }
		public Expresion_ropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_rop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpresion_rop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpresion_rop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpresion_rop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_ropContext expresion_rop() throws RecognitionException {
		Expresion_ropContext _localctx = new Expresion_ropContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresion_rop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr(0);
			setState(290);
			match(ROP);
			setState(291);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresion_roiContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ROI() { return getToken(PsicoderParser.ROI, 0); }
		public Expresion_roiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_roi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpresion_roi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpresion_roi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpresion_roi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_roiContext expresion_roi() throws RecognitionException {
		Expresion_roiContext _localctx = new Expresion_roiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expresion_roi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expr(0);
			setState(294);
			match(ROI);
			setState(295);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(PsicoderParser.PIZQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PDER() { return getToken(PsicoderParser.PDER, 0); }
		public Llamar_funcionContext llamar_funcion() {
			return getRuleContext(Llamar_funcionContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(PsicoderParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(PsicoderParser.INT, 0); }
		public TerminalNode CONST() { return getToken(PsicoderParser.CONST, 0); }
		public TerminalNode STRING() { return getToken(PsicoderParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode BOOLEANO() { return getToken(PsicoderParser.BOOLEANO, 0); }
		public TerminalNode MULOP() { return getToken(PsicoderParser.MULOP, 0); }
		public TerminalNode SUMOP() { return getToken(PsicoderParser.SUMOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(298);
				match(PIZQ);
				setState(299);
				expr(0);
				setState(300);
				match(PDER);
				}
				break;
			case 2:
				{
				setState(302);
				llamar_funcion();
				}
				break;
			case 3:
				{
				setState(303);
				match(DOUBLE);
				}
				break;
			case 4:
				{
				setState(304);
				match(INT);
				}
				break;
			case 5:
				{
				setState(305);
				match(CONST);
				}
				break;
			case 6:
				{
				setState(306);
				match(STRING);
				}
				break;
			case 7:
				{
				setState(307);
				match(ID);
				}
				break;
			case 8:
				{
				setState(308);
				match(BOOLEANO);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(312);
						match(MULOP);
						setState(313);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(315);
						match(SUMOP);
						setState(316);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsicoderVisitor ) return ((PsicoderVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expresion_logica_sempred((Expresion_logicaContext)_localctx, predIndex);
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_logica_sempred(Expresion_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0147\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\5\6o\n\6\3\7\3"+
		"\7\3\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0081"+
		"\n\b\f\b\16\b\u0084\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n"+
		"\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u009d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ab"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00dc\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u00f2\n\27\3\27\3\27\7\27\u00f6\n\27\f\27\16\27\u00f9"+
		"\13\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u0101\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u010c\n\32\f\32\16\32\u010f\13\32\3"+
		"\32\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011a\n\33\3\33"+
		"\3\33\3\33\7\33\u011f\n\33\f\33\16\33\u0122\13\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0138\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0140\n"+
		"\36\f\36\16\36\u0143\13\36\3\37\3\37\3\37\2\4\64: \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\3\5\2\22\22\36!\64\64\2\u0150"+
		"\2B\3\2\2\2\4O\3\2\2\2\6S\3\2\2\2\b^\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16"+
		"z\3\2\2\2\20\u008a\3\2\2\2\22\u0090\3\2\2\2\24\u009c\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00aa\3\2\2\2\32\u00ac\3\2\2\2\34\u00bb\3\2\2\2\36\u00be\3"+
		"\2\2\2 \u00c5\3\2\2\2\"\u00cd\3\2\2\2$\u00db\3\2\2\2&\u00dd\3\2\2\2(\u00e3"+
		"\3\2\2\2*\u00e7\3\2\2\2,\u00ed\3\2\2\2.\u0100\3\2\2\2\60\u0102\3\2\2\2"+
		"\62\u0111\3\2\2\2\64\u0119\3\2\2\2\66\u0123\3\2\2\28\u0127\3\2\2\2:\u0137"+
		"\3\2\2\2<\u0144\3\2\2\2>A\5\6\4\2?A\5\f\7\2@>\3\2\2\2@?\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EJ\5\4\3\2FI\5\6\4\2GI\5\f"+
		"\7\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2"+
		"\2\2MN\7\2\2\3N\3\3\2\2\2OP\7\3\2\2PQ\5\22\n\2QR\7\4\2\2R\5\3\2\2\2ST"+
		"\7\5\2\2TU\5<\37\2UV\7\64\2\2VW\7%\2\2WX\5\n\6\2XY\7&\2\2YZ\7\6\2\2Z["+
		"\5\22\n\2[\\\5\b\5\2\\]\7\7\2\2]\7\3\2\2\2^_\7\b\2\2_`\5:\36\2`a\7+\2"+
		"\2a\t\3\2\2\2bc\5<\37\2cj\7\64\2\2de\7,\2\2ef\5<\37\2fg\7\64\2\2gi\3\2"+
		"\2\2hd\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2ko\3\2\2\2lj\3\2\2\2mo\3\2"+
		"\2\2nb\3\2\2\2nm\3\2\2\2o\13\3\2\2\2pq\7\t\2\2qu\7\64\2\2rt\5\16\b\2s"+
		"r\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\n\2\2"+
		"y\r\3\2\2\2z{\5<\37\2{|\7\64\2\2|\u0082\5\20\t\2}~\7,\2\2~\177\7\64\2"+
		"\2\177\u0081\5\20\t\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\7+\2\2\u0086\17\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u008b\5:\36"+
		"\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0089\3\2\2\2\u008b\21"+
		"\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\22\n\2\u008e\u0091\3\2\2"+
		"\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008f\3\2\2\2\u0091\23"+
		"\3\2\2\2\u0092\u009d\5\26\f\2\u0093\u009d\5\32\16\2\u0094\u009d\5 \21"+
		"\2\u0095\u009d\5\36\20\2\u0096\u009d\5\"\22\2\u0097\u009d\5\16\b\2\u0098"+
		"\u009d\5(\25\2\u0099\u009d\5*\26\2\u009a\u009d\5,\27\2\u009b\u009d\5\60"+
		"\31\2\u009c\u0092\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0094\3\2\2\2\u009c"+
		"\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2"+
		"\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\25\3\2\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\7%\2\2\u00a0\u00a1\5\64\33"+
		"\2\u00a1\u00a2\7&\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5"+
		"\5\30\r\2\u00a5\u00a6\7\16\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\17\2\2\u00a8"+
		"\u00ab\5\22\n\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\20\2\2\u00ad\u00b0\7%\2\2\u00ae"+
		"\u00b1\5\20\t\2\u00af\u00b1\5\34\17\2\u00b0\u00ae\3\2\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7+\2\2\u00b3\u00b4\5\66\34\2"+
		"\u00b4\u00b5\7+\2\2\u00b5\u00b6\5(\25\2\u00b6\u00b7\7&\2\2\u00b7\u00b8"+
		"\7\6\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7\21\2\2\u00ba\33\3\2\2\2\u00bb"+
		"\u00bc\7\22\2\2\u00bc\u00bd\5\20\t\2\u00bd\35\3\2\2\2\u00be\u00bf\7\6"+
		"\2\2\u00bf\u00c0\5\22\n\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\7%\2\2\u00c2"+
		"\u00c3\5\66\34\2\u00c3\u00c4\7&\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\23"+
		"\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\5\66\34\2\u00c8\u00c9\7&\2\2\u00c9"+
		"\u00ca\7\6\2\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\7\24\2\2\u00cc!\3\2\2"+
		"\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7\64\2\2\u00d0"+
		"\u00d1\7&\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\27"+
		"\2\2\u00d4#\3\2\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\5$\23\2\u00d7\u00dc"+
		"\3\2\2\2\u00d8\u00d9\7\30\2\2\u00d9\u00da\7\31\2\2\u00da\u00dc\5\22\n"+
		"\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc%\3\2\2\2\u00dd\u00de"+
		"\7\32\2\2\u00de\u00df\5:\36\2\u00df\u00e0\7\31\2\2\u00e0\u00e1\5\22\n"+
		"\2\u00e1\u00e2\5.\30\2\u00e2\'\3\2\2\2\u00e3\u00e4\7\64\2\2\u00e4\u00e5"+
		"\7\13\2\2\u00e5\u00e6\5:\36\2\u00e6)\3\2\2\2\u00e7\u00e8\7\33\2\2\u00e8"+
		"\u00e9\7%\2\2\u00e9\u00ea\7\64\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec\7+\2"+
		"\2\u00ec+\3\2\2\2\u00ed\u00ee\7\34\2\2\u00ee\u00f1\7%\2\2\u00ef\u00f2"+
		"\5:\36\2\u00f0\u00f2\5\60\31\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f7\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f6\5:\36\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7&\2\2\u00fb\u00fc\7+\2"+
		"\2\u00fc-\3\2\2\2\u00fd\u00fe\7\35\2\2\u00fe\u0101\7+\2\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u00fd\3\2\2\2\u0100\u00ff\3\2\2\2\u0101/\3\2\2\2\u0102"+
		"\u0103\7\64\2\2\u0103\u0104\7%\2\2\u0104\u0105\5\62\32\2\u0105\u0106\7"+
		"&\2\2\u0106\u0107\7+\2\2\u0107\61\3\2\2\2\u0108\u010d\5:\36\2\u0109\u010a"+
		"\7,\2\2\u010a\u010c\5:\36\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u010d\3\2"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\63\3\2\2\2\u0113\u0114\b\33\1\2\u0114\u011a\5\66\34\2\u0115\u011a\58"+
		"\35\2\u0116\u0117\7\'\2\2\u0117\u011a\5\64\33\4\u0118\u011a\5:\36\2\u0119"+
		"\u0113\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a\u0120\3\2\2\2\u011b\u011c\f\7\2\2\u011c\u011d\7*\2\2\u011d"+
		"\u011f\5\64\33\b\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3"+
		"\2\2\2\u0120\u0121\3\2\2\2\u0121\65\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\5:\36\2\u0124\u0125\7)\2\2\u0125\u0126\5:\36\2\u0126\67\3\2\2\2"+
		"\u0127\u0128\5:\36\2\u0128\u0129\7(\2\2\u0129\u012a\5:\36\2\u012a9\3\2"+
		"\2\2\u012b\u012c\b\36\1\2\u012c\u012d\7%\2\2\u012d\u012e\5:\36\2\u012e"+
		"\u012f\7&\2\2\u012f\u0138\3\2\2\2\u0130\u0138\5\60\31\2\u0131\u0138\7"+
		"/\2\2\u0132\u0138\7\60\2\2\u0133\u0138\7\63\2\2\u0134\u0138\7\61\2\2\u0135"+
		"\u0138\7\64\2\2\u0136\u0138\7\62\2\2\u0137\u012b\3\2\2\2\u0137\u0130\3"+
		"\2\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137"+
		"\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0141\3\2"+
		"\2\2\u0139\u013a\f\f\2\2\u013a\u013b\7-\2\2\u013b\u0140\5:\36\r\u013c"+
		"\u013d\f\13\2\2\u013d\u013e\7.\2\2\u013e\u0140\5:\36\f\u013f\u0139\3\2"+
		"\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142;\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\t\2\2\2"+
		"\u0145=\3\2\2\2\32@BHJjnu\u0082\u008a\u0090\u009c\u00aa\u00b0\u00db\u00f1"+
		"\u00f7\u0100\u010d\u0111\u0119\u0120\u0137\u013f\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}