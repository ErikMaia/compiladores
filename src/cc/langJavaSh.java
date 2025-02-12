/* langJavaSh.java */
/* Generated By:JavaCC: Do not edit this line. langJavaSh.java */
package cc;
public class langJavaSh implements langJavaShConstants {
  public static void main(String args[]) throws ParseException, FileNotFoundException {
    if (args.length == 0) {
        System.out.println("Uso: java langJavaSh <arquivo>");
        System.exit(1);
    }

    // Abre o arquivo de entrada
    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(args[0]);
    langJavaSh parser = new langJavaSh(fileInputStream);

    while (true) {
        System.out.println("Lendo o arquivo de entrada");
        try {
            parser.ClassStruct(); // Analisa a estrutura da classe
            System.out.println("Compilado com sucesso");
        } catch (Exception e) {
            System.out.println("NOK.");
            System.out.println(e.getMessage());
            parser.ReInit(fileInputStream); // Reinicializa o parser com o arquivo
        } catch (Error e) {
            System.out.println("Oops.");
            System.out.println(e.getMessage());
            break;
        }
    }
}

/* Produções da gramática */

/* Expressões aritméticas */
  static final public void sum() throws ParseException {
    term();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:{
        jj_consume_token(PLUS);
        break;
        }
      case MINUS:{
        jj_consume_token(MINUS);
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      term();
    }
}

  static final public void term() throws ParseException {
    unary();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MULTIPLY:{
        jj_consume_token(MULTIPLY);
        break;
        }
      case DIVIDE:{
        jj_consume_token(DIVIDE);
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      unary();
    }
}

  static final public void unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MINUS:{
      jj_consume_token(MINUS);
      element();
      break;
      }
    case CONSTANT:
    case 36:{
      element();
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      break;
      }
    case 36:{
      jj_consume_token(36);
      sum();
      jj_consume_token(37);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void MathSta() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Ident:{
      jj_consume_token(Ident);
      break;
      }
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case MATH:{
      jj_consume_token(MATH);
      MathSta();
      break;
      }
    default:
      jj_la1[7] = jj_gen;
      ;
    }
}

/* --- Transformação das expressões lógicas --- */
  static final public void LogicalSta() throws ParseException {
    BooleanExp();
}

  static final public void BooleanExp() throws ParseException {
    BooleanPrimary();
    BooleanExpTail();
}

  static final public void BooleanExpTail() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LogicalDigital:{
      jj_consume_token(LogicalDigital);
      BooleanExp();
      break;
      }
    default:
      jj_la1[8] = jj_gen;
      ;
    }
}

  static final public void BooleanPrimary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case LOGICALCONSTANT:{
      jj_consume_token(LOGICALCONSTANT);
      break;
      }
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case MATH:{
        jj_consume_token(MATH);
        MathSta();
        break;
        }
      default:
        jj_la1[9] = jj_gen;
        ;
      }
      break;
      }
    case Ident:{
      jj_consume_token(Ident);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case LogicalMathOperator:{
        jj_consume_token(LogicalMathOperator);
        MathSta();
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/* --- Transformação de atribuição e incremento --- */
  static final public void VarAssignOrInc() throws ParseException {
    jj_consume_token(Ident);
    VarAssignOrIncTail();
}

  static final public void VarAssignOrIncTail() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Atribute:{
      jj_consume_token(Atribute);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CONSTANT:
      case Ident:{
        MathSta();
        break;
        }
      case LOGICALCONSTANT:{
        LogicalSta();
        break;
        }
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    case INCREMENT:
    case DECREMENT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DECREMENT:{
        jj_consume_token(DECREMENT);
        break;
        }
      case INCREMENT:{
        jj_consume_token(INCREMENT);
        break;
        }
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static final public void IncrementalExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Ident:{
      VarAssignOrInc();
      break;
      }
    case INCREMENT:
    case DECREMENT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DECREMENT:{
        jj_consume_token(DECREMENT);
        break;
        }
      case INCREMENT:{
        jj_consume_token(INCREMENT);
        break;
        }
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(Ident);
      break;
      }
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/* Usada também na escolha de statements */
  static final public void atributeVar() throws ParseException {
    VarAssignOrInc();
}

/* Declaração de inicialização de variável */
  static final public void initVar() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Int:{
      jj_consume_token(Int);
      jj_consume_token(Ident);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Atribute:{
        jj_consume_token(Atribute);
        MathSta();
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      break;
      }
    case Bool:{
      jj_consume_token(Bool);
      jj_consume_token(Ident);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Atribute:{
        jj_consume_token(Atribute);
        LogicalSta();
        break;
        }
      default:
        jj_la1[18] = jj_gen;
        ;
      }
      break;
      }
    case String:{
      jj_consume_token(String);
      jj_consume_token(Ident);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Atribute:{
        jj_consume_token(Atribute);
        jj_consume_token(38);
        label_3:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case CHAR:{
            ;
            break;
            }
          default:
            jj_la1[19] = jj_gen;
            break label_3;
          }
          jj_consume_token(CHAR);
        }
        jj_consume_token(38);
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        ;
      }
      break;
      }
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

