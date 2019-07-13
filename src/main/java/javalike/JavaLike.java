package javalike;

import javalike.parser.Parser;
import javalike.lexer.Lexer;
import java.lang.System;
import java.io.FileReader;
import java.lang.Exception;

public class JavaLike {
  private Lexer lexer;
  private Parser parser;

  public static void main(String[] args) throws Exception {
      if (args.length < 1) {
          throw new Exception("Input source file required");
      }

      FileReader reader = new FileReader(args[0]);
  }
}
