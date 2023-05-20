/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import communication.Communication;
import domain.Autobus;
import domain.VrstaAutobusa;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import tables.AutobusTableModel;

/**
 *
 * @author PC
 */
public class FrmAutobus extends javax.swing.JDialog {

    /**
     * Creates new form FrmAutobus
     */
    public FrmAutobus(java.awt.Frame parent, boolean modal) {
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
        jPanel2 = new javax.swing.JPanel();
        lblRegBroj = new javax.swing.JLabel();
        lblMarka = new javax.swing.JLabel();
        lblGodinaProzivodnje = new javax.swing.JLabel();
        lblBrMesta = new javax.swing.JLabel();
        lblVrsta = new javax.swing.JLabel();
        cbVrsta = new javax.swing.JComboBox<>();
        tbRegBroj = new javax.swing.JTextField();
        tbMarka = new javax.swing.JTextField();
        tbGodProizvodnje = new javax.swing.JTextField();
        tbBrojMesta = new javax.swing.JTextField();
        btnDodajAutobus = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutobusi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Autobus"));

        lblRegBroj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegBroj.setText("Registarski broj");

        lblMarka.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMarka.setText("Marka");

        lblGodinaProzivodnje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGodinaProzivodnje.setText("Godina proizvodnje");

        lblBrMesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBrMesta.setText("Broj mesta");

        lblVrsta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVrsta.setText("Vrsta ");

        btnDodajAutobus.setText("Dodaj autobus");
        btnDodajAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajAutobusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodajAutobus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRegBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbRegBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbMarka, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblGodinaProzivodnje, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbGodProizvodnje, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBrMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbBrojMesta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(801, 801, 801))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegBroj)
                    .addComponent(tbRegBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarka)
                    .addComponent(tbMarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGodinaProzivodnje)
                    .addComponent(tbGodProizvodnje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrMesta)
                    .addComponent(tbBrojMesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVrsta)
                    .addComponent(cbVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnDodajAutobus)
                .addContainerGap())
        );

        jTableAutobusi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAutobusi);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Detaljni pregled autobusa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajAutobusActionPerformed
        String brojMesta         = tbBrojMesta.getText();
        String godinaProzivodnje = tbGodProizvodnje.getText();
        String marka             = tbMarka.getText();
        String regBroj           = tbRegBroj.getText();
        
        if(brojMesta.length()<1){
            JOptionPane.showMessageDialog(this, "Broj mesta mora biti duze od 0");
            return;
        }
         if(godinaProzivodnje.length()!=4){
            JOptionPane.showMessageDialog(this, "Godina proizovodnje mora biti duzine 4!");
            return;
        }
        
         if (marka.length()< 2) {
             JOptionPane.showMessageDialog(this, "Marka mora biti duza od 2");
             return;    
         }
         
          if (marka.length()< 5) {
             JOptionPane.showMessageDialog(this, "Registarki broj mora biti duzi od 5");
             return;    
         }
    
        try {
            Long.parseLong(brojMesta); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Broj mesta mora sadrzati samo brojeve");
            return;
        }
        try {
            Long.parseLong(godinaProzivodnje); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina proizovdnje mora sadrzati samo brojeve");
            return;
        }
        
        if(daLiPostoji(tbRegBroj.getText())){
            JOptionPane.showMessageDialog(this, "Autobus sa registarkim brojem '"+tbRegBroj.getText()+"' vec postoji.");
        }else{
            try {
                Autobus noviAutobus = new Autobus(tbRegBroj.getText(), tbMarka.getText(), Integer.parseInt(godinaProzivodnje), Integer.parseInt(brojMesta), (VrstaAutobusa)cbVrsta.getSelectedItem());
                Communication.getInstance().kreirajAutobus(noviAutobus);
            } catch (Exception ex) {
                  System.out.println(ex.getStackTrace());
            }
        }
    }//GEN-LAST:event_btnDodajAutobusActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDodajAutobus;
    private javax.swing.JComboBox<Object> cbVrsta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAutobusi;
    private javax.swing.JLabel lblBrMesta;
    private javax.swing.JLabel lblGodinaProzivodnje;
    private javax.swing.JLabel lblMarka;
    private javax.swing.JLabel lblRegBroj;
    private javax.swing.JLabel lblVrsta;
    private javax.swing.JTextField tbBrojMesta;
    private javax.swing.JTextField tbGodProizvodnje;
    private javax.swing.JTextField tbMarka;
    private javax.swing.JTextField tbRegBroj;
    // End of variables declaration//GEN-END:variables

    private boolean daLiPostoji(String regBroj) {
        try {
            List<Autobus> autobusi = communication.Communication.getInstance().pretraziAutobus(regBroj);
            if(autobusi!=null)return true;
            else return false;
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
        return false;
    }

    private void prepareComponents() {
        try {
            List<Autobus> autobusi = communication.Communication.getInstance().ucitajListuAutobusa();
            long i=1;
            TableModel model=new AutobusTableModel(autobusi);
            jTableAutobusi.setModel(model);
            List<VrstaAutobusa> vrste=Communication.getInstance().UcitajListuVrstiAutobusa();
            for (VrstaAutobusa vrsta : vrste) {
                cbVrsta.addItem(vrsta);
            }
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

   
}
