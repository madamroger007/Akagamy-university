/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikelompokimk;

import databases.DBConnection;
import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


/**
 *
 * @author Ra$h
 */
public class logInMenu extends javax.swing.JFrame {

    /**
     * Creates new form logInMenu
     */
    
    // akun admin
   
    String usernameadmin="admin",passwordadmin="admin123";
    
    
    public logInMenu() {
        initComponents();
               
         
        //centre
        this.setLocationRelativeTo(null); 
        
        // border
       Border closeMin = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
       
       //border for closing button
       jLabel2_closeButton.setBorder(closeMin);
       


        
        
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2_closeButton = new javax.swing.JLabel();
        jPasswordField_logIn = new javax.swing.JPasswordField();
        jTextField1_userName = new javax.swing.JTextField();
        logintombol = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1_LogIn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        tomboladmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelompokimk/gambar/loko kampus.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));
        jPanel3.setToolTipText("");

        jLabel2_closeButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2_closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_closeButton.setText("X");
        jLabel2_closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2_closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2_closeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2_closeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2_closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jPasswordField_logIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_logIn.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_logIn.setText("password");
        jPasswordField_logIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_logInFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_logInFocusLost(evt);
            }
        });
        jPasswordField_logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_logInActionPerformed(evt);
            }
        });

        jTextField1_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1_userName.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1_userName.setText("Account");
        jTextField1_userName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1_userNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1_userNameFocusLost(evt);
            }
        });
        jTextField1_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1_userNameKeyPressed(evt);
            }
        });

        logintombol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logintombol.setText("Masuk");
        logintombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintombolActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelompokimk/gambar/user_logIn.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelompokimk/gambar/lock.png"))); // NOI18N

        jButton1_LogIn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1_LogIn1.setText("Daftar");
        jButton1_LogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_LogIn1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Atau");

        tomboladmin.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        tomboladmin.setVisible(false);
        tomboladmin.setText("Masuk Admin");
        tomboladmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboladminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logintombol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1_userName)
                            .addComponent(jPasswordField_logIn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                            .addComponent(tomboladmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1_LogIn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(229, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1_userName, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jPasswordField_logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logintombol, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tomboladmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(446, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1_LogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
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

        setSize(new java.awt.Dimension(708, 564));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2_closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_closeButtonMouseEntered
        // TODO add your handling code here:
        
       Border closeMin = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
       
       //border for closing button
       jLabel2_closeButton.setBorder(closeMin);
       jLabel2_closeButton.setForeground(Color.red);
       
    }//GEN-LAST:event_jLabel2_closeButtonMouseEntered

    private void jLabel2_closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_closeButtonMouseExited
        // TODO add your handling code here:
       Border closeMin = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
       
       //border for closing button
       jLabel2_closeButton.setBorder(closeMin);
       jLabel2_closeButton.setForeground(Color.black);

        
    }//GEN-LAST:event_jLabel2_closeButtonMouseExited

    private void jPasswordField_logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_logInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_logInActionPerformed

    private void jTextField1_userNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_userNameFocusGained
        // TODO add your handling code here:
        
        if(jTextField1_userName.getText().trim().equals("Account"))
        {
        jTextField1_userName.setText("");
        jTextField1_userName.setForeground(Color.black);
        
        }
        
    }//GEN-LAST:event_jTextField1_userNameFocusGained

    private void jTextField1_userNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1_userNameFocusLost
        // TODO add your handling code here:
        
        if (jTextField1_userName.getText().trim().equals("") || 
            jTextField1_userName.getText().trim().equals("Account") )
            
        {
            
            jTextField1_userName.setText("Account");
            jTextField1_userName.setForeground(new Color(153,153,153));
            
        }
        
        
    }//GEN-LAST:event_jTextField1_userNameFocusLost

    private void jPasswordField_logInFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_logInFocusGained
        // TODO add your handling code here:
        
        String LogInPassword = String.valueOf(jPasswordField_logIn.getPassword());
        
        if ( LogInPassword.trim().toLowerCase().equals("password"))
        {
            jPasswordField_logIn.setText("");
            jPasswordField_logIn.setForeground(Color.black);
                  
        }
            
        
    }//GEN-LAST:event_jPasswordField_logInFocusGained

    private void jPasswordField_logInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_logInFocusLost
        // TODO add your handling code here:
        
        String LogInPassword = String.valueOf(jPasswordField_logIn.getPassword());

        
        if (LogInPassword.trim().equals("") || 
            LogInPassword.trim().toLowerCase().equals("password") )
            
        {
            
            jPasswordField_logIn.setText("password");
            jPasswordField_logIn.setForeground(new Color(153,153,153));
            
        }
        
        
        
        
    }//GEN-LAST:event_jPasswordField_logInFocusLost

    private void jLabel2_closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_closeButtonMouseClicked

        // TODO add your handling code here:
        
        System.exit(0);
        
        
    }//GEN-LAST:event_jLabel2_closeButtonMouseClicked

    private void logintombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintombolActionPerformed
        // TODO add your handling code here:
        
        PreparedStatement PreparedStatement;
        ResultSet ResultSet;
        
        //get username
        String username = jTextField1_userName.getText();
        
        //get password
        String password = String.valueOf(jPasswordField_logIn.getPassword());
        
        //query to SQL database
        String query = "SELECT * FROM `Tabel_Data_mahasiswa` WHERE `usernameid` = ? AND `password` = ?";
                // show a message if the username or the password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Masukan username", "Empty Username", 2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Masukan password", "Empty Password", 2);
        }
        else{
            
            try {
           Connection conn = (Connection) DBConnection.connectDatabase();    

            PreparedStatement = conn.prepareStatement(query);
            
            PreparedStatement.setString(1, username);
            PreparedStatement.setString(2, password);
            ResultSet = PreparedStatement.executeQuery();
            
                if (ResultSet.next()) {
                    // show a new form  
//                    try {
//                        PreparedStatement stmt = conn.prepareStatement("SELECT Nama Tabel_Data_mahasiswa WHERE usernameid=?");
//
//                        stmt.setString(1, username);
//                        ResultSet rs = stmt.executeQuery();
//                        if (rs.next()) {
//                            String nama = rs.getString("Nama");
//                            // Tampilkan nilai                
//                            Home20.textusername.setText(nama);
//                        }
                        Home20 form = new Home20();
                        form.setVisible(true);
                       
                        // close the current form(login form)
                        this.dispose();
//                    } catch (SQLException ex) {
//                        System.out.println(ex);
//                    }
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "password / username tidak ada","Login Error",2);
            }
            
        
            
        }   catch (SQLException ex) {
                Logger.getLogger(logInMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_logintombolActionPerformed

    private void jButton1_LogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_LogIn1ActionPerformed
        // TODO add your handling code here:
        registration regis=new registration();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1_LogIn1ActionPerformed

    private void tomboladminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboladminActionPerformed
        // TODO add your handling code here:
        if(jTextField1_userName.getText().equals(usernameadmin)&& jPasswordField_logIn.getText().equals(passwordadmin)){
        Pilihan_admin data=new Pilihan_admin();
        data.setVisible(true);
        data.pack();
        data.setLocationRelativeTo(null);
        this.dispose();
        }else{
       JOptionPane.showMessageDialog(null, "password / usernameadmin gagal","Login Error",2);
    
        }
    }//GEN-LAST:event_tomboladminActionPerformed

    private void jTextField1_userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_userNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          String input = jTextField1_userName.getText();
         if (input.equals("admin")) {
          logintombol.setVisible(false);
          tomboladmin.setVisible(true);
         }else{
         logintombol.setVisible(true);
          tomboladmin.setVisible(false);
         }
      }  
        
    }//GEN-LAST:event_jTextField1_userNameKeyPressed

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
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_LogIn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_closeButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_logIn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField jTextField1_userName;
    private javax.swing.JButton logintombol;
    private javax.swing.JButton tomboladmin;
    // End of variables declaration//GEN-END:variables
}
