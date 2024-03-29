package javalike.lexer;

public class TokenType {
    public final static int
            // Relation Operators
            AND = 100,
            OR = 101,
            EQ = 102,
            NEQ = 103,
            LT = 104,
            LTE = 105,
            GT = 106,
            GTE = 107,
            // Math Operators
            ASSIGN = 108,
            MINUS = 109,
            ADD = 110,
            MULT = 111,
            DIV = 112,
            // Random Symbols
            DOT = 113,
            QUOTE = 114,
            COMMA = 115,
            SEMICOLON = 116,
            COLON = 117,
            // Grouping Symbols
            LPAREN = 118,
            RPAREN = 119,
            LBRACE = 120,
            RBRACE = 121,
            LBRACKET = 122,
            RBRACKET = 123,
            // Keywords
            IDENT = 154,
            CLASS = 124,
            BOOL = 125,
            INT = 126,
            STRING = 127,
            CHAR = 128,
            VOID = 129,
            SYM = 130,
            ATOI = 131,
            ITOA = 132,
            JAVALIKE2019 = 133,
            BREAK = 134,
            SWITCH = 135,
            CASE = 136,
            DEFAULT = 137,
            TRUE = 138,
            FALSE = 139,
            CIN = 140,
            COUT = 141,
            ELSE = 142,
            IF = 143,
            PUBLIC = 144,
            PRIVATE = 145,
            WHILE = 146,
            OBJECT = 147,
            NULL = 148,
            NEW = 149,
            MAIN = 150,
            RETURN = 151,
            THIS = 152,
            EOF = 153,
            UNKNOWN = 154;
}
