/* langJavaShTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. langJavaShTokenManager.java */
package cc;

/** Token Manager. */
public class langJavaShTokenManager implements langJavaShConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000L) != 0L)
            return 1;
         if ((active0 & 0x48000000L) != 0L)
         {
            jjmatchedKind = 34;
            return 13;
         }
         if ((active0 & 0x3b7e00000L) != 0L)
         {
            jjmatchedKind = 34;
            return 50;
         }
         return -1;
      case 1:
         if ((active0 & 0x3ede00000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 1;
            return 50;
         }
         if ((active0 & 0x12000000L) != 0L)
            return 50;
         return -1;
      case 2:
         if ((active0 & 0x3c5e00000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 2;
            return 50;
         }
         if ((active0 & 0x28000000L) != 0L)
            return 50;
         return -1;
      case 3:
         if ((active0 & 0x104000000L) != 0L)
            return 50;
         if ((active0 & 0x2c1e00000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 3;
            return 50;
         }
         return -1;
      case 4:
         if ((active0 & 0x80e00000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 4;
            return 50;
         }
         if ((active0 & 0x241000000L) != 0L)
            return 50;
         return -1;
      case 5:
         if ((active0 & 0x600000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 5;
            return 50;
         }
         if ((active0 & 0x80800000L) != 0L)
            return 50;
         return -1;
      case 6:
         if ((active0 & 0x200000L) != 0L)
            return 50;
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 6;
            return 50;
         }
         return -1;
      case 7:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 7;
            return 50;
         }
         return -1;
      case 8:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 34;
            jjmatchedPos = 8;
            return 50;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 38);
      case 40:
         return jjStopAtPos(0, 36);
      case 41:
         jjmatchedKind = 37;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 42:
         return jjStopAtPos(0, 9);
      case 43:
         jjmatchedKind = 5;
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 44:
         return jjStopAtPos(0, 44);
      case 45:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 47:
         return jjStopAtPos(0, 10);
      case 59:
         return jjStopAtPos(0, 43);
      case 61:
         return jjStartNfaWithStates_0(0, 16, 1);
      case 91:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x200000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4200000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x48000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x22400000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 123:
         return jjStopAtPos(0, 42);
      case 125:
         return jjStopAtPos(0, 41);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 43:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 45:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 93:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 102:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 50);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x244000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 111:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 50);
         return jjMoveStringLiteralDfa2_0(active0, 0x108000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 123:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x140000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 50);
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 116:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 50);
         return jjMoveStringLiteralDfa3_0(active0, 0xa00000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 50);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 108:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 50);
         return jjMoveStringLiteralDfa4_0(active0, 0x1400000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 50);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80200000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 115:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 50);
         break;
      case 116:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 103:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(5, 31, 50);
         break;
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 115:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(9, 22, 50);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 51;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     { jjCheckNAdd(49); }
                  }
                  else if ((0xac0000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 15)
                        kind = 15;
                  }
                  else if (curChar == 38)
                     { jjAddStates(0, 1); }
                  else if (curChar == 33)
                     { jjCheckNAdd(1); }
                  else if (curChar == 61)
                     { jjCheckNAdd(1); }
                  if (curChar == 60)
                     { jjCheckNAdd(1); }
                  else if (curChar == 62)
                     { jjCheckNAdd(1); }
                  break;
               case 1:
                  if (curChar == 61 && kind > 15)
                     kind = 15;
                  break;
               case 2:
                  if (curChar == 61)
                     { jjCheckNAdd(1); }
                  break;
               case 3:
                  if ((0x5000000000000000L & l) != 0L && kind > 15)
                     kind = 15;
                  break;
               case 4:
                  if (curChar == 62)
                     { jjCheckNAdd(1); }
                  break;
               case 5:
                  if (curChar == 60)
                     { jjCheckNAdd(1); }
                  break;
               case 6:
                  if (curChar == 33)
                     { jjCheckNAdd(1); }
                  break;
               case 40:
                  if (curChar == 38)
                     { jjAddStates(0, 1); }
                  break;
               case 41:
                  if (curChar == 38 && kind > 12)
                     kind = 12;
                  break;
               case 42:
                  if (curChar == 38 && kind > 13)
                     kind = 13;
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  kind = 17;
                  { jjCheckNAdd(49); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     { jjCheckNAdd(50); }
                  }
                  else if (curChar == 124)
                     { jjAddStates(2, 3); }
                  if (curChar == 111)
                     { jjAddStates(4, 5); }
                  else if (curChar == 97)
                     { jjAddStates(6, 7); }
                  else if (curChar == 112)
                     { jjAddStates(8, 10); }
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 13:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     { jjCheckNAdd(50); }
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 7:
                  if (curChar == 101 && kind > 18)
                     kind = 18;
                  break;
               case 8:
                  if (curChar == 117)
                     { jjCheckNAdd(7); }
                  break;
               case 9:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 115)
                     { jjCheckNAdd(7); }
                  break;
               case 12:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 112)
                     { jjAddStates(8, 10); }
                  break;
               case 16:
                  if (curChar == 99 && kind > 20)
                     kind = 20;
                  break;
               case 17:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 101 && kind > 20)
                     kind = 20;
                  break;
               case 22:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 100 && kind > 20)
                     kind = 20;
                  break;
               case 28:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 97)
                     { jjAddStates(6, 7); }
                  break;
               case 36:
                  if (curChar == 100 && kind > 12)
                     kind = 12;
                  break;
               case 37:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 100 && kind > 13)
                     kind = 13;
                  break;
               case 39:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 43:
                  if (curChar == 111)
                     { jjAddStates(4, 5); }
                  break;
               case 44:
                  if (curChar == 114 && kind > 12)
                     kind = 12;
                  break;
               case 45:
                  if (curChar == 114 && kind > 14)
                     kind = 14;
                  break;
               case 46:
                  if (curChar == 124)
                     { jjAddStates(2, 3); }
                  break;
               case 47:
                  if (curChar == 124 && kind > 12)
                     kind = 12;
                  break;
               case 48:
                  if (curChar == 124 && kind > 14)
                     kind = 14;
                  break;
               case 50:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  { jjCheckNAdd(50); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 51 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\53", "\53\53", "\55\55", "\55", "\52", "\57", 
null, null, null, null, null, "\75", null, null, null, null, 
"\145\170\164\145\156\144\163", "\151\155\160\154\145\155\145\156\164\163", "\162\145\164\165\162\156", 
"\167\150\151\154\145", "\151\146", "\145\154\163\145", "\146\157\162", "\144\157", "\151\156\164", 
"\146\154\157\141\164", "\163\164\162\151\156\147", "\142\157\157\154", "\143\154\141\163\163", null, 
null, "\50", "\51", "\42", "\133\135", "\51\173", "\175", "\173", "\73", "\54", };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   41, 42, 47, 48, 44, 45, 37, 39, 20, 26, 34, 
};

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public langJavaShTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public langJavaShTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  static public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 51; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public static void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1fffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[51];
    static private final int[] jjstateSet = new int[2 * 51];
    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    static protected int curChar;
}
