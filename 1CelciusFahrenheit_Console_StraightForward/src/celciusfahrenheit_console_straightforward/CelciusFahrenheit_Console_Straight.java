package celciusfahrenheit_console_straightforward;

import java.util.Scanner;
public class CelciusFahrenheit_Console_Straight {

    public static void main(String[] args) {
      System.out.println(("\nEnter temperature value to convert in the following format:")
                        +("\nFormat : doublevalueC or doublevaluef")    
                        +("\nC or c is Celcius, F or f is Fahrenheit"));
      Scanner sc = new Scanner (System.in);
      double sayi; char sonKarakter;
      boolean dongu =true ;
      while (dongu) {
          try {
              String bilgi = sc.next();
              sonKarakter = bilgi.charAt((bilgi.length()-1)); //charAt belli bir string içerisinde belli bir konumdaki karaktere erişmemizi sağlar ve burada biz bilgi stringinin -1 inci yani sonuncu karakterine eriştik
              if (sonKarakter != 'C' && sonKarakter != 'c' && sonKarakter != 'F' && sonKarakter != 'f') {
                          throw new RuntimeException("Invalid last character, must be C or c or F or f, try again ...");}
              sayi = Double.parseDouble(bilgi.substring(0, (bilgi.length()-1))); } //substring elimizde olan bir stringin 0. konumundan boyunun 1 eksiğine kadar olan kısma eriştirir bizi bu örnekte
          catch (NumberFormatException e){
              System.err.println("Invalid number, try again ...");
              System.err.println(e.getMessage());
              System.err.println(e.toString());
              continue ;
          }         
          catch (RuntimeException e){
              System.err.println(e.getMessage());
              System.err.println(e.toString());
              continue ;
          }
      String sonuc;
      if ( sonKarakter == 'F' || sonKarakter == 'f' ) {
              sonuc = sayi + " Fahrenheit = " + (sayi-32) * 5./9 + " Celcius"; }
      else {
              sonuc = sayi + " Celcius = " + (sayi*9./5+32) + " Fahrenheit"; }
      System.out.println( "\n"+sonuc );
      dongu =false;
      }
    }
}

