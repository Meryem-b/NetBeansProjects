package celciusfahrenheit_console_class1staticmethod;

public class FahrenheitCelciusMethod {
        public static String donustur (String derece) throws NumberFormatException { //throws'a gerek yok
            
         String sonKarakter = derece.substring(derece.length()-1,derece.length()); 

         double sayi = Double.parseDouble(derece.substring(0, derece.length()-1));

         if ( sonKarakter.equalsIgnoreCase("F")) {
              return sayi + " Fahrenheit = " + (sayi-32) * 5./9 + " Celcius"; }
         else {
              return sayi + " Celcius = " + (sayi*9./5+32) + " Fahrenheit"; }

      }
}
