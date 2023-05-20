/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import domain.Mesto;
import communication.Communication;
import domain.Autobus;
import domain.Vozac;
import domain.Voznja;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import tables.VoznjaTableModel;
import threads.DateTimeThread;

/**
 *
 * @author PC
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     * @param parent
     * @param modal
     */

    public FrmMain() {
        super();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTime();
        prepareTable(null, null);
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

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVoznje = new javax.swing.JTable();
        btnPretaziVoznju = new javax.swing.JButton();
        jDTPDatum = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlMesta = new javax.swing.JList<>();
        tbMesto = new javax.swing.JTextField();
        jlDatum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDatumVremeText = new javax.swing.JLabel();
        lblDatumVreme = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu = new javax.swing.JMenu();
        mbDodajAutobus = new javax.swing.JMenuItem();
        mbIzmeniAutobus = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mbDodajVozaca = new javax.swing.JMenuItem();
        mbIzmeniVozaca = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mbDodajMesto = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mbDodajVoznju = new javax.swing.JMenuItem();
        mbIzmeniVoznju = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem7.setText("jMenuItem7");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pregled voznji", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        tableVoznje.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableVoznje);

        btnPretaziVoznju.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPretaziVoznju.setText("PRETRAZI VOZNJU");
        btnPretaziVoznju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretaziVoznjuActionPerformed(evt);
            }
        });

        JlMesta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JlMesta.setEnabled(false);
        JlMesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlMestaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JlMesta);

        tbMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMestoActionPerformed(evt);
            }
        });
        tbMesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMestoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbMestoKeyTyped(evt);
            }
        });

        jlDatum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlDatum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDatum.setText("DATUM ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MESTO");

        lblDatumVremeText.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblDatumVremeText.setForeground(new java.awt.Color(0, 0, 0));
        lblDatumVremeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDatumVremeText.setText("Datum :");

        lblDatumVreme.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblDatumVreme.setForeground(new java.awt.Color(0, 0, 0));
        lblDatumVreme.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDatumVreme.setText("datum i vreme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tbMesto, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDTPDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jlDatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPretaziVoznju, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDatumVremeText, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDatumVreme, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                        .addGap(472, 472, 472))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumVremeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatumVreme, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbMesto)
                    .addComponent(jlDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPretaziVoznju, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(jDTPDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JMenu.setText("Autobus");

        mbDodajAutobus.setText("Dodaj/prikazi");
        mbDodajAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbDodajAutobusActionPerformed(evt);
            }
        });
        JMenu.add(mbDodajAutobus);

        mbIzmeniAutobus.setText("Izmeni ");
        mbIzmeniAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbIzmeniAutobusActionPerformed(evt);
            }
        });
        JMenu.add(mbIzmeniAutobus);

        jMenuBar1.add(JMenu);

        jMenu3.setText("Vozac");

        mbDodajVozaca.setText("Dodaj/prikazi ");
        mbDodajVozaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbDodajVozacaActionPerformed(evt);
            }
        });
        jMenu3.add(mbDodajVozaca);

        mbIzmeniVozaca.setText("Izmeni");
        mbIzmeniVozaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbIzmeniVozacaActionPerformed(evt);
            }
        });
        jMenu3.add(mbIzmeniVozaca);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Mesto");

        mbDodajMesto.setText("Dodaj ");
        mbDodajMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbDodajMestoActionPerformed(evt);
            }
        });
        jMenu5.add(mbDodajMesto);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Voznja");

        mbDodajVoznju.setText("Dodaj/prikazi");
        mbDodajVoznju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbDodajVoznjuActionPerformed(evt);
            }
        });
        jMenu6.add(mbDodajVoznju);

        mbIzmeniVoznju.setText("Izmeni");
        mbIzmeniVoznju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbIzmeniVoznjuActionPerformed(evt);
            }
        });
        jMenu6.add(mbIzmeniVoznju);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbMestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMestoKeyTyped
        // TODO add your handling code here:
        
            
        
    }//GEN-LAST:event_tbMestoKeyTyped

    private void tbMestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMestoKeyReleased
        // TODO add your handling code here:
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JlMesta.setModel(listModel);
        JlMesta.setEnabled(true);
         List<Mesto> mesta=new ArrayList<>();
        try {
            mesta = Communication.getInstance().ucitajListuMesta();
            for (Mesto mesto : mesta) {
                listModel.addElement(mesto.getNaziv());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "GRESKA PRILOKOM UCITAVNJA MESTA", JOptionPane.ERROR_MESSAGE);
        }
        
        String prefix = tbMesto.getText().toLowerCase();
        List<String> filteredList = new ArrayList<>();

        // Filtriranje elemenata koji počinju na uneti prefiks
        for (int i = 0; i < listModel.getSize(); i++) {
            String element = listModel.getElementAt(i);
            if (element.toLowerCase().startsWith(prefix)) {
                filteredList.add(element);
            }
        }
        // Ažuriranje prikazane liste rezultata
        JlMesta.setListData(filteredList.toArray(new String[0]));
            
    }//GEN-LAST:event_tbMestoKeyReleased

    private void tbMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbMestoActionPerformed

    private void btnPretaziVoznjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretaziVoznjuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPretaziVoznjuActionPerformed

    private void JlMestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlMestaMouseClicked
         String grad= String.valueOf(JlMesta.getSelectedValue());
         tbMesto.setText(grad);
    }//GEN-LAST:event_JlMestaMouseClicked

    private void mbDodajAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbDodajAutobusActionPerformed
        new FrmAutobus(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbDodajAutobusActionPerformed

    private void mbDodajVozacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbDodajVozacaActionPerformed
        new FrmVozac(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbDodajVozacaActionPerformed

    private void mbIzmeniVozacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbIzmeniVozacaActionPerformed
        new FrmIzmeniVozaca(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbIzmeniVozacaActionPerformed

    private void mbDodajMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbDodajMestoActionPerformed
        new FrmMesto(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbDodajMestoActionPerformed

    private void mbDodajVoznjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbDodajVoznjuActionPerformed
        new FrmVoznja(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbDodajVoznjuActionPerformed

    private void mbIzmeniVoznjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbIzmeniVoznjuActionPerformed
        new FrmIzmeniVoznju(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbIzmeniVoznjuActionPerformed

    private void mbIzmeniAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbIzmeniAutobusActionPerformed
        new FrmIzmeniAutobus(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_mbIzmeniAutobusActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu;
    private javax.swing.JList<String> JlMesta;
    private javax.swing.JButton btnPretaziVoznju;
    private com.toedter.calendar.JDateChooser jDTPDatum;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlDatum;
    private javax.swing.JLabel lblDatumVreme;
    private javax.swing.JLabel lblDatumVremeText;
    private javax.swing.JMenuItem mbDodajAutobus;
    private javax.swing.JMenuItem mbDodajMesto;
    private javax.swing.JMenuItem mbDodajVozaca;
    private javax.swing.JMenuItem mbDodajVoznju;
    private javax.swing.JMenuItem mbIzmeniAutobus;
    private javax.swing.JMenuItem mbIzmeniVozaca;
    private javax.swing.JMenuItem mbIzmeniVoznju;
    private javax.swing.JTable tableVoznje;
    private javax.swing.JTextField tbMesto;
    // End of variables declaration//GEN-END:variables

    private void setTime() {
        DateTimeThread dateTime= new DateTimeThread(lblDatumVreme);
        dateTime.start();
    }

    private void prepareTable(Mesto mesto, Date datum) {
       List<Voznja> voznje=new ArrayList<>();
       List<Voznja> voznjePom=new ArrayList<>();
       TableModel model;
        try {
            voznje = Communication.getInstance().nadjiVoznju(mesto.getNaziv());
            if(mesto==null && datum==null){
            model=new VoznjaTableModel(voznje);
            tableVoznje.setModel(model);
            }else{
                for (Voznja voznja : voznje) {
                    
                }
            }
            model=new VoznjaTableModel(voznje);
            tableVoznje.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(FrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void prepareComponents() {
        try {
            List<Voznja> voznje = Communication.getInstance().ucitajListuVoznji();
            TableModel model = new VoznjaTableModel(voznje);
            tableVoznje.setModel(model);
            
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
