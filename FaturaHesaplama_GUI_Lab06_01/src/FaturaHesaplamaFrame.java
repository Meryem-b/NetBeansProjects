/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab06-1
 */   
    
    import java.text.NumberFormat;
    import java.util.Scanner;

public class FaturaHesaplamaFrame extends javax.swing.JFrame {

       
        public static Scanner sc = new Scanner( System.in );
    
       
    public FaturaHesaplamaFrame() {
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
        temizle = new javax.swing.JButton();
        hesapla = new javax.swing.JButton();
        çıkış = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fatura Tutarı Hesabı");

        jLabel1.setText("Alt Toplam:");

        jLabel2.setText("İndirim Oranı:");

        jLabel3.setText("İndirim Miktarı:");

        jLabel4.setText("Vergisiz Toplam:");

        jLabel5.setText("Vergi Tutarı:");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 3, 16)); // NOI18N
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

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        hesapla.setText("Hesapla");
        hesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplaActionPerformed(evt);
            }
        });

        çıkış.setText("Çıkış");
        çıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkışActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(temizle)
                                .addGap(18, 18, 18)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hesapla)
                        .addGap(26, 26, 26)
                        .addComponent(çıkış))
                    .addComponent(indirimoranıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(faturatutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vergitutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vergisiztoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(indirimmiktarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(alttoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alttoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(indirimoranıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(indirimmiktarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(vergisiztoplamkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vergitutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(faturatutarıkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temizle)
                    .addComponent(hesapla)
                    .addComponent(çıkış))
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
        
        double im=Hesaplamalar.fonk1(at,indirimoranı); //im=indirimmiktarı
    
        double vszt=Hesaplamalar.fonk2(at,im); //vszt=vergisiztoplam
        
        double vt=Hesaplamalar.fonk3(vszt); //vt=vergitutarı
        
        double ft=Hesaplamalar.fonk4(vszt,vt); //ft=faturatutarı
        
        indirimmiktarıkutusu.setText(currency.format(Hesaplamalar.fonk1(at,indirimoranı)));
        vergisiztoplamkutusu.setText(currency.format(vszt));
        vergitutarıkutusu.setText(currency.format(vt));
        faturatutarıkutusu.setText(currency.format(ft));
        
    }//GEN-LAST:event_hesaplaActionPerformed

    private void alttoplamkutusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alttoplamkutusuActionPerformed

      hesaplaActionPerformed(evt);

    }//GEN-LAST:event_alttoplamkutusuActionPerformed

  
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FaturaHesaplamaFrame().setVisible(true);
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