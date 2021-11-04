
package TryCatchDaireDuzMantik_ZeroOrNegativeEntry;

import java.util.*;
import javax.swing.JOptionPane;

public class TryCatchDaireDuzMantik_ZeroOrNegativeEntry {

    public static void main(String[] args) {
       
        Scanner giris = new Scanner( System.in );
        double r;
        boolean cik = false; 

      while ( !cik ) {        
       
            System.out.print( "\nEnter radius/Yaricap girin : " );
        
        try { 
           r = giris.nextDouble();
           
           if (r == 0 ){
           
               throw new InputMismatchException("r cannot be 0"); 
               //throw new şu işi yapıyor RuntimeException hata classına bizim tanımladığımız yeni bir hata türü ekliyor
           
           }
           if (r < 0 ){
           
               throw new RuntimeException("r küçük olamaz 0'dan"); 
               //throw new şu işi yapıyor RuntimeException hata classına bizim tanımladığımız yeni bir hata türü ekliyor
           
           }
        
        }

        catch (InputMismatchException e) {
           JOptionPane.showMessageDialog(null,"InputMismatch error/hata, try again/yeniden deneyiniz");
           JOptionPane.showMessageDialog(null,e.getMessage());
           giris.next();
           
           continue; 
        }
        
        catch ( RuntimeException e) {
           JOptionPane.showMessageDialog(null,"Runtime error/hata, try again/yeniden deneyiniz");
           JOptionPane.showMessageDialog(null,e.getMessage());
           
           continue; 
        }
        
        System.out.println( "Circumference/Cevre   : " + 2 * Math.PI * r );
        System.out.println( "Area/Alan    : " + Math.PI * r * r );
        cik = true ; 
        
      }   //while
    
    }

}
