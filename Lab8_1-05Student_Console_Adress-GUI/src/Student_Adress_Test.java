/*
 *                               BATUHAN ABAY 090140321
 *                                  MAT335E Lab08-1
 */   

import java.util.*;
import javax.swing.JOptionPane;

public class Student_Adress_Test extends javax.swing.JFrame {

    public Student_Adress_Test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ekle = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        çıkış = new javax.swing.JButton();
        tamad = new javax.swing.JTextField();
        ogrencino = new javax.swing.JTextField();
        sokak = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        semt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numara = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ilce = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sehir = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kisibilgileritextarea = new javax.swing.JTextArea();
        herseyisil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Adress Test GUI");
        setPreferredSize(new java.awt.Dimension(522, 425));

        ekle.setText("Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        temizle.setText("Temizle");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        çıkış.setText("Çıkış");
        çıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                çıkışActionPerformed(evt);
            }
        });

        jLabel1.setText("Ad Soyad:");

        jLabel2.setText("Öğrenci Numaranız:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel3.setText("ADRES BİLGİLERİ ");

        jLabel4.setText("Sokak:");

        jLabel5.setText("Mahalle:");

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel6.setText("Numara:");

        jLabel7.setText("İlçe:");

        jLabel8.setText("Şehir:");

        jSeparator2.setForeground(new java.awt.Color(51, 0, 51));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel10.setText("KİŞİ BİLGİLERİ");

        kisibilgileritextarea.setEditable(false);
        kisibilgileritextarea.setColumns(20);
        kisibilgileritextarea.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        kisibilgileritextarea.setRows(5);
        jScrollPane1.setViewportView(kisibilgileritextarea);

        herseyisil.setText("Herşeyi Sil");
        herseyisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herseyisilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sokak, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numara, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ogrencino, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ilce, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(semt))
                            .addGap(59, 59, 59)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(204, 204, 204))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ekle)
                                        .addGap(18, 18, 18)
                                        .addComponent(temizle)
                                        .addGap(18, 18, 18)
                                        .addComponent(herseyisil)
                                        .addGap(34, 34, 34)
                                        .addComponent(çıkış)))
                                .addGap(38, 38, 38))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tamad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ogrencino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sokak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(semt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(numara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekle)
                    .addComponent(temizle)
                    .addComponent(çıkış)
                    .addComponent(herseyisil))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void çıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_çıkışActionPerformed
        System.exit(0);
    }//GEN-LAST:event_çıkışActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
      
        tamad.setText("");
        ogrencino.setText("");
        sokak.setText("");
        semt.setText("");
        numara.setText("");
        ilce.setText("");
        sehir.setText("");
 
    }//GEN-LAST:event_temizleActionPerformed

    private void herseyisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herseyisilActionPerformed
        tamad.setText("");
        ogrencino.setText("");
        sokak.setText("");
        semt.setText("");
        numara.setText("");
        ilce.setText("");
        sehir.setText("");
        
        kisibilgileritextarea.setText("");
    }//GEN-LAST:event_herseyisilActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
            
            if(isGecerliVeri()){
              
              Address adres=new Address(sokak.getText(),numara.getText(),semt.getText(),ilce.getText(),sehir.getText());
              Student ogrenci=new Student(ogrencino.getText(),tamad.getText(),adres);
             
              kisibilgileritextarea.append(ogrenci.toString());
            
            }
      
    }//GEN-LAST:event_ekleActionPerformed

    private boolean isGecerliVeri(){
        
        SwingValidator sv=new SwingValidator();
        
        return sv.isPresent(ogrencino,"Öğrenci Numarası") && sv.isPresent(tamad,"Ad Soyad");
        
    }
    
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
            java.util.logging.Logger.getLogger(Student_Adress_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Adress_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Adress_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Adress_Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Adress_Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ekle;
    private javax.swing.JButton herseyisil;
    private javax.swing.JTextField ilce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea kisibilgileritextarea;
    private javax.swing.JTextField numara;
    private javax.swing.JTextField ogrencino;
    private javax.swing.JTextField sehir;
    private javax.swing.JTextField semt;
    private javax.swing.JTextField sokak;
    private javax.swing.JTextField tamad;
    private javax.swing.JButton temizle;
    private javax.swing.JButton çıkış;
    // End of variables declaration//GEN-END:variables
}
