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
		DECSPRITECOUNTER=11, SETSPRITECOUNTER=12, MOVETORANDOMONZERO=13, TRANSFORMONZERO=14, 
		GAMEOVERONZERO=15, WINONZERO=16, MOVETORANDOM=17, TRANSFORMTOSPRITE=18, 
		MOVEPLAYERTO=19, PLAYERINCCOUNTERONE=20, PLAYERINCCOUNTERTWO=21, PLAYERINCCOUNTERTHREE=22, 
		PLAYERINCSPRITECOUNTER=23, PLAYERDECCOUNTERONE=24, PLAYERDECCOUNTERTWO=25, 
		PLAYERDECCOUNTERTHREE=26, PLAYERDECSPRITECOUNTER=27, GAMEOVER=28, WIN=29, 
		ENVIRONMENT=30, GOAL=31, PLAYER=32, SPRITE=33, COUNTER=34, EVENT=35, SET=36, 
		COUNTERINDEX=37, ARROW=38, INT=39, XINT=40, YINT=41, COLOR=42, SOLID=43, 
		COMMAND=44, WHITESPACE=45, BOOLEAN=46, WORD=47, NEWLINE=48;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_environment = 2, RULE_goal = 3, 
		RULE_player = 4, RULE_sprite = 5, RULE_counter = 6, RULE_event = 7, RULE_set = 8, 
		RULE_newline = 9, RULE_position = 10, RULE_range = 11, RULE_action = 12, 
		RULE_incCounter1 = 13, RULE_decCounter1 = 14, RULE_incCounter2 = 15, RULE_decCounter2 = 16, 
		RULE_incCounter3 = 17, RULE_decCounter3 = 18, RULE_incSpriteCounter = 19, 
		RULE_decSpriteCounter = 20, RULE_setSpriteCounter = 21, RULE_transformOnZeroCounter = 22, 
		RULE_gameOverOnZeroCounter = 23, RULE_winOnZeroCounter = 24, RULE_moveToRandom = 25, 
		RULE_moveToRandomOnZero = 26, RULE_transformToSprite = 27, RULE_movePlayerTo = 28, 
		RULE_playerIncCounter1 = 29, RULE_playerIncCounter2 = 30, RULE_playerIncCounter3 = 31, 
		RULE_playerDecCounter1 = 32, RULE_playerDecCounter2 = 33, RULE_playerDecCounter3 = 34, 
		RULE_playerIncSpriteCounter = 35, RULE_playerDecSpriteCounter = 36, RULE_gameOver = 37, 
		RULE_win = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "environment", "goal", "player", "sprite", "counter", 
			"event", "set", "newline", "position", "range", "action", "incCounter1", 
			"decCounter1", "incCounter2", "decCounter2", "incCounter3", "decCounter3", 
			"incSpriteCounter", "decSpriteCounter", "setSpriteCounter", "transformOnZeroCounter", 
			"gameOverOnZeroCounter", "winOnZeroCounter", "moveToRandom", "moveToRandomOnZero", 
			"transformToSprite", "movePlayerTo", "playerIncCounter1", "playerIncCounter2", 
			"playerIncCounter3", "playerDecCounter1", "playerDecCounter2", "playerDecCounter3", 
			"playerIncSpriteCounter", "playerDecSpriteCounter", "gameOver", "win"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'>'", null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INCCOUNTERONE", "DECCOUNTERONE", "INCCOUNTERTWO", 
			"DECCOUNTERTWO", "INCCOUNTERTHREE", "DECCOUNTERTHREE", "INCSPRITECOUNTER", 
			"DECSPRITECOUNTER", "SETSPRITECOUNTER", "MOVETORANDOMONZERO", "TRANSFORMONZERO", 
			"GAMEOVERONZERO", "WINONZERO", "MOVETORANDOM", "TRANSFORMTOSPRITE", "MOVEPLAYERTO", 
			"PLAYERINCCOUNTERONE", "PLAYERINCCOUNTERTWO", "PLAYERINCCOUNTERTHREE", 
			"PLAYERINCSPRITECOUNTER", "PLAYERDECCOUNTERONE", "PLAYERDECCOUNTERTWO", 
			"PLAYERDECCOUNTERTHREE", "PLAYERDECSPRITECOUNTER", "GAMEOVER", "WIN", 
			"ENVIRONMENT", "GOAL", "PLAYER", "SPRITE", "COUNTER", "EVENT", "SET", 
			"COUNTERINDEX", "ARROW", "INT", "XINT", "YINT", "COLOR", "SOLID", "COMMAND", 
			"WHITESPACE", "BOOLEAN", "WORD", "NEWLINE"
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
			setState(82);
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
				setState(79);
				expression();
				setState(80);
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
			setState(93);
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
				setState(85);
				environment();
				}
				break;
			case GOAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				goal();
				}
				break;
			case PLAYER:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				player();
				}
				break;
			case SPRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				sprite();
				}
				break;
			case COUNTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				counter();
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(90);
				event();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 8);
				{
				setState(91);
				set();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(92);
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
			setState(95);
			match(ENVIRONMENT);
			setState(96);
			match(ARROW);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(97);
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
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(103);
				match(NEWLINE);
				setState(104);
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
			setState(107);
			match(GOAL);
			setState(108);
			match(ARROW);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(109);
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
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(115);
				match(NEWLINE);
				setState(116);
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
			setState(119);
			match(PLAYER);
			setState(120);
			match(ARROW);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(121);
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
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(127);
				match(NEWLINE);
				setState(128);
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
			setState(131);
			match(SPRITE);
			setState(132);
			match(WORD);
			setState(133);
			match(ARROW);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR || _la==SOLID) {
				{
				{
				setState(134);
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
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(140);
				match(NEWLINE);
				setState(141);
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
		public List<TerminalNode> WINONZERO() { return getTokens(SGL2DParser.WINONZERO); }
		public TerminalNode WINONZERO(int i) {
			return getToken(SGL2DParser.WINONZERO, i);
		}
		public List<TerminalNode> GAMEOVERONZERO() { return getTokens(SGL2DParser.GAMEOVERONZERO); }
		public TerminalNode GAMEOVERONZERO(int i) {
			return getToken(SGL2DParser.GAMEOVERONZERO, i);
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
			setState(144);
			match(COUNTER);
			setState(145);
			match(COUNTERINDEX);
			setState(146);
			match(ARROW);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(147);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << INT) | (1L << BOOLEAN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(153);
				match(NEWLINE);
				setState(154);
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
		public TerminalNode PLAYER() { return getToken(SGL2DParser.PLAYER, 0); }
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
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
			setState(157);
			match(EVENT);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==PLAYER || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(ARROW);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCCOUNTERONE) | (1L << DECCOUNTERONE) | (1L << INCCOUNTERTWO) | (1L << DECCOUNTERTWO) | (1L << INCCOUNTERTHREE) | (1L << DECCOUNTERTHREE) | (1L << INCSPRITECOUNTER) | (1L << DECSPRITECOUNTER) | (1L << SETSPRITECOUNTER) | (1L << MOVETORANDOMONZERO) | (1L << TRANSFORMONZERO) | (1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << MOVETORANDOM) | (1L << TRANSFORMTOSPRITE) | (1L << MOVEPLAYERTO) | (1L << PLAYERINCCOUNTERONE) | (1L << PLAYERINCCOUNTERTWO) | (1L << PLAYERINCCOUNTERTHREE) | (1L << PLAYERINCSPRITECOUNTER) | (1L << PLAYERDECCOUNTERONE) | (1L << PLAYERDECCOUNTERTWO) | (1L << PLAYERDECCOUNTERTHREE) | (1L << PLAYERDECSPRITECOUNTER) | (1L << GAMEOVER) | (1L << WIN))) != 0)) {
				{
				{
				setState(160);
				action();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(166);
				match(NEWLINE);
				setState(167);
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
		public List<TerminalNode> NEWLINE() { return getTokens(SGL2DParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SGL2DParser.NEWLINE, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(SET);
			setState(171);
			match(WORD);
			setState(172);
			match(ARROW);
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case XINT:
					case YINT:
						{
						setState(173);
						position();
						}
						break;
					case T__0:
						{
						setState(174);
						range();
						}
						break;
					case NEWLINE:
						{
						setState(175);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(180);
				match(NEWLINE);
				setState(181);
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
			setState(184);
			match(NEWLINE);
			setState(185);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case XINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(XINT);
				setState(188);
				match(YINT);
				}
				break;
			case YINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(YINT);
				setState(190);
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
			setState(193);
			match(T__0);
			setState(194);
			position();
			setState(195);
			match(T__1);
			setState(196);
			position();
			setState(197);
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
		public MoveToRandomOnZeroContext moveToRandomOnZero() {
			return getRuleContext(MoveToRandomOnZeroContext.class,0);
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
		public PlayerIncCounter1Context playerIncCounter1() {
			return getRuleContext(PlayerIncCounter1Context.class,0);
		}
		public PlayerIncCounter2Context playerIncCounter2() {
			return getRuleContext(PlayerIncCounter2Context.class,0);
		}
		public PlayerIncCounter3Context playerIncCounter3() {
			return getRuleContext(PlayerIncCounter3Context.class,0);
		}
		public PlayerDecCounter1Context playerDecCounter1() {
			return getRuleContext(PlayerDecCounter1Context.class,0);
		}
		public PlayerDecCounter2Context playerDecCounter2() {
			return getRuleContext(PlayerDecCounter2Context.class,0);
		}
		public PlayerDecCounter3Context playerDecCounter3() {
			return getRuleContext(PlayerDecCounter3Context.class,0);
		}
		public PlayerIncSpriteCounterContext playerIncSpriteCounter() {
			return getRuleContext(PlayerIncSpriteCounterContext.class,0);
		}
		public PlayerDecSpriteCounterContext playerDecSpriteCounter() {
			return getRuleContext(PlayerDecSpriteCounterContext.class,0);
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
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCCOUNTERONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				incCounter1();
				}
				break;
			case DECCOUNTERONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				decCounter1();
				}
				break;
			case INCCOUNTERTWO:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				incCounter2();
				}
				break;
			case DECCOUNTERTWO:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				decCounter2();
				}
				break;
			case INCCOUNTERTHREE:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				incCounter3();
				}
				break;
			case DECCOUNTERTHREE:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				decCounter3();
				}
				break;
			case INCSPRITECOUNTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(205);
				incSpriteCounter();
				}
				break;
			case DECSPRITECOUNTER:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				decSpriteCounter();
				}
				break;
			case SETSPRITECOUNTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(207);
				setSpriteCounter();
				}
				break;
			case MOVETORANDOMONZERO:
				enterOuterAlt(_localctx, 10);
				{
				setState(208);
				moveToRandomOnZero();
				}
				break;
			case TRANSFORMONZERO:
				enterOuterAlt(_localctx, 11);
				{
				setState(209);
				transformOnZeroCounter();
				}
				break;
			case GAMEOVERONZERO:
				enterOuterAlt(_localctx, 12);
				{
				setState(210);
				gameOverOnZeroCounter();
				}
				break;
			case WINONZERO:
				enterOuterAlt(_localctx, 13);
				{
				setState(211);
				winOnZeroCounter();
				}
				break;
			case MOVETORANDOM:
				enterOuterAlt(_localctx, 14);
				{
				setState(212);
				moveToRandom();
				}
				break;
			case TRANSFORMTOSPRITE:
				enterOuterAlt(_localctx, 15);
				{
				setState(213);
				transformToSprite();
				}
				break;
			case MOVEPLAYERTO:
				enterOuterAlt(_localctx, 16);
				{
				setState(214);
				movePlayerTo();
				}
				break;
			case PLAYERINCCOUNTERONE:
				enterOuterAlt(_localctx, 17);
				{
				setState(215);
				playerIncCounter1();
				}
				break;
			case PLAYERINCCOUNTERTWO:
				enterOuterAlt(_localctx, 18);
				{
				setState(216);
				playerIncCounter2();
				}
				break;
			case PLAYERINCCOUNTERTHREE:
				enterOuterAlt(_localctx, 19);
				{
				setState(217);
				playerIncCounter3();
				}
				break;
			case PLAYERDECCOUNTERONE:
				enterOuterAlt(_localctx, 20);
				{
				setState(218);
				playerDecCounter1();
				}
				break;
			case PLAYERDECCOUNTERTWO:
				enterOuterAlt(_localctx, 21);
				{
				setState(219);
				playerDecCounter2();
				}
				break;
			case PLAYERDECCOUNTERTHREE:
				enterOuterAlt(_localctx, 22);
				{
				setState(220);
				playerDecCounter3();
				}
				break;
			case PLAYERINCSPRITECOUNTER:
				enterOuterAlt(_localctx, 23);
				{
				setState(221);
				playerIncSpriteCounter();
				}
				break;
			case PLAYERDECSPRITECOUNTER:
				enterOuterAlt(_localctx, 24);
				{
				setState(222);
				playerDecSpriteCounter();
				}
				break;
			case GAMEOVER:
				enterOuterAlt(_localctx, 25);
				{
				setState(223);
				gameOver();
				}
				break;
			case WIN:
				enterOuterAlt(_localctx, 26);
				{
				setState(224);
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
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(INCCOUNTERONE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(228);
				match(INT);
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

	public static class DecCounter1Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERONE() { return getToken(SGL2DParser.DECCOUNTERONE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(DECCOUNTERONE);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(235);
				match(INT);
				}
				}
				setState(240);
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

	public static class IncCounter2Context extends ParserRuleContext {
		public TerminalNode INCCOUNTERTWO() { return getToken(SGL2DParser.INCCOUNTERTWO, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(INCCOUNTERTWO);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(242);
				match(INT);
				}
				}
				setState(247);
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

	public static class DecCounter2Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERTWO() { return getToken(SGL2DParser.DECCOUNTERTWO, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DECCOUNTERTWO);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(249);
				match(INT);
				}
				}
				setState(254);
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

	public static class IncCounter3Context extends ParserRuleContext {
		public TerminalNode INCCOUNTERTHREE() { return getToken(SGL2DParser.INCCOUNTERTHREE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(INCCOUNTERTHREE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(256);
				match(INT);
				}
				}
				setState(261);
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

	public static class DecCounter3Context extends ParserRuleContext {
		public TerminalNode DECCOUNTERTHREE() { return getToken(SGL2DParser.DECCOUNTERTHREE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(DECCOUNTERTHREE);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(263);
				match(INT);
				}
				}
				setState(268);
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

	public static class IncSpriteCounterContext extends ParserRuleContext {
		public TerminalNode INCSPRITECOUNTER() { return getToken(SGL2DParser.INCSPRITECOUNTER, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(INCSPRITECOUNTER);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(270);
				match(INT);
				}
				}
				setState(275);
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

	public static class DecSpriteCounterContext extends ParserRuleContext {
		public TerminalNode DECSPRITECOUNTER() { return getToken(SGL2DParser.DECSPRITECOUNTER, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(DECSPRITECOUNTER);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(277);
				match(INT);
				}
				}
				setState(282);
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

	public static class SetSpriteCounterContext extends ParserRuleContext {
		public TerminalNode SETSPRITECOUNTER() { return getToken(SGL2DParser.SETSPRITECOUNTER, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SETSPRITECOUNTER);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(284);
				match(INT);
				}
				}
				setState(289);
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
			setState(290);
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
			setState(292);
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
			setState(294);
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
			setState(296);
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

	public static class MoveToRandomOnZeroContext extends ParserRuleContext {
		public TerminalNode MOVETORANDOMONZERO() { return getToken(SGL2DParser.MOVETORANDOMONZERO, 0); }
		public MoveToRandomOnZeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToRandomOnZero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterMoveToRandomOnZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitMoveToRandomOnZero(this);
		}
	}

	public final MoveToRandomOnZeroContext moveToRandomOnZero() throws RecognitionException {
		MoveToRandomOnZeroContext _localctx = new MoveToRandomOnZeroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_moveToRandomOnZero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(MOVETORANDOMONZERO);
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
		enterRule(_localctx, 54, RULE_transformToSprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 56, RULE_movePlayerTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(MOVEPLAYERTO);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(303);
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
				setState(308);
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

	public static class PlayerIncCounter1Context extends ParserRuleContext {
		public TerminalNode PLAYERINCCOUNTERONE() { return getToken(SGL2DParser.PLAYERINCCOUNTERONE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerIncCounter1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerIncCounter1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerIncCounter1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerIncCounter1(this);
		}
	}

	public final PlayerIncCounter1Context playerIncCounter1() throws RecognitionException {
		PlayerIncCounter1Context _localctx = new PlayerIncCounter1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_playerIncCounter1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PLAYERINCCOUNTERONE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(310);
				match(INT);
				}
				}
				setState(315);
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

	public static class PlayerIncCounter2Context extends ParserRuleContext {
		public TerminalNode PLAYERINCCOUNTERTWO() { return getToken(SGL2DParser.PLAYERINCCOUNTERTWO, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerIncCounter2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerIncCounter2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerIncCounter2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerIncCounter2(this);
		}
	}

	public final PlayerIncCounter2Context playerIncCounter2() throws RecognitionException {
		PlayerIncCounter2Context _localctx = new PlayerIncCounter2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_playerIncCounter2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(PLAYERINCCOUNTERTWO);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(317);
				match(INT);
				}
				}
				setState(322);
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

	public static class PlayerIncCounter3Context extends ParserRuleContext {
		public TerminalNode PLAYERINCCOUNTERTHREE() { return getToken(SGL2DParser.PLAYERINCCOUNTERTHREE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerIncCounter3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerIncCounter3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerIncCounter3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerIncCounter3(this);
		}
	}

	public final PlayerIncCounter3Context playerIncCounter3() throws RecognitionException {
		PlayerIncCounter3Context _localctx = new PlayerIncCounter3Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_playerIncCounter3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(PLAYERINCCOUNTERTHREE);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(324);
				match(INT);
				}
				}
				setState(329);
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

	public static class PlayerDecCounter1Context extends ParserRuleContext {
		public TerminalNode PLAYERDECCOUNTERONE() { return getToken(SGL2DParser.PLAYERDECCOUNTERONE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerDecCounter1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerDecCounter1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerDecCounter1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerDecCounter1(this);
		}
	}

	public final PlayerDecCounter1Context playerDecCounter1() throws RecognitionException {
		PlayerDecCounter1Context _localctx = new PlayerDecCounter1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_playerDecCounter1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PLAYERDECCOUNTERONE);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(331);
				match(INT);
				}
				}
				setState(336);
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

	public static class PlayerDecCounter2Context extends ParserRuleContext {
		public TerminalNode PLAYERDECCOUNTERTWO() { return getToken(SGL2DParser.PLAYERDECCOUNTERTWO, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerDecCounter2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerDecCounter2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerDecCounter2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerDecCounter2(this);
		}
	}

	public final PlayerDecCounter2Context playerDecCounter2() throws RecognitionException {
		PlayerDecCounter2Context _localctx = new PlayerDecCounter2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_playerDecCounter2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(PLAYERDECCOUNTERTWO);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(338);
				match(INT);
				}
				}
				setState(343);
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

	public static class PlayerDecCounter3Context extends ParserRuleContext {
		public TerminalNode PLAYERDECCOUNTERTHREE() { return getToken(SGL2DParser.PLAYERDECCOUNTERTHREE, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerDecCounter3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerDecCounter3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerDecCounter3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerDecCounter3(this);
		}
	}

	public final PlayerDecCounter3Context playerDecCounter3() throws RecognitionException {
		PlayerDecCounter3Context _localctx = new PlayerDecCounter3Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_playerDecCounter3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(PLAYERDECCOUNTERTHREE);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(345);
				match(INT);
				}
				}
				setState(350);
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

	public static class PlayerIncSpriteCounterContext extends ParserRuleContext {
		public TerminalNode PLAYERINCSPRITECOUNTER() { return getToken(SGL2DParser.PLAYERINCSPRITECOUNTER, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerIncSpriteCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerIncSpriteCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerIncSpriteCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerIncSpriteCounter(this);
		}
	}

	public final PlayerIncSpriteCounterContext playerIncSpriteCounter() throws RecognitionException {
		PlayerIncSpriteCounterContext _localctx = new PlayerIncSpriteCounterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_playerIncSpriteCounter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(PLAYERINCSPRITECOUNTER);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(352);
				match(INT);
				}
				}
				setState(357);
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

	public static class PlayerDecSpriteCounterContext extends ParserRuleContext {
		public TerminalNode PLAYERDECSPRITECOUNTER() { return getToken(SGL2DParser.PLAYERDECSPRITECOUNTER, 0); }
		public List<TerminalNode> INT() { return getTokens(SGL2DParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SGL2DParser.INT, i);
		}
		public PlayerDecSpriteCounterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerDecSpriteCounter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).enterPlayerDecSpriteCounter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SGL2DListener ) ((SGL2DListener)listener).exitPlayerDecSpriteCounter(this);
		}
	}

	public final PlayerDecSpriteCounterContext playerDecSpriteCounter() throws RecognitionException {
		PlayerDecSpriteCounterContext _localctx = new PlayerDecSpriteCounterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_playerDecSpriteCounter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(PLAYERDECSPRITECOUNTER);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(359);
				match(INT);
				}
				}
				setState(364);
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
		enterRule(_localctx, 74, RULE_gameOver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 76, RULE_win);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0174\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\5\2"+
		"U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\7\4e\n"+
		"\4\f\4\16\4h\13\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5"+
		"\3\5\3\5\5\5x\n\5\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13\6\3\6\3\6\5\6"+
		"\u0084\n\6\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\5"+
		"\7\u0091\n\7\3\b\3\b\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b"+
		"\5\b\u009e\n\b\3\t\3\t\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\3"+
		"\t\5\t\u00ab\n\t\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00b3\n\n\r\n\16\n\u00b4"+
		"\3\n\3\n\5\n\u00b9\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00e4\n\16\3\17\3\17\7\17\u00e8\n\17\f\17\16\17\u00eb"+
		"\13\17\3\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\21\3\21\7\21"+
		"\u00f6\n\21\f\21\16\21\u00f9\13\21\3\22\3\22\7\22\u00fd\n\22\f\22\16\22"+
		"\u0100\13\22\3\23\3\23\7\23\u0104\n\23\f\23\16\23\u0107\13\23\3\24\3\24"+
		"\7\24\u010b\n\24\f\24\16\24\u010e\13\24\3\25\3\25\7\25\u0112\n\25\f\25"+
		"\16\25\u0115\13\25\3\26\3\26\7\26\u0119\n\26\f\26\16\26\u011c\13\26\3"+
		"\27\3\27\7\27\u0120\n\27\f\27\16\27\u0123\13\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u0133\n\36\f\36"+
		"\16\36\u0136\13\36\3\37\3\37\7\37\u013a\n\37\f\37\16\37\u013d\13\37\3"+
		" \3 \7 \u0141\n \f \16 \u0144\13 \3!\3!\7!\u0148\n!\f!\16!\u014b\13!\3"+
		"\"\3\"\7\"\u014f\n\"\f\"\16\"\u0152\13\"\3#\3#\7#\u0156\n#\f#\16#\u0159"+
		"\13#\3$\3$\7$\u015d\n$\f$\16$\u0160\13$\3%\3%\7%\u0164\n%\f%\16%\u0167"+
		"\13%\3&\3&\7&\u016b\n&\f&\16&\u016e\13&\3\'\3\'\3(\3(\3(\2\2)\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\7\3"+
		"\2*+\3\2*,\3\2,-\5\2\21\22))\60\60\4\2\"\"\61\61\2\u0191\2T\3\2\2\2\4"+
		"_\3\2\2\2\6a\3\2\2\2\bm\3\2\2\2\ny\3\2\2\2\f\u0085\3\2\2\2\16\u0092\3"+
		"\2\2\2\20\u009f\3\2\2\2\22\u00ac\3\2\2\2\24\u00ba\3\2\2\2\26\u00c1\3\2"+
		"\2\2\30\u00c3\3\2\2\2\32\u00e3\3\2\2\2\34\u00e5\3\2\2\2\36\u00ec\3\2\2"+
		"\2 \u00f3\3\2\2\2\"\u00fa\3\2\2\2$\u0101\3\2\2\2&\u0108\3\2\2\2(\u010f"+
		"\3\2\2\2*\u0116\3\2\2\2,\u011d\3\2\2\2.\u0124\3\2\2\2\60\u0126\3\2\2\2"+
		"\62\u0128\3\2\2\2\64\u012a\3\2\2\2\66\u012c\3\2\2\28\u012e\3\2\2\2:\u0130"+
		"\3\2\2\2<\u0137\3\2\2\2>\u013e\3\2\2\2@\u0145\3\2\2\2B\u014c\3\2\2\2D"+
		"\u0153\3\2\2\2F\u015a\3\2\2\2H\u0161\3\2\2\2J\u0168\3\2\2\2L\u016f\3\2"+
		"\2\2N\u0171\3\2\2\2PU\3\2\2\2QR\5\4\3\2RS\7\2\2\3SU\3\2\2\2TP\3\2\2\2"+
		"TQ\3\2\2\2U\3\3\2\2\2V`\3\2\2\2W`\5\6\4\2X`\5\b\5\2Y`\5\n\6\2Z`\5\f\7"+
		"\2[`\5\16\b\2\\`\5\20\t\2]`\5\22\n\2^`\5\24\13\2_V\3\2\2\2_W\3\2\2\2_"+
		"X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2"+
		"`\5\3\2\2\2ab\7 \2\2bf\7(\2\2ce\t\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gk\3\2\2\2hf\3\2\2\2ij\7\62\2\2jl\5\4\3\2ki\3\2\2\2kl\3\2\2"+
		"\2l\7\3\2\2\2mn\7!\2\2nr\7(\2\2oq\t\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2sw\3\2\2\2tr\3\2\2\2uv\7\62\2\2vx\5\4\3\2wu\3\2\2\2wx\3\2"+
		"\2\2x\t\3\2\2\2yz\7\"\2\2z~\7(\2\2{}\t\3\2\2|{\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7"+
		"\62\2\2\u0082\u0084\5\4\3\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\13\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7\61\2\2\u0087\u008b\7(\2\2"+
		"\u0088\u008a\t\4\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\7\62\2\2\u008f\u0091\5\4\3\2\u0090\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\r\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0094\7\'\2\2\u0094\u0098"+
		"\7(\2\2\u0095\u0097\t\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009b\u009c\7\62\2\2\u009c\u009e\5\4\3\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0\7%\2\2\u00a0\u00a1\t\6\2\2"+
		"\u00a1\u00a5\7(\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00ab\5\4\3\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ad\7&\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\u00b2\7(\2\2\u00af\u00b3\5\26\f\2\u00b0\u00b3\5\30\r\2"+
		"\u00b1\u00b3\7\62\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b7\7\62\2\2\u00b7\u00b9\5\4\3\2\u00b8\u00b6\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\23\3\2\2\2\u00ba\u00bb\7\62\2\2\u00bb"+
		"\u00bc\5\4\3\2\u00bc\25\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00c2\7+\2\2"+
		"\u00bf\u00c0\7+\2\2\u00c0\u00c2\7*\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\3\2\2\u00c4\u00c5\5\26\f\2\u00c5"+
		"\u00c6\7\4\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7\5\2\2\u00c8\31\3\2\2"+
		"\2\u00c9\u00e4\5\34\17\2\u00ca\u00e4\5\36\20\2\u00cb\u00e4\5 \21\2\u00cc"+
		"\u00e4\5\"\22\2\u00cd\u00e4\5$\23\2\u00ce\u00e4\5&\24\2\u00cf\u00e4\5"+
		"(\25\2\u00d0\u00e4\5*\26\2\u00d1\u00e4\5,\27\2\u00d2\u00e4\5\66\34\2\u00d3"+
		"\u00e4\5.\30\2\u00d4\u00e4\5\60\31\2\u00d5\u00e4\5\62\32\2\u00d6\u00e4"+
		"\5\64\33\2\u00d7\u00e4\58\35\2\u00d8\u00e4\5:\36\2\u00d9\u00e4\5<\37\2"+
		"\u00da\u00e4\5> \2\u00db\u00e4\5@!\2\u00dc\u00e4\5B\"\2\u00dd\u00e4\5"+
		"D#\2\u00de\u00e4\5F$\2\u00df\u00e4\5H%\2\u00e0\u00e4\5J&\2\u00e1\u00e4"+
		"\5L\'\2\u00e2\u00e4\5N(\2\u00e3\u00c9\3\2\2\2\u00e3\u00ca\3\2\2\2\u00e3"+
		"\u00cb\3\2\2\2\u00e3\u00cc\3\2\2\2\u00e3\u00cd\3\2\2\2\u00e3\u00ce\3\2"+
		"\2\2\u00e3\u00cf\3\2\2\2\u00e3\u00d0\3\2\2\2\u00e3\u00d1\3\2\2\2\u00e3"+
		"\u00d2\3\2\2\2\u00e3\u00d3\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3\u00d5\3\2"+
		"\2\2\u00e3\u00d6\3\2\2\2\u00e3\u00d7\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e3"+
		"\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3\u00dc\3\2"+
		"\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\33\3\2\2"+
		"\2\u00e5\u00e9\7\6\2\2\u00e6\u00e8\7)\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\35\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00f0\7\7\2\2\u00ed\u00ef\7)\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\37\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f7\7\b\2\2\u00f4\u00f6\7)\2\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8!\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe\7\t\2\2\u00fb"+
		"\u00fd\7)\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0105"+
		"\7\n\2\2\u0102\u0104\7)\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106%\3\2\2\2\u0107\u0105\3\2\2\2"+
		"\u0108\u010c\7\13\2\2\u0109\u010b\7)\2\2\u010a\u0109\3\2\2\2\u010b\u010e"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\'\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0113\7\f\2\2\u0110\u0112\7)\2\2\u0111\u0110\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		")\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011a\7\r\2\2\u0117\u0119\7)\2\2\u0118"+
		"\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b+\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7\16\2\2\u011e\u0120"+
		"\7)\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122-\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\20\2\2"+
		"\u0125/\3\2\2\2\u0126\u0127\7\21\2\2\u0127\61\3\2\2\2\u0128\u0129\7\22"+
		"\2\2\u0129\63\3\2\2\2\u012a\u012b\7\23\2\2\u012b\65\3\2\2\2\u012c\u012d"+
		"\7\17\2\2\u012d\67\3\2\2\2\u012e\u012f\7\24\2\2\u012f9\3\2\2\2\u0130\u0134"+
		"\7\25\2\2\u0131\u0133\t\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2"+
		"\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135;\3\2\2\2\u0136\u0134\3"+
		"\2\2\2\u0137\u013b\7\26\2\2\u0138\u013a\7)\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c=\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u0142\7\27\2\2\u013f\u0141\7)\2\2\u0140\u013f"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"?\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0149\7\30\2\2\u0146\u0148\7)\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014aA\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0150\7\32\2\2\u014d"+
		"\u014f\7)\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151C\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0157"+
		"\7\33\2\2\u0154\u0156\7)\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158E\3\2\2\2\u0159\u0157\3\2\2\2"+
		"\u015a\u015e\7\34\2\2\u015b\u015d\7)\2\2\u015c\u015b\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fG\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0165\7\31\2\2\u0162\u0164\7)\2\2\u0163\u0162\3\2"+
		"\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"I\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\7\35\2\2\u0169\u016b\7)\2\2"+
		"\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d"+
		"\3\2\2\2\u016dK\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\36\2\2\u0170"+
		"M\3\2\2\2\u0171\u0172\7\37\2\2\u0172O\3\2\2\2\'T_fkrw~\u0083\u008b\u0090"+
		"\u0098\u009d\u00a5\u00aa\u00b2\u00b4\u00b8\u00c1\u00e3\u00e9\u00f0\u00f7"+
		"\u00fe\u0105\u010c\u0113\u011a\u0121\u0134\u013b\u0142\u0149\u0150\u0157"+
		"\u015e\u0165\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}