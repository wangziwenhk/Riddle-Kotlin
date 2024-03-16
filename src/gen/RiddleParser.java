package gen;// Generated from C:/Users/wangz/IdeaProjects/Riddle-Kotlin/ast/RiddleParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.io.Serializable;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RiddleParser extends Parser implements Serializable {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Var=1, Val=2, Fun=3, If=4, Else=5, False=6, True=7, While=8, Print=9, 
		Int=10, Float=11, Char=12, Boolen=13, String=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Plus=21, 
		Minus=22, Star=23, Div=24, Mod=25, Caret=26, And=27, Or=28, Tilde=29, 
		Not=30, Assign=31, Less=32, Greater=33, PlusAssign=34, MinusAssign=35, 
		StarAssign=36, DivAssign=37, ModAssign=38, XorAssign=39, AndAssign=40, 
		OrAssign=41, LeftShiftAssign=42, RightShiftAssign=43, Equal=44, NotEqual=45, 
		LessEqual=46, GreaterEqual=47, AndAnd=48, OrOr=49, PlusPlus=50, MinusMinus=51, 
		Comma=52, Question=53, Colon=54, Semi=55, Dot=56, IntegerLiteral=57, DecimalSequence=58, 
		OctalSequence=59, BinarySequence=60, HexadecimalSequence=61, StringLiteral=62, 
		StringPrefix=63, CharLiteral=64, EscapeCharacter=65, FloatLiteral=66, 
		Identfier=67, Whitespace=68, NewLine=69, Newline=70, BlockComment=71, 
		LineComment=72;
	public static final int
		RULE_program = 0, RULE_newline_statment = 1, RULE_statment = 2, RULE_print = 3, 
		RULE_primaryExpression = 4, RULE_variableDefine = 5, RULE_ifExpression = 6, 
		RULE_while = 7, RULE_funcDefine = 8, RULE_funcBody = 9, RULE_block = 10, 
		RULE_expression = 11, RULE_assignExpression = 12, RULE_equalExpression = 13, 
		RULE_notEqualExpression = 14, RULE_greaterExpression = 15, RULE_lessExpression = 16, 
		RULE_lessEqualExpression = 17, RULE_idExpression = 18, RULE_typeLiteral = 19, 
		RULE_basicType = 20, RULE_literal = 21, RULE_strLiteral = 22, RULE_charLiteral = 23, 
		RULE_intLiteral = 24, RULE_floatLiteral = 25, RULE_boolenLiteral = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "newline_statment", "statment", "print", "primaryExpression", 
			"variableDefine", "ifExpression", "while", "funcDefine", "funcBody", 
			"block", "expression", "assignExpression", "equalExpression", "notEqualExpression", 
			"greaterExpression", "lessExpression", "lessEqualExpression", "idExpression", 
			"typeLiteral", "basicType", "literal", "strLiteral", "charLiteral", "intLiteral", 
			"floatLiteral", "boolenLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'val'", "'fun'", "'if'", "'else'", "'false'", "'true'", 
			"'while'", "'print'", "'int'", "'float'", "'char'", "'bool'", "'string'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'^'", "'&'", "'|'", "'~'", null, "'='", "'<'", "'>'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", "'>>='", 
			"'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", "','", "'?'", 
			"':'", "';'", "'.'", null, null, null, null, null, null, "'r'", null, 
			null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Var", "Val", "Fun", "If", "Else", "False", "True", "While", "Print", 
			"Int", "Float", "Char", "Boolen", "String", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", "Not", "Assign", 
			"Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", 
			"ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShiftAssign", 
			"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", "Question", "Colon", 
			"Semi", "Dot", "IntegerLiteral", "DecimalSequence", "OctalSequence", 
			"BinarySequence", "HexadecimalSequence", "StringLiteral", "StringPrefix", 
			"CharLiteral", "EscapeCharacter", "FloatLiteral", "Identfier", "Whitespace", 
			"NewLine", "Newline", "BlockComment", "LineComment"
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
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					newline_statment();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4791830003522765790L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 13L) != 0)) {
				{
				setState(60);
				statment(0);
				}
			}

			setState(63);
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
			setState(69);
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
				setState(65);
				statment(0);
				setState(66);
				match(NewLine);
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Val:
				{
				setState(72);
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
				setState(73);
				expression();
				}
				break;
			case LeftBrace:
				{
				setState(74);
				block();
				}
				break;
			case Fun:
				{
				setState(75);
				funcDefine();
				}
				break;
			case While:
				{
				setState(76);
				while_();
				}
				break;
			case Print:
				{
				setState(77);
				print();
				}
				break;
			case Semi:
				{
				setState(78);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
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
					setState(81);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(82);
					match(Semi);
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(83);
						statment(0);
						}
						break;
					}
					}
					} 
				}
				setState(90);
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
			setState(91);
			match(Print);
			setState(92);
			match(LeftParen);
			setState(93);
			expression();
			setState(94);
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
			setState(103);
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
				setState(96);
				literal();
				}
				break;
			case Identfier:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				idExpression();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(LeftParen);
				setState(99);
				expression();
				setState(100);
				match(RightParen);
				}
				break;
			case If:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
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
			setState(105);
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
			setState(106);
			match(Identfier);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(107);
				match(Assign);
				setState(108);
				expression();
				}
				break;
			}
			}
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(Comma);
					{
					setState(112);
					match(Identfier);
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(113);
						match(Assign);
						setState(114);
						expression();
						}
						break;
					}
					}
					}
					} 
				}
				setState(121);
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
			setState(122);
			match(If);
			setState(123);
			match(LeftParen);
			setState(124);
			expression();
			setState(125);
			match(RightParen);
			setState(126);
			statment(0);
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(127);
				match(Else);
				setState(128);
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
			setState(131);
			match(While);
			setState(132);
			match(LeftParen);
			setState(133);
			expression();
			setState(134);
			match(RightParen);
			setState(135);
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
		public List<TerminalNode> Identfier() { return getTokens(RiddleParser.Identfier); }
		public TerminalNode Identfier(int i) {
			return getToken(RiddleParser.Identfier, i);
		}
		public TerminalNode LeftParen() { return getToken(RiddleParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(RiddleParser.RightParen, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(RiddleParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(RiddleParser.Colon, i);
		}
		public List<TypeLiteralContext> typeLiteral() {
			return getRuleContexts(TypeLiteralContext.class);
		}
		public TypeLiteralContext typeLiteral(int i) {
			return getRuleContext(TypeLiteralContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Fun);
			setState(138);
			match(Identfier);
			setState(139);
			match(LeftParen);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identfier) {
				{
				{
				setState(140);
				match(Identfier);
				setState(141);
				match(Colon);
				setState(142);
				typeLiteral();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RightParen);
			setState(149);
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
			setState(151);
			match(LeftBrace);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4791830003522765790L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 13L) != 0)) {
				{
				{
				setState(152);
				statment(0);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(160);
			match(LeftBrace);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4791830003522765790L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 13L) != 0)) {
				{
				{
				setState(161);
				statment(0);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
			setState(169);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				equalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(Identfier);
				setState(173);
				match(Assign);
				setState(174);
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
		public NotEqualExpressionContext notEqualExpression() {
			return getRuleContext(NotEqualExpressionContext.class,0);
		}
		public List<EqualExpressionContext> equalExpression() {
			return getRuleContexts(EqualExpressionContext.class);
		}
		public EqualExpressionContext equalExpression(int i) {
			return getRuleContext(EqualExpressionContext.class,i);
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
			setState(178);
			notEqualExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalExpression);
					setState(180);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(181);
					match(Equal);
					setState(182);
					equalExpression(1);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class NotEqualExpressionContext extends ParserRuleContext {
		public GreaterExpressionContext greaterExpression() {
			return getRuleContext(GreaterExpressionContext.class,0);
		}
		public List<NotEqualExpressionContext> notEqualExpression() {
			return getRuleContexts(NotEqualExpressionContext.class);
		}
		public NotEqualExpressionContext notEqualExpression(int i) {
			return getRuleContext(NotEqualExpressionContext.class,i);
		}
		public TerminalNode NotEqual() { return getToken(RiddleParser.NotEqual, 0); }
		public NotEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterNotEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitNotEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitNotEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotEqualExpressionContext notEqualExpression() throws RecognitionException {
		return notEqualExpression(0);
	}

	private NotEqualExpressionContext notEqualExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NotEqualExpressionContext _localctx = new NotEqualExpressionContext(_ctx, _parentState);
		NotEqualExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_notEqualExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			greaterExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NotEqualExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_notEqualExpression);
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					match(NotEqual);
					setState(193);
					notEqualExpression(1);
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class GreaterExpressionContext extends ParserRuleContext {
		public LessExpressionContext lessExpression() {
			return getRuleContext(LessExpressionContext.class,0);
		}
		public List<GreaterExpressionContext> greaterExpression() {
			return getRuleContexts(GreaterExpressionContext.class);
		}
		public GreaterExpressionContext greaterExpression(int i) {
			return getRuleContext(GreaterExpressionContext.class,i);
		}
		public TerminalNode Greater() { return getToken(RiddleParser.Greater, 0); }
		public GreaterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterGreaterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitGreaterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitGreaterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GreaterExpressionContext greaterExpression() throws RecognitionException {
		return greaterExpression(0);
	}

	private GreaterExpressionContext greaterExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GreaterExpressionContext _localctx = new GreaterExpressionContext(_ctx, _parentState);
		GreaterExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_greaterExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(200);
			lessExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GreaterExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_greaterExpression);
					setState(202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(203);
					match(Greater);
					setState(204);
					greaterExpression(1);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class LessExpressionContext extends ParserRuleContext {
		public LessEqualExpressionContext lessEqualExpression() {
			return getRuleContext(LessEqualExpressionContext.class,0);
		}
		public List<LessExpressionContext> lessExpression() {
			return getRuleContexts(LessExpressionContext.class);
		}
		public LessExpressionContext lessExpression(int i) {
			return getRuleContext(LessExpressionContext.class,i);
		}
		public TerminalNode Less() { return getToken(RiddleParser.Less, 0); }
		public LessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessExpressionContext lessExpression() throws RecognitionException {
		return lessExpression(0);
	}

	private LessExpressionContext lessExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LessExpressionContext _localctx = new LessExpressionContext(_ctx, _parentState);
		LessExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_lessExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			lessEqualExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LessExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lessExpression);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(Less);
					setState(215);
					lessExpression(1);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class LessEqualExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<LessEqualExpressionContext> lessEqualExpression() {
			return getRuleContexts(LessEqualExpressionContext.class);
		}
		public LessEqualExpressionContext lessEqualExpression(int i) {
			return getRuleContext(LessEqualExpressionContext.class,i);
		}
		public TerminalNode LessEqual() { return getToken(RiddleParser.LessEqual, 0); }
		public LessEqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessEqualExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterLessEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitLessEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitLessEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessEqualExpressionContext lessEqualExpression() throws RecognitionException {
		return lessEqualExpression(0);
	}

	private LessEqualExpressionContext lessEqualExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LessEqualExpressionContext _localctx = new LessEqualExpressionContext(_ctx, _parentState);
		LessEqualExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_lessEqualExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(222);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LessEqualExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lessEqualExpression);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(LessEqual);
					setState(226);
					lessEqualExpression(1);
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 36, RULE_idExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
	public static class TypeLiteralContext extends ParserRuleContext {
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TypeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterTypeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitTypeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitTypeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeLiteralContext typeLiteral() throws RecognitionException {
		TypeLiteralContext _localctx = new TypeLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			basicType();
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
	public static class BasicTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(RiddleParser.Int, 0); }
		public TerminalNode Char() { return getToken(RiddleParser.Char, 0); }
		public TerminalNode Float() { return getToken(RiddleParser.Float, 0); }
		public TerminalNode Boolen() { return getToken(RiddleParser.Boolen, 0); }
		public TerminalNode String() { return getToken(RiddleParser.String, 0); }
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RiddleParserListener ) ((RiddleParserListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RiddleParserVisitor ) return ((RiddleParserVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_basicType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				intLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				strLiteral();
				}
				break;
			case CharLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				charLiteral();
				}
				break;
			case FloatLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				floatLiteral();
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
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
		enterRule(_localctx, 44, RULE_strLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 46, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 48, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 50, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		enterRule(_localctx, 52, RULE_boolenLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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
		case 14:
			return notEqualExpression_sempred((NotEqualExpressionContext)_localctx, predIndex);
		case 15:
			return greaterExpression_sempred((GreaterExpressionContext)_localctx, predIndex);
		case 16:
			return lessExpression_sempred((LessExpressionContext)_localctx, predIndex);
		case 17:
			return lessEqualExpression_sempred((LessEqualExpressionContext)_localctx, predIndex);
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
	private boolean notEqualExpression_sempred(NotEqualExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean greaterExpression_sempred(GreaterExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lessExpression_sempred(LessExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lessEqualExpression_sempred(LessEqualExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0003\u0000>\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001F\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0005\u0002W\b\u0002"+
		"\n\u0002\f\u0002Z\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004h\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0005\u0005v\b\u0005\n\u0005"+
		"\f\u0005y\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0090\b\b\n\b\f\b\u0093\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u009a\b\t\n\t\f\t\u009d\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00a3\b\n\n\n\f\n\u00a6\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00b0\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b8"+
		"\b\r\n\r\f\r\u00bb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00c3\b\u000e\n\u000e\f\u000e\u00c6"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00ce\b\u000f\n\u000f\f\u000f\u00d1\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00d9\b\u0010\n\u0010\f\u0010\u00dc\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00e4\b\u0011\n"+
		"\u0011\f\u0011\u00e7\t\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00f4\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0000\u0006\u0004\u001a\u001c\u001e \""+
		"\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.024\u0000\u0003\u0001\u0000\u0001\u0002\u0001"+
		"\u0000\n\u000e\u0001\u0000\u0006\u0007\u0103\u00009\u0001\u0000\u0000"+
		"\u0000\u0002E\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006"+
		"[\u0001\u0000\u0000\u0000\bg\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000"+
		"\u0000\fz\u0001\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000"+
		"\u0010\u0089\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000"+
		"\u0014\u00a0\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000"+
		"\u0018\u00af\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000"+
		"\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000"+
		" \u00d2\u0001\u0000\u0000\u0000\"\u00dd\u0001\u0000\u0000\u0000$\u00e8"+
		"\u0001\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000"+
		"\u0000\u0000*\u00f3\u0001\u0000\u0000\u0000,\u00f5\u0001\u0000\u0000\u0000"+
		".\u00f7\u0001\u0000\u0000\u00000\u00f9\u0001\u0000\u0000\u00002\u00fb"+
		"\u0001\u0000\u0000\u00004\u00fd\u0001\u0000\u0000\u000068\u0003\u0002"+
		"\u0001\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u0000"+
		"\u0000\u0001@\u0001\u0001\u0000\u0000\u0000AB\u0003\u0004\u0002\u0000"+
		"BC\u0005E\u0000\u0000CF\u0001\u0000\u0000\u0000DF\u0005E\u0000\u0000E"+
		"A\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0003\u0001\u0000"+
		"\u0000\u0000GH\u0006\u0002\uffff\uffff\u0000HP\u0003\n\u0005\u0000IP\u0003"+
		"\u0016\u000b\u0000JP\u0003\u0014\n\u0000KP\u0003\u0010\b\u0000LP\u0003"+
		"\u000e\u0007\u0000MP\u0003\u0006\u0003\u0000NP\u00057\u0000\u0000OG\u0001"+
		"\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000"+
		"OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000ON\u0001\u0000\u0000\u0000PX\u0001\u0000\u0000\u0000QR\n\u0002\u0000"+
		"\u0000RT\u00057\u0000\u0000SU\u0003\u0004\u0002\u0000TS\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VQ\u0001\u0000"+
		"\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\\\u0005\t\u0000\u0000\\]\u0005\u000f\u0000\u0000]^\u0003\u0016"+
		"\u000b\u0000^_\u0005\u0010\u0000\u0000_\u0007\u0001\u0000\u0000\u0000"+
		"`h\u0003*\u0015\u0000ah\u0003$\u0012\u0000bc\u0005\u000f\u0000\u0000c"+
		"d\u0003\u0016\u000b\u0000de\u0005\u0010\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fh\u0003\f\u0006\u0000g`\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000"+
		"\u0000gb\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\t\u0001\u0000"+
		"\u0000\u0000ij\u0007\u0000\u0000\u0000jm\u0005C\u0000\u0000kl\u0005\u001f"+
		"\u0000\u0000ln\u0003\u0016\u000b\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nw\u0001\u0000\u0000\u0000op\u00054\u0000\u0000ps\u0005"+
		"C\u0000\u0000qr\u0005\u001f\u0000\u0000rt\u0003\u0016\u000b\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000"+
		"uo\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u000b\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0004\u0000\u0000{|\u0005\u000f\u0000\u0000"+
		"|}\u0003\u0016\u000b\u0000}~\u0005\u0010\u0000\u0000~\u0081\u0003\u0004"+
		"\u0002\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0082\u0003\u0004"+
		"\u0002\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000\u0083\u0084\u0005\b\u0000"+
		"\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0086\u0003\u0016\u000b"+
		"\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0003\u0004\u0002"+
		"\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000"+
		"\u0000\u008a\u008b\u0005C\u0000\u0000\u008b\u0091\u0005\u000f\u0000\u0000"+
		"\u008c\u008d\u0005C\u0000\u0000\u008d\u008e\u00056\u0000\u0000\u008e\u0090"+
		"\u0003&\u0013\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u0090\u0093\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0003"+
		"\u0012\t\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u009b\u0005\u0013"+
		"\u0000\u0000\u0098\u009a\u0003\u0004\u0002\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0014"+
		"\u0000\u0000\u009f\u0013\u0001\u0000\u0000\u0000\u00a0\u00a4\u0005\u0013"+
		"\u0000\u0000\u00a1\u00a3\u0003\u0004\u0002\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0014"+
		"\u0000\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003\u0018"+
		"\f\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003\u001a\r"+
		"\u0000\u00ac\u00ad\u0005C\u0000\u0000\u00ad\u00ae\u0005\u001f\u0000\u0000"+
		"\u00ae\u00b0\u0003\u0018\f\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0006\r\uffff\uffff\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b4\u00b5\n\u0001\u0000\u0000\u00b5\u00b6"+
		"\u0005,\u0000\u0000\u00b6\u00b8\u0003\u001a\r\u0001\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u001b\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0006"+
		"\u000e\uffff\uffff\u0000\u00bd\u00be\u0003\u001e\u000f\u0000\u00be\u00c4"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0001\u0000\u0000\u00c0\u00c1\u0005"+
		"-\u0000\u0000\u00c1\u00c3\u0003\u001c\u000e\u0001\u00c2\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u001d\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006\u000f"+
		"\uffff\uffff\u0000\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u00cf\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\n\u0001\u0000\u0000\u00cb\u00cc\u0005!\u0000"+
		"\u0000\u00cc\u00ce\u0003\u001e\u000f\u0001\u00cd\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u0010\uffff"+
		"\uffff\u0000\u00d3\u00d4\u0003\"\u0011\u0000\u00d4\u00da\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\n\u0001\u0000\u0000\u00d6\u00d7\u0005 \u0000\u0000"+
		"\u00d7\u00d9\u0003 \u0010\u0001\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9"+
		"\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db!\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\u0011\uffff\uffff\u0000\u00de"+
		"\u00df\u0003\b\u0004\u0000\u00df\u00e5\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\n\u0001\u0000\u0000\u00e1\u00e2\u0005.\u0000\u0000\u00e2\u00e4\u0003"+
		"\"\u0011\u0001\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6#\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005C\u0000\u0000\u00e9%\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0003(\u0014\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0007\u0001\u0000\u0000\u00ed)\u0001\u0000\u0000\u0000\u00ee\u00f4\u0003"+
		"0\u0018\u0000\u00ef\u00f4\u0003,\u0016\u0000\u00f0\u00f4\u0003.\u0017"+
		"\u0000\u00f1\u00f4\u00032\u0019\u0000\u00f2\u00f4\u00034\u001a\u0000\u00f3"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4+\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0005>\u0000\u0000\u00f6-\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005@"+
		"\u0000\u0000\u00f8/\u0001\u0000\u0000\u0000\u00f9\u00fa\u00059\u0000\u0000"+
		"\u00fa1\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005B\u0000\u0000\u00fc3"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0007\u0002\u0000\u0000\u00fe5\u0001"+
		"\u0000\u0000\u0000\u00159=EOTXgmsw\u0081\u0091\u009b\u00a4\u00af\u00b9"+
		"\u00c4\u00cf\u00da\u00e5\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}