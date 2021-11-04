package celciusfahrenheit_console_straightforward;

import java.util.Scanner;
public class CelciusFahrenheit_Console_Straight {

    public static void main(String[] args) {
      System.out.println(("\nEnter temperature value to convert in the following format:")
                        +("\nFormat : doublevalueC or doublevaluef")    
                        +("\nC or c is Celcius, F or f is Fahrenheit"));
      Scanner sc = new Scanner (System.in);
      double sayi; char sonKarakter; String sonuc;
      boolean dongu =true ;
      while (dongu) {
          try {
              String bilgi = sc.next();
              sonKarakter = bilgi.charAt((bilgi.length()-1));
              if (sonKarakter != 'C' && sonKarakter != 'c' && sonKarakter != 'F' && sonKarakter != 'f') {
                          throw new RuntimeException("Invalid last character, must be C or c or F or f, try again ...");}
              sonuc = donustur(bilgi); }
          catch (NumberFormatException e){
              System.err.println(e.toString());
              continue ;
          }         
          catch (RuntimeException hata){
              System.err.println(hata.toString());
              continue ;
          }
      System.out.println( "\n"+sonuc );
      dongu =false;
      }
    }
    
    public static String donustur (String derece) {
            
         String sonKarakter = derece.substring(derece.length()-1,derece.length()); 

         double sayi = Double.parseDouble(derece.substring(0, derece.length()-1));

         if ( sonKarakter.equalsIgnoreCase("F")) {
              return sayi + " Fahrenheit = " + (sayi-32) * 5./9 + " Celcius"; }
         else {
              return sayi + " Celcius = " + (sayi*9./5+32) + " Fahrenheit"; }

      }
}

