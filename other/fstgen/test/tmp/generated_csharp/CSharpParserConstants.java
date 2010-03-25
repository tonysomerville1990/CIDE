/* Generated By:JavaCC: Do not edit this line. CSharpParserConstants.java */
package tmp.generated_csharp;

public interface CSharpParserConstants {

  int EOF = 0;
  int ABSTRACT = 7;
  int LONG = 8;
  int AS = 9;
  int NAMESPACE = 10;
  int BASE = 11;
  int NEW = 12;
  int BOOL = 13;
  int NULL = 14;
  int BREAK = 15;
  int OBJECT = 16;
  int BYTE = 17;
  int OPERATOR = 18;
  int CASE = 19;
  int OUT = 20;
  int CATCH = 21;
  int OVERRIDE = 22;
  int CHAR = 23;
  int PARAMS = 24;
  int CHECKED = 25;
  int PRIVATE = 26;
  int CLASS = 27;
  int PROTECTED = 28;
  int CONST = 29;
  int PUBLIC = 30;
  int CONTINUE = 31;
  int READONLY = 32;
  int DECIMAL = 33;
  int REF = 34;
  int DEFAULTTOKEN = 35;
  int RETURN = 36;
  int DELEGATE = 37;
  int SBYTE = 38;
  int DO = 39;
  int SEALED = 40;
  int DOUBLE = 41;
  int SHORT = 42;
  int ELSE = 43;
  int SIZEOF = 44;
  int ENUM = 45;
  int STACKALLOC = 46;
  int EVENT = 47;
  int STATIC = 48;
  int EXPLICIT = 49;
  int STRING = 50;
  int EXTERN = 51;
  int STRUCT = 52;
  int FALSE = 53;
  int SWITCH = 54;
  int FINALLY = 55;
  int THIS = 56;
  int FIXED = 57;
  int THROW = 58;
  int FLOAT = 59;
  int TRUE = 60;
  int FOR = 61;
  int TRY = 62;
  int FOREACH = 63;
  int TYPEOF = 64;
  int GOTO = 65;
  int UINT = 66;
  int IF = 67;
  int ULONG = 68;
  int IMPLICIT = 69;
  int UNCHECKED = 70;
  int IN = 71;
  int UNSAFE = 72;
  int INT = 73;
  int USHORT = 74;
  int INTERFACE = 75;
  int USING = 76;
  int INTERNAL = 77;
  int VIRTUAL = 78;
  int IS = 79;
  int VOID = 80;
  int LOCK = 81;
  int WHILE = 82;
  int VOLATILE = 83;
  int WHERE = 84;
  int ASSEMBLY = 85;
  int MODULE = 86;
  int DOT = 87;
  int LBRACE = 88;
  int RBRACE = 89;
  int LBRACK = 90;
  int RBRACK = 91;
  int LPAREN = 92;
  int RPAREN = 93;
  int PLUS = 94;
  int PLUS_ASN = 95;
  int MINUS = 96;
  int MINUS_ASN = 97;
  int STAR = 98;
  int STAR_ASN = 99;
  int DIV = 100;
  int DIV_ASN = 101;
  int MOD = 102;
  int MOD_ASN = 103;
  int INC = 104;
  int DEC = 105;
  int SL = 106;
  int SL_ASN = 107;
  int SR = 108;
  int SR_ASN = 109;
  int BSR = 110;
  int BSR_ASN = 111;
  int AMPER = 112;
  int BAND_ASN = 113;
  int BOR = 114;
  int BOR_ASN = 115;
  int CARET = 116;
  int BXOR_ASN = 117;
  int TILDE = 118;
  int ASSIGN = 119;
  int EQUAL = 120;
  int LTHAN = 121;
  int LE = 122;
  int GTHAN = 123;
  int GE = 124;
  int BANG = 125;
  int NOT_EQUAL = 126;
  int LOR = 127;
  int LAND = 128;
  int COMMA = 129;
  int COLON = 130;
  int SEMI = 131;
  int HASH = 132;
  int QUOTE = 133;
  int QMARK = 134;
  int ARROW = 135;
  int UNICODE_ESCAPE_SEQUENCE = 136;
  int IDENTIFIER = 137;
  int IDENTIFIER_START_CHARACTER = 138;
  int IDENTIFIER_PART_CHARACTER = 139;
  int NUMERIC_LITERAL = 140;
  int HEXADECIMAL_INTEGER_LITERAL = 141;
  int CHARACTER_LITERAL = 142;
  int REGULAR_STRING_LITERAL = 143;
  int VERBATIM_STRING_LITERAL = 144;
  int DECIMAL_DIGIT = 145;
  int INTEGER_TYPE_SUFFIX = 146;
  int HEX_DIGIT = 147;
  int EXPONENT_PART = 148;
  int SIGN = 149;
  int REAL_TYPE_SUFFIX = 150;
  int CHARACTER = 151;
  int SINGLE_CHARACTER = 152;
  int SIMPLE_ESCAPE_SEQUENCE = 153;
  int HEXADECIMAL_ESCAPE_SEQUENCE = 154;
  int REGULAR_STRING_LITERAL_CHARACTER = 155;
  int SINGLE_REGULAR_STRING_LITERAL_CHARACTER = 156;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "<token of kind 6>",
    "\"abstract\"",
    "\"long\"",
    "\"as\"",
    "\"namespace\"",
    "\"base\"",
    "\"new\"",
    "\"bool\"",
    "\"null\"",
    "\"break\"",
    "\"object\"",
    "\"byte\"",
    "\"operator\"",
    "\"case\"",
    "\"out\"",
    "\"catch\"",
    "\"override\"",
    "\"char\"",
    "\"params\"",
    "\"checked\"",
    "\"private\"",
    "\"class\"",
    "\"protected\"",
    "\"const\"",
    "\"public\"",
    "\"continue\"",
    "\"readonly\"",
    "\"decimal\"",
    "\"ref\"",
    "\"default\"",
    "\"return\"",
    "\"delegate\"",
    "\"sbyte\"",
    "\"do\"",
    "\"sealed\"",
    "\"double\"",
    "\"short\"",
    "\"else\"",
    "\"sizeof\"",
    "\"enum\"",
    "\"stackalloc\"",
    "\"event\"",
    "\"static\"",
    "\"explicit\"",
    "\"string\"",
    "\"extern\"",
    "\"struct\"",
    "\"false\"",
    "\"switch\"",
    "\"finally\"",
    "\"this\"",
    "\"fixed\"",
    "\"throw\"",
    "\"float\"",
    "\"true\"",
    "\"for\"",
    "\"try\"",
    "\"foreach\"",
    "\"typeof\"",
    "\"goto\"",
    "\"uint\"",
    "\"if\"",
    "\"ulong\"",
    "\"implicit\"",
    "\"unchecked\"",
    "\"in\"",
    "\"unsafe\"",
    "\"int\"",
    "\"ushort\"",
    "\"interface\"",
    "\"using\"",
    "\"internal\"",
    "\"virtual\"",
    "\"is\"",
    "\"void\"",
    "\"lock\"",
    "\"while\"",
    "\"volatile\"",
    "\"where\"",
    "\"assembly\"",
    "\"module\"",
    "\".\"",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"+\"",
    "\"+=\"",
    "\"-\"",
    "\"-=\"",
    "\"*\"",
    "\"*=\"",
    "\"/\"",
    "\"/=\"",
    "\"%\"",
    "\"%=\"",
    "\"++\"",
    "\"--\"",
    "\"<<\"",
    "\"<<=\"",
    "\">>\"",
    "\">>=\"",
    "\">>>\"",
    "\">>>=\"",
    "\"&\"",
    "\"&=\"",
    "\"|\"",
    "\"|=\"",
    "\"^\"",
    "\"^=\"",
    "\"~\"",
    "\"=\"",
    "\"==\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"!\"",
    "\"!=\"",
    "\"||\"",
    "\"&&\"",
    "\",\"",
    "\":\"",
    "\";\"",
    "\"#\"",
    "\"\\\"\"",
    "\"?\"",
    "\"->\"",
    "<UNICODE_ESCAPE_SEQUENCE>",
    "<IDENTIFIER>",
    "<IDENTIFIER_START_CHARACTER>",
    "<IDENTIFIER_PART_CHARACTER>",
    "<NUMERIC_LITERAL>",
    "<HEXADECIMAL_INTEGER_LITERAL>",
    "<CHARACTER_LITERAL>",
    "<REGULAR_STRING_LITERAL>",
    "<VERBATIM_STRING_LITERAL>",
    "<DECIMAL_DIGIT>",
    "<INTEGER_TYPE_SUFFIX>",
    "<HEX_DIGIT>",
    "<EXPONENT_PART>",
    "<SIGN>",
    "<REAL_TYPE_SUFFIX>",
    "<CHARACTER>",
    "<SINGLE_CHARACTER>",
    "<SIMPLE_ESCAPE_SEQUENCE>",
    "<HEXADECIMAL_ESCAPE_SEQUENCE>",
    "<REGULAR_STRING_LITERAL_CHARACTER>",
    "<SINGLE_REGULAR_STRING_LITERAL_CHARACTER>",
  };

}