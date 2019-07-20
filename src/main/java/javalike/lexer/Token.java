package javalike.lexer;

public class Token extends Object {
    private String lexeme;

    public Token(String lex, int type) {
        super(type);
        lexeme = lex;
    }

    public String getLexeme() {
       return lexeme;
    }

    public String toString() {
        return "<Token "+ lexeme + " type=" + super.toString() + ">";
    }

    public static final Token
            and = new Token("&&", TokenType.AND),
            or = new Token("||", TokenType.OR),
            eq = new Token("==", TokenType.EQ),
            neq = new Token("!=", TokenType.NEQ),
            lt = new Token("<", TokenType.LT),
            lte = new Token("<=", TokenType.LTE),
            gt = new Token(">", TokenType.GT),
            gte = new Token(">=", TokenType.GTE),
            // Math Operators
            assign = new Token("=", TokenType.ASSIGN),
            minus = new Token("-", TokenType.MINUS),
            add = new Token("+", TokenType.ADD),
            mult = new Token("*", TokenType.MULT),
            div = new Token("/", TokenType.DIV),
            // Random Symbols
            dot = new Token(".", TokenType.DOT),
            quote = new Token("'", TokenType.QUOTE),
            comma = new Token(",", TokenType.COMMA),
            semicolon = new Token(";", TokenType.SEMICOLON),
            colon = new Token(":", TokenType.COLON),
            // Grouping Symbols
            lparen = new Token("(", TokenType.LPAREN),
            rparen = new Token(")", TokenType.RPAREN),
            lbrace = new Token("{", TokenType.LBRACE),
            rbrace = new Token("}", TokenType.RBRACE),
            lbracket = new Token("[", TokenType.LBRACKET),
            rbracket = new Token("]", TokenType.RBRACKET),
            // Keywords
            Class = new Token("class", TokenType.CLASS),
            Bool = new Token("bool", TokenType.BOOL),
            Int = new Token("int", TokenType.INT),
            Str = new Token("string", TokenType.STRING),
            Char = new Token("char", TokenType.CHAR),
            Void = new Token("void", TokenType.VOID),
            Sym = new Token("sym", TokenType.SYM),
            atoi = new Token("atoi", TokenType.ATOI),
            itoa = new Token("itoa", TokenType.ITOA),
            JAVALIKE2019 = new Token("javalike2019", TokenType.JAVALIKE2019),
            Break = new Token("break", TokenType.BREAK),
            Switch = new Token("switch", TokenType.SWITCH),
            Case = new Token("case", TokenType.CASE),
            Default = new Token("default", TokenType.DEFAULT),
            True = new Token("true", TokenType.TRUE),
            False = new Token("false", TokenType.FALSE),
            Cin = new Token("cin", TokenType.CIN),
            Cout = new Token("cout", TokenType.COUT),
            Else = new Token("else", TokenType.ELSE),
            If = new Token("if", TokenType.IF),
            Public = new Token("public", TokenType.PUBLIC),
            Private = new Token("private", TokenType.PRIVATE),
            While = new Token("while", TokenType.WHILE),
            Object = new Token("object", TokenType.OBJECT),
            Null = new Token("null", TokenType.NULL),
            New = new Token("new", TokenType.NEW),
            Main = new Token("main", TokenType.MAIN),
            Return = new Token("return", TokenType.RETURN),
            This = new Token("this", TokenType.THIS),
            EOF = new Token("eof", TokenType.EOF);
}
