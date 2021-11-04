public class DersTest   {
    public static void main(String[] args) {
        
      Course ders1 = new Course("MAT335", "Programlama Algoritmalari") ;
      Course ders2 = new Course() ;
      
      ders2.setCourseCode("BLG361");
      ders2.setCourseTitle("Veritabani Yonetim Sistemleri") ;
      
      System.out.println(ders1) ;
      System.out.println(ders2.toString()) ;
      
     }
}
