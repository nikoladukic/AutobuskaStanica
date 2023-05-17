/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package rs.ac.bg.fon.ps.view.form;

/**
 *
 * @author PC
 */
public class FrmIzmeniVozaca extends javax.swing.JDialog {

    /**
     * Creates new form FrmIzmeniVozaca
     */
    public FrmIzmeniVozaca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbVozac = new javax.swing.JComboBox<>();
        lblIzaberiVozaca = new javax.swing.JLabel();
        lblJmbg = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        lblDatum = new javax.swing.JLabel();
        lblRadniStaz = new javax.swing.JLabel();
        tbJmbg = new javax.swing.JTextField();
        tbRadniStaz = new javax.swing.JTextField();
        tbPrezime = new javax.swing.JTextField();
        tbIme = new javax.swing.JTextField();
        tbDatumRodjenja = new javax.swing.JTextField();
        btnIzmeni = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("IZMENA VOZACA"));

        lblIzaberiVozaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIzaberiVozaca.setText("Izaberi vozaca");

        lblJmbg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblJmbg.setText("Jmbg");

        lblIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIme.setText("Ime");

        lblPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrezime.setText("Prezime");

        lblDatum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDatum.setText("Datum rodjenja");

        lblRadniStaz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRadniStaz.setText("Radni staz");

        tbJmbg.setEnabled(false);
        tbJmbg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbJmbgActionPerformed(evt);
            }
        });

        tbRadniStaz.setEnabled(false);
        tbRadniStaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbRadniStazActionPerformed(evt);
            }
        });

        tbPrezime.setEnabled(false);

        tbIme.setEnabled(false);

        tbDatumRodjenja.setEnabled(false);
        tbDatumRodjenja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDatumRodjenjaActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni vozaca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIzmeni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(lblRadniStaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lblJmbg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIzaberiVozaca, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbVozac, 0, 200, Short.MAX_VALUE)
                    .addComponent(tbJmbg)
                    .addComponent(tbRadniStaz)
                    .addComponent(tbPrezime)
                    .addComponent(tbIme)
                    .addComponent(tbDatumRodjenja)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzaberiVozaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVozac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJmbg)
                    .addComponent(tbJmbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(tbIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrezime)
                    .addComponent(tbPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum)
                    .addComponent(tbDatumRodjenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadniStaz)
                    .addComponent(tbRadniStaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnIzmeni)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbJmbgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbJmbgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbJmbgActionPerformed

    private void tbRadniStazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbRadniStazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRadniStazActionPerformed

    private void tbDatumRodjenjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDatumRodjenjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDatumRodjenjaActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnIzmeni;
    private javax.swing.JComboBox<String> cbVozac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblIzaberiVozaca;
    private javax.swing.JLabel lblJmbg;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblRadniStaz;
    private javax.swing.JTextField tbDatumRodjenja;
    private javax.swing.JTextField tbIme;
    private javax.swing.JTextField tbJmbg;
    private javax.swing.JTextField tbPrezime;
    private javax.swing.JTextField tbRadniStaz;
    // End of variables declaration//GEN-END:variables
}
