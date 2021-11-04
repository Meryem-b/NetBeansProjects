package celciusfahrenheit_console_nonstaticmethods;
import java.util.Scanner;

public class TemperatureTest {
   public static void main (String[] args)    {
      double sayi; char sonKarakter; String sonuc; boolean dongu =true ;
      while (dongu) {
      try {
          System.out.println(("\nEnter temperature value in format doublevaluex or doublevaluex,")
                           +("\nwhere x is : C or c (Celcius), F or f (Fahrenheit)"));

          Scanner sc = new Scanner (System.in);
          String bilgi = sc.next();

          sonKarakter = bilgi.charAt((bilgi.length()-1));
          if (sonKarakter != 'C' && sonKarakter != 'c' && sonKarakter != 'F' && sonKarakter != 'f') 
                              throw new RuntimeException("Invalid last character, must be C or c or F or f, try again ...");
          sayi = Double.parseDouble(bilgi.substring(0, (bilgi.length()-1)));
      } 
      catch (NumberFormatException e){
              System.err.println(e.toString());
              continue ;
      }         
      catch (RuntimeException e){
              System.err.println(e.toString());
              continue ;
      }
          Temperature sicaklik = new Temperature ();      

          sonuc = sonKarakter == 'C' || sonKarakter == 'c' ?
                           sayi + " C = " + sicaklik.donustur_C_F (sayi) + " F ":
                           sayi + " F = " + sicaklik.donustur_F_C (sayi) + " C ";
          System.out.println(sonuc);
          dongu =false;
      }//while
   }//main
}//class

