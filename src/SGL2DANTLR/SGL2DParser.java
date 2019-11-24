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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(SGL2DParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(SGL2DParser.NEWLINE, i);
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
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(80);
					match(NEWLINE);
					setState(81);
					expression();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				environment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				goal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				player();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				sprite();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				counter();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				event();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				set();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				newline();
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

	public static class EnvironmentContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(SGL2DParser.ENVIRONMENT, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(101);
			match(ENVIRONMENT);
			setState(102);
			match(ARROW);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(103);
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
				setState(108);
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

	public static class GoalContext extends ParserRuleContext {
		public TerminalNode GOAL() { return getToken(SGL2DParser.GOAL, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(109);
			match(GOAL);
			setState(110);
			match(ARROW);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(111);
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
				setState(116);
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode PLAYER() { return getToken(SGL2DParser.PLAYER, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(117);
			match(PLAYER);
			setState(118);
			match(ARROW);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XINT) | (1L << YINT) | (1L << COLOR))) != 0)) {
				{
				{
				setState(119);
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
				setState(124);
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

	public static class SpriteContext extends ParserRuleContext {
		public TerminalNode SPRITE() { return getToken(SGL2DParser.SPRITE, 0); }
		public TerminalNode WORD() { return getToken(SGL2DParser.WORD, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(125);
			match(SPRITE);
			setState(126);
			match(WORD);
			setState(127);
			match(ARROW);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLOR || _la==SOLID) {
				{
				{
				setState(128);
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
				setState(133);
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

	public static class CounterContext extends ParserRuleContext {
		public TerminalNode COUNTER() { return getToken(SGL2DParser.COUNTER, 0); }
		public TerminalNode COUNTERINDEX() { return getToken(SGL2DParser.COUNTERINDEX, 0); }
		public TerminalNode ARROW() { return getToken(SGL2DParser.ARROW, 0); }
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
			setState(134);
			match(COUNTER);
			setState(135);
			match(COUNTERINDEX);
			setState(136);
			match(ARROW);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << INT) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(137);
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
				setState(142);
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
			setState(143);
			match(EVENT);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==PLAYER || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(ARROW);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCCOUNTERONE) | (1L << DECCOUNTERONE) | (1L << INCCOUNTERTWO) | (1L << DECCOUNTERTWO) | (1L << INCCOUNTERTHREE) | (1L << DECCOUNTERTHREE) | (1L << INCSPRITECOUNTER) | (1L << DECSPRITECOUNTER) | (1L << SETSPRITECOUNTER) | (1L << MOVETORANDOMONZERO) | (1L << TRANSFORMONZERO) | (1L << GAMEOVERONZERO) | (1L << WINONZERO) | (1L << MOVETORANDOM) | (1L << TRANSFORMTOSPRITE) | (1L << MOVEPLAYERTO) | (1L << PLAYERINCCOUNTERONE) | (1L << PLAYERINCCOUNTERTWO) | (1L << PLAYERINCCOUNTERTHREE) | (1L << PLAYERINCSPRITECOUNTER) | (1L << PLAYERDECCOUNTERONE) | (1L << PLAYERDECCOUNTERTWO) | (1L << PLAYERDECCOUNTERTHREE) | (1L << PLAYERDECSPRITECOUNTER) | (1L << GAMEOVER) | (1L << WIN))) != 0)) {
				{
				{
				setState(146);
				action();
				}
				}
				setState(151);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SET);
			setState(153);
			match(WORD);
			setState(154);
			match(ARROW);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(158);
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
					case NEWLINE:
						{
						setState(157);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(162);
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
			exitRule();
		}
		return _localctx;
	}

	public static class NewlineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(SGL2DParser.NEWLINE, 0); }
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
			setState(163);
			match(NEWLINE);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case XINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(XINT);
				setState(166);
				match(YINT);
				}
				break;
			case YINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(YINT);
				setState(168);
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
			setState(171);
			match(T__0);
			setState(172);
			position();
			setState(173);
			match(T__1);
			setState(174);
			position();
			setState(175);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCCOUNTERONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				incCounter1();
				}
				break;
			case DECCOUNTERONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				decCounter1();
				}
				break;
			case INCCOUNTERTWO:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				incCounter2();
				}
				break;
			case DECCOUNTERTWO:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				decCounter2();
				}
				break;
			case INCCOUNTERTHREE:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				incCounter3();
				}
				break;
			case DECCOUNTERTHREE:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				decCounter3();
				}
				break;
			case INCSPRITECOUNTER:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				incSpriteCounter();
				}
				break;
			case DECSPRITECOUNTER:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				decSpriteCounter();
				}
				break;
			case SETSPRITECOUNTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(185);
				setSpriteCounter();
				}
				break;
			case MOVETORANDOMONZERO:
				enterOuterAlt(_localctx, 10);
				{
				setState(186);
				moveToRandomOnZero();
				}
				break;
			case TRANSFORMONZERO:
				enterOuterAlt(_localctx, 11);
				{
				setState(187);
				transformOnZeroCounter();
				}
				break;
			case GAMEOVERONZERO:
				enterOuterAlt(_localctx, 12);
				{
				setState(188);
				gameOverOnZeroCounter();
				}
				break;
			case WINONZERO:
				enterOuterAlt(_localctx, 13);
				{
				setState(189);
				winOnZeroCounter();
				}
				break;
			case MOVETORANDOM:
				enterOuterAlt(_localctx, 14);
				{
				setState(190);
				moveToRandom();
				}
				break;
			case TRANSFORMTOSPRITE:
				enterOuterAlt(_localctx, 15);
				{
				setState(191);
				transformToSprite();
				}
				break;
			case MOVEPLAYERTO:
				enterOuterAlt(_localctx, 16);
				{
				setState(192);
				movePlayerTo();
				}
				break;
			case PLAYERINCCOUNTERONE:
				enterOuterAlt(_localctx, 17);
				{
				setState(193);
				playerIncCounter1();
				}
				break;
			case PLAYERINCCOUNTERTWO:
				enterOuterAlt(_localctx, 18);
				{
				setState(194);
				playerIncCounter2();
				}
				break;
			case PLAYERINCCOUNTERTHREE:
				enterOuterAlt(_localctx, 19);
				{
				setState(195);
				playerIncCounter3();
				}
				break;
			case PLAYERDECCOUNTERONE:
				enterOuterAlt(_localctx, 20);
				{
				setState(196);
				playerDecCounter1();
				}
				break;
			case PLAYERDECCOUNTERTWO:
				enterOuterAlt(_localctx, 21);
				{
				setState(197);
				playerDecCounter2();
				}
				break;
			case PLAYERDECCOUNTERTHREE:
				enterOuterAlt(_localctx, 22);
				{
				setState(198);
				playerDecCounter3();
				}
				break;
			case PLAYERINCSPRITECOUNTER:
				enterOuterAlt(_localctx, 23);
				{
				setState(199);
				playerIncSpriteCounter();
				}
				break;
			case PLAYERDECSPRITECOUNTER:
				enterOuterAlt(_localctx, 24);
				{
				setState(200);
				playerDecSpriteCounter();
				}
				break;
			case GAMEOVER:
				enterOuterAlt(_localctx, 25);
				{
				setState(201);
				gameOver();
				}
				break;
			case WIN:
				enterOuterAlt(_localctx, 26);
				{
				setState(202);
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
			setState(205);
			match(INCCOUNTERONE);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(206);
				match(INT);
				}
				}
				setState(211);
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
			setState(212);
			match(DECCOUNTERONE);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(213);
				match(INT);
				}
				}
				setState(218);
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
			setState(219);
			match(INCCOUNTERTWO);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(220);
				match(INT);
				}
				}
				setState(225);
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
			setState(226);
			match(DECCOUNTERTWO);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(227);
				match(INT);
				}
				}
				setState(232);
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
			setState(233);
			match(INCCOUNTERTHREE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(234);
				match(INT);
				}
				}
				setState(239);
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
			setState(240);
			match(DECCOUNTERTHREE);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(241);
				match(INT);
				}
				}
				setState(246);
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
			setState(247);
			match(INCSPRITECOUNTER);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(248);
				match(INT);
				}
				}
				setState(253);
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
			setState(254);
			match(DECSPRITECOUNTER);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(255);
				match(INT);
				}
				}
				setState(260);
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
			setState(261);
			match(SETSPRITECOUNTER);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(262);
				match(INT);
				}
				}
				setState(267);
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
			setState(268);
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
			setState(270);
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
			setState(272);
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
			setState(274);
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
			setState(276);
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
			setState(278);
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
			setState(280);
			match(MOVEPLAYERTO);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XINT || _la==YINT) {
				{
				{
				setState(281);
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
				setState(286);
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
			setState(287);
			match(PLAYERINCCOUNTERONE);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(288);
				match(INT);
				}
				}
				setState(293);
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
			setState(294);
			match(PLAYERINCCOUNTERTWO);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(295);
				match(INT);
				}
				}
				setState(300);
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
			setState(301);
			match(PLAYERINCCOUNTERTHREE);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(302);
				match(INT);
				}
				}
				setState(307);
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
			setState(308);
			match(PLAYERDECCOUNTERONE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(309);
				match(INT);
				}
				}
				setState(314);
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
			setState(315);
			match(PLAYERDECCOUNTERTWO);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(316);
				match(INT);
				}
				}
				setState(321);
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
			setState(322);
			match(PLAYERDECCOUNTERTHREE);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(323);
				match(INT);
				}
				}
				setState(328);
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
			setState(329);
			match(PLAYERINCSPRITECOUNTER);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(330);
				match(INT);
				}
				}
				setState(335);
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
			setState(336);
			match(PLAYERDECSPRITECOUNTER);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(337);
				match(INT);
				}
				}
				setState(342);
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
			setState(343);
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
			setState(345);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u015e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\7\2"+
		"U\n\2\f\2\16\2X\13\2\3\2\5\2[\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3f\n\3\3\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\5\3\5\3\5\7\5s\n\5\f\5"+
		"\16\5v\13\5\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\7\3\7\3\7\3\7\7\7\u0084"+
		"\n\7\f\7\16\7\u0087\13\7\3\b\3\b\3\b\3\b\7\b\u008d\n\b\f\b\16\b\u0090"+
		"\13\b\3\t\3\t\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00a1\n\n\f\n\16\n\u00a4\13\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\5\f\u00ac\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\7\17\u00d2\n\17"+
		"\f\17\16\17\u00d5\13\17\3\20\3\20\7\20\u00d9\n\20\f\20\16\20\u00dc\13"+
		"\20\3\21\3\21\7\21\u00e0\n\21\f\21\16\21\u00e3\13\21\3\22\3\22\7\22\u00e7"+
		"\n\22\f\22\16\22\u00ea\13\22\3\23\3\23\7\23\u00ee\n\23\f\23\16\23\u00f1"+
		"\13\23\3\24\3\24\7\24\u00f5\n\24\f\24\16\24\u00f8\13\24\3\25\3\25\7\25"+
		"\u00fc\n\25\f\25\16\25\u00ff\13\25\3\26\3\26\7\26\u0103\n\26\f\26\16\26"+
		"\u0106\13\26\3\27\3\27\7\27\u010a\n\27\f\27\16\27\u010d\13\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\7\36\u011d"+
		"\n\36\f\36\16\36\u0120\13\36\3\37\3\37\7\37\u0124\n\37\f\37\16\37\u0127"+
		"\13\37\3 \3 \7 \u012b\n \f \16 \u012e\13 \3!\3!\7!\u0132\n!\f!\16!\u0135"+
		"\13!\3\"\3\"\7\"\u0139\n\"\f\"\16\"\u013c\13\"\3#\3#\7#\u0140\n#\f#\16"+
		"#\u0143\13#\3$\3$\7$\u0147\n$\f$\16$\u014a\13$\3%\3%\7%\u014e\n%\f%\16"+
		"%\u0151\13%\3&\3&\7&\u0155\n&\f&\16&\u0158\13&\3\'\3\'\3(\3(\3(\2\2)\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"N\2\7\3\2*+\3\2*,\3\2,-\5\2\21\22))\60\60\4\2\"\"\61\61\2\u0176\2Z\3\2"+
		"\2\2\4e\3\2\2\2\6g\3\2\2\2\bo\3\2\2\2\nw\3\2\2\2\f\177\3\2\2\2\16\u0088"+
		"\3\2\2\2\20\u0091\3\2\2\2\22\u009a\3\2\2\2\24\u00a5\3\2\2\2\26\u00ab\3"+
		"\2\2\2\30\u00ad\3\2\2\2\32\u00cd\3\2\2\2\34\u00cf\3\2\2\2\36\u00d6\3\2"+
		"\2\2 \u00dd\3\2\2\2\"\u00e4\3\2\2\2$\u00eb\3\2\2\2&\u00f2\3\2\2\2(\u00f9"+
		"\3\2\2\2*\u0100\3\2\2\2,\u0107\3\2\2\2.\u010e\3\2\2\2\60\u0110\3\2\2\2"+
		"\62\u0112\3\2\2\2\64\u0114\3\2\2\2\66\u0116\3\2\2\28\u0118\3\2\2\2:\u011a"+
		"\3\2\2\2<\u0121\3\2\2\2>\u0128\3\2\2\2@\u012f\3\2\2\2B\u0136\3\2\2\2D"+
		"\u013d\3\2\2\2F\u0144\3\2\2\2H\u014b\3\2\2\2J\u0152\3\2\2\2L\u0159\3\2"+
		"\2\2N\u015b\3\2\2\2P[\3\2\2\2QV\5\4\3\2RS\7\62\2\2SU\5\4\3\2TR\3\2\2\2"+
		"UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W[\3\2\2\2XV\3\2\2\2Y[\7\2\2\3ZP\3\2\2\2"+
		"ZQ\3\2\2\2ZY\3\2\2\2[\3\3\2\2\2\\f\3\2\2\2]f\5\6\4\2^f\5\b\5\2_f\5\n\6"+
		"\2`f\5\f\7\2af\5\16\b\2bf\5\20\t\2cf\5\22\n\2df\5\24\13\2e\\\3\2\2\2e"+
		"]\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2"+
		"ed\3\2\2\2f\5\3\2\2\2gh\7 \2\2hl\7(\2\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2\2"+
		"lj\3\2\2\2lm\3\2\2\2m\7\3\2\2\2nl\3\2\2\2op\7!\2\2pt\7(\2\2qs\t\3\2\2"+
		"rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\t\3\2\2\2vt\3\2\2\2wx\7\"\2"+
		"\2x|\7(\2\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\7#\2\2\u0080\u0081\7\61\2\2\u0081\u0085\7(\2"+
		"\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7$\2\2\u0089\u008a\7\'\2\2\u008a\u008e\7(\2\2\u008b\u008d\t\5\2"+
		"\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\17\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7%\2\2\u0092"+
		"\u0093\t\6\2\2\u0093\u0097\7(\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\21\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7&\2\2\u009b\u009c\7\61\2"+
		"\2\u009c\u00a2\7(\2\2\u009d\u00a1\5\26\f\2\u009e\u00a1\5\30\r\2\u009f"+
		"\u00a1\7\62\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\23\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\62\2\2\u00a6\25\3\2\2\2"+
		"\u00a7\u00a8\7*\2\2\u00a8\u00ac\7+\2\2\u00a9\u00aa\7+\2\2\u00aa\u00ac"+
		"\7*\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\7\3\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\5"+
		"\26\f\2\u00b1\u00b2\7\5\2\2\u00b2\31\3\2\2\2\u00b3\u00ce\5\34\17\2\u00b4"+
		"\u00ce\5\36\20\2\u00b5\u00ce\5 \21\2\u00b6\u00ce\5\"\22\2\u00b7\u00ce"+
		"\5$\23\2\u00b8\u00ce\5&\24\2\u00b9\u00ce\5(\25\2\u00ba\u00ce\5*\26\2\u00bb"+
		"\u00ce\5,\27\2\u00bc\u00ce\5\66\34\2\u00bd\u00ce\5.\30\2\u00be\u00ce\5"+
		"\60\31\2\u00bf\u00ce\5\62\32\2\u00c0\u00ce\5\64\33\2\u00c1\u00ce\58\35"+
		"\2\u00c2\u00ce\5:\36\2\u00c3\u00ce\5<\37\2\u00c4\u00ce\5> \2\u00c5\u00ce"+
		"\5@!\2\u00c6\u00ce\5B\"\2\u00c7\u00ce\5D#\2\u00c8\u00ce\5F$\2\u00c9\u00ce"+
		"\5H%\2\u00ca\u00ce\5J&\2\u00cb\u00ce\5L\'\2\u00cc\u00ce\5N(\2\u00cd\u00b3"+
		"\3\2\2\2\u00cd\u00b4\3\2\2\2\u00cd\u00b5\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd"+
		"\u00b7\3\2\2\2\u00cd\u00b8\3\2\2\2\u00cd\u00b9\3\2\2\2\u00cd\u00ba\3\2"+
		"\2\2\u00cd\u00bb\3\2\2\2\u00cd\u00bc\3\2\2\2\u00cd\u00bd\3\2\2\2\u00cd"+
		"\u00be\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c1\3\2"+
		"\2\2\u00cd\u00c2\3\2\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd"+
		"\u00c5\3\2\2\2\u00cd\u00c6\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c8\3\2"+
		"\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\33\3\2\2\2\u00cf\u00d3\7\6\2\2\u00d0\u00d2\7)\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\35\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00da\7\7\2\2\u00d7"+
		"\u00d9\7)\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00da\u00db\3\2\2\2\u00db\37\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e1"+
		"\7\b\2\2\u00de\u00e0\7)\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e1\3\2\2\2"+
		"\u00e4\u00e8\7\t\2\2\u00e5\u00e7\7)\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9#\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ef\7\n\2\2\u00ec\u00ee\7)\2\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"%\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\7\13\2\2\u00f3\u00f5\7)\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\7\f\2\2\u00fa"+
		"\u00fc\7)\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe)\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0104"+
		"\7\r\2\2\u0101\u0103\7)\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105+\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107\u010b\7\16\2\2\u0108\u010a\7)\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c-\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7\20\2\2\u010f/\3\2\2\2\u0110\u0111\7\21\2"+
		"\2\u0111\61\3\2\2\2\u0112\u0113\7\22\2\2\u0113\63\3\2\2\2\u0114\u0115"+
		"\7\23\2\2\u0115\65\3\2\2\2\u0116\u0117\7\17\2\2\u0117\67\3\2\2\2\u0118"+
		"\u0119\7\24\2\2\u01199\3\2\2\2\u011a\u011e\7\25\2\2\u011b\u011d\t\2\2"+
		"\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f;\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0125\7\26\2\2\u0122"+
		"\u0124\7)\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126=\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c"+
		"\7\27\2\2\u0129\u012b\7)\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d?\3\2\2\2\u012e\u012c\3\2\2\2"+
		"\u012f\u0133\7\30\2\2\u0130\u0132\7)\2\2\u0131\u0130\3\2\2\2\u0132\u0135"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134A\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u013a\7\32\2\2\u0137\u0139\7)\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"C\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0141\7\33\2\2\u013e\u0140\7)\2\2"+
		"\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142E\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148\7\34\2\2\u0145"+
		"\u0147\7)\2\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149G\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014f"+
		"\7\31\2\2\u014c\u014e\7)\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150I\3\2\2\2\u0151\u014f\3\2\2\2"+
		"\u0152\u0156\7\35\2\2\u0153\u0155\7)\2\2\u0154\u0153\3\2\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157K\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015a\7\36\2\2\u015aM\3\2\2\2\u015b\u015c\7\37\2"+
		"\2\u015cO\3\2\2\2!VZelt|\u0085\u008e\u0097\u00a0\u00a2\u00ab\u00cd\u00d3"+
		"\u00da\u00e1\u00e8\u00ef\u00f6\u00fd\u0104\u010b\u011e\u0125\u012c\u0133"+
		"\u013a\u0141\u0148\u014f\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}