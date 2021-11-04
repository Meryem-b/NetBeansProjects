
import java.util.Random;

public class RandomNumbersUtil_Methods
{
   public static void main (String[] args) {
      Random uretici = new Random();
      int tamsayi;
      float gercelsayi;

      tamsayi = uretici.nextInt();
      System.out.println ("\nRastgele tamsayi/random integer : " + tamsayi);

      tamsayi = uretici.nextInt(10);
      System.out.println ("0-9 arasi/inbetween tamsayi/integer : " + tamsayi);

      tamsayi = uretici.nextInt(10) + 1;
      System.out.println ("1-10 arasi/inbetween tamsayi/integer : " + tamsayi);

      tamsayi = uretici.nextInt(15) + 20;
      System.out.println ("20-34 arasi/inbetween tamsayi/integer : " + tamsayi);

      tamsayi = uretici.nextInt(20) - 10;
      System.out.println ("-10 - +9 arasi/inbetween tamsayi/integer : " + tamsayi);

      gercelsayi = uretici.nextFloat();
      System.out.println ("[0-1) arasi/inbetween gercel sayi/real number : " + gercelsayi);

      gercelsayi = uretici.nextFloat() * 6;  // 0.0 --> 5.999999
      tamsayi = (int)gercelsayi + 1;
      System.out.println ("1-6 arasi/inbetween tamsayi/integer : " + tamsayi);
   }
}
