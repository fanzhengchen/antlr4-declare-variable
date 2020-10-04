// Generated from /Users/fanzhengchen/IntellijProjects/antlr4/antlr-example/declare-variable/src/main/resources/Mark.g4 by ANTLR 4.8
package com.alipay.parse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MarkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IntegerLiteral=3, IntegerLiteralSuffix=4, INT=5, SHORT=6, 
		DOUBLE=7, FLOAT=8, RETURN=9, ASSIGN=10, MUL_ASSIGN=11, ADD=12, MUL=13, 
		SUB=14, DIV=15, LPAREN=16, RPAREN=17, SEMI_COL=18, Identifier=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IntegerLiteral", "IntegerLiteralSuffix", "INT", "SHORT", 
			"DOUBLE", "FLOAT", "RETURN", "ASSIGN", "MUL_ASSIGN", "ADD", "MUL", "SUB", 
			"DIV", "LPAREN", "RPAREN", "SEMI_COL", "Identifier", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, null, "'int'", "'short'", "'double'", "'float'", 
			"'return'", "'='", "'*='", "'+'", "'*'", "'-'", "'/'", "'('", "')'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IntegerLiteral", "IntegerLiteralSuffix", "INT", "SHORT", 
			"DOUBLE", "FLOAT", "RETURN", "ASSIGN", "MUL_ASSIGN", "ADD", "MUL", "SUB", 
			"DIV", "LPAREN", "RPAREN", "SEMI_COL", "Identifier", "WS"
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


	public MarkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mark.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\6\4\61\n\4\r\4\16\4"+
		"\62\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\7\24j\n\24\f\24\16\24m\13\24\3\25\6\25p\n\25\r"+
		"\25\16\25q\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\3\2\62;\4\2"+
		"NNnn\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\60\3\2\2\2\t\64\3\2\2\2\13\66\3\2"+
		"\2\2\r:\3\2\2\2\17@\3\2\2\2\21G\3\2\2\2\23M\3\2\2\2\25T\3\2\2\2\27V\3"+
		"\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2"+
		"\2\2%e\3\2\2\2\'g\3\2\2\2)o\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7\177\2\2.\6"+
		"\3\2\2\2/\61\t\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2"+
		"\2\2\63\b\3\2\2\2\64\65\t\3\2\2\65\n\3\2\2\2\66\67\7k\2\2\678\7p\2\28"+
		"9\7v\2\29\f\3\2\2\2:;\7u\2\2;<\7j\2\2<=\7q\2\2=>\7t\2\2>?\7v\2\2?\16\3"+
		"\2\2\2@A\7f\2\2AB\7q\2\2BC\7w\2\2CD\7d\2\2DE\7n\2\2EF\7g\2\2F\20\3\2\2"+
		"\2GH\7h\2\2HI\7n\2\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2L\22\3\2\2\2MN\7t\2\2N"+
		"O\7g\2\2OP\7v\2\2PQ\7w\2\2QR\7t\2\2RS\7p\2\2S\24\3\2\2\2TU\7?\2\2U\26"+
		"\3\2\2\2VW\7,\2\2WX\7?\2\2X\30\3\2\2\2YZ\7-\2\2Z\32\3\2\2\2[\\\7,\2\2"+
		"\\\34\3\2\2\2]^\7/\2\2^\36\3\2\2\2_`\7\61\2\2` \3\2\2\2ab\7*\2\2b\"\3"+
		"\2\2\2cd\7+\2\2d$\3\2\2\2ef\7=\2\2f&\3\2\2\2gk\t\4\2\2hj\t\4\2\2ih\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l(\3\2\2\2mk\3\2\2\2np\t\5\2\2on\3\2"+
		"\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\25\2\2t*\3\2\2\2\6\2"+
		"\62kq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}