
public class StudentTest   {
    public static void main(String[] args) {
      Student ogrenci1 = new Student("Ilk Ogrenci") ;
      Student ogrenci2 = new Student("Hakan Ergen") ;
      Student ogrenci3= new Student();
      ogrenci3.setFullName("Hakan Ergen");
      System.out.println(ogrenci1.toString()) ;
      System.out.println(ogrenci2.toString()) ;
      System.out.println(ogrenci3.toString()) ;
      ogrenci3.setFullName("Batuhan Abay");
      System.out.println(ogrenci3.toString()) ;
      ogrenci2.setFullName("Ahmet");
      System.out.println(ogrenci2.toString()) ;
     }
}
