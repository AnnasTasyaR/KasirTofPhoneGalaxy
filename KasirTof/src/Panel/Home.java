/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Panel;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    public String nama;
     public String emails;
     public String penguna;

    /**
     * Creates new form Home
     */
    public Home(String name, String email, String pengguna) {
         this.nama = name;
         this.emails = email;
         this.penguna = pengguna;
        new Profil(name, email, pengguna);
        initComponents();
    }

    public Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jMenu = new javax.swing.JPanel();
        jbKasir = new javax.swing.JLabel();
        jbLogout = new javax.swing.JButton();
        jbProfil = new javax.swing.JButton();
        jbProfil1 = new javax.swing.JButton();
        jProduk = new javax.swing.JPanel();
        jbDataProduk = new javax.swing.JLabel();
        jbKeranjang = new javax.swing.JLabel();
        jTransaksi = new javax.swing.JPanel();
        jlabel = new javax.swing.JLabel();
        jbtransaksi = new javax.swing.JLabel();
        jUser = new javax.swing.JPanel();
        jbDataUser = new javax.swing.JLabel();
        jbUser = new javax.swing.JLabel();
        jbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(599, 474));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jMenu.setBackground(new java.awt.Color(255, 204, 153));
        jMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jbKasir.setBackground(new java.awt.Color(255, 255, 255));
        jbKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/School Cafeteria_2.png"))); // NOI18N
        jbKasir.setText("TOF PHONE");
        jbKasir.setIconTextGap(10);

        jbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Logout_1.png"))); // NOI18N
        jbLogout.setText("LOGOUT");
        jbLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogoutActionPerformed(evt);
            }
        });

        jbProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Home_4.png"))); // NOI18N
        jbProfil.setText("HOME");

        jbProfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Male User.png"))); // NOI18N
        jbProfil1.setText("PROFIL");
        jbProfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProfil1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuLayout = new javax.swing.GroupLayout(jMenu);
        jMenu.setLayout(jMenuLayout);
        jMenuLayout.setHorizontalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuLayout.createSequentialGroup()
                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jbKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbProfil, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jbProfil1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jMenuLayout.setVerticalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jbKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbProfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jProduk.setBackground(new java.awt.Color(255, 204, 153));
        jProduk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jProduk.setMinimumSize(new java.awt.Dimension(112, 112));
        jProduk.setPreferredSize(new java.awt.Dimension(112, 112));

        jbDataProduk.setText("Data Produk");

        jbKeranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Shopping Cart_2.png"))); // NOI18N

        javax.swing.GroupLayout jProdukLayout = new javax.swing.GroupLayout(jProduk);
        jProduk.setLayout(jProdukLayout);
        jProdukLayout.setHorizontalGroup(
            jProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProdukLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jProdukLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbDataProduk))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jProdukLayout.setVerticalGroup(
            jProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jProdukLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jbDataProduk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbKeranjang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTransaksi.setBackground(new java.awt.Color(255, 204, 153));
        jTransaksi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jTransaksi.setPreferredSize(new java.awt.Dimension(112, 112));

        jlabel.setText("Data Transaksi");

        jbtransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Data Quality.png"))); // NOI18N

        javax.swing.GroupLayout jTransaksiLayout = new javax.swing.GroupLayout(jTransaksi);
        jTransaksi.setLayout(jTransaksiLayout);
        jTransaksiLayout.setHorizontalGroup(
            jTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTransaksiLayout.createSequentialGroup()
                .addGroup(jTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTransaksiLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTransaksiLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlabel)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jTransaksiLayout.setVerticalGroup(
            jTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTransaksiLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jUser.setBackground(new java.awt.Color(255, 204, 153));
        jUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jbDataUser.setText("Data User");

        jbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/Profile.png"))); // NOI18N

        javax.swing.GroupLayout jUserLayout = new javax.swing.GroupLayout(jUser);
        jUser.setLayout(jUserLayout);
        jUserLayout.setHorizontalGroup(
            jUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUserLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jUserLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbUser))
                    .addComponent(jbDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jUserLayout.setVerticalGroup(
            jUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbDataUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbUser)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/img/tof_1-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTransaksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbLogoutActionPerformed

    private void jbProfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProfil1ActionPerformed
     dispose();
     Profil pr = new Profil(nama, emails, penguna);
     pr.setVisible(true);
             // TODO add your handling code here:
    }//GEN-LAST:event_jbProfil1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jProduk;
    private javax.swing.JPanel jTransaksi;
    private javax.swing.JPanel jUser;
    private javax.swing.JLabel jbDataProduk;
    private javax.swing.JLabel jbDataUser;
    private javax.swing.JLabel jbKasir;
    private javax.swing.JLabel jbKeranjang;
    private javax.swing.JLabel jbLogo;
    private javax.swing.JButton jbLogout;
    private javax.swing.JButton jbProfil;
    private javax.swing.JButton jbProfil1;
    private javax.swing.JLabel jbUser;
    private javax.swing.JLabel jbtransaksi;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
