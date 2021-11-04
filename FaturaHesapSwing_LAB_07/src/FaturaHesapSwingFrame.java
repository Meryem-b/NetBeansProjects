/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab07
 */   
    
    import java.text.NumberFormat;
    import java.util.Scanner;
    import business.hesaplar;
    
public class FaturaHesapSwingFrame extends javax.swing.JFrame {
     
         public static Scanner sc = new Scanner( System.in );
  
    public FaturaHesapSwingFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alttoplamkutusu = new javax.swing.JTextField();
        indirimoranıkutusu = new javax.swing.JTextField();
        indirimmiktarıkutusu = new javax.swing.JTextField();
        vergisiztoplamkutusu = new javax.swing.JTextField();
        vergitutarıkutusu = new javax.swing.JTextField();
        faturatutarıkutusu = new javax.swing.JTextField();
        çıkış = new javax.swing.JButton();
        hesapla = new javax.swing.JButton();
        temizle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fatura Hesaplama Hata Kontrollü");

        jLabel1.setText("Alt Toplam:");

        jLabel2.setText("İndirim Oranı:");

        jLabel3.setText("İndirim Miktarı:");

        jLabel4.setText("Vergisiz Toplam:");

        jLabel5.setText("Vergi Tutarı:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 20)); // NOI18N
        jLabel6.setText("Fatura Tutarı:");

        alttoplamkutusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alttoplamkutusuActionPerformed(evt);
            }
        });

        indirimoranıkutusu.setEditable(false);

        indirimmiktarıkutusu.setEditable(false);

        vergisiztoplamkutusu.setEditable(false);

        vergitutarıkutusu.setEditable(false);

        faturatutarıkutusu.setEditable(false);

        çıkış.setForeground(new java.awt.Color(243, 0, 0));
        çıkış.setText("Çıkış");
        çıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkışActionPerformed(evt);
            }
        });

        hesapla.setForeground(new java.awt.Color(0, 63, 184));
        hesapla.setText("Hesapla");
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faturatutarıkutusu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(alttoplamkutusu)
                            .addComponent(indirimmiktarıkutusu)
                            .addComponent(vergitutarıkutusu)
                            .addComponent(vergisiztoplamkutusu)
                            .addComponent(indirimoranıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(temizle)
                        .addGap(59, 59, 59)
                        .addComponent(hesapla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(çıkış)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(alttoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(indirimoranıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(indirimmiktarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vergisiztoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vergitutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faturatutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(temizle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(çıkış, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hesapla))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void çıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkışActionPerformed
        
         System.exit(0);
        
    }//GEN-LAST:event_çıkışActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        
        alttoplamkutusu.setText("");
        indirimoranıkutusu.setText("");
        indirimmiktarıkutusu.setText("");
        vergisiztoplamkutusu.setText("");
        vergitutarıkutusu.setText("");
        faturatutarıkutusu.setText("");
        
    }//GEN-LAST:event_temizleActionPerformed

    private void hesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplaActionPerformed
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        if(isGecerliVeri()){
            
            String alttoplam=alttoplamkutusu.getText();
       
            alttoplamkutusu.setText(alttoplam);
            
            double at=Double.parseDouble(alttoplam);
            double indirimoranı;   
        
            if(at>=100){
                  indirimoranı=0.1;
            }
          
            else{
                  indirimoranı=0;
            }
        
            indirimoranıkutusu.setText(percent.format(indirimoranı));
        
            double im=hesaplar.fonk1(at,indirimoranı); //im=indirimmiktarı
    
            double vszt=hesaplar.fonk2(at,im); //vszt=vergisiztoplam
        
            double vt=hesaplar.fonk3(vszt); //vt=vergitutarı
        
            double ft=hesaplar.fonk4(vszt,vt); //ft=faturatutarı
        
            indirimmiktarıkutusu.setText(currency.format(hesaplar.fonk1(at,indirimoranı)));
            vergisiztoplamkutusu.setText(currency.format(vszt));
            vergitutarıkutusu.setText(currency.format(vt));
            faturatutarıkutusu.setText(currency.format(ft));
            
        }//if sonu
        
        
    }//GEN-LAST:event_hesaplaActionPerformed

    private void alttoplamkutusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alttoplamkutusuActionPerformed

        hesaplaActionPerformed(evt);
        
    }//GEN-LAST:event_alttoplamkutusuActionPerformed
    
    private boolean isGecerliVeri(){
        
        SwingValidator sv=new SwingValidator();
        
        return sv.isPresent(alttoplamkutusu,"Alt Toplam") && sv.isDouble(alttoplamkutusu,"Alt Toplam") && sv.isPositive(alttoplamkutusu,"Alt Toplam");
        
    }
    
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
            java.util.logging.Logger.getLogger(FaturaHesapSwingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FaturaHesapSwingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FaturaHesapSwingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FaturaHesapSwingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //new FaturaHesapSwingFrame().setVisible(true); //generated code
              
               FaturaHesapSwingFrame frame = new FaturaHesapSwingFrame();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alttoplamkutusu;
    private javax.swing.JTextField faturatutarıkutusu;
    private javax.swing.JButton hesapla;
    private javax.swing.JTextField indirimmiktarıkutusu;
    private javax.swing.JTextField indirimoranıkutusu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton temizle;
    private javax.swing.JTextField vergisiztoplamkutusu;
    private javax.swing.JTextField vergitutarıkutusu;
    private javax.swing.JButton çıkış;
    // End of variables declaration//GEN-END:variables
}
