/*
 *                               BATUHAN ABAY 090140321
 *                                   MAT335E Lab04
 */

package silindiralanhacimbulma_lab04;

import java.util.Scanner;

public class SilindirAlanHacimBulma_Lab04 {
    
        private static Scanner sc = new Scanner( System.in );
        private static double r,h,alan,hacim;
            
    public static void main(String[] args) {
        
        String kontrol="e";
        
        while(kontrol.equalsIgnoreCase("E")){
            
            oku();
            hesapla();
            yaz();
            
          System.out.print("\nDevam etmek istermisiniz E/H(evet/hayır) ? : ");
          kontrol=sc.next();
          System.out.print("\n");
        
        }//while end
        
    }//main end
    
    
    public static void oku(){
        
       System.out.print("Yarıçap değerini giriniz: ");
       r=sc.nextDouble();
       while(r<=0){
          
           System.out.print("\nYarıçap için girilen değer YANLIŞ !!! Lütfen DOĞRU yarıçap degeri giriniz: ");
           r=sc.nextDouble();
       }
       
       System.out.print("\nYükseklik değerini giriniz: ");
       h=sc.nextDouble();
       while(h<=0){
           
           System.out.print("\nYükseklik için girilen değer YANLIŞ !!! Lütfen DOĞRU yükseklik degeri giriniz: ");
           h=sc.nextDouble();
       }
    
    }
    
    public static void hesapla(){
       
       hacim=Math.PI*Math.pow(r,2)*h;
       alan=(2*Math.PI*Math.pow(r,2))+(2*Math.PI*r*h);
    
    }
    
    public static void yaz(){
       
       System.out.printf("\nAlan  = %.4f",alan); 
       System.out.printf("\nHacim = %.4f",hacim); 
        
    }
    
}//class end