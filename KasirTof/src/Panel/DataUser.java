/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Panel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class DataUser extends javax.swing.JFrame {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model;
    public int id =-1;
    
    

    /**
     * Creates new form DataUser
     */
    public DataUser() {
        initComponents();
        String[] header = {"Id", "Nama", "Email", "No_telepon", "Level", "Password"};
        model = new DefaultTableModel(header, 0);
        tabel1.setModel(model);   
        pp();
    }
    
    public void pp(){
 model.setRowCount(0);

        try {
            con = koneksi.konek();
            String sql = "SELECT * FROM user";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id_user"),   // Asumsi id ada di kolom pertama
                    rs.getString("nama"),
                    rs.getString("email"),
                    rs.getString("no_telepon"),
                    rs.getString("Level"),
                    rs.getString("Password")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBedit = new javax.swing.JButton();
        jBhapus = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbnama = new javax.swing.JLabel();
        jbemail = new javax.swing.JLabel();
        jbnotlpn = new javax.swing.JLabel();
        jblevel = new javax.swing.JLabel();
        jbpassword = new javax.swing.JLabel();
        jNama = new javax.swing.JTextField();
        jEmail = new javax.swing.JTextField();
        jLevel = new javax.swing.JTextField();
        jPassword = new javax.swing.JTextField();
        jNotlpn = new javax.swing.JTextField();
        jBsimpan = new javax.swing.JButton();
        jbTambah = new javax.swing.JButton();

        jTextField6.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(599, 474));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO", "Nama", "Email", "no telpon", "level", "password"
            }
        ));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Search_3.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("DATA USER");

        jBedit.setText("EDIT");
        jBedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditActionPerformed(evt);
            }
        });

        jBhapus.setText("HAPUS");
        jBhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhapusActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Back.png"))); // NOI18N

        jbnama.setText("Nama");

        jbemail.setText("Email");

        jbnotlpn.setText("no telpon");

        jblevel.setText("Level");

        jbpassword.setText("password");

        jBsimpan.setText("SIMPAN");
        jBsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBsimpanMouseClicked(evt);
            }
        });

        jbTambah.setText("TAMBAH");
        jbTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTambahMouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 126, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(115, 115, 115))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jblevel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbpassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jbnama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jbnotlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jNama)
                                        .addComponent(jEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(jNotlpn))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jbTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBhapus)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCari)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnama)
                    .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbemail)
                    .addComponent(jEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbnotlpn)
                    .addComponent(jNotlpn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jblevel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbpassword)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsimpan)
                    .addComponent(jBedit)
                    .addComponent(jBhapus)
                    .addComponent(jbTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTambahMouseClicked
        // TODO add your handling code here:
        try {
    String sql = "INSERT INTO user (nama, email, no_telepon, Level, Password) VALUES (?, ?, ?, ?, ?)";
    Connection con = koneksi.konek();
    PreparedStatement pst = con.prepareStatement(sql);
    
    pst.setString(1, jNama.getText());  
    pst.setString(2, jEmail.getText()); 
    pst.setString(3, jNotlpn.getText()); 
    pst.setString(4, jLevel.getText());  
    pst.setString(5, jPassword.getText()); 
    
     
 
    JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
    int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User saved successfully!");

                // Clear the input fields
                jNama.setText("");
                jEmail.setText("");
                jNotlpn.setText("");
                jLevel.setText("");
                jPassword.setText("");

                // Reload the table data to show the new user
                pp();
            }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Gagal Menyimpan: " + e.getMessage());
}
    }//GEN-LAST:event_jbTambahMouseClicked

    private void jBsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBsimpanMouseClicked
        // TODO add your handling code here:
        
        try{
           String sql = "SELECT * FROM user WHERE nama ='" + jNama.getText() + "'";
           Connection con = koneksi.konek();
           PreparedStatement pst = con.prepareStatement(sql);
           pst.execute();
        }catch (Exception e){     
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jBsimpanMouseClicked

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        int row = tabel1.getSelectedRow();
        
        if (row >= 0) {
                    // Ambil data dari baris yang diklik
                    id = Integer.parseInt(model.getValueAt(row, 0).toString()); // Ambil id (asumsi kolom 0 adalah id)
                    jNama.setText(model.getValueAt(row, 1).toString());
                    jEmail.setText(model.getValueAt(row, 2).toString());
                    jNotlpn.setText(model.getValueAt(row, 3).toString());
                    jLevel.setText(model.getValueAt(row, 4).toString());
                    jPassword.setText(model.getValueAt(row, 5).toString());
                }
        
        
    }//GEN-LAST:event_tabel1MouseClicked

    private void jBeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditActionPerformed
        try {
        // Query untuk update data
        String sql = "UPDATE user SET nama = ?, email = ?, no_telepon = ?, Level = ?, Password = ? WHERE id_user = ?";
        con = koneksi.konek();
       PreparedStatement pst = con.prepareStatement(sql);
    

        // Set nilai yang baru dari input user
        pst.setString(1, jNama.getText());
        pst.setString(2, jEmail.getText());
        pst.setString(3, jNotlpn.getText());
        pst.setString(4, jLevel.getText());
        pst.setString(5, jPassword.getText());
        pst.setInt(6, id); // Update berdasarkan id

        // Eksekusi update
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil di-update!");

            // Reload tabel setelah update
            pp();

            // Kosongkan field input dan reset selectedUserId
            id = -1;
            jNama.setText("");
            jEmail.setText("");
            jNotlpn.setText("");
            jLevel.setText("");
            jPassword.setText("");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + e.getMessage());
    } 
    }//GEN-LAST:event_jBeditActionPerformed

    private void jBhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhapusActionPerformed
try {
        // Query untuk update data
        String sql = "DELETE FROM user WHERE id_user = ?";
        con = koneksi.konek();
       PreparedStatement pst = con.prepareStatement(sql);
 pst.setInt(1, id);
int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Data berhasil di-delete!");

            // Reload tabel setelah update
            pp();

            // Kosongkan field input dan reset selectedUserId
            id = -1;
            jNama.setText("");
            jEmail.setText("");
            jNotlpn.setText("");
            jLevel.setText("");
            jPassword.setText("");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal mengupdate data: " + e.getMessage());
    } 
    }//GEN-LAST:event_jBhapusActionPerformed

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
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBedit;
    private javax.swing.JButton jBhapus;
    private javax.swing.JButton jBsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jLevel;
    private javax.swing.JTextField jNama;
    private javax.swing.JTextField jNotlpn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbTambah;
    private javax.swing.JLabel jbemail;
    private javax.swing.JLabel jblevel;
    private javax.swing.JLabel jbnama;
    private javax.swing.JLabel jbnotlpn;
    private javax.swing.JLabel jbpassword;
    private javax.swing.JTable tabel1;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    private void table() {
         model.setRowCount(0);
        try{
           String sql = "SELECT * FROM user";
           Connection con = koneksi.konek();
           PreparedStatement pst = con.prepareStatement(sql);
            while (rs.next()) {
                int id = rs.getInt("id_user");
                String name = rs.getString("nama");
                String email = rs.getString("email");
                String telp = rs.getString("no_telepon");
                    String lvl = rs.getString("Level");
                     String ps = rs.getString("no_telepon");
                // Add the row to the table model
                model.addRow(new Object[]{id, name, email, telp});
            }
           pst.execute();
        }catch (Exception e){     
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
