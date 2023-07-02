/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Autobus;
import domain.DestinacijaVoznje;
import domain.Mesto;
import domain.Vozac;
import domain.Voznja;
import domain.VrstaAutobusa;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import tables.VozacTableModel;
import tables.VoznjaTableModel;

/**
 *
 * @author PC
 */
public class FrmVoznja extends javax.swing.JDialog {

    /**
     * Creates new form FrmVoznja
     */
    public FrmVoznja(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prepareComponents();
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
        lblDatum = new javax.swing.JLabel();
        lblVreme = new javax.swing.JLabel();
        lblVozac = new javax.swing.JLabel();
        lblAutobus = new javax.swing.JLabel();
        lblMestoDolaska = new javax.swing.JLabel();
        jdpDatumPolaska = new com.toedter.calendar.JDateChooser();
        tbMinutes = new javax.swing.JTextField();
        tbSecunds = new javax.swing.JTextField();
        cbVozac = new javax.swing.JComboBox<>();
        cbMestoDolaska = new javax.swing.JComboBox<>();
        cbAutobus = new javax.swing.JComboBox<>();
        btnDodajVoznju = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tbHours = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVoznje = new javax.swing.JTable();
        lblPregled = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Voznja"));

        lblDatum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatum.setText("Datum polaska");

        lblVreme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVreme.setText("Vreme polaska (hh:mm:ss)");

        lblVozac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVozac.setText("Vozac");

        lblAutobus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAutobus.setText("Autobus");

        lblMestoDolaska.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMestoDolaska.setText("Mesto dolaska");

        cbAutobus.setToolTipText("");

        btnDodajVoznju.setText("Dodaj voznju");
        btnDodajVoznju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajVoznjuActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(":");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDodajVoznju, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVreme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVozac, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMestoDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tbHours, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(tbSecunds, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdpDatumPolaska, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbVozac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbMestoDolaska, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAutobus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdpDatumPolaska, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVreme)
                    .addComponent(tbMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbSecunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(tbHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVozac)
                    .addComponent(cbVozac, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutobus)
                    .addComponent(cbAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMestoDolaska)
                    .addComponent(cbMestoDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDodajVoznju)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jtableVoznje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableVoznje);

        lblPregled.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPregled.setText("Detaljni pregled voznji");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPregled, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregled)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajVoznjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajVoznjuActionPerformed
        validateInputs();
        String hh=tbHours.getText();
        String mm=tbMinutes.getText();
        String ss=tbSecunds.getText();
        Time time=new Time(Integer.parseInt(hh), Integer.parseInt(mm), Integer.parseInt(ss));
        Voznja voznja = new Voznja();
        voznja.setVozac((Vozac)cbVozac.getSelectedItem());
        voznja.setDatumPolaska((Date)jdpDatumPolaska.getDate());
        voznja.setAutobus((Autobus)cbAutobus.getSelectedItem());
        voznja.setVremePolaska(time);
        try {
            voznja = Communication.getInstance().kreirajVoznju(voznja);
            Communication.getInstance().kreirajDestinacijuVoznje(new DestinacijaVoznje(0,voznja,(Mesto)cbMestoDolaska.getSelectedItem()));
            JOptionPane.showMessageDialog(this, "Voznja uspesno dodata.");
            prepareComponents();
        } catch (Exception ex) {
            Logger.getLogger(FrmVoznja.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, "Greska pri dodavanju voznje, vec postoji!","Greska",JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
         
    }//GEN-LAST:event_btnDodajVoznjuActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajVoznju;
    private javax.swing.JComboBox<Object> cbAutobus;
    private javax.swing.JComboBox<Object> cbMestoDolaska;
    private javax.swing.JComboBox<Object> cbVozac;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdpDatumPolaska;
    private javax.swing.JTable jtableVoznje;
    private javax.swing.JLabel lblAutobus;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblMestoDolaska;
    private javax.swing.JLabel lblPregled;
    private javax.swing.JLabel lblVozac;
    private javax.swing.JLabel lblVreme;
    private javax.swing.JTextField tbHours;
    private javax.swing.JTextField tbMinutes;
    private javax.swing.JTextField tbSecunds;
    // End of variables declaration//GEN-END:variables

    private void validateInputs() {
        String hh=tbHours.getText();
        String mm=tbMinutes.getText();
        String ss=tbSecunds.getText();
        if(jdpDatumPolaska.getDate()==null){
            JOptionPane.showMessageDialog(this, "Morate izabrati datum voznje koju unosite");
            return;
        }
         if(hh.isEmpty()||mm.isEmpty()||ss.isEmpty()){
            JOptionPane.showMessageDialog(this, "Obavezno je uneti vreme voznje");
            return;
        }
         if(cbAutobus.getSelectedItem()==null ){
             JOptionPane.showMessageDialog(this, "Obavezno je uneti autobus");
             return;
         }
         if(cbMestoDolaska.getSelectedItem()==null ){
             JOptionPane.showMessageDialog(this, "Obavezno je uneti mesto dolaska");
             return;
         }
          if(cbVozac.getSelectedItem()==null ){
             JOptionPane.showMessageDialog(this, "Obavezno je uneti vozaca za voznju");
             return;
         }
        try {
            int hours   = Integer.parseInt(hh); 
            int minutes = Integer.parseInt(mm); 
            int secunds = Integer.parseInt(ss); 
            
            if(hours>24||hours<0||minutes<0||minutes>60||secunds>60||secunds<0){
             JOptionPane.showMessageDialog(this, "Vreme mora biti u validnom formatu HH:[0-24], MM:[0-60], SS:[0-60]");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vreme mora biti u validnom formatu HH:[0-24], MM:[0-60], SS:[0-60]");
        }
    }
        private void prepareComponents() {
        try {
            List<Voznja> voznje = Communication.getInstance().ucitajListuVoznji();
            TableModel model = new VoznjaTableModel(voznje);
            jtableVoznje.setModel(model);
            List<Mesto> mesta=Communication.getInstance().ucitajListuMesta();
            for (Mesto mesto : mesta) {
                cbMestoDolaska.addItem(mesto);
            }
            List<Autobus> autobusi=Communication.getInstance().ucitajListuAutobusa();
            for (Autobus autobus : autobusi) {
                cbAutobus.addItem(autobus);
            }
            List<Vozac> vozaci=Communication.getInstance().ucitajListuVozaca();
            for (Vozac vozac : vozaci) {
                cbVozac.addItem(vozac);
            }
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
}
