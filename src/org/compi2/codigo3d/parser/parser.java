
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Mar 13 14:18:43 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Mar 13 14:18:43 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\007\002\000\002\002" +
    "\004\000\002\006\003\000\002\006\003\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\003\005\000\002\003\004\000\002\003\005\000\002" +
    "\003\003\000\002\003\003\000\002\003\003\000\002\005" +
    "\003\000\002\005\003\000\002\005\003\000\002\005\003" +
    "\000\002\005\003\000\002\005\003\000\002\010\002\000" +
    "\002\004\006\000\002\011\002\000\002\004\006\000\002" +
    "\004\004\000\002\004\005\000\002\004\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\016\004\000\005\000\006\000\012\000\016" +
    "\000\030\000\001\002\000\016\004\007\005\015\006\012" +
    "\012\013\016\017\030\011\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\ufff5\011\ufff5" +
    "\012\ufff5\013\ufff5\014\ufff5\015\ufff5\017\ufff5\020\ufff5\021" +
    "\ufff5\022\ufff5\023\ufff5\024\ufff5\025\ufff5\026\ufff5\027\ufff5" +
    "\001\002\000\010\002\ufffe\020\047\021\050\001\002\000" +
    "\016\004\007\005\015\006\012\012\013\016\017\030\011" +
    "\001\002\000\040\002\ufff3\011\ufff3\012\ufff3\013\ufff3\014" +
    "\ufff3\015\ufff3\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3" +
    "\024\ufff3\025\ufff3\026\ufff3\027\ufff3\001\002\000\014\004" +
    "\007\005\015\006\012\012\013\016\037\001\002\000\032" +
    "\002\ufffd\011\036\012\024\013\022\014\032\015\030\022" +
    "\025\023\035\024\033\025\023\026\026\027\027\001\002" +
    "\000\040\002\ufff4\011\ufff4\012\ufff4\013\ufff4\014\ufff4\015" +
    "\ufff4\017\ufff4\020\ufff4\021\ufff4\022\ufff4\023\ufff4\024\ufff4" +
    "\025\ufff4\026\ufff4\027\ufff4\001\002\000\004\002\uffff\001" +
    "\002\000\016\004\007\005\015\006\012\012\013\016\017" +
    "\030\011\001\002\000\010\017\051\020\047\021\050\001" +
    "\002\000\032\011\036\012\024\013\022\014\032\015\030" +
    "\017\034\022\025\023\035\024\033\025\023\026\026\027" +
    "\027\001\002\000\014\004\007\005\015\006\012\012\013" +
    "\016\037\001\002\000\014\004\ufff0\005\ufff0\006\ufff0\012" +
    "\ufff0\016\ufff0\001\002\000\014\004\007\005\015\006\012" +
    "\012\013\016\037\001\002\000\014\004\ufff1\005\ufff1\006" +
    "\ufff1\012\ufff1\016\ufff1\001\002\000\014\004\uffee\005\uffee" +
    "\006\uffee\012\uffee\016\uffee\001\002\000\014\004\uffed\005" +
    "\uffed\006\uffed\012\uffed\016\uffed\001\002\000\014\004\007" +
    "\005\015\006\012\012\013\016\037\001\002\000\014\004" +
    "\007\005\015\006\012\012\013\016\037\001\002\000\014" +
    "\004\007\005\015\006\012\012\013\016\037\001\002\000" +
    "\014\004\uffef\005\uffef\006\uffef\012\uffef\016\uffef\001\002" +
    "\000\040\002\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015" +
    "\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6" +
    "\025\ufff6\026\ufff6\027\ufff6\001\002\000\014\004\ufff2\005" +
    "\ufff2\006\ufff2\012\ufff2\016\ufff2\001\002\000\014\004\007" +
    "\005\015\006\012\012\013\016\037\001\002\000\014\004" +
    "\007\005\015\006\012\012\013\016\037\001\002\000\040" +
    "\002\ufffc\011\ufffc\012\ufffc\013\022\014\032\015\030\017" +
    "\ufffc\020\ufffc\021\ufffc\022\ufffc\023\ufffc\024\ufffc\025\ufffc" +
    "\026\ufffc\027\ufffc\001\002\000\016\011\036\012\024\013" +
    "\022\014\032\015\030\017\034\001\002\000\040\002\ufffa" +
    "\011\ufffa\012\ufffa\013\ufffa\014\ufffa\015\030\017\ufffa\020" +
    "\ufffa\021\ufffa\022\ufffa\023\ufffa\024\ufffa\025\ufffa\026\ufffa" +
    "\027\ufffa\001\002\000\024\002\uffe7\011\036\012\024\013" +
    "\022\014\032\015\030\017\uffe7\020\uffe7\021\uffe7\001\002" +
    "\000\040\002\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\015" +
    "\030\017\ufff8\020\ufff8\021\ufff8\022\ufff8\023\ufff8\024\ufff8" +
    "\025\ufff8\026\ufff8\027\ufff8\001\002\000\040\002\ufffb\011" +
    "\ufffb\012\ufffb\013\022\014\032\015\030\017\ufffb\020\ufffb" +
    "\021\ufffb\022\ufffb\023\ufffb\024\ufffb\025\ufffb\026\ufffb\027" +
    "\ufffb\001\002\000\040\002\ufff9\011\ufff9\012\ufff9\013\ufff9" +
    "\014\ufff9\015\030\017\ufff9\020\ufff9\021\ufff9\022\ufff9\023" +
    "\ufff9\024\ufff9\025\ufff9\026\ufff9\027\ufff9\001\002\000\016" +
    "\004\uffec\005\uffec\006\uffec\012\uffec\016\uffec\030\uffec\001" +
    "\002\000\016\004\uffea\005\uffea\006\uffea\012\uffea\016\uffea" +
    "\030\uffea\001\002\000\012\002\uffe6\017\uffe6\020\uffe6\021" +
    "\uffe6\001\002\000\016\004\007\005\015\006\012\012\013" +
    "\016\017\030\011\001\002\000\012\002\uffe9\017\uffe9\020" +
    "\047\021\uffe9\001\002\000\030\011\036\012\024\013\022" +
    "\014\032\015\030\022\025\023\035\024\033\025\023\026" +
    "\026\027\027\001\002\000\016\004\007\005\015\006\012" +
    "\012\013\016\017\030\011\001\002\000\012\002\uffeb\017" +
    "\uffeb\020\uffeb\021\uffeb\001\002\000\040\002\ufff7\011\ufff7" +
    "\012\ufff7\013\022\014\032\015\030\017\ufff7\020\ufff7\021" +
    "\ufff7\022\ufff7\023\ufff7\024\ufff7\025\ufff7\026\ufff7\027\ufff7" +
    "\001\002\000\012\002\uffe8\017\uffe8\020\047\021\050\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\002\004\007\003\001\001\000\010\003" +
    "\013\004\007\006\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\003" +
    "\053\004\057\001\001\000\002\001\001\000\004\003\056" +
    "\001\001\000\004\005\030\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\003\020\004\017\001\001\000\002" +
    "\001\001\000\004\005\030\001\001\000\004\003\045\001" +
    "\001\000\002\001\001\000\004\003\044\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\003" +
    "\043\001\001\000\004\003\042\001\001\000\004\003\041" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\037\001\001\000\004\003\040\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\054\001\001\000\004\011\051\001" +
    "\001\000\002\001\001\000\006\003\053\004\052\001\001" +
    "\000\002\001\001\000\004\005\030\001\001\000\006\003" +
    "\053\004\055\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // B ::= para B parc 
            {
              NodoC3D RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D b = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                        RESULT = b;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // B ::= expresion OPREL expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int oprelleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oprelright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D oprel = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String etqV = ControlC3D.generaEtq();
                        String etqF = ControlC3D.generaEtq();
                        
                        String cad = "if "+izq.getCad()+ " " + oprel.getCad()+" " + der.getCad() + " then goto " + etqV + "\ngoto " + etqF + "\n";

                        ControlC3D.agregarC3D(cad);
                        
                        RESULT = new NodoC3D(""); 
                        RESULT.setEtiquetas(etqV+":", etqF+":");
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // B ::= not B 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = new NodoC3D(exp.getCad());
                        RESULT.setEtiquetas(exp.getEtqF(), exp.getEtqV());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // B ::= B or NT$2 B 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        ControlC3D.agregarC3D(der.getEtqV());

                        RESULT = new NodoC3D("");
                        RESULT.setEtiquetas(izq.getEtqV()+der.getEtqV(), der.getEtqF());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // NT$2 ::= 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 ControlC3D.agregarC3D(izq.getEtqF()+"\n"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // B ::= B and NT$1 B 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        ControlC3D.agregarC3D(der.getEtqV());

                        RESULT = new NodoC3D("");
                        RESULT.setEtiquetas(der.getEtqV(), izq.getEtqF()+der.getEtqF()); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // NT$1 ::= 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
 ControlC3D.agregarC3D(izq.getEtqV()+"\n"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OPREL ::= noigual 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("!="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OPREL ::= igualigual 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("=="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OPREL ::= menorigual 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OPREL ::= mayorigual 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OPREL ::= menor 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OPREL ::= mayor 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("OPREL",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= decimal 
            {
              NodoC3D RESULT =null;
		int decimallleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimallright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimall = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimall); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= entero 
            {
              NodoC3D RESULT =null;
		int enterofleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enterofright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String enterof = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(enterof); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= id 
            {
              NodoC3D RESULT =null;
		int iddleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iddright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String idd = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(idd); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= para expresion parc 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= menos expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresion ::= expresion pot expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expresion ::= expresion dividido expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expresion ::= expresion por expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= expresion menos expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expresion ::= expresion mas expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // J ::= expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                        ControlC3D.agregarC3D("//Último valor: " + exp.getCad());
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // J ::= B 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                        ControlC3D.agregarC3D("\n//Verdadero:[" + exp.getEtqV()+"]");
                        ControlC3D.agregarC3D("\n//Falso:[" + exp.getEtqF()+"]");
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("J",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 J 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
