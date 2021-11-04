
import javax.swing.JOptionPane;

public class PaymentFrame extends javax.swing.JFrame {
    
    /** Creates new form PaymentFrame */
    public PaymentFrame() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dugmeGrubu = new javax.swing.ButtonGroup();
        pano = new javax.swing.JPanel();
        krediKartRadyoDugme = new javax.swing.JRadioButton();
        faturaGonderRadyoDugme = new javax.swing.JRadioButton();
        kayanCubuklar = new javax.swing.JScrollPane();
        kartTipListe = new javax.swing.JList();
        kartTipiEtiket = new javax.swing.JLabel();
        kartNoEtiket = new javax.swing.JLabel();
        kartNoGirisKutu = new javax.swing.JTextField();
        kabulDugme = new javax.swing.JButton();
        bitirDugme = new javax.swing.JButton();
        kartBitisTarihiEtiket = new javax.swing.JLabel();
        ayKombo = new javax.swing.JComboBox();
        seneKombo = new javax.swing.JComboBox();
        isaretKutusu = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Application");

        pano.setBorder(javax.swing.BorderFactory.createTitledBorder("BILLING TYPE"));

        dugmeGrubu.add(krediKartRadyoDugme);
        krediKartRadyoDugme.setSelected(true);
        krediKartRadyoDugme.setText("Credit card");
        krediKartRadyoDugme.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        krediKartRadyoDugme.setMargin(new java.awt.Insets(0, 0, 0, 0));
        krediKartRadyoDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingRadioButtonActionPerformed(evt);
            }
        });

        dugmeGrubu.add(faturaGonderRadyoDugme);
        faturaGonderRadyoDugme.setText("Bill customer");
        faturaGonderRadyoDugme.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        faturaGonderRadyoDugme.setMargin(new java.awt.Insets(0, 0, 0, 0));
        faturaGonderRadyoDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panoLayout = new javax.swing.GroupLayout(pano);
        pano.setLayout(panoLayout);
        panoLayout.setHorizontalGroup(
            panoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(krediKartRadyoDugme)
                .addGap(37, 37, 37)
                .addComponent(faturaGonderRadyoDugme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panoLayout.setVerticalGroup(
            panoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krediKartRadyoDugme)
                    .addComponent(faturaGonderRadyoDugme))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kartTipListe.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Visa", "Master Card", "American Express", "Diners" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        kartTipListe.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kartTipListe.setRequestFocusEnabled(false);
        kartTipListe.setSelectedIndex(2);
        kayanCubuklar.setViewportView(kartTipListe);

        kartTipiEtiket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kartTipiEtiket.setText("Card type:");

        kartNoEtiket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kartNoEtiket.setText("Card number:");

        kabulDugme.setText("Accept");
        kabulDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabulDugmeActionPerformed(evt);
            }
        });

        bitirDugme.setText("Exit");
        bitirDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitirDugmeActionPerformed(evt);
            }
        });

        kartBitisTarihiEtiket.setText("Expiration Date:");

        ayKombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        seneKombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019" }));

        isaretKutusu.setText("Verified");
        isaretKutusu.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        isaretKutusu.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kabulDugme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitirDugme))
                    .addComponent(pano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kartTipiEtiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kartNoEtiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(kartBitisTarihiEtiket)
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ayKombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seneKombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kayanCubuklar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(isaretKutusu)
                            .addComponent(kartNoGirisKutu, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(kayanCubuklar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kartNoGirisKutu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kartTipiEtiket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kartNoEtiket)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kartBitisTarihiEtiket)
                    .addComponent(seneKombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ayKombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isaretKutusu)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bitirDugme)
                    .addComponent(kabulDugme))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billingRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingRadioButtonActionPerformed
        if (krediKartRadyoDugme.isSelected())
            enableCreditCardControls(true);
        else if (faturaGonderRadyoDugme.isSelected())
            enableCreditCardControls(false);
    }//GEN-LAST:event_billingRadioButtonActionPerformed

    private void bitirDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitirDugmeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bitirDugmeActionPerformed

    private void kabulDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabulDugmeActionPerformed
        String msg;
        if (krediKartRadyoDugme.isSelected())
        {
            msg = "Billing card : " + (String) kartTipListe.getSelectedValue() +
                  "\nCard Number : " + kartNoGirisKutu.getText() +
                  "\nExpiration date : " +
                  (String)ayKombo.getSelectedItem() +
                   ", " + (String)seneKombo.getSelectedItem();
            if (isaretKutusu.isSelected())
                msg+= "\nCard has been verified.";
            else
                msg+= "\nCard has not been verified.";
        }
        else
        {
            msg = "Customer will be billed.";
        }
        JOptionPane.showMessageDialog(this, msg); //joption classından showMessageDialog methodunu çagırdım ve bu bana ekstradan mesaj kutusu açtı ve girilenleri yazdı
        kartTipListe.setSelectedIndex(0);
        kartNoGirisKutu.setText("");
        ayKombo.setSelectedIndex(0);
        seneKombo.setSelectedIndex(0);
        isaretKutusu.setSelected(false);
    }//GEN-LAST:event_kabulDugmeActionPerformed
    
    private void enableCreditCardControls(boolean enable) // burayı kullanıcı yazmıs
    {   
        //setEnabled yöntemiyle aşağıdakileri enable veya disable yapmak için kullanılır.
        kartTipListe.setEnabled(enable);
        kartNoGirisKutu.setEnabled(enable);
        ayKombo.setEnabled(enable);
        seneKombo.setEnabled(enable);
        isaretKutusu.setEnabled(enable);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ayKombo;
    private javax.swing.JButton bitirDugme;
    private javax.swing.ButtonGroup dugmeGrubu;
    private javax.swing.JRadioButton faturaGonderRadyoDugme;
    private javax.swing.JCheckBox isaretKutusu;
    private javax.swing.JButton kabulDugme;
    private javax.swing.JLabel kartBitisTarihiEtiket;
    private javax.swing.JLabel kartNoEtiket;
    private javax.swing.JTextField kartNoGirisKutu;
    private javax.swing.JList kartTipListe;
    private javax.swing.JLabel kartTipiEtiket;
    private javax.swing.JScrollPane kayanCubuklar;
    private javax.swing.JRadioButton krediKartRadyoDugme;
    private javax.swing.JPanel pano;
    private javax.swing.JComboBox seneKombo;
    // End of variables declaration//GEN-END:variables
    
}