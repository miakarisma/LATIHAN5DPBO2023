/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

// Import
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sekar
 */
public class Menu extends javax.swing.JFrame {

    // Properties
    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;

    /**
     * Creates new form Menu
     */
    public Menu() {
        // Constructor
        initComponents();
        listMhs = new ArrayList<>();
        
        // Dummy
        listMhs.add(new Mahasiswa("2132888", "Cahya Gumilang", "A", "Laki-laki"));
        listMhs.add(new Mahasiswa("2001103", "Nelly Joy C. S", "B", "Perempuan"));
        listMhs.add(new Mahasiswa("2202222", "Muhammad Satria R.", "C", "Laki-laki"));
        
        // Set Table
        tblMhs.setModel(setTable());
        
        // Hide Delete button
        btnDelete.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        // Column Title
        Object[] column = {"NIM", "Nama", "Nilai", "Jenis Kelamin"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        // Get Cell Value
        for (int i = 0; i < listMhs.size(); i++)
        {
            Object[] row = new Object[4];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();
            row[3] = listMhs.get(i).getGender();
            
            dataTabel.addRow(row);
        }

        return dataTabel;
    }

    public void insertData() {
        // Get Data from Form
        String nim = fieldNim.getText();
        String nama = fieldNama.getText();
        String nilai = fieldNilai.getText();
        String gender = boxGender.getSelectedItem().toString();
        
        // Add New Data
        if(!nim.isEmpty() && !nama.isEmpty() && !nilai.isEmpty() && !gender.isEmpty())
        {
            listMhs.add(new Mahasiswa(nim, nama, nilai, gender));
        
            // Reset Form
            resetForm();

            //Update Table
            tblMhs.setModel(setTable());

            // Show Information
            System.out.println("Insert Success");
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
        }
        else
        {
            System.out.println("Insert Failed");
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan");
        }
    }

    public void updateData() {
        // Get Data from Form
        String nim = fieldNim.getText();
        String nama = fieldNama.getText();
        String nilai = fieldNilai.getText();
        String gender = boxGender.getSelectedItem().toString();

        // set Data to Object
        if(!nim.isEmpty() && !nama.isEmpty() && !nilai.isEmpty() && !gender.isEmpty())
        {
            listMhs.get(selectedID).setNim(nim);
            listMhs.get(selectedID).setNama(nama);
            listMhs.get(selectedID).setNilai(nilai);
            listMhs.get(selectedID).setGender(gender);
        
            // Reset Form
            resetForm();
        
            // Update Table
            tblMhs.setModel(setTable());
            
            btnAdd.setText("Add");
            btnDelete.setVisible(false);
            this.isUpdate = false;
            
            // Show Information
            System.out.println("Update Success");
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        }
        else 
        {
            System.out.println("Update Failed");
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
    }

    public void deleteData() {
        // Remove Data from List
        listMhs.remove(selectedID);
        
        // Update Table
        tblMhs.setModel(setTable());
        
        // Reset Form
        resetForm();
        
        // Show Information
        System.out.println("Delete Success");
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void resetForm() {
        // Set All Value Form to Empty
        fieldNim.setText("");
        fieldNama.setText("");
        fieldNilai.setText("");
        boxGender.setSelectedItem("Perempuan");
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
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        fieldNim = new javax.swing.JTextField();
        lblNim = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        lblNilai = new javax.swing.JLabel();
        fieldNilai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMhs = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblNilai1 = new javax.swing.JLabel();
        boxGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(126, 136, 176));

        lblTitle.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Daftar Mahasiswa");

        btnAdd.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        fieldNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNimActionPerformed(evt);
            }
        });

        lblNim.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblNim.setForeground(new java.awt.Color(255, 255, 255));
        lblNim.setText("NIM");

        lblNama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("Nama");

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        lblNilai.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblNilai.setForeground(new java.awt.Color(255, 255, 255));
        lblNilai.setText("Nilai");

        fieldNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNilaiActionPerformed(evt);
            }
        });

        tblMhs.setAutoCreateRowSorter(true);
        tblMhs.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblMhs.setUpdateSelectionOnSort(false);
        tblMhs.setVerifyInputWhenFocusTarget(false);
        tblMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMhs);

        btnDelete.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblNilai1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblNilai1.setForeground(new java.awt.Color(255, 255, 255));
        lblNilai1.setText("Jenis Kelamin");

        boxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perempuan", "Laki-laki" }));
        boxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNilai)
                                    .addComponent(lblNilai1))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete)
                            .addComponent(btnCancel))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNim)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNilai)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNilai1)
                    .addComponent(boxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNimActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

    private void fieldNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNilaiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        // If Add (data not clicked)
        if (isUpdate == false) {
            insertData();
        } else {
            // update data
            updateData();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMhsMouseClicked
        // TODO add your handling code here:
        // If data clicked
        this.isUpdate = true;

        //Get Selected Data
        int row = tblMhs.getSelectedRow();
        String selectedNim = (tblMhs.getModel().getValueAt(row, 0).toString());
        String selectedNama = (tblMhs.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (tblMhs.getModel().getValueAt(row, 2).toString());
        String selectedGender = (tblMhs.getModel().getValueAt(row, 3).toString());
        
        // Search Data
        for (int i = 0; i < listMhs.size(); i++)
        {
            if(selectedNim.equals(listMhs.get(i).getNim())) 
            {
                selectedID = i;
                break;
            }
        }

        // Set Form Value
        fieldNim.setText(selectedNim);
        fieldNama.setText(selectedNama);
        fieldNilai.setText(selectedNilai);
        boxGender.setSelectedItem(selectedGender);
        
        btnAdd.setText("Update");
        btnDelete.setVisible(true);
    }//GEN-LAST:event_tblMhsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            int isDelete = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapusnya?", "Delete Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (JOptionPane.YES_NO_OPTION == isDelete) 
            {
                deleteData();
                btnAdd.setText("Add");
                btnDelete.setVisible(false);
                this.isUpdate = false;
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        // Cancel Input Form
        btnAdd.setText("Add");
        btnDelete.setVisible(false);
        this.isUpdate = false;
        
        // Reset Form
        resetForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void boxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxGenderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_boxGenderActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGender;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNilai;
    private javax.swing.JTextField fieldNim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNilai;
    private javax.swing.JLabel lblNilai1;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblMhs;
    // End of variables declaration//GEN-END:variables
}
