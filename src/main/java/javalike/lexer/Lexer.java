package javalike.lexer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lexer {
    private FileReader reader;
    private char peek = ' ';
    private static int line = 1;

    public Lexer(FileReader r ) {
        reader = r;
    }

    private void readch() throws IOException {
        while (reader.ready()) {
            peek = (char) reader.read();
            if (!Character.isSpaceChar(peek)) {
                break;
            }
        }
    }

    private boolean peek(char c) throws IOException {
        readch();
        if (peek != c) {
            return false;
        }
        return true;
    }

    public Token scan() throws IOException {
        readch();
        switch (peek) {
            case '&':
                break;
        }
        return null;
    }
}
