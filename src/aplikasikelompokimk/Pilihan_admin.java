/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikelompokimk;

import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author adam
 */
public class Pilihan_admin extends javax.swing.JFrame {

    /**
     * Creates new form Pilihan_admin
     */
    public Pilihan_admin() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cekpendaftaran = new javax.swing.JPanel();
        alurjlabel = new javax.swing.JLabel();
        mahasiswaaktif = new javax.swing.JPanel();
        daftarlabel = new javax.swing.JLabel();
        pembayaran = new javax.swing.JPanel();
        bantulabel = new javax.swing.JLabel();
        pnlTop = new javax.swing.JPanel();
        pnlActions = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 51));

        jLabel2.setFont(new java.awt.Font("Manjari", 1, 24)); // NOI18N
        jLabel2.setText("UNIVERSITAS AKAGAMY");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelompokimk/gambar/loko kampus.png"))); // NOI18N

        cekpendaftaran.setBackground(new java.awt.Color(0,0,0,80));
        cekpendaftaran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cekpendaftaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cekpendaftaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cekpendaftaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cekpendaftaranMouseExited(evt);
            }
        });

        alurjlabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        alurjlabel.setText("Cek Pendaftaran");

        javax.swing.GroupLayout cekpendaftaranLayout = new javax.swing.GroupLayout(cekpendaftaran);
        cekpendaftaran.setLayout(cekpendaftaranLayout);
        cekpendaftaranLayout.setHorizontalGroup(
            cekpendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cekpendaftaranLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(alurjlabel)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        cekpendaftaranLayout.setVerticalGroup(
            cekpendaftaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cekpendaftaranLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(alurjlabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mahasiswaaktif.setBackground(new java.awt.Color(0,0,0,80));
        mahasiswaaktif.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mahasiswaaktif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaaktifMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mahasiswaaktifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mahasiswaaktifMouseExited(evt);
            }
        });

        daftarlabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        daftarlabel.setText("Mahasiswa Aktif");

        javax.swing.GroupLayout mahasiswaaktifLayout = new javax.swing.GroupLayout(mahasiswaaktif);
        mahasiswaaktif.setLayout(mahasiswaaktifLayout);
        mahasiswaaktifLayout.setHorizontalGroup(
            mahasiswaaktifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mahasiswaaktifLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(daftarlabel)
                .addGap(33, 33, 33))
        );
        mahasiswaaktifLayout.setVerticalGroup(
            mahasiswaaktifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mahasiswaaktifLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(daftarlabel)
                .addGap(14, 14, 14))
        );

        pembayaran.setBackground(new java.awt.Color(0,0,0,80));
        pembayaran.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembayaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pembayaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pembayaranMouseExited(evt);
            }
        });

        bantulabel.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        bantulabel.setText("Penilaian");

        javax.swing.GroupLayout pembayaranLayout = new javax.swing.GroupLayout(pembayaran);
        pembayaran.setLayout(pembayaranLayout);
        pembayaranLayout.setHorizontalGroup(
            pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(bantulabel)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pembayaranLayout.setVerticalGroup(
            pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pembayaranLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bantulabel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlTop.setBackground(new java.awt.Color(50, 27, 140));
        pnlTop.setPreferredSize(new java.awt.Dimension(1024, 30));
        pnlTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopMouseDragged(evt);
            }
        });
        pnlTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTopMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopMousePressed(evt);
            }
        });
        pnlTop.setLayout(new java.awt.BorderLayout());

        pnlActions.setBackground(new java.awt.Color(50, 27, 140));
        pnlActions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home20/images/icons8_minus_18px_1.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
        });
        pnlActions.add(lblMinimize);

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home20/images/icons8_multiply_18px_1.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });
        pnlActions.add(lblClose);

        pnlTop.add(pnlActions, java.awt.BorderLayout.LINE_END);

        pnlTitle.setBackground(new java.awt.Color(50, 27, 140));
        pnlTitle.setPreferredSize(new java.awt.Dimension(200, 30));
        pnlTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 8));

        lblTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle.setText("Admin ");
        pnlTitle.add(lblTitle);

        pnlTop.add(pnlTitle, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasikelompokimk/gambar/icons8-logout-rounded-up-30 (copy).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(cekpendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(mahasiswaaktif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekpendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahasiswaaktif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int xy, xx;
    private void cekpendaftaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekpendaftaranMouseClicked
        // TODO add your handling code here:
        Cekdata alur= new Cekdata();
        alur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cekpendaftaranMouseClicked

    private void cekpendaftaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekpendaftaranMouseEntered
        // TODO add your handling code here:
        cekpendaftaran.setBackground(new java.awt.Color(255, 255, 255));
        alurjlabel.setForeground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_cekpendaftaranMouseEntered

    private void cekpendaftaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekpendaftaranMouseExited
        // TODO add your handling code here:
        cekpendaftaran.setBackground(new java.awt.Color(0, 0, 0, 80));
        alurjlabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_cekpendaftaranMouseExited

    private void mahasiswaaktifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaaktifMouseClicked
        // TODO add your handling code here:
        Halaman_Mahasiswa_Aktif daftar=new Halaman_Mahasiswa_Aktif();
        daftar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mahasiswaaktifMouseClicked

    private void mahasiswaaktifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaaktifMouseEntered
        // TODO add your handling code here:
        mahasiswaaktif.setBackground(new java.awt.Color(255, 255, 255));
        daftarlabel.setForeground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_mahasiswaaktifMouseEntered

    private void mahasiswaaktifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaaktifMouseExited
        // TODO add your handling code here:
        mahasiswaaktif.setBackground(new java.awt.Color(0, 0, 0, 80));
        daftarlabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_mahasiswaaktifMouseExited

    private void pembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranMouseClicked
        // TODO add your handling code here:
        Halaman_matkul matkul=new Halaman_matkul();
        matkul.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pembayaranMouseClicked

    private void pembayaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranMouseEntered
        // TODO add your handling code here:
        pembayaran.setBackground(new java.awt.Color(255, 255, 255));
        bantulabel.setForeground(new java.awt.Color(102, 204, 0));
    }//GEN-LAST:event_pembayaranMouseEntered

    private void pembayaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembayaranMouseExited
        // TODO add your handling code here:
        pembayaran.setBackground(new java.awt.Color(0, 0, 0, 80));
        bantulabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_pembayaranMouseExited

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        Pilihan_admin.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblCloseMousePressed

    private void pnlTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnlTopMouseDragged

    private void pnlTopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            if (Pilihan_admin.this.getExtendedState() == MAXIMIZED_BOTH) {
                Pilihan_admin.this.setExtendedState(JFrame.NORMAL);
            } else {
                Pilihan_admin.this.setExtendedState(MAXIMIZED_BOTH);
            }
        }
    }//GEN-LAST:event_pnlTopMouseClicked

    private void pnlTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTopMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnlTopMousePressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        logInMenu login=new logInMenu();
        login.setVisible(true);
        login.pack();
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
     jPanel2.setBackground(new java.awt.Color(0, 0, 0, 80));
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
           jPanel2.setBackground(new java.awt.Color(244, 244, 244));
  
    }//GEN-LAST:event_jPanel2MouseExited

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
            java.util.logging.Logger.getLogger(Pilihan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilihan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilihan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilihan_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilihan_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alurjlabel;
    private javax.swing.JLabel bantulabel;
    private javax.swing.JPanel cekpendaftaran;
    private javax.swing.JLabel daftarlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mahasiswaaktif;
    private javax.swing.JPanel pembayaran;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JPanel pnlTop;
    // End of variables declaration//GEN-END:variables
}
