// Generated from C:/Users/William Luo/Desktop/University/CPSC 311/sgl2d/starter/src\SGL2D.g4 by ANTLR 4.7.2
package SGL2DANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SGL2DParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ENVIRONMENT=7, GOAL=8, 
		PLAYER=9, SPRITE=10, COUNTER=11, EVENT=12, SET=13, ARROW=14, INT=15, XINT=16, 
		YINT=17, COLOR=18, SOLID=19, COMMAND=20, WHITESPACE=21, BOOLEAN=22, WORD=23, 
		NEWLINE=24;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_environment = 2, RULE_goal = 3, 
		RULE_player = 4, RULE_sprite = 5, RULE_counter = 6, RULE_event = 7, RULE_set = 8, 
		RULE_newline = 9, RULE_position = 10, RULE_range = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "environment", "goal", "player", "sprite", "counter", 
			"event", "set", "newline", "position", "range"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'1'", "'2'", "'3'", "'('", "','", "')'", null, null, null, null, 
			null, null, null, "'>'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ENVIRONMENT", "GOAL", "PLAYER", 
			"SPRITE", "COUNTER", "EVENT", "SET", "ARROW", "INT", "XINT", "YINT", 
			"COLOR", "SOLID", "COMMAND", "WHITESPACE", "BOOLEAN", "WORD", "NEWLINE"
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
	public String getGrammarFileName() { return "SGL2D.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SGL2DParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SGL2DParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			expression();
			setState(25);
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

	public static class ExpressionContext extends ParserRuleContext {
		public EnvironmentContext environment() {
			return getRuleContext(EnvironmentContext.class,0);
		}
		public GoalContext goal() {
			return getRuleContext(GoalContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public SpriteContext sprite() {
			return getRuleContext(SpriteContext.class,0);
		}
		public CounterContext counter() {
			return getRuleContext(CounterContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				environment();
				}
				break;
			case GOAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				goal();
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				player();
				}
				break;
			case SPRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				sprite();
				}
				break;
			case COUNTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				counter();
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				event();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 8);
				{
				setState(34);
				set();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(35);
				newline();
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

	public static class EnvironmentContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(SGL2DParser.ENVIRONMENT, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> XINT() { return getTokens(SGL2DParser.XINT); }
		public TerminalNode XINT(int i) {
			return getToken(SGL2DParser.XINT, i);
		}
		public List<TerminalNode> YINT() { return getTokens(SGL2DParser.YINT); }
		public TerminalNode YINT(int i) {
			return getToken(SGL2DParser.YINT, i);
		}
		public EnvironmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterEnvironment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitEnvironment(this);
		}
	}

	public final EnvironmentContext environment() throws RecognitionException {
		EnvironmentContext _localctx = new EnvironmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_environment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(ENVIRONMENT);
			setState(39);
			match(ARROW);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(40);
				_la = _input.LA(1);
				if ( !(_la==XINT || _la==YINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(46);
				match(NEWLINE);
				setState(47);
				expression();
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

	public static class GoalContext extends ParserRuleContext {
		public TerminalNode GOAL() { return getToken(SGL2DParser.GOAL, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> XINT() { return getTokens(SGL2DParser.XINT); }
		public TerminalNode XINT(int i) {
			return getToken(SGL2DParser.XINT, i);
		}
		public List<TerminalNode> YINT() { return getTokens(SGL2DParser.YINT); }
		public TerminalNode YINT(int i) {
			return getToken(SGL2DParser.YINT, i);
		}
		public List<TerminalNode> COLOR() { return getTokens(SGL2DParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(SGL2DParser.COLOR, i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(GOAL);
			setState(51);
			match(ARROW);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(52);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(58);
				match(NEWLINE);
				setState(59);
				expression();
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(SGL2DParser.PLAYER, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> XINT() { return getTokens(SGL2DParser.XINT); }
		public TerminalNode XINT(int i) {
			return getToken(SGL2DParser.XINT, i);
		}
		public List<TerminalNode> YINT() { return getTokens(SGL2DParser.YINT); }
		public TerminalNode YINT(int i) {
			return getToken(SGL2DParser.YINT, i);
		}
		public List<TerminalNode> COLOR() { return getTokens(SGL2DParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(SGL2DParser.COLOR, i);
		}
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayer(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(PLAYER);
			setState(63);
			match(ARROW);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(64);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(70);
				match(NEWLINE);
				setState(71);
				expression();
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

	public static class SpriteContext extends ParserRuleContext {
		public TerminalNode SPRITE() { return getToken(SGL2DParser.SPRITE, 0); }
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLOR() { return getTokens(SGL2DParser.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(SGL2DParser.COLOR, i);
		}
		public List<TerminalNode> SOLID() { return getTokens(SGL2DParser.SOLID); }
		public TerminalNode SOLID(int i) {
			return getToken(SGL2DParser.SOLID, i);
		}
		public SpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterSprite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitSprite(this);
		}
	}

	public final SpriteContext sprite() throws RecognitionException {
		SpriteContext _localctx = new SpriteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sprite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(SPRITE);
			setState(75);
			match(WORD);
			setState(76);
			match(ARROW);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR || _la==SOLID) {
				{
				{
				setState(77);
				_la = _input.LA(1);
				if ( !(_la==COLOR || _la==SOLID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(83);
				match(NEWLINE);
				setState(84);
				expression();
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

	public static class CounterContext extends ParserRuleContext {
		public TerminalNode COUNTER() { return getToken(SGL2DParser.COUNTER, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(SGL2DParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(SGL2DParser.BOOLEAN, i);
		}
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public CounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitCounter(this);
		}
	}

	public final CounterContext counter() throws RecognitionException {
		CounterContext _localctx = new CounterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_counter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(COUNTER);
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			match(ARROW);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==BOOLEAN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(96);
				match(NEWLINE);
				setState(97);
				expression();
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(SGL2DParser.EVENT, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode SPRITE() { return getToken(SGL2DParser.SPRITE, 0); }
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode GOAL() { return getToken(SGL2DParser.GOAL, 0); }
		public List<TerminalNode> COMMAND() { return getTokens(SGL2DParser.COMMAND); }
		public TerminalNode COMMAND(int i) {
			return getToken(SGL2DParser.COMMAND, i);
		}
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(EVENT);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPRITE:
				{
				setState(101);
				match(SPRITE);
				setState(102);
				match(WORD);
				}
				break;
			case GOAL:
				{
				setState(103);
				match(GOAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(ARROW);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(107);
				match(COMMAND);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(113);
				match(NEWLINE);
				setState(114);
				expression();
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SGL2DParser.SET, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public TerminalNode SPRITE() { return getToken(SGL2DParser.SPRITE, 0); }
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode GOAL() { return getToken(SGL2DParser.GOAL, 0); }
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SET);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPRITE:
				{
				setState(118);
				match(SPRITE);
				setState(119);
				match(WORD);
				}
				break;
			case GOAL:
				{
				setState(120);
				match(GOAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(ARROW);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case XINT:
				case YINT:
					{
					setState(124);
					position();
					}
					break;
				case T__3:
					{
					setState(125);
					range();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << XINT) | (1L << YINT))) != 0) );
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(130);
				match(NEWLINE);
				setState(131);
				expression();
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

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(NEWLINE);
			setState(135);
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode XINT() { return getToken(SGL2DParser.XINT, 0); }
		public TerminalNode YINT() { return getToken(SGL2DParser.YINT, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_position);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case XINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(XINT);
				setState(138);
				match(YINT);
				}
				break;
			case YINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(YINT);
				setState(140);
				match(XINT);
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

	public static class RangeContext extends ParserRuleContext {
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__3);
			setState(144);
			position();
			setState(145);
			match(T__4);
			setState(146);
			position();
			setState(147);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\'\n\3\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\5\4\63\n\4\3\5"+
		"\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\7\6D\n\6"+
		"\f\6\16\6G\13\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13"+
		"\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\b\3\b\5"+
		"\be\n\b\3\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\7\to\n\t\f\t\16\tr\13\t\3\t\3"+
		"\t\5\tv\n\t\3\n\3\n\3\n\3\n\5\n|\n\n\3\n\3\n\3\n\6\n\u0081\n\n\r\n\16"+
		"\n\u0082\3\n\3\n\5\n\u0087\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0090"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\7\3\2\22\23\3\2\22\24\3\2\24\25\3\2\3\5\4\2\21\21\30\30\2\u00a5\2\32"+
		"\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b\64\3\2\2\2\n@\3\2\2\2\fL\3\2\2\2\16Y"+
		"\3\2\2\2\20f\3\2\2\2\22w\3\2\2\2\24\u0088\3\2\2\2\26\u008f\3\2\2\2\30"+
		"\u0091\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\'\3\2\2\2\36"+
		"\'\5\6\4\2\37\'\5\b\5\2 \'\5\n\6\2!\'\5\f\7\2\"\'\5\16\b\2#\'\5\20\t\2"+
		"$\'\5\22\n\2%\'\5\24\13\2&\35\3\2\2\2&\36\3\2\2\2&\37\3\2\2\2& \3\2\2"+
		"\2&!\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\7"+
		"\t\2\2)-\7\20\2\2*,\t\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\62"+
		"\3\2\2\2/-\3\2\2\2\60\61\7\32\2\2\61\63\5\4\3\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\7\3\2\2\2\64\65\7\n\2\2\659\7\20\2\2\668\t\3\2\2\67\66\3\2\2"+
		"\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;9\3\2\2\2<=\7\32\2\2=?\5"+
		"\4\3\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@A\7\13\2\2AE\7\20\2\2BD\t\3\2\2"+
		"CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GE\3\2\2\2HI\7\32\2"+
		"\2IK\5\4\3\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LM\7\f\2\2MN\7\31\2\2NR\7"+
		"\20\2\2OQ\t\4\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SW\3\2\2\2TR"+
		"\3\2\2\2UV\7\32\2\2VX\5\4\3\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YZ\7\r\2\2"+
		"Z[\t\5\2\2[_\7\20\2\2\\^\t\6\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`d\3\2\2\2a_\3\2\2\2bc\7\32\2\2ce\5\4\3\2db\3\2\2\2de\3\2\2\2e\17"+
		"\3\2\2\2fj\7\16\2\2gh\7\f\2\2hk\7\31\2\2ik\7\n\2\2jg\3\2\2\2ji\3\2\2\2"+
		"kl\3\2\2\2lp\7\20\2\2mo\7\26\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2"+
		"\2qu\3\2\2\2rp\3\2\2\2st\7\32\2\2tv\5\4\3\2us\3\2\2\2uv\3\2\2\2v\21\3"+
		"\2\2\2w{\7\17\2\2xy\7\f\2\2y|\7\31\2\2z|\7\n\2\2{x\3\2\2\2{z\3\2\2\2|"+
		"}\3\2\2\2}\u0080\7\20\2\2~\u0081\5\26\f\2\177\u0081\5\30\r\2\u0080~\3"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\7\32\2\2\u0085\u0087\5"+
		"\4\3\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23\3\2\2\2\u0088"+
		"\u0089\7\32\2\2\u0089\u008a\5\4\3\2\u008a\25\3\2\2\2\u008b\u008c\7\22"+
		"\2\2\u008c\u0090\7\23\2\2\u008d\u008e\7\23\2\2\u008e\u0090\7\22\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008d\3\2\2\2\u0090\27\3\2\2\2\u0091\u0092\7\6\2"+
		"\2\u0092\u0093\5\26\f\2\u0093\u0094\7\7\2\2\u0094\u0095\5\26\f\2\u0095"+
		"\u0096\7\b\2\2\u0096\31\3\2\2\2\25&-\629>EJRW_djpu{\u0080\u0082\u0086"+
		"\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}