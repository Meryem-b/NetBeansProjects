/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab03-2
 */

import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class KarbonAyakİziHesaplayicisi_GUI extends javax.swing.JFrame {
    
     NumberFormat deger = NumberFormat.getNumberInstance();
    
    public KarbonAyakİziHesaplayicisi_GUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elektrik = new javax.swing.JLabel();
        dogalgaz = new javax.swing.JLabel();
        kisi = new javax.swing.JLabel();
        ayakizi = new javax.swing.JLabel();
        tekrardeneme = new javax.swing.JButton();
        hesapla = new javax.swing.JButton();
        cikis = new javax.swing.JButton();
        elektrikKutusu = new javax.swing.JTextField();
        dogalgazKutusu = new javax.swing.JTextField();
        kisiKutusu = new javax.swing.JTextField();
        ayakiziKutusu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karbon Ayak İzi Hesaplayıcısı");

        elektrik.setText("Elektrik Tüketiminiz(kwh)");

        dogalgaz.setText("Doğalgaz Tüketiminiz(kwh)");

        kisi.setText("Evinizde Yaşayan Kişi Sayısı");

        ayakizi.setText("Karbon Ayak İziniz (Ton CO2)");

        tekrardeneme.setText("Tekrar Dene");
        tekrardeneme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tekrardenemeActionPerformed(evt);
            }
        });

        hesapla.setText("Hesapla");
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        cikis.setText("Çıkış");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        ayakiziKutusu.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kisi)
                            .addComponent(ayakizi))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kisiKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ayakiziKutusu)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tekrardeneme)
                        .addGap(18, 18, 18)
                        .addComponent(hesapla)
                        .addGap(33, 33, 33)
                        .addComponent(cikis)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dogalgaz)
                            .addComponent(elektrik))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dogalgazKutusu)
                            .addComponent(elektrikKutusu))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elektrik)
                    .addComponent(elektrikKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogalgaz)
                    .addComponent(dogalgazKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kisi)
                    .addComponent(kisiKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ayakizi)
                    .addComponent(ayakiziKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tekrardeneme)
                    .addComponent(hesapla)
                    .addComponent(cikis))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tekrardenemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tekrardenemeActionPerformed
        
        elektrikKutusu.setText("");
        dogalgazKutusu.setText("");
        kisiKutusu.setText("");
        ayakiziKutusu.setText("");
                
    }//GEN-LAST:event_tekrardenemeActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
       
        String girilenElektrik=elektrikKutusu.getText();
        String girilenDogalgaz=dogalgazKutusu.getText();
        String girilenKisi=kisiKutusu.getText();
        
        if(girilenElektrik.equals("")||girilenDogalgaz.equals("")||girilenKisi.equals("")){
            
            JOptionPane.showMessageDialog(this, "Elektrik,Dogalgaz veya Kişi Alanlarından Herhangi Birisi Boş Bırakılamaz !!!");
            
        }
        
        else{
            
            
            double et = Double.parseDouble(girilenElektrik);   // et : elektrik tüketimi ifade ediyor
            double dgt = Double.parseDouble(girilenDogalgaz);  // dgt: dogalgaz tüketimi ifade ediyor
            double ks = Double.parseDouble(girilenKisi);       // ks : kisi sayısı nı ifade ediyor
            
            double etk = Double.parseDouble("0.00054230");     // etk:elektrik tüketim katsayısı
            double dgtk= Double.parseDouble("0.00018533");     // dgtk:dogalgaz tüketim katsayısı
            
            if(et<0||dgt<0||ks<=0){
            
                JOptionPane.showMessageDialog(this, "Negatif değerler ve kisi sayısı için '0' kabul edilemez !!!");
            
            }
        
            else{
                
               ayakiziKutusu.setText(deger.format((et*etk)+(dgt*dgtk)/ks));
            
            }
        
        }
        
    }//GEN-LAST:event_hesaplaActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_cikisActionPerformed

    
    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(KarbonAyakİziHesaplayicisi_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KarbonAyakİziHesaplayicisi_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KarbonAyakİziHesaplayicisi_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KarbonAyakİziHesaplayicisi_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KarbonAyakİziHesaplayicisi_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayakizi;
    private javax.swing.JTextField ayakiziKutusu;
    private javax.swing.JButton cikis;
    private javax.swing.JLabel dogalgaz;
    private javax.swing.JTextField dogalgazKutusu;
    private javax.swing.JLabel elektrik;
    private javax.swing.JTextField elektrikKutusu;
    private javax.swing.JButton hesapla;
    private javax.swing.JLabel kisi;
    private javax.swing.JTextField kisiKutusu;
    private javax.swing.JButton tekrardeneme;
    // End of variables declaration//GEN-END:variables
}