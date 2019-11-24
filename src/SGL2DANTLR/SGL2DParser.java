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
		T__0=1, T__1=2, T__2=3, INCCOUNTERONE=4, DECCOUNTERONE=5, INCCOUNTERTWO=6, 
		DECCOUNTERTWO=7, INCCOUNTERTHREE=8, DECCOUNTERTHREE=9, INCSPRITECOUNTER=10, 
		DECSPRITECOUNTER=11, SETSPRITECOUNTER=12, TRANSFORMONZERO=13, GAMEOVERONZERO=14, 
		WINONZERO=15, MOVETORANDOM=16, TRANSFORMTOSPRITE=17, MOVEPLAYERTO=18, 
		GAMEOVER=19, WIN=20, ENVIRONMENT=21, GOAL=22, PLAYER=23, SPRITE=24, COUNTER=25, 
		EVENT=26, SET=27, COUNTERINDEX=28, ARROW=29, INT=30, XINT=31, YINT=32, 
		COLOR=33, SOLID=34, COMMAND=35, WHITESPACE=36, BOOLEAN=37, WORD=38, NEWLINE=39;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_environment = 2, RULE_goal = 3, 
		RULE_player = 4, RULE_sprite = 5, RULE_counter = 6, RULE_event = 7, RULE_set = 8, 
		RULE_newline = 9, RULE_position = 10, RULE_range = 11, RULE_action = 12, 
		RULE_incCounter1 = 13, RULE_decCounter1 = 14, RULE_incCounter2 = 15, RULE_decCounter2 = 16, 
		RULE_incCounter3 = 17, RULE_decCounter3 = 18, RULE_incSpriteCounter = 19, 
		RULE_decSpriteCounter = 20, RULE_setSpriteCounter = 21, RULE_transformOnZeroCounter = 22, 
		RULE_gameOverOnZeroCounter = 23, RULE_winOnZeroCounter = 24, RULE_moveToRandom = 25, 
		RULE_transformToSprite = 26, RULE_movePlayerTo = 27, RULE_gameOver = 28, 
		RULE_win = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "environment", "goal", "player", "sprite", "counter", 
			"event", "set", "newline", "position", "range", "action", "incCounter1", 
			"decCounter1", "incCounter2", "decCounter2", "incCounter3", "decCounter3", 
			"incSpriteCounter", "decSpriteCounter", "setSpriteCounter", "transformOnZeroCounter", 
			"gameOverOnZeroCounter", "winOnZeroCounter", "moveToRandom", "transformToSprite", 
			"movePlayerTo", "gameOver", "win"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'>'", null, null, null, null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INCCOUNTERONE", "DECCOUNTERONE", "INCCOUNTERTWO", 
			"DECCOUNTERTWO", "INCCOUNTERTHREE", "DECCOUNTERTHREE", "INCSPRITECOUNTER", 
			"DECSPRITECOUNTER", "SETSPRITECOUNTER", "TRANSFORMONZERO", "GAMEOVERONZERO", 
			"WINONZERO", "MOVETORANDOM", "TRANSFORMTOSPRITE", "MOVEPLAYERTO", "GAMEOVER", 
			"WIN", "ENVIRONMENT", "GOAL", "PLAYER", "SPRITE", "COUNTER", "EVENT", 
			"SET", "COUNTERINDEX", "ARROW", "INT", "XINT", "YINT", "COLOR", "SOLID", 
			"COMMAND", "WHITESPACE", "BOOLEAN", "WORD", "NEWLINE"
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				expression();
				setState(62);
				match(EOF);
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
			setState(75);
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
				setState(67);
				environment();
				}
				break;
			case GOAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				goal();
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				player();
				}
				break;
			case SPRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				sprite();
				}
				break;
			case COUNTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				counter();
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				event();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 8);
				{
				setState(73);
				set();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
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
			setState(77);
			match(ENVIRONMENT);
			setState(78);
			match(ARROW);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(79);
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
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(85);
				match(NEWLINE);
				setState(86);
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
			setState(89);
			match(GOAL);
			setState(90);
			match(ARROW);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(91);
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
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(97);
				match(NEWLINE);
				setState(98);
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
			setState(101);
			match(PLAYER);
			setState(102);
			match(ARROW);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(103);
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
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(109);
				match(NEWLINE);
				setState(110);
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
			setState(113);
			match(SPRITE);
			setState(114);
			match(WORD);
			setState(115);
			match(ARROW);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR || _la==SOLID) {
				{
				{
				setState(116);
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
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(122);
				match(NEWLINE);
				setState(123);
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
		public TerminalNode COUNTERINDEX() { return getToken(SGL2DParser.COUNTERINDEX, 0); }
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
			setState(126);
			match(COUNTER);
			setState(127);
			match(COUNTERINDEX);
			setState(128);
			match(ARROW);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(129);
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
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(135);
				match(NEWLINE);
				setState(136);
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
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
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
			setState(139);
			match(EVENT);
			setState(140);
			match(WORD);
			setState(141);
			match(ARROW);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCCOUNTERONE) | (1L << DECCOUNTERONE) | (1L << INCCOUNTERTWO) | (1L << DECCOUNTERTWO) | (1L << INCCOUNTERTHREE) | (1L << DECCOUNTERTHREE) | (1L << INCSPRITECOUNTER) | (1L << DECSPRITECOUNTER) | (1L << SETSPRITECOUNTER) | (1L << TRANSFORMONZERO) | (1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << MOVETORANDOM) | (1L << TRANSFORMTOSPRITE) | (1L << MOVEPLAYERTO) | (1L << GAMEOVER) | (1L << WIN))) != 0)) {
				{
				{
				setState(142);
				action();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(148);
				match(NEWLINE);
				setState(149);
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
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(152);
			match(SET);
			setState(153);
			match(WORD);
			setState(154);
			match(ARROW);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case XINT:
				case YINT:
					{
					setState(155);
					position();
					}
					break;
				case T__0:
					{
					setState(156);
					range();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << XINT) | (1L << YINT))) != 0) );
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(161);
				match(NEWLINE);
				setState(162);
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
			setState(165);
			match(NEWLINE);
			setState(166);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case XINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(XINT);
				setState(169);
				match(YINT);
				}
				break;
			case YINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(YINT);
				setState(171);
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
			setState(174);
			match(T__0);
			setState(175);
			position();
			setState(176);
			match(T__1);
			setState(177);
			position();
			setState(178);
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

	public static class ActionContext extends ParserRuleContext {
		public IncCounter1Context incCounter1() {
			return getRuleContext(IncCounter1Context.class,0);
		}
		public DecCounter1Context decCounter1() {
			return getRuleContext(DecCounter1Context.class,0);
		}
		public IncCounter2Context incCounter2() {
			return getRuleContext(IncCounter2Context.class,0);
		}
		public DecCounter2Context decCounter2() {
			return getRuleContext(DecCounter2Context.class,0);
		}
		public IncCounter3Context incCounter3() {
			return getRuleContext(IncCounter3Context.class,0);
		}
		public DecCounter3Context decCounter3() {
			return getRuleContext(DecCounter3Context.class,0);
		}
		public IncSpriteCounterContext incSpriteCounter() {
			return getRuleContext(IncSpriteCounterContext.class,0);
		}
		public DecSpriteCounterContext decSpriteCounter() {
			return getRuleContext(DecSpriteCounterContext.class,0);
		}
		public SetSpriteCounterContext setSpriteCounter() {
			return getRuleContext(SetSpriteCounterContext.class,0);
		}
		public TransformOnZeroCounterContext transformOnZeroCounter() {
			return getRuleContext(TransformOnZeroCounterContext.class,0);
		}
		public GameOverOnZeroCounterContext gameOverOnZeroCounter() {
			return getRuleContext(GameOverOnZeroCounterContext.class,0);
		}
		public WinOnZeroCounterContext winOnZeroCounter() {
			return getRuleContext(WinOnZeroCounterContext.class,0);
		}
		public MoveToRandomContext moveToRandom() {
			return getRuleContext(MoveToRandomContext.class,0);
		}
		public TransformToSpriteContext transformToSprite() {
			return getRuleContext(TransformToSpriteContext.class,0);
		}
		public MovePlayerToContext movePlayerTo() {
			return getRuleContext(MovePlayerToContext.class,0);
		}
		public GameOverContext gameOver() {
			return getRuleContext(GameOverContext.class,0);
		}
		public WinContext win() {
			return getRuleContext(WinContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_action);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCCOUNTERONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				incCounter1();
				}
				break;
			case DECCOUNTERONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				decCounter1();
				}
				break;
			case INCCOUNTERTWO:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				incCounter2();
				}
				break;
			case DECCOUNTERTWO:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				decCounter2();
				}
				break;
			case INCCOUNTERTHREE:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				incCounter3();
				}
				break;
			case DECCOUNTERTHREE:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				decCounter3();
				}
				break;
			case INCSPRITECOUNTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				incSpriteCounter();
				}
				break;
			case DECSPRITECOUNTER:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				decSpriteCounter();
				}
				break;
			case SETSPRITECOUNTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				setSpriteCounter();
				}
				break;
			case TRANSFORMONZERO:
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				transformOnZeroCounter();
				}
				break;
			case GAMEOVERONZERO:
				enterOuterAlt(_localctx, 11);
				{
				setState(190);
				gameOverOnZeroCounter();
				}
				break;
			case WINONZERO:
				enterOuterAlt(_localctx, 12);
				{
				setState(191);
				winOnZeroCounter();
				}
				break;
			case MOVETORANDOM:
				enterOuterAlt(_localctx, 13);
				{
				setState(192);
				moveToRandom();
				}
				break;
			case TRANSFORMTOSPRITE:
				enterOuterAlt(_localctx, 14);
				{
				setState(193);
				transformToSprite();
				}
				break;
			case MOVEPLAYERTO:
				enterOuterAlt(_localctx, 15);
				{
				setState(194);
				movePlayerTo();
				}
				break;
			case GAMEOVER:
				enterOuterAlt(_localctx, 16);
				{
				setState(195);
				gameOver();
				}
				break;
			case WIN:
				enterOuterAlt(_localctx, 17);
				{
				setState(196);
				win();
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

	public static class IncCounter1Context extends ParserRuleContext {
		public TerminalNode INCCOUNTERONE() { return getToken(SGL2DParser.INCCOUNTERONE, 0); }
		public IncCounter1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incCounter1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterIncCounter1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitIncCounter1(this);
		}
	}

	public final IncCounter1Context incCounter1() throws RecognitionException {
		IncCounter1Context _localctx = new IncCounter1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_incCounter1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(INCCOUNTERONE);
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

	public static class DecCounter1Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERONE() { return getToken(SGL2DParser.DECCOUNTERONE, 0); }
		public DecCounter1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decCounter1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterDecCounter1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitDecCounter1(this);
		}
	}

	public final DecCounter1Context decCounter1() throws RecognitionException {
		DecCounter1Context _localctx = new DecCounter1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_decCounter1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(DECCOUNTERONE);
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

	public static class IncCounter2Context extends ParserRuleContext {
		public TerminalNode INCCOUNTERTWO() { return getToken(SGL2DParser.INCCOUNTERTWO, 0); }
		public IncCounter2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incCounter2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterIncCounter2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitIncCounter2(this);
		}
	}

	public final IncCounter2Context incCounter2() throws RecognitionException {
		IncCounter2Context _localctx = new IncCounter2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_incCounter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(INCCOUNTERTWO);
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

	public static class DecCounter2Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERTWO() { return getToken(SGL2DParser.DECCOUNTERTWO, 0); }
		public DecCounter2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decCounter2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterDecCounter2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitDecCounter2(this);
		}
	}

	public final DecCounter2Context decCounter2() throws RecognitionException {
		DecCounter2Context _localctx = new DecCounter2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_decCounter2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DECCOUNTERTWO);
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

	public static class IncCounter3Context extends ParserRuleContext {
		public TerminalNode INCCOUNTERTHREE() { return getToken(SGL2DParser.INCCOUNTERTHREE, 0); }
		public IncCounter3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incCounter3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterIncCounter3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitIncCounter3(this);
		}
	}

	public final IncCounter3Context incCounter3() throws RecognitionException {
		IncCounter3Context _localctx = new IncCounter3Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_incCounter3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(INCCOUNTERTHREE);
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

	public static class DecCounter3Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERTHREE() { return getToken(SGL2DParser.DECCOUNTERTHREE, 0); }
		public DecCounter3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decCounter3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterDecCounter3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitDecCounter3(this);
		}
	}

	public final DecCounter3Context decCounter3() throws RecognitionException {
		DecCounter3Context _localctx = new DecCounter3Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_decCounter3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(DECCOUNTERTHREE);
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

	public static class IncSpriteCounterContext extends ParserRuleContext {
		public TerminalNode INCSPRITECOUNTER() { return getToken(SGL2DParser.INCSPRITECOUNTER, 0); }
		public IncSpriteCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incSpriteCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterIncSpriteCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitIncSpriteCounter(this);
		}
	}

	public final IncSpriteCounterContext incSpriteCounter() throws RecognitionException {
		IncSpriteCounterContext _localctx = new IncSpriteCounterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_incSpriteCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(INCSPRITECOUNTER);
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

	public static class DecSpriteCounterContext extends ParserRuleContext {
		public TerminalNode DECSPRITECOUNTER() { return getToken(SGL2DParser.DECSPRITECOUNTER, 0); }
		public DecSpriteCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decSpriteCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterDecSpriteCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitDecSpriteCounter(this);
		}
	}

	public final DecSpriteCounterContext decSpriteCounter() throws RecognitionException {
		DecSpriteCounterContext _localctx = new DecSpriteCounterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decSpriteCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(DECSPRITECOUNTER);
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

	public static class SetSpriteCounterContext extends ParserRuleContext {
		public TerminalNode SETSPRITECOUNTER() { return getToken(SGL2DParser.SETSPRITECOUNTER, 0); }
		public SetSpriteCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSpriteCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterSetSpriteCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitSetSpriteCounter(this);
		}
	}

	public final SetSpriteCounterContext setSpriteCounter() throws RecognitionException {
		SetSpriteCounterContext _localctx = new SetSpriteCounterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setSpriteCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(SETSPRITECOUNTER);
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

	public static class TransformOnZeroCounterContext extends ParserRuleContext {
		public TerminalNode TRANSFORMONZERO() { return getToken(SGL2DParser.TRANSFORMONZERO, 0); }
		public TransformOnZeroCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformOnZeroCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterTransformOnZeroCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitTransformOnZeroCounter(this);
		}
	}

	public final TransformOnZeroCounterContext transformOnZeroCounter() throws RecognitionException {
		TransformOnZeroCounterContext _localctx = new TransformOnZeroCounterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_transformOnZeroCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TRANSFORMONZERO);
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

	public static class GameOverOnZeroCounterContext extends ParserRuleContext {
		public TerminalNode GAMEOVERONZERO() { return getToken(SGL2DParser.GAMEOVERONZERO, 0); }
		public GameOverOnZeroCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameOverOnZeroCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterGameOverOnZeroCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitGameOverOnZeroCounter(this);
		}
	}

	public final GameOverOnZeroCounterContext gameOverOnZeroCounter() throws RecognitionException {
		GameOverOnZeroCounterContext _localctx = new GameOverOnZeroCounterContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gameOverOnZeroCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(GAMEOVERONZERO);
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

	public static class WinOnZeroCounterContext extends ParserRuleContext {
		public TerminalNode WINONZERO() { return getToken(SGL2DParser.WINONZERO, 0); }
		public WinOnZeroCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winOnZeroCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterWinOnZeroCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitWinOnZeroCounter(this);
		}
	}

	public final WinOnZeroCounterContext winOnZeroCounter() throws RecognitionException {
		WinOnZeroCounterContext _localctx = new WinOnZeroCounterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_winOnZeroCounter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(WINONZERO);
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

	public static class MoveToRandomContext extends ParserRuleContext {
		public TerminalNode MOVETORANDOM() { return getToken(SGL2DParser.MOVETORANDOM, 0); }
		public MoveToRandomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToRandom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterMoveToRandom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitMoveToRandom(this);
		}
	}

	public final MoveToRandomContext moveToRandom() throws RecognitionException {
		MoveToRandomContext _localctx = new MoveToRandomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_moveToRandom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(MOVETORANDOM);
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

	public static class TransformToSpriteContext extends ParserRuleContext {
		public TerminalNode TRANSFORMTOSPRITE() { return getToken(SGL2DParser.TRANSFORMTOSPRITE, 0); }
		public TransformToSpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformToSprite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterTransformToSprite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitTransformToSprite(this);
		}
	}

	public final TransformToSpriteContext transformToSprite() throws RecognitionException {
		TransformToSpriteContext _localctx = new TransformToSpriteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_transformToSprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TRANSFORMTOSPRITE);
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

	public static class MovePlayerToContext extends ParserRuleContext {
		public TerminalNode MOVEPLAYERTO() { return getToken(SGL2DParser.MOVEPLAYERTO, 0); }
		public List<TerminalNode> XINT() { return getTokens(SGL2DParser.XINT); }
		public TerminalNode XINT(int i) {
			return getToken(SGL2DParser.XINT, i);
		}
		public List<TerminalNode> YINT() { return getTokens(SGL2DParser.YINT); }
		public TerminalNode YINT(int i) {
			return getToken(SGL2DParser.YINT, i);
		}
		public MovePlayerToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movePlayerTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterMovePlayerTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitMovePlayerTo(this);
		}
	}

	public final MovePlayerToContext movePlayerTo() throws RecognitionException {
		MovePlayerToContext _localctx = new MovePlayerToContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_movePlayerTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(MOVEPLAYERTO);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(228);
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
				setState(233);
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

	public static class GameOverContext extends ParserRuleContext {
		public TerminalNode GAMEOVER() { return getToken(SGL2DParser.GAMEOVER, 0); }
		public GameOverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameOver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterGameOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitGameOver(this);
		}
	}

	public final GameOverContext gameOver() throws RecognitionException {
		GameOverContext _localctx = new GameOverContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gameOver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(GAMEOVER);
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

	public static class WinContext extends ParserRuleContext {
		public TerminalNode WIN() { return getToken(SGL2DParser.WIN, 0); }
		public WinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_win; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterWin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitWin(this);
		}
	}

	public final WinContext win() throws RecognitionException {
		WinContext _localctx = new WinContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_win);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(WIN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\5\2C\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3"+
		"\4\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\7\5_\n\5\f\5\16"+
		"\5b\13\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6"+
		"\5\6r\n\6\3\7\3\7\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\5\7\177\n\7"+
		"\3\b\3\b\3\b\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\b\3\b\5\b\u008c\n"+
		"\b\3\t\3\t\3\t\3\t\7\t\u0092\n\t\f\t\16\t\u0095\13\t\3\t\3\t\5\t\u0099"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\6\n\u00a0\n\n\r\n\16\n\u00a1\3\n\3\n\5\n\u00a6"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00e8\n\35\f\35\16"+
		"\35\u00eb\13\35\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\6\3\2!\"\3\2!#\3\2#$\4\2  \'"+
		"\'\2\u00fc\2B\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\b[\3\2\2\2\ng\3\2\2\2\fs\3"+
		"\2\2\2\16\u0080\3\2\2\2\20\u008d\3\2\2\2\22\u009a\3\2\2\2\24\u00a7\3\2"+
		"\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2"+
		"\2\36\u00cb\3\2\2\2 \u00cd\3\2\2\2\"\u00cf\3\2\2\2$\u00d1\3\2\2\2&\u00d3"+
		"\3\2\2\2(\u00d5\3\2\2\2*\u00d7\3\2\2\2,\u00d9\3\2\2\2.\u00db\3\2\2\2\60"+
		"\u00dd\3\2\2\2\62\u00df\3\2\2\2\64\u00e1\3\2\2\2\66\u00e3\3\2\2\28\u00e5"+
		"\3\2\2\2:\u00ec\3\2\2\2<\u00ee\3\2\2\2>C\3\2\2\2?@\5\4\3\2@A\7\2\2\3A"+
		"C\3\2\2\2B>\3\2\2\2B?\3\2\2\2C\3\3\2\2\2DN\3\2\2\2EN\5\6\4\2FN\5\b\5\2"+
		"GN\5\n\6\2HN\5\f\7\2IN\5\16\b\2JN\5\20\t\2KN\5\22\n\2LN\5\24\13\2MD\3"+
		"\2\2\2ME\3\2\2\2MF\3\2\2\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3"+
		"\2\2\2ML\3\2\2\2N\5\3\2\2\2OP\7\27\2\2PT\7\37\2\2QS\t\2\2\2RQ\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UY\3\2\2\2VT\3\2\2\2WX\7)\2\2XZ\5\4\3\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2[\\\7\30\2\2\\`\7\37\2\2]_\t\3\2\2^]\3"+
		"\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ae\3\2\2\2b`\3\2\2\2cd\7)\2\2df\5"+
		"\4\3\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2gh\7\31\2\2hl\7\37\2\2ik\t\3\2\2"+
		"ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mq\3\2\2\2nl\3\2\2\2op\7)\2\2"+
		"pr\5\4\3\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2st\7\32\2\2tu\7(\2\2uy\7\37"+
		"\2\2vx\t\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z~\3\2\2\2{y\3\2"+
		"\2\2|}\7)\2\2}\177\5\4\3\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080"+
		"\u0081\7\33\2\2\u0081\u0082\7\36\2\2\u0082\u0086\7\37\2\2\u0083\u0085"+
		"\t\5\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008b\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7)"+
		"\2\2\u008a\u008c\5\4\3\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\17\3\2\2\2\u008d\u008e\7\34\2\2\u008e\u008f\7(\2\2\u008f\u0093\7\37\2"+
		"\2\u0090\u0092\5\32\16\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7)\2\2\u0097\u0099\5\4\3\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b\7\35\2\2\u009b\u009c\7(\2"+
		"\2\u009c\u009f\7\37\2\2\u009d\u00a0\5\26\f\2\u009e\u00a0\5\30\r\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\7)\2\2\u00a4"+
		"\u00a6\5\4\3\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\23\3\2\2"+
		"\2\u00a7\u00a8\7)\2\2\u00a8\u00a9\5\4\3\2\u00a9\25\3\2\2\2\u00aa\u00ab"+
		"\7!\2\2\u00ab\u00af\7\"\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00af\7!\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1\7\3\2"+
		"\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\26\f\2\u00b4"+
		"\u00b5\7\5\2\2\u00b5\31\3\2\2\2\u00b6\u00c8\5\34\17\2\u00b7\u00c8\5\36"+
		"\20\2\u00b8\u00c8\5 \21\2\u00b9\u00c8\5\"\22\2\u00ba\u00c8\5$\23\2\u00bb"+
		"\u00c8\5&\24\2\u00bc\u00c8\5(\25\2\u00bd\u00c8\5*\26\2\u00be\u00c8\5,"+
		"\27\2\u00bf\u00c8\5.\30\2\u00c0\u00c8\5\60\31\2\u00c1\u00c8\5\62\32\2"+
		"\u00c2\u00c8\5\64\33\2\u00c3\u00c8\5\66\34\2\u00c4\u00c8\58\35\2\u00c5"+
		"\u00c8\5:\36\2\u00c6\u00c8\5<\37\2\u00c7\u00b6\3\2\2\2\u00c7\u00b7\3\2"+
		"\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00ba\3\2\2\2\u00c7"+
		"\u00bb\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bd\3\2\2\2\u00c7\u00be\3\2"+
		"\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c2\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8\33\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\35"+
		"\3\2\2\2\u00cb\u00cc\7\7\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7\b\2\2\u00ce"+
		"!\3\2\2\2\u00cf\u00d0\7\t\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\n\2\2\u00d2"+
		"%\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6"+
		")\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8+\3\2\2\2\u00d9\u00da\7\16\2\2\u00da"+
		"-\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc/\3\2\2\2\u00dd\u00de\7\20\2\2\u00de"+
		"\61\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\63\3\2\2\2\u00e1\u00e2\7\22\2\2"+
		"\u00e2\65\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4\67\3\2\2\2\u00e5\u00e9\7"+
		"\24\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea9\3\2\2\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ed\7\25\2\2\u00ed;\3\2\2\2\u00ee\u00ef\7\26\2\2\u00ef=\3\2\2"+
		"\2\26BMTY`elqy~\u0086\u008b\u0093\u0098\u009f\u00a1\u00a5\u00ae\u00c7"+
		"\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}