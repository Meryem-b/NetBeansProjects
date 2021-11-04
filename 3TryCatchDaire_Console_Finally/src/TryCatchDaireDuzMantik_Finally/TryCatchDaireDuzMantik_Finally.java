package TryCatchDaireDuzMantik_Finally;

import java.util.*;
import javax.swing.JOptionPane;

public class TryCatchDaireDuzMantik_Finally {

    public static void main(String[] args) {
       
        Scanner giris = new Scanner( System.in );
        //int r;
        double r;
        boolean cik = false;
        String finalllyMesaj = "";

        while ( !cik ) {        
        System.out.print( "\nEnter radius/Yaricap girin : " );
        try { 
           //r = giris.nextInt();
           r = giris.nextDouble();
           finalllyMesaj = " Valid input/Dogru giris";
        }

//        catch (InputMismatchException e) {
//           JOptionPane.showMessageDialog(null,"Invalid format, try again");
//           giris.next(); finalllyMesaj = "InputMismatchException error/hata";
//           continue;
//       }
       catch ( RuntimeException e) {
           JOptionPane.showMessageDialog(null,"General error, try again");
           giris.next();  finalllyMesaj = "RuntimeException error/hata";
           continue;  
       }
//        catch (InputMismatchException e) {
//           JOptionPane.showMessageDialog(null,"Invalid format, try again");
//           giris.next(); finalllyMesaj = "InputMismatchException error/hata";
//           continue; 
//        }
        
        finally { //finally yazıldıysa kesinlikle çalıştırılır, okunmaması gibi bir durum olamaz
           JOptionPane.showMessageDialog(null,finalllyMesaj);            
        }
        
        System.out.println( "Circumference/Cevre   : " + 2 * Math.PI * r );
        System.out.println( "Area/Alan    : " + Math.PI * r * r );
        cik = true ; 
        
        }   //while
    }
}
