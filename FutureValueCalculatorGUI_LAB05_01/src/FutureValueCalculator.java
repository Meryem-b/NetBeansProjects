/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab05-1
 */

import java.text.NumberFormat;

public class FutureValueCalculator extends javax.swing.JFrame {

   
    public FutureValueCalculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aomlabel = new javax.swing.JLabel();
        yfolabel = new javax.swing.JLabel();
        yslabel = new javax.swing.JLabel();
        gmlabel = new javax.swing.JLabel();
        aomkutusu = new javax.swing.JTextField();
        yfokutusu = new javax.swing.JTextField();
        yskutusu = new javax.swing.JTextField();
        gmkutusu = new javax.swing.JTextField();
        hesaplatusu = new javax.swing.JButton();
        cıkıstusu = new javax.swing.JButton();
        temizletusu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Future Value Calculator");

        aomlabel.setText("Aylık Ödeme Miktarı:");

        yfolabel.setText("Yıllık Faiz Oranı:");

        yslabel.setText("Yıl Sayısı:");

        gmlabel.setText("Gelecekteki Miktar:");

        gmkutusu.setEditable(false);

        hesaplatusu.setText("Hesapla");
        hesaplatusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplatusuActionPerformed(evt);
            }
        });

        cıkıstusu.setText("Çıkış");
        cıkıstusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cıkıstusuActionPerformed(evt);
            }
        });

        temizletusu.setText("Temizle");
        temizletusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizletusuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aomlabel)
                            .addComponent(gmlabel)
                            .addComponent(yslabel)
                            .addComponent(yfolabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gmkutusu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(yskutusu)
                            .addComponent(yfokutusu)
                            .addComponent(aomkutusu)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(temizletusu)
                        .addGap(31, 31, 31)
                        .addComponent(hesaplatusu)
                        .addGap(32, 32, 32)
                        .addComponent(cıkıstusu)
                        .addGap(8, 8, 8)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aomlabel)
                    .addComponent(aomkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yfolabel)
                    .addComponent(yfokutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yslabel)
                    .addComponent(yskutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gmlabel)
                    .addComponent(gmkutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hesaplatusu)
                    .addComponent(cıkıstusu)
                    .addComponent(temizletusu))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void cıkıstusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cıkıstusuActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_cıkıstusuActionPerformed

    private void hesaplatusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplatusuActionPerformed
       
         double aom = Double.parseDouble(aomkutusu.getText());
            
           
            double yfo = Double.parseDouble(yfokutusu.getText());
            int ys = Integer.parseInt(yskutusu.getText());
          
            
            double fv = calculateFutureValue(aom, yfo, ys);
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            
            gmkutusu.setText(currency.format(fv));
        
    }//GEN-LAST:event_hesaplatusuActionPerformed

    private void temizletusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizletusuActionPerformed
        
        gmkutusu.setText("");
        aomkutusu.setText("");
        yskutusu.setText("");
        yfokutusu.setText("");
        
    }//GEN-LAST:event_temizletusuActionPerformed

    public static double calculateFutureValue(double monthlyPayment,
    double yearlyInterestRate, int years)
    {
        final int MONTHS_IN_YEAR = 12;
        int months = years * MONTHS_IN_YEAR;
        double monthlyInterestRate = yearlyInterestRate/MONTHS_IN_YEAR/100;
        double futureValue = 0;
        for (int i = 1; i <= months; i++)
        {
            futureValue = (futureValue + monthlyPayment) *
            (1 + monthlyInterestRate);
        }
        return futureValue;
    }
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FutureValueCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aomkutusu;
    private javax.swing.JLabel aomlabel;
    private javax.swing.JButton cıkıstusu;
    private javax.swing.JTextField gmkutusu;
    private javax.swing.JLabel gmlabel;
    private javax.swing.JButton hesaplatusu;
    private javax.swing.JButton temizletusu;
    private javax.swing.JTextField yfokutusu;
    private javax.swing.JLabel yfolabel;
    private javax.swing.JTextField yskutusu;
    private javax.swing.JLabel yslabel;
    // End of variables declaration//GEN-END:variables
}
