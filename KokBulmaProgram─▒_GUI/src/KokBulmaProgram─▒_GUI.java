/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab03-1
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class KokBulmaProgramı_GUI extends javax.swing.JFrame {
    
    NumberFormat deger = NumberFormat.getNumberInstance();
  
    public KokBulmaProgramı_GUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tekrarDene = new javax.swing.JButton();
        hesapla = new javax.swing.JButton();
        cikisYap = new javax.swing.JButton();
        x2Kutusu = new javax.swing.JTextField();
        xKutusu = new javax.swing.JTextField();
        sabitTerimKutusu = new javax.swing.JTextField();
        kok1Kutusu = new javax.swing.JTextField();
        kok2Kutusu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reel Kök Bulma Programı");

        jLabel1.setText("x^2 li Terimin Katsayısı");

        jLabel2.setText("x li Terimin Katsayısı");

        jLabel3.setText("Sabit Terim");

        jLabel5.setText("X2(İkinci Kök)");

        tekrarDene.setText("Tekrar Dene");
        tekrarDene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekrarDeneActionPerformed(evt);
            }
        });

        hesapla.setText("Hesapla");
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        cikisYap.setText("Çıkış Yap");
        cikisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisYapActionPerformed(evt);
            }
        });

        kok1Kutusu.setEditable(false);

        kok2Kutusu.setEditable(false);

        jLabel4.setText("X1(Birinci Kök)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(135, 135, 135)
                                .addComponent(sabitTerimKutusu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(74, 74, 74)
                                .addComponent(xKutusu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(x2Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(kok1Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(kok2Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(tekrarDene)
                                .addGap(29, 29, 29)
                                .addComponent(cikisYap)))
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(hesapla)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(x2Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(xKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sabitTerimKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kok2Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kok1Kutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(hesapla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tekrarDene)
                    .addComponent(cikisYap))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tekrarDeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekrarDeneActionPerformed
        
        x2Kutusu.setText("");
        xKutusu.setText("");
        sabitTerimKutusu.setText("");
        kok1Kutusu.setText("");
        kok2Kutusu.setText("");
        
    }//GEN-LAST:event_tekrarDeneActionPerformed

    private void cikisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisYapActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_cikisYapActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
        
        String girilenX2=x2Kutusu.getText();
        String girilenX=xKutusu.getText();
        String girilenSabit=sabitTerimKutusu.getText();
        
        if(girilenX2.equals("")||girilenX.equals("")||girilenSabit.equals("")){
            
            JOptionPane.showMessageDialog(this, "Terimlerin katsayıları boş bırakılamaz !!!");
            
        }
        
        else{
            
            double a=Double.parseDouble(girilenX2);
            double b=Double.parseDouble(girilenX);
            double c=Double.parseDouble(girilenSabit);
            
            double diskriminant=(b*b)-(4*a*c);
            
            if(a==0){
                
                JOptionPane.showMessageDialog(this, "x^2 li terimin katsayısı 0 olamaz !!!");
                
            }
            else{
                
               
                if(diskriminant<0){
                
                     JOptionPane.showMessageDialog(this, "Diskriminantımız negatif olduğundan dolayı reel kökümüz yoktur !");
                
                }
                
                else{
                   
                    if(diskriminant==0){
                
                      JOptionPane.showMessageDialog(this, "Diskriminantımız 0 a eşit olduğundan çakışık kökümüz vardır");
                
                      kok1Kutusu.setText(deger.format((-b)/(2*a)));
                      kok2Kutusu.setText(deger.format((-b)/(2*a)));
                
                    }
        
                    else{
                
                        kok1Kutusu.setText(deger.format((-b-(Math.sqrt(diskriminant)))/(2*a)));
                        kok2Kutusu.setText(deger.format((-b+(Math.sqrt(diskriminant)))/(2*a)));
            
                    }
                }    
            }
        }
    }//GEN-LAST:event_hesaplaActionPerformed

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KokBulmaProgramı_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KokBulmaProgramı_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KokBulmaProgramı_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KokBulmaProgramı_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KokBulmaProgramı_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikisYap;
    private javax.swing.JButton hesapla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kok1Kutusu;
    private javax.swing.JTextField kok2Kutusu;
    private javax.swing.JTextField sabitTerimKutusu;
    private javax.swing.JButton tekrarDene;
    private javax.swing.JTextField x2Kutusu;
    private javax.swing.JTextField xKutusu;
    // End of variables declaration//GEN-END:variables
}
