package userinterface;

import java.text.NumberFormat;

public class FutureValueFrame extends javax.swing.JFrame {

    /** Creates new form FutureValueFrame */
    public FutureValueFrame() {
        initComponents();
        for (int i=100; i<=1000; i=i+100)       //editable olan combobox imizin içindeki item ları döngü ile kod yazarak ekleriz
            monthlyPaymentComboBox.addItem(i); // 'addItem(i)' ı combobox ımızın içine işlenicek itemları girmek için kulandık 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yearlyRateTextField = new javax.swing.JTextField();
        futureValueTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        monthlyPaymentComboBox = new javax.swing.JComboBox();
        yearsComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Future Value Calculator");
        setResizable(false);

        jLabel1.setText("Monthly Payment:");

        jLabel2.setText("Yearly Interest Rate:");

        jLabel3.setText("Number of Years:");

        jLabel4.setText("Future Value:");

        futureValueTextField.setEditable(false);
        futureValueTextField.setFocusable(false);

        calculateButton.setMnemonic('c');
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setMnemonic('x');
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        monthlyPaymentComboBox.setEditable(true);

        yearsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        yearsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(futureValueTextField)
                            .addComponent(yearlyRateTextField)
                            .addComponent(monthlyPaymentComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yearsComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(monthlyPaymentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yearlyRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yearsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(futureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(calculateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        
            double p = Double.parseDouble(monthlyPaymentComboBox.getSelectedItem().toString());
               //Combobox tan okumanın yöntemi için yukarıdaki gibi"batuComboBox.getSelectedItem()" kullanılır.
           
            double r = Double.parseDouble(yearlyRateTextField.getText());
            int y = Integer.parseInt(yearsComboBox.getSelectedItem().toString());
          
            
            double fv = calculateFutureValue(p, r, y);
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            
            futureValueTextField.setText(currency.format(fv)); //bunun manası currency.format methodunu cağır ve bunu fv ye uygula sonra bu sonucu setText ile future value ya ata.        
    }//GEN-LAST:event_calculateButtonActionPerformed
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void yearsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsComboBoxActionPerformed

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
    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                 new FutureValueFrame().setVisible(true);  // generated code
                FutureValueFrame frame = new FutureValueFrame();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField futureValueTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox monthlyPaymentComboBox;
    private javax.swing.JTextField yearlyRateTextField;
    private javax.swing.JComboBox yearsComboBox;
    // End of variables declaration//GEN-END:variables

}