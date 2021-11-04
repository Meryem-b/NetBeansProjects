/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab07
 */ 

import javax.swing.*;
import javax.swing.text.JTextComponent;

public class SwingValidator {
    
     public boolean isPresent(JTextComponent c, String fieldName){
       
         if (c.getText().length() == 0){
            
            showMessage(c, fieldName + " boş bırakılamaz, doldurulması gereklidir.");
            c.requestFocusInWindow();
            
            return false;
         
         }
        
         return true;
     }//isPresent sonu
     
     public boolean isDouble(JTextComponent c, String fieldName){
      
         try{
             
                double d = Double.parseDouble(c.getText());
                
                return true;
        
         }
        
         catch (NumberFormatException e){
            
               showMessage(c, fieldName + " geçerli bir gerçel sayı olmalıdır.");
               
               c.requestFocusInWindow();
               
               return false;
        
         }
      
     }//isDouble sonu
      
     public boolean isPositive(JTextComponent c, String fieldName){
        
            try{
               
                  double d = Double.parseDouble(c.getText());
           
                  if (d <= 0.){
                         throw new RuntimeException();
                  }
                
                  else{
                      return true;
                  }
            
            }
            
            catch (RuntimeException e){
                 
                showMessage(c, fieldName + " pozitif sayı olmalıdır.");
                c.requestFocusInWindow();
                return false;
            }
            
     }//isPositive sonu
     
     private void showMessage(JTextComponent c, String message){
             
        JOptionPane.showMessageDialog(c, message, "Geçersiz Giriş",JOptionPane.ERROR_MESSAGE); //3.parametre JOptionPane'in başlığını verir.
                                                                                               //4.parametre JOptionPane'in sembolünü verir(x).
     }//showMessage sonu

}//class sonu
