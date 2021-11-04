package TryCatchDaireDuzMantik_2Catches;

import java.util.*; //burdaki '*' sembolu java.util. içerisindeki herşeyi import et manasına gelir
import javax.swing.JOptionPane;

public class TryCatchDaireDuzMantik_2Catches {

    public static void main(String[] args) {
              
        Scanner giris = new Scanner( System.in );
       
        double r;
        boolean cik = false; 

        while ( !cik ) {        
        
            System.out.print( "\nEnter radius (Yaricap girin) : " );
        
        try {
              r =  giris.nextInt();     // InputMismatchException
           //r = Double.parseDouble(giris.next());  // NumberFormatException
        }

        catch (InputMismatchException e) {
           JOptionPane.showMessageDialog(null,"Invalid/Hatali format (InputMismatch), try again/yeniden deneyiniz");
           JOptionPane.showMessageDialog(null,e.getMessage());
           JOptionPane.showMessageDialog(null,e.toString()); //to string kullandığımızda çıkan mesaj kutusunda hatanın spesifik türünüde söyler.
           giris.nextLine();
           continue; 
        }
        catch ( RuntimeException e) {
           JOptionPane.showMessageDialog(null,"Other error/Diger hata (NumberFormat), try again/yeniden deneyiniz");
           JOptionPane.showMessageDialog(null,e.getMessage());
           JOptionPane.showMessageDialog(null,e.toString()); 
           giris.nextLine();
           continue; 
        }
       
        System.out.println( "Circumference/Cevre   : " + 2 * Math.PI * r );
        System.out.println( "Area/Alan    : " + Math.PI * r * r );
        cik = true ; 
        
        }
    }
}
