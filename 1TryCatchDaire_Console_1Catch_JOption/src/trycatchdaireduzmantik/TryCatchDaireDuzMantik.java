package trycatchdaireduzmantik;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TryCatchDaireDuzMantik {

    public static void main(String[] args) {
        Scanner giris = new Scanner( System.in );
        double r;
        boolean cik = false; 

        while ( !cik ) {   //burada whileın içindeki opsiyonumuz cik'in tersidir yanı while ın içine true bişey gelirse döngüye gir.     
        System.out.print( "\nEnter radius (Yaricap girin) : " );
        try {  
               r = giris.nextDouble();
               if(r<=0){
               
                   throw new RuntimeException("0 dan küçük olamaz");
               }
        }
        //catch ( Throwable e) {
        //catch ( Exception e) {
        catch ( RuntimeException e) {
            
         //"JOptionPane.showMessageDialog();"bize dialog kutusu açıp mesaj bastırmamıza imkan verir
         // null yazmamızın sebebi bunun bir console programı olmasıdır, çünkü açacagı mesaj kutusu tanımlı değil, null olarak veriyoruz.   
          
           JOptionPane.showMessageDialog(null,"1. Error/Hata, try again/yeniden deneyiniz");
          
           JOptionPane.showMessageDialog(null,"2. "+e.getMessage());
           
         //  JOptionPane.showMessageDialog(null,"3. "+e.toString());
           
          // JOptionPane.showMessageDialog(null,"4. "+e.getStackTrace());
           
           giris.next();
           continue; // bu continue bizi içinde blunduğu döngünün başına döndürür yani bizi while ın başına döndürür.
        }

        System.out.println( "Circumference/Cevre   : " + 2 * Math.PI * r );
        System.out.println( "Area/Alan    : " + Math.PI * r * r );
        cik = true ; 
        
        }
        
    }
}
