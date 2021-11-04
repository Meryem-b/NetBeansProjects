package stringornek;

// String class and some of its methods

public class StringOrnek {
   public static void main (String[] args)    {
      String deyis = "Hava her zaman";     
      String degisim1, degisim2, degisim3, degisim4;

      System.out.print ("\nDeyis : \"" + deyis + "\"");
      System.out.println ("  Uzunluk : " + deyis.length());

      degisim1 = deyis.concat (" soguktur."); //concat methodu stringin sonuna yazdıgımız stringi ekler
      degisim2 = degisim1.toUpperCase();      //toUpperCase methodu tüm harfleri büyük harfe cevirir
      degisim3 = degisim2.replace ('U', 'X'); //replace methodu birinci girdiyi stringin içinde bulup hepsini ikinci girdiyle degistirir
      degisim4 = degisim3.substring (3, 10); //bunun manası 3. konumdan başlıyor 10. konuma kadar alır ve 10. konum dahil degildir (stringlerin ilk karakteri 0 dan baslar

      // Print mutations
      System.out.println ();
      System.out.println ("degisim #1: " + degisim1);
      System.out.println ("degisim #2: " + degisim2);
      System.out.println ("degisim #3: " + degisim3);
      System.out.println ("degisim #4: " + degisim4);

      System.out.println ("\nSon uzunluk : " + degisim4.length());
   }
}

