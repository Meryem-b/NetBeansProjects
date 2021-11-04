
import java.util.ArrayList;

public class CourseTest   {
    
    private static ArrayList<Course> dersler = new ArrayList<>();
    
    public static void main(String[] args) {
        
      Course ders1 = new Course("MAT335", "Programlama Algoritmalari") ;
      Course ders2 = new Course() ;
      
      ders2.setCourseCode("BLG361");
      ders2.setCourseTitle("Veritabani Yonetim Sistemleri") ;
      
      dersler.add(ders1);   dersler.add(ders2);
      
      System.out.println(ders1) ;
      System.out.println(ders2.toString()) ;
      
      System.out.println ("\nDersleri yaz/Write courses 1 : " + dersler);     
      islem(dersler);
      System.out.println ("\nDersleri yaz/Write courses 3 : " + dersler);
      
     }//main
    
    public static void islem (ArrayList<Course> dersler){
        
          System.out.println ("\nDersleri yaz/Write courses 2 : " + dersler);
          
          Course ders1 = new Course("MAT335E", "Programming Algorithms") ;
          Course ders2 = new Course() ;
          
          ders2.setCourseCode("BLG361E");
          ders2.setCourseTitle("Database Management Systems") ;
          
          dersler.add(ders1);
          dersler.add(ders2);
    }
}
