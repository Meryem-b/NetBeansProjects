
public class DiceTest {
    public static void main (String[] args) {
      Dice zar1, zar2;   int toplam;

      zar1 = new Dice(); zar2 = new Dice();

      zar1.toss();  zar2.toss();
      System.out.println ("\n1) 1.Zar/Die : " + zar1 + "\n   2.Zar/Die : " + zar2);

      zar1.toss();
      try {
          zar2.setTossedNumber(4); 
          //zar2.setTossedNumber(7);
          }
      catch (RuntimeException e)
      {     System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.exit(11);
      }

      System.out.println ("\n2)  1.Zar/Die : " + zar1 + "\n    2.Zar/Die : " + zar2);
      toplam = zar1.getTossedNumber() + zar2.getTossedNumber();
      System.out.println ("    Yukaridakilerin toplami/Sum of above : " + toplam);

      toplam = zar1.toss() + zar2.toss();
      System.out.println ("\n3)  1.Zar/Die : " + zar1 + "\n    2.Zar/Die : " + zar2);
      System.out.println ("    Son Toplam/Final sum : " + toplam);
   }
}
