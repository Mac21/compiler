package javalike;

import javalike.lexer.Token;
import javalike.parser.Parser;
import javalike.lexer.Lexer;

import java.io.DataInputStream;
import java.lang.System;
import java.io.FileReader;
import java.io.File;
import java.lang.Exception;

public class JavaLike {
  private Lexer lexer;
  private Parser parser;

  public static void main(String[] args) throws Exception {
      if (args.length < 1) {
          throw new Exception("Input source file required");
      }

      FileReader reader = new FileReader(args[0]);
      //DataInputStream input = new DataInputStream(reader);

      Lexer l = new Lexer(reader);
      while (true) {
          Token tok = l.scan();
          System.out.println(tok.toString());
          System.out.println(l.getLineNumber());
          if (tok == Token.EOF) {
            break;
          }
      }
  }
}
