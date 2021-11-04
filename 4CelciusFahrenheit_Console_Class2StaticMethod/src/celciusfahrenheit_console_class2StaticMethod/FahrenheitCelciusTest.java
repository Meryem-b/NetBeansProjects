package celciusfahrenheit_console_class2StaticMethod;

import java.util.Scanner;

public class FahrenheitCelciusTest {
   public static void main (String[] args)    {
      System.out.println(("\nEnter temperature value in format doublevaluex or doublevaluex,")
                       +("\nwhere x is : C or c (Celcius), F or f (Fahrenheit)"));
      Scanner sc = new Scanner (System.in);
      double sayi; char sonKarakter; String sonuc;
      boolean dongu =true ;
      while (dongu) {
          try {
              String bilgi = sc.next();
              sonKarakter = bilgi.charAt((bilgi.length()-1));
              if (sonKarakter != 'C' && sonKarakter != 'c' && sonKarakter != 'F' && sonKarakter != 'f') {
                          throw new RuntimeException("Invalid last character, must be C or c or F or f, try again ...");}
              sonuc =FahrenheitCelciusMethod.donustur(bilgi); }
          catch (NumberFormatException e){
              System.err.println(e.toString());
              continue ;
          }         
          catch (RuntimeException e){
              System.err.println(e.toString());
              continue ;
          }
      System.out.println( "\n"+sonuc );
      dongu =false;
      }
   }
}
