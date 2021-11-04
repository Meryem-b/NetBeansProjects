package celciusfahrenheit_console_nonstaticmethods;

public class Temperature {

      public double donustur_C_F (double sayi) {
              return (sayi*9./5+32);
      }
      public double donustur_F_C (double sayi) {
              return (sayi-32) * 5./9 ;
      }
}

