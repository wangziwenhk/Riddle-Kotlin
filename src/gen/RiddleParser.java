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
		Var=1, Val=2, LeftParen=3, RightParen=4, LeftBracket=5, RightBracket=6, 
		LeftBrace=7, RightBrace=8, Plus=9, Minus=10, Star=11, Div=12, Mod=13, 
		Caret=14, And=15, Or=16, Tilde=17, Not=18, Assign=19, Less=20, Greater=21, 
		PlusAssign=22, MinusAssign=23, StarAssign=24, DivAssign=25, ModAssign=26, 
		XorAssign=27, AndAssign=28, OrAssign=29, LeftShiftAssign=30, RightShiftAssign=31, 
		Equal=32, NotEqual=33, LessEqual=34, GreaterEqual=35, AndAnd=36, OrOr=37, 
		PlusPlus=38, MinusMinus=39, Comma=40, Question=41, Colon=42, Semi=43, 
		Dot=44, IntegerLiteral=45, DecimalSequence=46, OctalSequence=47, BinarySequence=48, 
		HexadecimalSequence=49, StringLiteral=50, StringPrefix=51, CharLiteral=52, 
		EscapeCharacter=53, FloatLiteral=54, Identfier=55, Whitespace=56, Newline=57, 
		BlockComment=58, LineComment=59;
	public static final int
		RULE_program = 0, RULE_statment = 1, RULE_variableDefine = 2, RULE_block = 3, 
		RULE_primaryExpression = 4, RULE_assignExpression = 5, RULE_idExpression = 6, 
		RULE_literal = 7, RULE_strLiteral = 8, RULE_charLiteral = 9, RULE_intLiteral = 10, 
		RULE_floatLiteral = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statment", "variableDefine", "block", "primaryExpression", 
			"assignExpression", "idExpression", "literal", "strLiteral", "charLiteral", 
			"intLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'val'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", 
			"'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", 
			"'|='", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", null, null, 
			"'++'", "'--'", "','", "'?'", "':'", "';'", "'.'", null, null, null, 
			null, null, null, "'r'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "Val", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", 
			"And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", 
			"LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", 
			"Comma", "Question", "Colon", "Semi", "Dot", "IntegerLiteral", "DecimalSequence", 
			"OctalSequence", "BinarySequence", "HexadecimalSequence", "StringLiteral", 
			"StringPrefix", "CharLiteral", "EscapeCharacter", "FloatLiteral", "Identfier", 
			"Whitespace", "Newline", "BlockComment", "LineComment"
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
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 59707879434748038L) != 0)) {
				{
				{
				setState(24);
				statment();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class StatmentContext extends ParserRuleContext {
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public TerminalNode Semi() { return getToken(RiddleParser.Semi, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statment);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Val:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				variableDefine();
				setState(31);
				match(Semi);
				}
				break;
			case IntegerLiteral:
			case StringLiteral:
			case CharLiteral:
			case FloatLiteral:
			case Identfier:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				primaryExpression();
				setState(34);
				match(Semi);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				block();
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
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
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
		enterRule(_localctx, 4, RULE_variableDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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
			setState(40);
			match(Identfier);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(41);
				match(Assign);
				setState(42);
				primaryExpression();
				}
			}

			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(45);
				match(Comma);
				{
				setState(46);
				match(Identfier);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(47);
					match(Assign);
					setState(48);
					primaryExpression();
					}
				}

				}
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LeftBrace);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 59707879434748038L) != 0)) {
				{
				{
				setState(57);
				statment();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdExpressionContext idExpression() {
			return getRuleContext(IdExpressionContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				idExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
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
	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode Identfier() { return getToken(RiddleParser.Identfier, 0); }
		public TerminalNode Assign() { return getToken(RiddleParser.Assign, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_assignExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Identfier);
			setState(71);
			match(Assign);
			setState(72);
			primaryExpression();
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
	public static class IdExpressionContext extends ParserRuleContext {
		public List<TerminalNode> Identfier() { return getTokens(RiddleParser.Identfier); }
		public TerminalNode Identfier(int i) {
			return getToken(RiddleParser.Identfier, i);
		}
		public TerminalNode Dot() { return getToken(RiddleParser.Dot, 0); }
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
		enterRule(_localctx, 12, RULE_idExpression);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(Identfier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(Identfier);
				{
				setState(76);
				match(Dot);
				setState(77);
				match(Identfier);
				}
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
		enterRule(_localctx, 14, RULE_literal);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				intLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				strLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				charLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				floatLiteral();
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
		enterRule(_localctx, 16, RULE_strLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 18, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		enterRule(_localctx, 20, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 22, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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

	public static final String _serializedATN =
		"\u0004\u0001;_\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001\u0000"+
		"\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002,\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00022\b\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004E\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000\u0000"+
		"\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0001"+
		"\u0001\u0000\u0001\u0002_\u0000\u001b\u0001\u0000\u0000\u0000\u0002%\u0001"+
		"\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u00068\u0001\u0000"+
		"\u0000\u0000\bD\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fN"+
		"\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010V\u0001\u0000"+
		"\u0000\u0000\u0012X\u0001\u0000\u0000\u0000\u0014Z\u0001\u0000\u0000\u0000"+
		"\u0016\\\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0003\u0004\u0002\u0000\u001f \u0005+\u0000\u0000 &\u0001\u0000"+
		"\u0000\u0000!\"\u0003\b\u0004\u0000\"#\u0005+\u0000\u0000#&\u0001\u0000"+
		"\u0000\u0000$&\u0003\u0006\u0003\u0000%\u001e\u0001\u0000\u0000\u0000"+
		"%!\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0003\u0001\u0000"+
		"\u0000\u0000\'(\u0007\u0000\u0000\u0000(+\u00057\u0000\u0000)*\u0005\u0013"+
		"\u0000\u0000*,\u0003\b\u0004\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,5\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.1\u00057\u0000"+
		"\u0000/0\u0005\u0013\u0000\u000002\u0003\b\u0004\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u00003-\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008<\u0005\u0007\u0000\u00009;\u0003\u0002\u0001\u0000:9\u0001\u0000"+
		"\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		"?@\u0005\b\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AE\u0003\u000e\u0007"+
		"\u0000BE\u0003\f\u0006\u0000CE\u0003\n\u0005\u0000DA\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\t\u0001\u0000"+
		"\u0000\u0000FG\u00057\u0000\u0000GH\u0005\u0013\u0000\u0000HI\u0003\b"+
		"\u0004\u0000I\u000b\u0001\u0000\u0000\u0000JO\u00057\u0000\u0000KL\u0005"+
		"7\u0000\u0000LM\u0005,\u0000\u0000MO\u00057\u0000\u0000NJ\u0001\u0000"+
		"\u0000\u0000NK\u0001\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PU\u0003"+
		"\u0014\n\u0000QU\u0003\u0010\b\u0000RU\u0003\u0012\t\u0000SU\u0003\u0016"+
		"\u000b\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u000f\u0001\u0000\u0000"+
		"\u0000VW\u00052\u0000\u0000W\u0011\u0001\u0000\u0000\u0000XY\u00054\u0000"+
		"\u0000Y\u0013\u0001\u0000\u0000\u0000Z[\u0005-\u0000\u0000[\u0015\u0001"+
		"\u0000\u0000\u0000\\]\u00056\u0000\u0000]\u0017\u0001\u0000\u0000\u0000"+
		"\t\u001b%+15<DNT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}