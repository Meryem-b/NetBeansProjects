
public class StudentTest   {
    public static void main(String[] args) {
      Address adres1 = new Address("Street xxx", "1/2", "Maslak", "Sariyer", "Istanbul");  
      Student ogrenci1 = new Student("001", "1. Student", adres1) ;
      Address adres2 = new Address();
      Student ogrenci2 = new Student("002", "\"2. Student", adres2) ;
      System.out.println(ogrenci1.toString()) ;
      System.out.println(ogrenci2.toString()) ;
     }
}
