
import java.util.*;
public class ReversingNumber_Console {
   public static void main (String[] args) {
       
      int originalNumber, nmbr, lastDigit, reversedNumber;
      Scanner giris = new Scanner(System.in);
      boolean kont = false;
      
      while (! kont ) {
      System.out.println ("\nTek basamaklı olmayan ve pozitif bir tamsayi giriniz/"
              + "Enter a positive integer which is more than 1 digit :\n");
      try {
         originalNumber = Integer.parseInt(giris.nextLine());
         
         if (originalNumber <= 9   ) 
                throw new RuntimeException("Girilen sayi tek basamakli veya negatif olamaz/Number cannot be 1-digit and/or negative");   
      }
      catch (NumberFormatException e ) {
         System.out.println ("Hatali formatta bilgi");   
         continue; }
      catch (RuntimeException e ) {
         System.out.println ("HATA : " + e.getMessage());   
         continue; }

      System.out.println ("\nGirilen sayi/Entered number = " + originalNumber);

      nmbr = originalNumber; reversedNumber = 0;
      do {
         lastDigit = nmbr % 10;
         reversedNumber = (reversedNumber * 10) + lastDigit;
         nmbr = nmbr / 10;
      } while (nmbr > 0);
      System.out.println ("Tersine cevrilmisi/Reversed (do ... while) = " + reversedNumber);

      nmbr = originalNumber; reversedNumber = 0;
      while (nmbr > 0) {
        lastDigit = nmbr % 10;
        reversedNumber = (reversedNumber * 10) + lastDigit;
        nmbr = nmbr / 10;
      } 
      System.out.println ("Tersine cevrilmisi/Reversed (while ... ) = " + reversedNumber);
     
      nmbr = originalNumber;
      String x = Integer.toString(nmbr), y="" ;
      for (int i=0; i<x.length(); i++)
           y= y+ x.charAt(x.length()-1-i);
      System.out.println ("Tersine cevrilmisi/Reversed (for ... ) = " + y );
      kont=true;
      } //while blok
   }
}
