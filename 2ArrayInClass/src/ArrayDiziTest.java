public class ArrayDiziTest {
   public static void main(String[] args) {
      int dimension = 100;               
      ArrayDizi dz;                  
      dz = new ArrayDizi(dimension);   
 
      System.out.println(dz);                

      dz.addEleman(77l); dz.addEleman(99l); dz.addEleman(44l); dz.addEleman(55l);  dz.addEleman(22l);
      dz.addEleman(88L); dz.addEleman(11L); dz.addEleman(0L);  dz.addEleman(66L);  dz.addEleman(33L);

      System.out.println(dz);                

      int searching = 35;          
      if( dz.findEleman(searching) )
         System.out.println("\n"+ searching + " bulundu/found");
      else
         System.out.println("\n"+ searching + " bulunamadi/not found");

      dz.deleteEleman(00L); dz.deleteEleman(55L); dz.deleteEleman(99L);
      System.out.println(dz);                  
   }  
} 
