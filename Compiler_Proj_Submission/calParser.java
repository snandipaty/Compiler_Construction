// Generated from cal by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, INT=2, CONSTANT=3, RETURN=4, BOOL=5, VOID=6, MAIN=7, IF=8, 
		ELSE=9, TRUE=10, FALSE=11, WHILE=12, BEGIN=13, END=14, IS=15, SKIPS=16, 
		COMMA=17, SEMI=18, COLON=19, ASSIGN=20, LPAREN=21, RPAREN=22, PLUS=23, 
		MINUS=24, TILDE=25, OR=26, AND=27, EQ=28, NEQ=29, LT=30, LEQ=31, GT=32, 
		GEQ=33, WS=34, NUMBER=35, IDENTIFIER=36, LINE_COMMENT=37, MULTI_LINE_COMMENT=38;
	public static final int
		RULE_program = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, 
		RULE_const_decl = 4, RULE_function_list = 5, RULE_function = 6, RULE_parameter_list = 7, 
		RULE_nemp_parameter_list = 8, RULE_main = 9, RULE_statement_block = 10, 
		RULE_statement = 11, RULE_condition = 12, RULE_arg_list = 13, RULE_nemp_arg_list = 14, 
		RULE_type = 15, RULE_binary_arith_op = 16, RULE_comp_op = 17, RULE_fragments = 18, 
		RULE_expression = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
			"function", "parameter_list", "nemp_parameter_list", "main", "statement_block", 
			"statement", "condition", "arg_list", "nemp_arg_list", "type", "binary_arith_op", 
			"comp_op", "fragments", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", "';'", "':'", "':='", "'('", "')'", 
			"'+'", "'-'", "'\\u223C'", "'|'", "'&'", "'='", "'!='", "'<'", "'<='", 
			"'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARIABLE", "INT", "CONSTANT", "RETURN", "BOOL", "VOID", "MAIN", 
			"IF", "ELSE", "TRUE", "FALSE", "WHILE", "BEGIN", "END", "IS", "SKIPS", 
			"COMMA", "SEMI", "COLON", "ASSIGN", "LPAREN", "RPAREN", "PLUS", "MINUS", 
			"TILDE", "OR", "AND", "EQ", "NEQ", "LT", "LEQ", "GT", "GEQ", "WS", "NUMBER", 
			"IDENTIFIER", "LINE_COMMENT", "MULTI_LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "cal"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public TerminalNode MAIN() { return getToken(calParser.MAIN, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			decl_list();
			setState(41);
			function_list();
			setState(42);
			match(MAIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANT:
				{
				setState(44);
				decl();
				setState(45);
				match(SEMI);
				setState(46);
				decl_list();
				}
				break;
			case INT:
			case BOOL:
			case VOID:
			case MAIN:
			case IF:
			case ELSE:
			case WHILE:
			case BEGIN:
			case END:
			case SKIPS:
			case RPAREN:
			case IDENTIFIER:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				var_decl();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				const_decl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(calParser.VARIABLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(VARIABLE);
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(COLON);
			setState(58);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(calParser.CONSTANT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONSTANT);
			setState(61);
			match(IDENTIFIER);
			setState(62);
			match(COLON);
			setState(63);
			type();
			setState(64);
			match(ASSIGN);
			setState(65);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194404L) != 0)) {
				{
				setState(67);
				function();
				setState(68);
				function_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(calParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(calParser.LPAREN, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calParser.RPAREN, 0); }
		public TerminalNode IS() { return getToken(calParser.IS, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(calParser.BEGIN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(calParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode END() { return getToken(calParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				type();
				setState(73);
				match(IDENTIFIER);
				setState(74);
				match(LPAREN);
				setState(75);
				parameter_list();
				setState(76);
				match(RPAREN);
				setState(77);
				match(IS);
				setState(78);
				decl_list();
				setState(79);
				match(BEGIN);
				setState(80);
				statement_block();
				setState(81);
				match(RETURN);
				setState(82);
				match(LPAREN);
				setState(83);
				expression();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(RPAREN);
				setState(86);
				match(SEMI);
				setState(87);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(90);
				nemp_parameter_list();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(calParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_parameter_list(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nemp_parameter_list);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(COLON);
				setState(95);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(IDENTIFIER);
				setState(97);
				match(COLON);
				setState(98);
				type();
				setState(99);
				match(COMMA);
				setState(100);
				nemp_parameter_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(calParser.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(calParser.BEGIN, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(calParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(MAIN);
			setState(105);
			match(BEGIN);
			setState(106);
			decl_list();
			setState(107);
			statement_block();
			setState(108);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719555328L) != 0)) {
				{
				setState(110);
				statement();
				setState(111);
				statement_block();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(calParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(calParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(calParser.LPAREN, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calParser.RPAREN, 0); }
		public TerminalNode BEGIN() { return getToken(calParser.BEGIN, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(calParser.END, 0); }
		public TerminalNode IF() { return getToken(calParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(calParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(calParser.WHILE, 0); }
		public TerminalNode SKIPS() { return getToken(calParser.SKIPS, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(IDENTIFIER);
				setState(116);
				match(ASSIGN);
				setState(117);
				expression();
				setState(118);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IDENTIFIER);
				setState(121);
				match(LPAREN);
				setState(122);
				arg_list();
				setState(123);
				match(RPAREN);
				setState(124);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(BEGIN);
				setState(127);
				statement_block();
				setState(128);
				match(END);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(IF);
				setState(131);
				condition(0);
				setState(132);
				match(BEGIN);
				setState(133);
				statement_block();
				setState(134);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(ELSE);
				setState(137);
				match(BEGIN);
				setState(138);
				statement_block();
				setState(139);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(WHILE);
				setState(142);
				condition(0);
				setState(143);
				match(BEGIN);
				setState(144);
				statement_block();
				setState(145);
				match(END);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(147);
				match(SKIPS);
				setState(148);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(calParser.TILDE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(calParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(calParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(calParser.OR, 0); }
		public TerminalNode AND() { return getToken(calParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(152);
				match(TILDE);
				setState(153);
				condition(5);
				}
				break;
			case 2:
				{
				setState(154);
				match(LPAREN);
				setState(155);
				condition(0);
				setState(156);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(158);
				expression();
				setState(159);
				comp_op();
				setState(160);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						match(OR);
						setState(166);
						condition(3);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(168);
						match(AND);
						setState(169);
						condition(2);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arg_list);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				nemp_arg_list();
				}
				break;
			case RPAREN:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(calParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nemp_arg_list);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(COMMA);
				setState(182);
				nemp_arg_list();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(calParser.BOOL, 0); }
		public TerminalNode VOID() { return getToken(calParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 100L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(calParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitBinary_arith_op(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(calParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(calParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(calParser.LT, 0); }
		public TerminalNode GT() { return getToken(calParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(calParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(calParser.GEQ, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FragmentsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public TerminalNode MINUS() { return getToken(calParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(calParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(calParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(calParser.FALSE, 0); }
		public FragmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterFragments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitFragments(this);
		}
	}

	public final FragmentsContext fragments() throws RecognitionException {
		FragmentsContext _localctx = new FragmentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fragments);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(MINUS);
				setState(193);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(FALSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<FragmentsContext> fragments() {
			return getRuleContexts(FragmentsContext.class);
		}
		public FragmentsContext fragments(int i) {
			return getRuleContext(FragmentsContext.class,i);
		}
		public List<Binary_arith_opContext> binary_arith_op() {
			return getRuleContexts(Binary_arith_opContext.class);
		}
		public Binary_arith_opContext binary_arith_op(int i) {
			return getRuleContext(Binary_arith_opContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(calParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(calParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(calParser.IDENTIFIER, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calListener ) ((calListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				fragments();
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						binary_arith_op();
						setState(201);
						fragments();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(LPAREN);
				setState(209);
				expression();
				setState(210);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(IDENTIFIER);
				setState(213);
				match(LPAREN);
				setState(214);
				arg_list();
				setState(215);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				fragments();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0003\u0007\\\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bg\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0003\nr\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0096\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ab\b\f\n\f\f\f\u00ae"+
		"\t\f\u0001\r\u0001\r\u0003\r\u00b2\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00b8\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c6\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00cc\b\u0013\n\u0013"+
		"\f\u0013\u00cf\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00db\b\u0013\u0001\u0013\u0000\u0001\u0018\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0003\u0002\u0000\u0002\u0002\u0005\u0006\u0001\u0000\u0017"+
		"\u0018\u0001\u0000\u001c!\u00e3\u0000(\u0001\u0000\u0000\u0000\u00021"+
		"\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u00067\u0001\u0000"+
		"\u0000\u0000\b<\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fX"+
		"\u0001\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010f\u0001\u0000"+
		"\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000"+
		"\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000"+
		"\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000"+
		"\u001e\u00b9\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\""+
		"\u00bd\u0001\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00da\u0001"+
		"\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0003\n\u0005\u0000*+\u0005"+
		"\u0007\u0000\u0000+\u0001\u0001\u0000\u0000\u0000,-\u0003\u0004\u0002"+
		"\u0000-.\u0005\u0012\u0000\u0000./\u0003\u0002\u0001\u0000/2\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001,\u0001\u0000\u0000\u000010\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000036\u0003\u0006\u0003"+
		"\u000046\u0003\b\u0004\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000"+
		"\u00006\u0005\u0001\u0000\u0000\u000078\u0005\u0001\u0000\u000089\u0005"+
		"$\u0000\u00009:\u0005\u0013\u0000\u0000:;\u0003\u001e\u000f\u0000;\u0007"+
		"\u0001\u0000\u0000\u0000<=\u0005\u0003\u0000\u0000=>\u0005$\u0000\u0000"+
		">?\u0005\u0013\u0000\u0000?@\u0003\u001e\u000f\u0000@A\u0005\u0014\u0000"+
		"\u0000AB\u0003&\u0013\u0000B\t\u0001\u0000\u0000\u0000CD\u0003\f\u0006"+
		"\u0000DE\u0003\n\u0005\u0000EG\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0003"+
		"\u001e\u000f\u0000IJ\u0005$\u0000\u0000JK\u0005\u0015\u0000\u0000KL\u0003"+
		"\u000e\u0007\u0000LM\u0005\u0016\u0000\u0000MN\u0005\u000f\u0000\u0000"+
		"NO\u0003\u0002\u0001\u0000OP\u0005\r\u0000\u0000PQ\u0003\u0014\n\u0000"+
		"QR\u0005\u0004\u0000\u0000RS\u0005\u0015\u0000\u0000ST\u0003&\u0013\u0000"+
		"TY\u0001\u0000\u0000\u0000UV\u0005\u0016\u0000\u0000VW\u0005\u0012\u0000"+
		"\u0000WY\u0005\u000e\u0000\u0000XH\u0001\u0000\u0000\u0000XU\u0001\u0000"+
		"\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z\\\u0003\u0010\b\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000"+
		"\u0000]^\u0005$\u0000\u0000^_\u0005\u0013\u0000\u0000_g\u0003\u001e\u000f"+
		"\u0000`a\u0005$\u0000\u0000ab\u0005\u0013\u0000\u0000bc\u0003\u001e\u000f"+
		"\u0000cd\u0005\u0011\u0000\u0000de\u0003\u0010\b\u0000eg\u0001\u0000\u0000"+
		"\u0000f]\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000g\u0011\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0007\u0000\u0000ij\u0005\r\u0000\u0000jk\u0003"+
		"\u0002\u0001\u0000kl\u0003\u0014\n\u0000lm\u0005\u000e\u0000\u0000m\u0013"+
		"\u0001\u0000\u0000\u0000no\u0003\u0016\u000b\u0000op\u0003\u0014\n\u0000"+
		"pr\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000r\u0015\u0001\u0000\u0000\u0000st\u0005$\u0000\u0000tu\u0005\u0014"+
		"\u0000\u0000uv\u0003&\u0013\u0000vw\u0005\u0012\u0000\u0000w\u0096\u0001"+
		"\u0000\u0000\u0000xy\u0005$\u0000\u0000yz\u0005\u0015\u0000\u0000z{\u0003"+
		"\u001a\r\u0000{|\u0005\u0016\u0000\u0000|}\u0005\u0012\u0000\u0000}\u0096"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0080\u0003"+
		"\u0014\n\u0000\u0080\u0081\u0005\u000e\u0000\u0000\u0081\u0096\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\b\u0000\u0000\u0083\u0084\u0003\u0018\f"+
		"\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0086\u0003\u0014\n\u0000"+
		"\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u0096\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0005\r\u0000\u0000\u008a"+
		"\u008b\u0003\u0014\n\u0000\u008b\u008c\u0005\u000e\u0000\u0000\u008c\u0096"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\f\u0000\u0000\u008e\u008f\u0003"+
		"\u0018\f\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090\u0091\u0003\u0014"+
		"\n\u0000\u0091\u0092\u0005\u000e\u0000\u0000\u0092\u0096\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094\u0096\u0005\u0012\u0000"+
		"\u0000\u0095s\u0001\u0000\u0000\u0000\u0095x\u0001\u0000\u0000\u0000\u0095"+
		"~\u0001\u0000\u0000\u0000\u0095\u0082\u0001\u0000\u0000\u0000\u0095\u0088"+
		"\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0006\f\uffff\uffff\u0000\u0098\u0099\u0005\u0019\u0000\u0000\u0099\u00a3"+
		"\u0003\u0018\f\u0005\u009a\u009b\u0005\u0015\u0000\u0000\u009b\u009c\u0003"+
		"\u0018\f\u0000\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u00a3\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0003&\u0013\u0000\u009f\u00a0\u0003\"\u0011"+
		"\u0000\u00a0\u00a1\u0003&\u0013\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000"+
		"\u00a2\u009e\u0001\u0000\u0000\u0000\u00a3\u00ac\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\n\u0002\u0000\u0000\u00a5\u00a6\u0005\u001a\u0000\u0000\u00a6"+
		"\u00ab\u0003\u0018\f\u0003\u00a7\u00a8\n\u0001\u0000\u0000\u00a8\u00a9"+
		"\u0005\u001b\u0000\u0000\u00a9\u00ab\u0003\u0018\f\u0002\u00aa\u00a4\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ad\u0019\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0003\u001c\u000e\u0000\u00b0\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b8\u0005"+
		"$\u0000\u0000\u00b4\u00b5\u0005$\u0000\u0000\u00b5\u00b6\u0005\u0011\u0000"+
		"\u0000\u00b6\u00b8\u0003\u001c\u000e\u0000\u00b7\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b8\u001d\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0007\u0000\u0000\u0000\u00ba\u001f\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0007\u0001\u0000\u0000\u00bc!\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0007\u0002\u0000\u0000\u00be#\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c6\u0005$\u0000\u0000\u00c0\u00c1\u0005\u0018\u0000\u0000\u00c1\u00c6"+
		"\u0005$\u0000\u0000\u00c2\u00c6\u0005#\u0000\u0000\u00c3\u00c6\u0005\n"+
		"\u0000\u0000\u00c4\u00c6\u0005\u000b\u0000\u0000\u00c5\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00cd\u0003$\u0012\u0000"+
		"\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00ca\u0003$\u0012\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00db\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0015\u0000\u0000\u00d1\u00d2"+
		"\u0003&\u0013\u0000\u00d2\u00d3\u0005\u0016\u0000\u0000\u00d3\u00db\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005$\u0000\u0000\u00d5\u00d6\u0005\u0015"+
		"\u0000\u0000\u00d6\u00d7\u0003\u001a\r\u0000\u00d7\u00d8\u0005\u0016\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00db\u0003$\u0012\u0000"+
		"\u00da\u00c7\u0001\u0000\u0000\u0000\u00da\u00d0\u0001\u0000\u0000\u0000"+
		"\u00da\u00d4\u0001\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\'\u0001\u0000\u0000\u0000\u001015FX[fq\u0095\u00a2\u00aa\u00ac"+
		"\u00b1\u00b7\u00c5\u00cd\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}