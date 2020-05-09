// Generated from /Users/ajc/Documents/projects/arms/arms.github.io/antlr/arms.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class armsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TEMPLATE=16, 
		FOR=17, IF=18, ELSE=19, PRIMITIVE=20, MODEL=21, UNITS=22, INTERP_NAME=23, 
		NAME=24, STRING=25, COLOR=26, NUMBER=27, BLOCK_COMMENT=28, LINE_COMMENT=29, 
		WHITESPACE=30;
	public static final int
		RULE_program = 0, RULE_model = 1, RULE_attributeBlock = 2, RULE_attribute = 3, 
		RULE_statement = 4, RULE_block = 5, RULE_variable = 6, RULE_template = 7, 
		RULE_invocation = 8, RULE_expression = 9, RULE_ternary = 10, RULE_primitive = 11, 
		RULE_math = 12;
	public static final String[] ruleNames = {
		"program", "model", "attributeBlock", "attribute", "statement", "block", 
		"variable", "template", "invocation", "expression", "ternary", "primitive", 
		"math"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'{'", "'}'", "'('", "','", "')'", "'?'", "':'", "'-'", "'['", 
		"']'", "'^'", "'*'", "'/'", "'+'", "'template'", "'for'", "'if'", "'else'", 
		null, "'Model'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TEMPLATE", "FOR", "IF", "ELSE", "PRIMITIVE", 
		"MODEL", "UNITS", "INTERP_NAME", "NAME", "STRING", "COLOR", "NUMBER", 
		"BLOCK_COMMENT", "LINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "arms.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public armsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			model();
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				statement();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TEMPLATE) | (1L << INTERP_NAME) | (1L << NAME))) != 0) );
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

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(armsParser.NAME, 0); }
		public TerminalNode MODEL() { return getToken(armsParser.MODEL, 0); }
		public AttributeBlockContext attributeBlock() {
			return getRuleContext(AttributeBlockContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NAME);
			setState(33);
			match(T__0);
			setState(34);
			match(MODEL);
			setState(35);
			attributeBlock();
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

	public static class AttributeBlockContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeBlock; }
	}

	public final AttributeBlockContext attributeBlock() throws RecognitionException {
		AttributeBlockContext _localctx = new AttributeBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(38);
				attribute();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__2);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(armsParser.NAME, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode STRING() { return getToken(armsParser.STRING, 0); }
		public TerminalNode UNITS() { return getToken(armsParser.UNITS, 0); }
		public TerminalNode COLOR() { return getToken(armsParser.COLOR, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(NAME);
			setState(47);
			match(T__0);
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				math(0);
				}
				break;
			case 2:
				{
				setState(49);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(50);
				match(UNITS);
				}
				break;
			case 4:
				{
				setState(51);
				match(COLOR);
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				template();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				invocation();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TEMPLATE) | (1L << INTERP_NAME) | (1L << NAME))) != 0) );
			setState(66);
			match(T__2);
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

	public static class VariableContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(armsParser.NAME, 0); }
		public TerminalNode INTERP_NAME() { return getToken(armsParser.INTERP_NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==INTERP_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(69);
			match(T__0);
			setState(70);
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

	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(armsParser.TEMPLATE, 0); }
		public List<TerminalNode> NAME() { return getTokens(armsParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(armsParser.NAME, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(TEMPLATE);
			setState(73);
			match(NAME);
			setState(74);
			match(T__3);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(75);
				match(NAME);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(76);
					match(T__4);
					setState(77);
					match(NAME);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(T__5);
			setState(86);
			block();
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

	public static class InvocationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(armsParser.NAME, 0); }
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NAME);
			setState(89);
			match(T__3);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__8) | (1L << T__9) | (1L << NAME) | (1L << STRING) | (1L << NUMBER))) != 0)) {
				{
				setState(90);
				math(0);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(91);
					match(T__4);
					setState(92);
					math(0);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(T__5);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				ternary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				primitive();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				math(0);
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

	public static class TernaryContext extends ParserRuleContext {
		public MathContext cond;
		public MathContext tbranch;
		public MathContext fbranch;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ternary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			((TernaryContext)_localctx).cond = math(0);
			setState(108);
			match(T__6);
			setState(109);
			((TernaryContext)_localctx).tbranch = math(0);
			setState(110);
			match(T__7);
			setState(111);
			((TernaryContext)_localctx).fbranch = math(0);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE() { return getToken(armsParser.PRIMITIVE, 0); }
		public AttributeBlockContext attributeBlock() {
			return getRuleContext(AttributeBlockContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PRIMITIVE);
			setState(114);
			attributeBlock();
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

	public static class MathContext extends ParserRuleContext {
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
	 
		public MathContext() { }
		public void copyFrom(MathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends MathContext {
		public MathContext left;
		public Token operator;
		public MathContext right;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public MultiplicationContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends MathContext {
		public MathContext left;
		public Token operator;
		public MathContext right;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public AdditionContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class SubtractionContext extends MathContext {
		public MathContext left;
		public Token operator;
		public MathContext right;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public SubtractionContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class NumberContext extends MathContext {
		public TerminalNode NUMBER() { return getToken(armsParser.NUMBER, 0); }
		public NumberContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class Vector3Context extends MathContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public Vector3Context(MathContext ctx) { copyFrom(ctx); }
	}
	public static class DivisionContext extends MathContext {
		public MathContext left;
		public Token operator;
		public MathContext right;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public DivisionContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class StringContext extends MathContext {
		public TerminalNode STRING() { return getToken(armsParser.STRING, 0); }
		public StringContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class Vector4Context extends MathContext {
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public Vector4Context(MathContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesesContext extends MathContext {
		public ExpressionContext inner;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class PowerContext extends MathContext {
		public MathContext left;
		public Token operator;
		public MathContext right;
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public PowerContext(MathContext ctx) { copyFrom(ctx); }
	}
	public static class NameContext extends MathContext {
		public TerminalNode NAME() { return getToken(armsParser.NAME, 0); }
		public NameContext(MathContext ctx) { copyFrom(ctx); }
	}

	public final MathContext math() throws RecognitionException {
		return math(0);
	}

	private MathContext math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathContext _localctx = new MathContext(_ctx, _parentState);
		MathContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_math, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(118);
					match(T__8);
					}
				}

				setState(121);
				match(NAME);
				}
				break;
			case 3:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new Vector3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__9);
				setState(124);
				math(0);
				setState(125);
				math(0);
				setState(126);
				math(0);
				setState(127);
				match(T__10);
				}
				break;
			case 5:
				{
				_localctx = new Vector4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__9);
				setState(130);
				math(0);
				setState(131);
				math(0);
				setState(132);
				math(0);
				setState(133);
				math(0);
				setState(134);
				match(T__10);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(T__3);
				setState(137);
				((ParenthesesContext)_localctx).inner = expression();
				setState(138);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new MathContext(_parentctx, _parentState));
						((PowerContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						((PowerContext)_localctx).operator = match(T__11);
						setState(144);
						((PowerContext)_localctx).right = math(6);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new MathContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						((MultiplicationContext)_localctx).operator = match(T__12);
						setState(147);
						((MultiplicationContext)_localctx).right = math(5);
						}
						break;
					case 3:
						{
						_localctx = new DivisionContext(new MathContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						((DivisionContext)_localctx).operator = match(T__13);
						setState(150);
						((DivisionContext)_localctx).right = math(4);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new MathContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(151);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(152);
						((AdditionContext)_localctx).operator = match(T__14);
						setState(153);
						((AdditionContext)_localctx).right = math(3);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new MathContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_math);
						setState(154);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(155);
						((SubtractionContext)_localctx).operator = match(T__8);
						setState(156);
						((SubtractionContext)_localctx).right = math(2);
						}
						break;
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return math_sempred((MathContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sempred(MathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\6\7A\n\7\r\7\16\7B\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tQ\n\t\f\t\16\tT\13\t\5"+
		"\tV\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n`\n\n\f\n\16\nc\13\n\5\ne\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\5\16z\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00a0\n\16\f\16\16\16\u00a3\13\16\3\16\2\3\32\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\3\3\2\31\32\2\u00b1\2\34\3\2\2\2\4\"\3\2\2\2"+
		"\6\'\3\2\2\2\b\60\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2\16F\3\2\2\2\20J\3\2\2"+
		"\2\22Z\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30s\3\2\2\2\32\u008e\3\2\2\2\34"+
		"\36\5\4\3\2\35\37\5\n\6\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\3\3\2\2\2\"#\7\32\2\2#$\7\3\2\2$%\7\27\2\2%&\5\6\4\2&\5\3\2\2\2"+
		"\'+\7\4\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2"+
		"\2-+\3\2\2\2./\7\5\2\2/\7\3\2\2\2\60\61\7\32\2\2\61\66\7\3\2\2\62\67\5"+
		"\32\16\2\63\67\7\33\2\2\64\67\7\30\2\2\65\67\7\34\2\2\66\62\3\2\2\2\66"+
		"\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28=\5\f\7\29=\5\16"+
		"\b\2:=\5\20\t\2;=\5\22\n\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\13"+
		"\3\2\2\2>@\7\4\2\2?A\5\n\6\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"D\3\2\2\2DE\7\5\2\2E\r\3\2\2\2FG\t\2\2\2GH\7\3\2\2HI\5\24\13\2I\17\3\2"+
		"\2\2JK\7\22\2\2KL\7\32\2\2LU\7\6\2\2MR\7\32\2\2NO\7\7\2\2OQ\7\32\2\2P"+
		"N\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UM\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\7\b\2\2XY\5\f\7\2Y\21\3\2\2\2Z[\7\32\2\2[d\7\6"+
		"\2\2\\a\5\32\16\2]^\7\7\2\2^`\5\32\16\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2"+
		"ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\b\2"+
		"\2g\23\3\2\2\2hl\5\26\f\2il\5\30\r\2jl\5\32\16\2kh\3\2\2\2ki\3\2\2\2k"+
		"j\3\2\2\2l\25\3\2\2\2mn\5\32\16\2no\7\t\2\2op\5\32\16\2pq\7\n\2\2qr\5"+
		"\32\16\2r\27\3\2\2\2st\7\26\2\2tu\5\6\4\2u\31\3\2\2\2vw\b\16\1\2w\u008f"+
		"\7\35\2\2xz\7\13\2\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u008f\7\32\2\2|\u008f"+
		"\7\33\2\2}~\7\f\2\2~\177\5\32\16\2\177\u0080\5\32\16\2\u0080\u0081\5\32"+
		"\16\2\u0081\u0082\7\r\2\2\u0082\u008f\3\2\2\2\u0083\u0084\7\f\2\2\u0084"+
		"\u0085\5\32\16\2\u0085\u0086\5\32\16\2\u0086\u0087\5\32\16\2\u0087\u0088"+
		"\5\32\16\2\u0088\u0089\7\r\2\2\u0089\u008f\3\2\2\2\u008a\u008b\7\6\2\2"+
		"\u008b\u008c\5\24\13\2\u008c\u008d\7\b\2\2\u008d\u008f\3\2\2\2\u008ev"+
		"\3\2\2\2\u008ey\3\2\2\2\u008e|\3\2\2\2\u008e}\3\2\2\2\u008e\u0083\3\2"+
		"\2\2\u008e\u008a\3\2\2\2\u008f\u00a1\3\2\2\2\u0090\u0091\f\7\2\2\u0091"+
		"\u0092\7\16\2\2\u0092\u00a0\5\32\16\b\u0093\u0094\f\6\2\2\u0094\u0095"+
		"\7\17\2\2\u0095\u00a0\5\32\16\7\u0096\u0097\f\5\2\2\u0097\u0098\7\20\2"+
		"\2\u0098\u00a0\5\32\16\6\u0099\u009a\f\4\2\2\u009a\u009b\7\21\2\2\u009b"+
		"\u00a0\5\32\16\5\u009c\u009d\f\3\2\2\u009d\u009e\7\13\2\2\u009e\u00a0"+
		"\5\32\16\4\u009f\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0096\3\2\2\2"+
		"\u009f\u0099\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a1\3\2\2\2\20 "+
		"+\66<BRUadky\u008e\u009f\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}