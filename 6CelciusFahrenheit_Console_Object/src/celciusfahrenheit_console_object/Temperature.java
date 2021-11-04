package celciusfahrenheit_console_object;

public class Temperature {
      private char tip;
      private double sayi;
      
      public Temperature(char t, double s) {
         tip=t;
         sayi=s;  
      }
  
      /* get... and set... methods for
         tip and sayi
         are omitted */

      public double donustur_C_F () {
              return (sayi*9./5+32);
      }
      public double donustur_F_C () {
              return (sayi-32) * 5./9 ;
      }
//      public String toString() {
//          return tip == 'C'|| tip == 'c'?
//             sayi + " Celcius    = " + donustur_C_F() + " Fahrenheit":
//             sayi + " Fahrenheit = " + donustur_F_C() + " Celcius";
//      }
        public String toString() {
                
          String sonuc = tip == 'C'|| tip == 'c'?
             sayi + " Celcius = " + donustur_C_F () + " Fahrenheit" :
             sayi + " Fahrenheit = " + donustur_F_C() + " Celcius";
          return sonuc;
      }
}