/* Declaração de método */
  static final public void Method() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AccessMod:{
      jj_consume_token(AccessMod);
      break;
      }
    default:
      jj_la1[22] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Int:{
      jj_consume_token(Int);
      break;
      }
    case Float:{
      jj_consume_token(Float);
      break;
      }
    case String:{
      jj_consume_token(String);
      break;
      }
    case Bool:{
      jj_consume_token(Bool);
      break;
      }
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(Ident);
    jj_consume_token(36);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Int:
      case Float:
      case String:
      case Bool:{
        ;
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Int:{
        jj_consume_token(Int);
        break;
        }
      case Float:{
        jj_consume_token(Float);
        break;
        }
      case String:{
        jj_consume_token(String);
        break;
        }
      case Bool:{
        jj_consume_token(Bool);
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(Ident);
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 39:{
          ;
          break;
          }
        default:
          jj_la1[26] = jj_gen;
          break label_5;
        }
        jj_consume_token(39);
      }
    }
    jj_consume_token(37);
    jj_consume_token(40);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case INCREMENT:
      case DECREMENT:
      case While:
      case If:
      case For:
      case Int:
      case String:
      case Bool:
      case Ident:{
        ;
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        break label_6;
      }
      stra();
    }
    jj_consume_token(41);
}

/* Expressão if */
  static final public void IfExpression() throws ParseException {
    jj_consume_token(If);
    jj_consume_token(36);
    LogicalSta();
    jj_consume_token(37);
    jj_consume_token(40);
    stra();
    jj_consume_token(41);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Else:{
      jj_consume_token(Else);
      jj_consume_token(40);
      stra();
      jj_consume_token(41);
      break;
      }
    default:
      jj_la1[28] = jj_gen;
      ;
    }
}

/* Expressão for */
  static final public void ForExpression() throws ParseException {
    jj_consume_token(For);
    jj_consume_token(36);
    initVar();
    jj_consume_token(42);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Ident:{
      jj_consume_token(Ident);
      jj_consume_token(LogicalMathOperator);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case Ident:{
        jj_consume_token(Ident);
        break;
        }
      case CONSTANT:{
        jj_consume_token(CONSTANT);
        break;
        }
      default:
        jj_la1[29] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
      }
    default:
      jj_la1[30] = jj_gen;
      ;
    }
    jj_consume_token(42);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INCREMENT:
    case DECREMENT:
    case Ident:{
      IncrementalExpression();
      break;
      }
    default:
      jj_la1[31] = jj_gen;
      ;
    }
    jj_consume_token(37);
    jj_consume_token(40);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INCREMENT:
    case DECREMENT:
    case While:
    case If:
    case For:
    case Int:
    case String:
    case Bool:
    case Ident:{
      stra();
      break;
      }
    default:
      jj_la1[32] = jj_gen;
      ;
    }
    jj_consume_token(41);
}

/* Expressão while */
  static final public void WhileExpretion() throws ParseException {
    jj_consume_token(While);
    jj_consume_token(36);
    LogicalSta();
    jj_consume_token(37);
    jj_consume_token(40);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case INCREMENT:
    case DECREMENT:
    case While:
    case If:
    case For:
    case Int:
    case String:
    case Bool:
    case Ident:{
      stra();
      break;
      }
    default:
      jj_la1[33] = jj_gen;
      ;
    }
    jj_consume_token(41);
}

/* Declaração de propriedade */
  static final public void prop() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AccessMod:{
      jj_consume_token(AccessMod);
      break;
      }
    default:
      jj_la1[34] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Int:{
      jj_consume_token(Int);
      break;
      }
    case Float:{
      jj_consume_token(Float);
      break;
      }
    case String:{
      jj_consume_token(String);
      break;
      }
    case Bool:{
      jj_consume_token(Bool);
      break;
      }
    default:
      jj_la1[35] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(Ident);
}

