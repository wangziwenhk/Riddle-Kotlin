package gen;// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RiddleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Val=2, Fun=3, If=4, Else=5, False=6, True=7, While=8, Print=9, 
		NewLine=10, LeftParen=11, RightParen=12, LeftBracket=13, RightBracket=14, 
		LeftBrace=15, RightBrace=16, Plus=17, Minus=18, Star=19, Div=20, Mod=21, 
		Caret=22, And=23, Or=24, Tilde=25, Not=26, Assign=27, Less=28, Greater=29, 
		PlusAssign=30, MinusAssign=31, StarAssign=32, DivAssign=33, ModAssign=34, 
		XorAssign=35, AndAssign=36, OrAssign=37, LeftShiftAssign=38, RightShiftAssign=39, 
		Equal=40, NotEqual=41, LessEqual=42, GreaterEqual=43, AndAnd=44, OrOr=45, 
		PlusPlus=46, MinusMinus=47, Comma=48, Question=49, Colon=50, Semi=51, 
		Dot=52, IntegerLiteral=53, DecimalSequence=54, OctalSequence=55, BinarySequence=56, 
		HexadecimalSequence=57, StringLiteral=58, StringPrefix=59, CharLiteral=60, 
		EscapeCharacter=61, FloatLiteral=62, Identfier=63, Whitespace=64, BlockComment=65, 
		LineComment=66;
	public static final int
		RULE_program = 0, RULE_newline_statment = 1, RULE_statment = 2, RULE_print = 3, 
		RULE_primaryExpression = 4, RULE_variableDefine = 5, RULE_ifExpression = 6, 
		RULE_while = 7, RULE_funcDefine = 8, RULE_funcBody = 9, RULE_block = 10, 
		RULE_expression = 11, RULE_assignExpression = 12, RULE_equalExpression = 13, 
		RULE_idExpression = 14, RULE_literal = 15, RULE_strLiteral = 16, RULE_charLiteral = 17, 
		RULE_intLiteral = 18, RULE_floatLiteral = 19, RULE_boolenLiteral = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "newline_statment", "statment", "print", "primaryExpression", 
			"variableDefine", "ifExpression", "while", "funcDefine", "funcBody", 
			"block", "expression", "assignExpression", "equalExpression", "idExpression", 
			"literal", "strLiteral", "charLiteral", "intLiteral", "floatLiteral", 
			"boolenLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'val'", "'fun'", "'if'", "'else'", "'false'", "'true'", 
			"'while'", "'print'", null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, 
			"'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", null, 
			null, "'++'", "'--'", "','", "'?'", "':'", "';'", "'.'", null, null, 
			null, null, null, null, "'r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "Val", "Fun", "If", "Else", "False", "True", "While", "Print", 
			"NewLine", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", 
			"And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", 
			"LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", 
			"Comma", "Question", "Colon", "Semi", "Dot", "IntegerLiteral", "DecimalSequence", 
			"OctalSequence", "BinarySequence", "HexadecimalSequence", "StringLiteral", 
			"StringPrefix", "CharLiteral", "EscapeCharacter", "FloatLiteral", "Identfier", 
			"Whitespace", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "RiddleParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RiddleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RiddleParser.EOF, 0); }
		public List<Newline_statmentContext> newline_statment() {
			return getRuleContexts(Newline_statmentContext.class);
		}
		public Newline_statmentContext newline_statment(int i) {
			return getRuleContext(Newline_statmentContext.class,i);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					newline_statment();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3159275138600367138L) != 0)) {
				{
				setState(48);
				statment(0);
				}
			}

			setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Newline_statmentContext extends ParserRuleContext {
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public TerminalNode NewLine() { return getToken(RiddleParser.NewLine, 0); }
		public Newline_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNewline_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNewline_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNewline_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Newline_statmentContext newline_statment() throws RecognitionException {
		Newline_statmentContext _localctx = new Newline_statmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newline_statment);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Val:
			case Fun:
			case If:
			case False:
			case True:
			case While:
			case Print:
			case LeftParen:
			case LeftBrace:
			case Semi:
			case IntegerLiteral:
			case StringLiteral:
			case CharLiteral:
			case FloatLiteral:
			case Identfier:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				statment(0);
				setState(54);
				match(NewLine);
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(NewLine);
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
	public static class StatmentContext extends ParserRuleContext {
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefineContext funcDefine() {
			return getRuleContext(FuncDefineContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode Semi() { return getToken(RiddleParser.Semi, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		return statment(0);
	}

	private StatmentContext statment(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatmentContext _localctx = new StatmentContext(_ctx, _parentState);
		StatmentContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_statment, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Val:
				{
				setState(60);
				variableDefine();
				}
				break;
			case If:
			case False:
			case True:
			case LeftParen:
			case IntegerLiteral:
			case StringLiteral:
			case CharLiteral:
			case FloatLiteral:
			case Identfier:
				{
				setState(61);
				expression();
				}
				break;
			case LeftBrace:
				{
				setState(62);
				block();
				}
				break;
			case Fun:
				{
				setState(63);
				funcDefine();
				}
				break;
			case While:
				{
				setState(64);
				while_();
				}
				break;
			case Print:
				{
				setState(65);
				print();
				}
				break;
			case Semi:
				{
				setState(66);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatmentContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statment);
					setState(69);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(70);
					match(Semi);
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(71);
						statment(0);
						}
						break;
					}
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(RiddleParser.Print, 0); }
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Print);
			setState(80);
			match(LeftParen);
			setState(81);
			expression();
			setState(82);
			match(RightParen);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primaryExpression);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case True:
			case IntegerLiteral:
			case StringLiteral:
			case CharLiteral:
			case FloatLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				literal();
				}
				break;
			case Identfier:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				idExpression();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(LeftParen);
				setState(87);
				expression();
				setState(88);
				match(RightParen);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				ifExpression();
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
	public static class VariableDefineContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(RiddleParser.Var, 0); }
		public TerminalNode Val() { return getToken(RiddleParser.Val, 0); }
		public List<TerminalNode> Identfier() { return getTokens(RiddleParser.Identfier); }
		public TerminalNode Identfier(int i) {
			return getToken(RiddleParser.Identfier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(RiddleParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(RiddleParser.Comma, i);
		}
		public List<TerminalNode> Assign() { return getTokens(RiddleParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(RiddleParser.Assign, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterVariableDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitVariableDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitVariableDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefineContext variableDefine() throws RecognitionException {
		VariableDefineContext _localctx = new VariableDefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Val) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(94);
			match(Identfier);
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(95);
				match(Assign);
				setState(96);
				expression();
				}
				break;
			}
			}
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(Comma);
					{
					setState(100);
					match(Identfier);
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(101);
						match(Assign);
						setState(102);
						expression();
						}
						break;
					}
					}
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(RiddleParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public TerminalNode Else() { return getToken(RiddleParser.Else, 0); }
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(If);
			setState(111);
			match(LeftParen);
			setState(112);
			expression();
			setState(113);
			match(RightParen);
			setState(114);
			statment(0);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(115);
				match(Else);
				setState(116);
				statment(0);
				}
				break;
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(RiddleParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(While);
			setState(120);
			match(LeftParen);
			setState(121);
			expression();
			setState(122);
			match(RightParen);
			setState(123);
			statment(0);
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
	public static class FuncDefineContext extends ParserRuleContext {
		public TerminalNode Fun() { return getToken(RiddleParser.Fun, 0); }
		public TerminalNode Identfier() { return getToken(RiddleParser.Identfier, 0); }
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public FuncDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFuncDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFuncDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFuncDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefineContext funcDefine() throws RecognitionException {
		FuncDefineContext _localctx = new FuncDefineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcDefine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(Fun);
			setState(126);
			match(Identfier);
			setState(127);
			match(LeftParen);
			setState(128);
			match(RightParen);
			setState(129);
			funcBody();
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
	public static class FuncBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(RiddleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(RiddleParser.RightBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LeftBrace);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3159275138600367138L) != 0)) {
				{
				{
				setState(132);
				statment(0);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(RightBrace);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(RiddleParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(RiddleParser.RightBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LeftBrace);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3159275138600367138L) != 0)) {
				{
				{
				setState(141);
				statment(0);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RightBrace);
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
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			assignExpression();
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
	public static class AssignExpressionContext extends ParserRuleContext {
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public TerminalNode Identfier() { return getToken(RiddleParser.Identfier, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignExpression);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				equalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(Identfier);
				setState(153);
				match(Assign);
				setState(154);
				assignExpression();
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
	public static class EqualExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public EqualExpressionContext equalExpression() {
			return getRuleContext(EqualExpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(RiddleParser.Equal, 0); }
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		return equalExpression(0);
	}

	private EqualExpressionContext equalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, _parentState);
		EqualExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalExpression);
					setState(160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(161);
					match(Equal);
					setState(162);
					primaryExpression();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class IdExpressionContext extends ParserRuleContext {
		public TerminalNode Identfier() { return getToken(RiddleParser.Identfier, 0); }
		public IdExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterIdExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitIdExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitIdExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdExpressionContext idExpression() throws RecognitionException {
		IdExpressionContext _localctx = new IdExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_idExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(Identfier);
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
	public static class LiteralContext extends ParserRuleContext {
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public StrLiteralContext strLiteral() {
			return getRuleContext(StrLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public BoolenLiteralContext boolenLiteral() {
			return getRuleContext(BoolenLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				intLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				strLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				charLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				floatLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				boolenLiteral();
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
	public static class StrLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RiddleParser.StringLiteral, 0); }
		public StrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterStrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitStrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrLiteralContext strLiteral() throws RecognitionException {
		StrLiteralContext _localctx = new StrLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_strLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(StringLiteral);
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
	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode CharLiteral() { return getToken(RiddleParser.CharLiteral, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CharLiteral);
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
	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(RiddleParser.IntegerLiteral, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IntegerLiteral);
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
	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FloatLiteral() { return getToken(RiddleParser.FloatLiteral, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FloatLiteral);
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
	public static class BoolenLiteralContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(RiddleParser.True, 0); }
		public TerminalNode False() { return getToken(RiddleParser.False, 0); }
		public BoolenLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolenLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBoolenLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBoolenLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBoolenLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolenLiteralContext boolenLiteral() throws RecognitionException {
		BoolenLiteralContext _localctx = new BoolenLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolenLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
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
		case 2:
			return statment_sempred((StatmentContext)_localctx, predIndex);
		case 13:
			return equalExpression_sempred((EqualExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statment_sempred(StatmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean equalExpression_sempred(EqualExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0003\u00002\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0005\u0002K\b\u0002"+
		"\n\u0002\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\\\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0005\u0005j\b\u0005\n\u0005"+
		"\f\u0005m\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u0086\b\t\n\t"+
		"\f\t\u0089\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u008f\b\n\n\n\f"+
		"\n\u0092\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u009c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00a4\b\r\n\r\f\r\u00a7\t\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b0\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0002"+
		"\u0004\u001a\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0002\u0001\u0000\u0001\u0002"+
		"\u0001\u0000\u0006\u0007\u00c0\u0000-\u0001\u0000\u0000\u0000\u00029\u0001"+
		"\u0000\u0000\u0000\u0004C\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000"+
		"\u0000\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000\u0000\fn\u0001"+
		"\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000"+
		"\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000"+
		"\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000"+
		"\u0000\u001a\u009d\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000"+
		"\u0000\u001e\u00af\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000"+
		"\"\u00b3\u0001\u0000\u0000\u0000$\u00b5\u0001\u0000\u0000\u0000&\u00b7"+
		"\u0001\u0000\u0000\u0000(\u00b9\u0001\u0000\u0000\u0000*,\u0003\u0002"+
		"\u0001\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u000002\u0003\u0004\u0002\u000010\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0000"+
		"\u0000\u00014\u0001\u0001\u0000\u0000\u000056\u0003\u0004\u0002\u0000"+
		"67\u0005\n\u0000\u00007:\u0001\u0000\u0000\u00008:\u0005\n\u0000\u0000"+
		"95\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0003\u0001\u0000"+
		"\u0000\u0000;<\u0006\u0002\uffff\uffff\u0000<D\u0003\n\u0005\u0000=D\u0003"+
		"\u0016\u000b\u0000>D\u0003\u0014\n\u0000?D\u0003\u0010\b\u0000@D\u0003"+
		"\u000e\u0007\u0000AD\u0003\u0006\u0003\u0000BD\u00053\u0000\u0000C;\u0001"+
		"\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000"+
		"C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000DL\u0001\u0000\u0000\u0000EF\n\u0002\u0000"+
		"\u0000FH\u00053\u0000\u0000GI\u0003\u0004\u0002\u0000HG\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JE\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000OP\u0005\t\u0000\u0000PQ\u0005\u000b\u0000\u0000QR\u0003\u0016\u000b"+
		"\u0000RS\u0005\f\u0000\u0000S\u0007\u0001\u0000\u0000\u0000T\\\u0003\u001e"+
		"\u000f\u0000U\\\u0003\u001c\u000e\u0000VW\u0005\u000b\u0000\u0000WX\u0003"+
		"\u0016\u000b\u0000XY\u0005\f\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z\\"+
		"\u0003\f\u0006\u0000[T\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000"+
		"[V\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\t\u0001\u0000\u0000"+
		"\u0000]^\u0007\u0000\u0000\u0000^a\u0005?\u0000\u0000_`\u0005\u001b\u0000"+
		"\u0000`b\u0003\u0016\u000b\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bk\u0001\u0000\u0000\u0000cd\u00050\u0000\u0000dg\u0005?\u0000"+
		"\u0000ef\u0005\u001b\u0000\u0000fh\u0003\u0016\u000b\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ic\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\u0004\u0000\u0000op\u0005\u000b\u0000\u0000pq\u0003"+
		"\u0016\u000b\u0000qr\u0005\f\u0000\u0000ru\u0003\u0004\u0002\u0000st\u0005"+
		"\u0005\u0000\u0000tv\u0003\u0004\u0002\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005\b\u0000"+
		"\u0000xy\u0005\u000b\u0000\u0000yz\u0003\u0016\u000b\u0000z{\u0005\f\u0000"+
		"\u0000{|\u0003\u0004\u0002\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0003\u0000\u0000~\u007f\u0005?\u0000\u0000\u007f\u0080\u0005\u000b\u0000"+
		"\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000"+
		"\u0082\u0011\u0001\u0000\u0000\u0000\u0083\u0087\u0005\u000f\u0000\u0000"+
		"\u0084\u0086\u0003\u0004\u0002\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0010\u0000\u0000"+
		"\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u0090\u0005\u000f\u0000\u0000"+
		"\u008d\u008f\u0003\u0004\u0002\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000"+
		"\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0018\f\u0000\u0096"+
		"\u0017\u0001\u0000\u0000\u0000\u0097\u009c\u0003\u001a\r\u0000\u0098\u0099"+
		"\u0005?\u0000\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a\u009c\u0003"+
		"\u0018\f\u0000\u009b\u0097\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u009e\u0006\r\uffff"+
		"\uffff\u0000\u009e\u009f\u0003\b\u0004\u0000\u009f\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\n\u0001\u0000\u0000\u00a1\u00a2\u0005(\u0000\u0000"+
		"\u00a2\u00a4\u0003\b\u0004\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005?\u0000\u0000\u00a9\u001d"+
		"\u0001\u0000\u0000\u0000\u00aa\u00b0\u0003$\u0012\u0000\u00ab\u00b0\u0003"+
		" \u0010\u0000\u00ac\u00b0\u0003\"\u0011\u0000\u00ad\u00b0\u0003&\u0013"+
		"\u0000\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00aa\u0001\u0000\u0000\u0000"+
		"\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u001f\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005:\u0000\u0000\u00b2"+
		"!\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005<\u0000\u0000\u00b4#\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u00055\u0000\u0000\u00b6%\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005>\u0000\u0000\u00b8\'\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0007\u0001\u0000\u0000\u00ba)\u0001\u0000\u0000\u0000\u0010"+
		"-19CHL[agku\u0087\u0090\u009b\u00a5\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}