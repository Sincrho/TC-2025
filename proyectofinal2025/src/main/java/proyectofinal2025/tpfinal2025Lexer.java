// Generated from c:/Users/Santiago/Desktop/Personal/Finales 2025/TC 2025/proyectofinal2025/src/main/java/proyectofinal2025/tpfinal2025.g4 by ANTLR 4.13.1
 
package proyectofinal2025;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class tpfinal2025Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVE_APER=1, LLAVE_CIER=2, PAR_APER=3, PAR_CIER=4, MAS=5, MENOS=6, MULTI=7, 
		DIVIS=8, MENOR=9, MAYOR=10, MENOR_IGUAL=11, MAYOR_IGUAL=12, IGUALDAD=13, 
		DIFERENTE=14, AND=15, OR=16, COMA=17, PUNTO_COMA=18, ASIGNACION=19, INT=20, 
		FLOAT=21, DOUBLE=22, VOID=23, CTRL_IF=24, CTRL_WHILE=25, CTRL_FOR=26, 
		CTRL_RETURN=27, NRO_ENTERO=28, NRO_DECIMAL=29, ID=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVE_APER", "LLAVE_CIER", "PAR_APER", "PAR_CIER", 
			"MAS", "MENOS", "MULTI", "DIVIS", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"IGUALDAD", "DIFERENTE", "AND", "OR", "COMA", "PUNTO_COMA", "ASIGNACION", 
			"INT", "FLOAT", "DOUBLE", "VOID", "CTRL_IF", "CTRL_WHILE", "CTRL_FOR", 
			"CTRL_RETURN", "NRO_ENTERO", "NRO_DECIMAL", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "','", "';'", 
			"'='", "'int'", "'float'", "'double'", "'void'", "'if'", "'while'", "'for'", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVE_APER", "LLAVE_CIER", "PAR_APER", "PAR_CIER", "MAS", "MENOS", 
			"MULTI", "DIVIS", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "IGUALDAD", 
			"DIFERENTE", "AND", "OR", "COMA", "PUNTO_COMA", "ASIGNACION", "INT", 
			"FLOAT", "DOUBLE", "VOID", "CTRL_IF", "CTRL_WHILE", "CTRL_FOR", "CTRL_RETURN", 
			"NRO_ENTERO", "NRO_DECIMAL", "ID", "WS"
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


	public tpfinal2025Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tpfinal2025.g4"; }

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
		"\u0004\u0000\u001f\u00b9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0004\u001d\u009f\b\u001d\u000b\u001d\f\u001d"+
		"\u00a0\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u00a9\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u00ae\b\u001f\n\u001f\f\u001f\u00b1\t\u001f\u0001 \u0004 \u00b4"+
		"\b \u000b \f \u00b5\u0001 \u0001 \u0000\u0000!\u0001\u0000\u0003\u0000"+
		"\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011"+
		"\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e"+
		"!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u0018"+
		"5\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001f\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00bc\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C"+
		"\u0001\u0000\u0000\u0000\u0003E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000"+
		"\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000"+
		"\u000bM\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fQ\u0001"+
		"\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013U\u0001\u0000\u0000"+
		"\u0000\u0015W\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019"+
		"[\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001da\u0001"+
		"\u0000\u0000\u0000\u001fd\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000"+
		"\u0000#j\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000\u0000\'o\u0001\u0000"+
		"\u0000\u0000)q\u0001\u0000\u0000\u0000+s\u0001\u0000\u0000\u0000-w\u0001"+
		"\u0000\u0000\u0000/}\u0001\u0000\u0000\u00001\u0084\u0001\u0000\u0000"+
		"\u00003\u0089\u0001\u0000\u0000\u00005\u008c\u0001\u0000\u0000\u00007"+
		"\u0092\u0001\u0000\u0000\u00009\u0096\u0001\u0000\u0000\u0000;\u009e\u0001"+
		"\u0000\u0000\u0000=\u00a2\u0001\u0000\u0000\u0000?\u00a8\u0001\u0000\u0000"+
		"\u0000A\u00b3\u0001\u0000\u0000\u0000CD\u0007\u0000\u0000\u0000D\u0002"+
		"\u0001\u0000\u0000\u0000EF\u0007\u0001\u0000\u0000F\u0004\u0001\u0000"+
		"\u0000\u0000GH\u0005{\u0000\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005"+
		"}\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005(\u0000\u0000L\n\u0001"+
		"\u0000\u0000\u0000MN\u0005)\u0000\u0000N\f\u0001\u0000\u0000\u0000OP\u0005"+
		"+\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005-\u0000\u0000R\u0010"+
		"\u0001\u0000\u0000\u0000ST\u0005*\u0000\u0000T\u0012\u0001\u0000\u0000"+
		"\u0000UV\u0005/\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0005<\u0000"+
		"\u0000X\u0016\u0001\u0000\u0000\u0000YZ\u0005>\u0000\u0000Z\u0018\u0001"+
		"\u0000\u0000\u0000[\\\u0005<\u0000\u0000\\]\u0005=\u0000\u0000]\u001a"+
		"\u0001\u0000\u0000\u0000^_\u0005>\u0000\u0000_`\u0005=\u0000\u0000`\u001c"+
		"\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000bc\u0005=\u0000\u0000c\u001e"+
		"\u0001\u0000\u0000\u0000de\u0005!\u0000\u0000ef\u0005=\u0000\u0000f \u0001"+
		"\u0000\u0000\u0000gh\u0005&\u0000\u0000hi\u0005&\u0000\u0000i\"\u0001"+
		"\u0000\u0000\u0000jk\u0005|\u0000\u0000kl\u0005|\u0000\u0000l$\u0001\u0000"+
		"\u0000\u0000mn\u0005,\u0000\u0000n&\u0001\u0000\u0000\u0000op\u0005;\u0000"+
		"\u0000p(\u0001\u0000\u0000\u0000qr\u0005=\u0000\u0000r*\u0001\u0000\u0000"+
		"\u0000st\u0005i\u0000\u0000tu\u0005n\u0000\u0000uv\u0005t\u0000\u0000"+
		"v,\u0001\u0000\u0000\u0000wx\u0005f\u0000\u0000xy\u0005l\u0000\u0000y"+
		"z\u0005o\u0000\u0000z{\u0005a\u0000\u0000{|\u0005t\u0000\u0000|.\u0001"+
		"\u0000\u0000\u0000}~\u0005d\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f"+
		"\u0080\u0005u\u0000\u0000\u0080\u0081\u0005b\u0000\u0000\u0081\u0082\u0005"+
		"l\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u00830\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005v\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086"+
		"\u0087\u0005i\u0000\u0000\u0087\u0088\u0005d\u0000\u0000\u00882\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005i\u0000\u0000\u008a\u008b\u0005f\u0000"+
		"\u0000\u008b4\u0001\u0000\u0000\u0000\u008c\u008d\u0005w\u0000\u0000\u008d"+
		"\u008e\u0005h\u0000\u0000\u008e\u008f\u0005i\u0000\u0000\u008f\u0090\u0005"+
		"l\u0000\u0000\u0090\u0091\u0005e\u0000\u0000\u00916\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005f\u0000\u0000\u0093\u0094\u0005o\u0000\u0000\u0094"+
		"\u0095\u0005r\u0000\u0000\u00958\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"r\u0000\u0000\u0097\u0098\u0005e\u0000\u0000\u0098\u0099\u0005t\u0000"+
		"\u0000\u0099\u009a\u0005u\u0000\u0000\u009a\u009b\u0005r\u0000\u0000\u009b"+
		"\u009c\u0005n\u0000\u0000\u009c:\u0001\u0000\u0000\u0000\u009d\u009f\u0003"+
		"\u0003\u0001\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1<\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003;\u001d"+
		"\u0000\u00a3\u00a4\u0005.\u0000\u0000\u00a4\u00a5\u0003;\u001d\u0000\u00a5"+
		">\u0001\u0000\u0000\u0000\u00a6\u00a9\u0003\u0001\u0000\u0000\u00a7\u00a9"+
		"\u0005_\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00af\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003"+
		"\u0001\u0000\u0000\u00ab\u00ae\u0003\u0003\u0001\u0000\u00ac\u00ae\u0005"+
		"_\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0@\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0007\u0002\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0006 \u0000\u0000\u00b8B\u0001\u0000\u0000\u0000\u0006"+
		"\u0000\u00a0\u00a8\u00ad\u00af\u00b5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}