/* Estrutura de classe */
  static final public void ClassStruct() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case AccessMod:{
      jj_consume_token(AccessMod);
      break;
      }
    default:
      jj_la1[36] = jj_gen;
      ;
    }
    jj_consume_token(Class);
    jj_consume_token(Ident);
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Extends:{
      jj_consume_token(Extends);
      jj_consume_token(Ident);
      break;
      }
    default:
      jj_la1[37] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Implements:{
      jj_consume_token(Implements);
      jj_consume_token(Ident);
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case 43:{
          ;
          break;
          }
        default:
          jj_la1[38] = jj_gen;
          break label_7;
        }
        jj_consume_token(43);
        jj_consume_token(Ident);
      }
      break;
      }
    default:
      jj_la1[39] = jj_gen;
      ;
    }
    jj_consume_token(40);
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case AccessMod:
      case Int:
      case Float:
      case String:
      case Bool:{
        ;
        break;
        }
      default:
        jj_la1[40] = jj_gen;
        break label_8;
      }
      Method();
    }
    jj_consume_token(41);
}

/* Statements (statement único ou composto) */
  static final public void stra() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Ident:{
      VarAssignOrInc();
      break;
      }
    case Int:
    case String:
    case Bool:{
      initVar();
      break;
      }
    case INCREMENT:
    case DECREMENT:{
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case DECREMENT:{
        jj_consume_token(DECREMENT);
        break;
        }
      case INCREMENT:{
        jj_consume_token(INCREMENT);
        break;
        }
      default:
        jj_la1[41] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(Ident);
      break;
      }
    case If:{
      IfExpression();
      break;
      }
    case For:{
      ForExpression();
      break;
      }
    case While:{
      WhileExpretion();
      break;
      }
    default:
      jj_la1[42] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(42);
}

  static final public void panicSync() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 0:{

      break;
      }
    default:
      jj_la1[43] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case Ident:{
      jj_consume_token(Ident);
      break;
      }
    case CONSTANT:{
      jj_consume_token(CONSTANT);
      break;
      }
    case 42:{
      jj_consume_token(42);
      break;
      }
    case 40:{
      jj_consume_token(40);
      break;
      }
    case 41:{
      jj_consume_token(41);
      break;
      }
    default:
      jj_la1[44] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public langJavaShTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[45];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
	   jj_la1_init_0();
	   jj_la1_init_1();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0x120,0x120,0x600,0x600,0x20100,0x20000,0x20000,0x800,0x1000,0x800,0x8000,0x60000,0x60000,0xc0,0x100c0,0xc0,0xc0,0x10000,0x10000,0x0,0x10000,0xa0000000,0x100000,0xe0000000,0xe0000000,0xe0000000,0x0,0xab0000c0,0x4000000,0x20000,0x0,0xc0,0xab0000c0,0xab0000c0,0x100000,0xe0000000,0x100000,0x200000,0x0,0x400000,0xe0100000,0xc0,0xab0000c0,0x1,0x20000,};
	}
	private static void jj_la1_init_1() {
	   jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x10,0x10,0x4,0x0,0x0,0x0,0x0,0x4,0x4,0x0,0x0,0x0,0x4,0x0,0x0,0x8,0x0,0x1,0x0,0x1,0x1,0x1,0x80,0x5,0x0,0x4,0x4,0x4,0x5,0x5,0x0,0x1,0x0,0x0,0x800,0x0,0x1,0x0,0x5,0x0,0x704,};
	}

  /** Constructor with InputStream. */
  public langJavaSh(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public langJavaSh(java.io.InputStream stream, String encoding) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser.  ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new langJavaShTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public langJavaSh(java.io.Reader stream) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new langJavaShTokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new langJavaShTokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public langJavaSh(langJavaShTokenManager tm) {
	 if (jj_initialized_once) {
	   System.out.println("ERROR: Second call to constructor of static parser. ");
	   System.out.println("	   You must either use ReInit() or set the JavaCC option STATIC to false");
	   System.out.println("	   during parser generation.");
	   throw new Error();
	 }
	 jj_initialized_once = true;
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(langJavaShTokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 45; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  static private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[44];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 45; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		   if ((jj_la1_1[i] & (1<<j)) != 0) {
			 la1tokens[32+j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 44; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  static private boolean trace_enabled;

/** Trace enabled. */
  static final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
