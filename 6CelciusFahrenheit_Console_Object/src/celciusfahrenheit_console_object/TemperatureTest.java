package celciusfahrenheit_console_object;

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
      Temperature sicaklik = new Temperature (sonKarakter, sayi);
      System.out.println( "\n"+sicaklik );
      dongu =false;
      }//while
   }
}

