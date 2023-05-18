/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Vozac;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author PC
 */
public class FrmVozac extends javax.swing.JDialog {

    /**
     * Creates new form FrmVozac
     */
    public FrmVozac(java.awt.Frame parent, boolean modal) {
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

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil2 = new org.jdatepicker.util.JDatePickerUtil();
        jDatePickerUtil3 = new org.jdatepicker.util.JDatePickerUtil();
        utilCalendarModel1 = new org.jdatepicker.impl.UtilCalendarModel();
        jPanel1 = new javax.swing.JPanel();
        lblJMBG = new javax.swing.JLabel();
        lblIme = new javax.swing.JLabel();
        lblPrezime = new javax.swing.JLabel();
        lblDatumRodjenja = new javax.swing.JLabel();
        lblRadniStaz = new javax.swing.JLabel();
        jdpDatumRodjenja = new com.toedter.calendar.JDateChooser();
        tbJmbg = new javax.swing.JTextField();
        tbPrezime = new javax.swing.JTextField();
        tbIme = new javax.swing.JTextField();
        tbRadniStaz = new javax.swing.JTextField();
        btnDodajVozaca = new javax.swing.JToggleButton();
        brnIzmeniVozaca = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("VOZAC"));

        lblJMBG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJMBG.setText("JMBG");

        lblIme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIme.setText("Ime");

        lblPrezime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrezime.setText("Prezime");

        lblDatumRodjenja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatumRodjenja.setText("Datum rodjenja");

        lblRadniStaz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRadniStaz.setText("Radni staz");

        btnDodajVozaca.setText("Dodaj vozaca");
        btnDodajVozaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajVozacaActionPerformed(evt);
            }
        });

        brnIzmeniVozaca.setText("Izmeni vozaca");
        brnIzmeniVozaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnIzmeniVozacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbJmbg))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIme, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbIme))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbPrezime))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDatumRodjenja, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblRadniStaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbRadniStaz)
                            .addComponent(jdpDatumRodjenja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 152, Short.MAX_VALUE)
                        .addComponent(brnIzmeniVozaca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodajVozaca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbJmbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDatumRodjenja)
                    .addComponent(jdpDatumRodjenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadniStaz, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbRadniStaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajVozaca)
                    .addComponent(brnIzmeniVozaca))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajVozacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajVozacaActionPerformed
        String ime=tbIme.getText();
        String prezime=tbPrezime.getText();
        String jmbg=tbJmbg.getText();
        String radniStaz=tbRadniStaz.getText();
        
        if(ime.length()<2){
            JOptionPane.showMessageDialog(this, "Ime mora biti duze od 2");
            return;
        }
         if(prezime.length()<2){
            JOptionPane.showMessageDialog(this, "Preizme mora biti duze od 2");
            return;
        }
        
         if (jmbg.length()!= 13) {
             JOptionPane.showMessageDialog(this, "JMBG mora biti duzine 13");
             return;    
         }
    
        try {
            Long.parseLong(jmbg); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "JMBG mora sadrzati samo brojeve");
            return;
        }
        try {
            Long.parseLong(radniStaz); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Radni staz mora sadrzati samo brojeve");
            return;
        }
        
        try {
            Communication.getInstance().kreirajVozaca(new Vozac(jmbg,ime,prezime,jdpDatumRodjenja.getDate(),Integer.parseInt(radniStaz)));
        } catch (Exception ex) {
            Logger.getLogger(FrmVozac.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }//GEN-LAST:event_btnDodajVozacaActionPerformed

    private void brnIzmeniVozacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnIzmeniVozacaActionPerformed
        new FrmIzmeniVozaca(new JFrame(),true);
    }//GEN-LAST:event_brnIzmeniVozacaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton brnIzmeniVozaca;
    private javax.swing.JToggleButton btnDodajVozaca;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil2;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil3;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdpDatumRodjenja;
    private javax.swing.JLabel lblDatumRodjenja;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblJMBG;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblRadniStaz;
    private javax.swing.JTextField tbIme;
    private javax.swing.JTextField tbJmbg;
    private javax.swing.JTextField tbPrezime;
    private javax.swing.JTextField tbRadniStaz;
    private org.jdatepicker.impl.UtilCalendarModel utilCalendarModel1;
    // End of variables declaration//GEN-END:variables
}