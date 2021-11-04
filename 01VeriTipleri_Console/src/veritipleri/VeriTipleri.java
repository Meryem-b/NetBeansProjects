package veritipleri;

// Simple data types - Yalin veri tipleri
public class VeriTipleri {
   public static void main (String[] args) {
      byte b1 = 127;          // -128
      Byte b2 = -128;
            
      short s1 = 32767;       // -32768
      Short s2 = -32768;
      
      int i1 = 2147483647;     // -2147483648
      Integer i2 = new Integer(-2147483648); // i2.toString()
      Integer i3 = -2147483648;
      // i3.toString();
      
      long lng1 = 9000000000000000000L;    // +- 9 x (10 üstü - to power 18)
      Long lng2 = new Long(-9000000000000000000L);
      
      float f1 = 1234567.37F;            // +- 3.4 x (10 üstü - to power 38 (7 digit))
      Float f2 = new Float(-1234567.37F);
      
      double d1 = 123456712345671.;      // +- 1.7 x 10 üstü - to power 308 (15 digit)
      Double d2 = new Double(123456712345671.);

      boolean bool1 = true;   //veya - or false
      Boolean bool2 = new Boolean (false); //Etkin degil - Not efficient
      Boolean bool3 = false;

      char ch1 = 'A';    // A : 65
      Character ch2 = new Character('a');
       
      final int TABAN = 32;     
      int topla1 = TABAN + ch1;
      char topla2 = (char) (TABAN + ch1);

      int x = 32777; short y = (short) x;    // casting - kesme
      int z = 135;  byte w = (byte) z;                               

      System.out.println ();
      System.out.println ("byte = " + b1);
      System.out.println ("Short = " + s2);
      System.out.println ("int = " + i1);
      System.out.println ("int = " + i3);
      System.out.println ("Long = " + lng2);
      System.out.println ("float = " + f1);
      System.out.println ("Double = " + d2);
      System.out.println ("boolean = " + bool1);
      System.out.println ("char = " + ch1); 
      System.out.println ("TABAN = " + TABAN);
      System.out.println ("int topla1 = " + topla1);
      System.out.println ("char topla2 = " + topla2);
      System.out.println("Before casting/Kesmeden once  int   x = " + x);
      System.out.println("After casting/Kesmeden sonra short y = " + y);         
      System.out.println("Before casting/Kesmeden once  int   z = " + z);
      System.out.println("After casting/Kesmeden sonra byte w = " + w);         
   }
}

