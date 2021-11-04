
import java.util.ArrayList;

public class DiziArrayList_Console {

    public static void main(String[] args) {
        
      ArrayList<String> names = new ArrayList<>(); //<> //ArrayList hazır bir veri yapısıdır biz oluşturmadık
      //ArrayList<dizimizin veri tipini yazarız> isim = new ArrayList<>(); bu yöntemle boyut belirtmeye gerek yok.
      
      names.add ("Aaaa"); //names adıyla olusturgumuz ArrayList nesnesine eleman ekleriz
      names.add ("Bbbb");
      names.add ("Cccc");
      names.add ("Dddd");
      System.out.println ("\n"+names);

      int location = names.indexOf("Bbbb");//indexOf aldığı değişkenin dizi içerisindeki dizin bilgisini verir
      names.remove (location);
      // veya/or names.remove("Bbbb");
      System.out.println ("\n"+names);

      System.out.println ("\n1. indisdeki eleman/Element at index 1 : " + names.get(1));//names.get(dizin numarası) yöntemi ile numarasını verdiğimiz numaradaki elemanı verir bize

      names.add(2,"Baska");//buradaki add yöntemi insert işlemi  yapar yani 2. dizine baska yı ekle, halihazırda 2 de olanı 3 e atar
      System.out.println ("\n"+names);

      names.set(3,"Dahabaska");//set yöntemi aldığı lokasyondaki elemanımızın değerini verdiğimiz 2. parametreye göre değiştirir
      System.out.println ("\n"+names);
      
      System.out.println ("\nNesne var mi/Does it exist ? : " + names.contains("Baska"));//contains ile dizimizde verdiğimiz parametre varmı yokmu diye bakar ve true or false return eder

      System.out.println ("\nEleman sayisi/No. of elements : " + names.size());//dizinin eleman sayısını verir

      names.clear();//diziyi siler
      System.out.println ("\nBos mu/Empty ? : " + names.isEmpty());//dizimiz boşmu diye kontrol eder true / false döndürür 
    }
    
}
