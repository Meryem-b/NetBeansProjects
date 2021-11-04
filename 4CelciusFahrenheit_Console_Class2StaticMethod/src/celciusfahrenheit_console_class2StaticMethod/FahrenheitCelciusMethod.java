package celciusfahrenheit_console_class2StaticMethod;

public class FahrenheitCelciusMethod {
  
      public static String donustur (String derece) {
         String sonKarakter = derece.substring(derece.length()-1, derece.length()); 

         double sayi = Double.parseDouble(derece.substring(0, derece.length()-1));
         //Ternary operator ?:
         return  (sonKarakter.equalsIgnoreCase("C")?
                        donustur_C_F (sayi) : donustur_F_C (sayi)); //true ise soldaki, false ise sağdaki

      }
      public static String donustur_C_F (double sayi) {
              return sayi + " Celcius = " + (sayi*9./5+32) + " Fahrenheit";
      }
      public static String donustur_F_C (double sayi) {
              return sayi + " Fahrenheit = " + (sayi-32) * 5./9 + " Celcius";
      }
}
