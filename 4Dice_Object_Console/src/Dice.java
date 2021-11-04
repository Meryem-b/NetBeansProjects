
public class Dice {
   private final int MAXNUMBER = 6;
   private final int MINNUMBER = 1;

   private int tossedNumber;

   public Dice() {
      tossedNumber = toss();
   }

   public int toss() {
      tossedNumber = (int)(Math.random() * MAXNUMBER) + 1;
      return tossedNumber;
   }

   public void setTossedNumber (int deger) throws RuntimeException { //buradaki throws, yöntemin içine try catch yapısı yazmaktansa bizim maine bir throw return etmemizi sağlar.
      if(deger >=MINNUMBER && deger<=MAXNUMBER)
            tossedNumber = deger;
      else
        throw new RuntimeException("1-6 araligi disinda hatali atama/Out of interval, invalid assignment");
   }

   public int getTossedNumber() {
      return tossedNumber;
   }

   public String toString() {
      String sonuc = Integer.toString(tossedNumber);
      return sonuc;
   }
}
