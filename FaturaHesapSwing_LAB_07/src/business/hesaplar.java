/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab07
 */ 

package business;


public class hesaplar {
    
    public static final double VERGİORANI=0.18;
    
    public static double fonk1(double alttoplam,double indirimoranı){
      
        double indirimmiktarı;
       
        indirimmiktarı=alttoplam*indirimoranı;
        
        return indirimmiktarı;
        
    }//fonk1'in sonu
    
     public static double fonk2(double alttoplam,double indirimmiktarı){
     
          double vergisiztoplam;
          
           vergisiztoplam=alttoplam-indirimmiktarı;
           
           return vergisiztoplam;
     
     }//fonk2'nin sonu
     
     public static double fonk3(double vergisiztoplam){
         
          double vergitutarı;
          
          vergitutarı=vergisiztoplam*VERGİORANI;
         
          return vergitutarı;
          
     }//fonk3'ün sonu
     
     public static double fonk4(double vergisiztoplam,double vergitutarı){
     
         double faturatutarı;
         
         faturatutarı=vergisiztoplam+vergitutarı;

         return faturatutarı;
     }//fonk4'ün sonu
 
}//class'ın sonu
