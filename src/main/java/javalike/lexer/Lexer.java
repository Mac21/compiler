package javalike.lexer;

import java.awt.image.TileObserver;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Lexer {
    private static int line = 1;
    private boolean isDone;
    private FileReader reader;
    private char peek = ' ';
    private HashMap<String, Token> reserved = new HashMap<String, Token>();

    public Lexer(FileReader r ) {
        reserved.put(Token.add.getLexeme(), Token.add);
        reserved.put(Token.If.getLexeme(), Token.If);
        reserved.put(Token.Else.getLexeme(), Token.Else);
        reserved.put(Token.While.getLexeme(), Token.While);
        reserved.put(Token.Default.getLexeme(), Token.Default);
        reserved.put(Token.Break.getLexeme(), Token.Break);
        reserved.put(Token.Void.getLexeme(), Token.Void);
        reserved.put(Token.Main.getLexeme(), Token.Main);
        reader = r;
        isDone = false;
    }

    private void readch() throws IOException {
            int charCode = reader.read();
            if (charCode == -1) {
                isDone = true;
                peek = ' ';
                return;
            }
            peek = (char) charCode;
    }

    private boolean expect(char c) throws IOException {
        readch();
        if (peek != c) {
            return false;
        }
        peek = ' ';
        return true;
    }

    public int getLineNumber() {
        return line;
    }

    public Token scan() throws IOException {
        if (isDone) {
            return Token.EOF;
        }

        while (true) {
            readch();
            if (peek == ' ' || peek == '\t') {
                continue;
            } else if (peek == '\n') {
                line++;
            } else {
                break;
            }
        }

        switch (peek) {
            case '&':
                if (expect('&')) {
                    return Token.and;
                }
                break;
            case '|':
                if (expect('|')) {
                    return Token.or;
                }
                break;
            default:
                if (Character.isDigit(peek)) {
                    // Parsing a number
                }
                if (Character.isLetter(peek)) {
                    // Parsing a keyword or identifier
                    StringBuilder b = new StringBuilder();
                    do {
                        //System.out.println(peek);
                        b.append(peek);
                        readch();
                    } while (Character.isLetterOrDigit(peek));
                    String identStr = b.toString();
                    Token keyword = reserved.get(identStr);
                    if (keyword != null) {
                        return keyword;
                    }

                    Token ident = new Token(identStr, TokenType.IDENT);
                    reserved.put(identStr, ident);
                    return ident;
                }
                Token tok = new Token("" + peek, TokenType.UNKNOWN);
                peek = ' ';
                return tok;
        }
        return Token.EOF;
    }
}
