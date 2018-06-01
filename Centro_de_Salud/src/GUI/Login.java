/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import clases.usuario;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class Login extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    private final usuario us;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        transparencia();
        //Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width, this.getBounds().height,35,35);
        //AWTUtilities.setComponentMixingCutoutShape(this.jPanel1, forma);
        AWTUtilities.setWindowOpaque(this, false);
        us = new usuario();
    }
    private void transparencia()
    {
        btnminimizar.setOpaque(false);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btncerrar.setOpaque(false);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        jPanel2.setBackground(new Color(0,0,0,0));
        btningresar2.setOpaque(false);
        btningresar2.setBorderPainted(false);
        btningresar2.setContentAreaFilled(false);
        btnregistrar.setOpaque(false);
        btnregistrar.setBorderPainted(false);
        btnregistrar.setContentAreaFilled(false);
        btningresar1.setOpaque(false);
        btningresar1.setBorderPainted(false);
        btningresar1.setContentAreaFilled(false);
        btnregistrar1.setOpaque(false);
        btnregistrar1.setBorderPainted(false);
        btnregistrar1.setContentAreaFilled(false);
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
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        RSPPrincipal = new rojerusan.RSPanelsSlider();
        jpingresar = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpRegistrar = new javax.swing.JPanel();
        btnminimizar1 = new javax.swing.JButton();
        btncerrar1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        RSPRegistrar = new rojerusan.RSPanelsSlider();
        p2registrar = new javax.swing.JPanel();
        btnregistrar1 = new javax.swing.JButton();
        btningresar1 = new javax.swing.JButton();
        cbtning1 = new rojerusan.RSMaterialButtonCircle();
        jLabel3 = new javax.swing.JLabel();
        cbtnreg1 = new rojerusan.RSMaterialButtonCircle();
        jLabel6 = new javax.swing.JLabel();
        p1registrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        RSPIngresar = new rojerusan.RSPanelsSlider();
        p2ingresar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        p1ingresar = new javax.swing.JPanel();
        btnregistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbtnreg = new rojerusan.RSMaterialButtonCircle();
        jLabel4 = new javax.swing.JLabel();
        btningresar2 = new javax.swing.JButton();
        cbtning2 = new rojerusan.RSMaterialButtonCircle();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 52, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelHora1.setFont(new java.awt.Font("Roboto Bold", 1, 48)); // NOI18N
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 300, 100));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        jPanel1.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, 510, 750));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        jpingresar.setBackground(new java.awt.Color(255, 255, 255));
        jpingresar.setName("jpingresar"); // NOI18N
        jpingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px.png"))); // NOI18N
        btncerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px.png"))); // NOI18N
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        jpingresar.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 57));

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Compress_35px.png"))); // NOI18N
        btnminimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Compress_55px.png"))); // NOI18N
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        jpingresar.add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 57));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/login.png"))); // NOI18N
        jpingresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 470, 640));

        RSPPrincipal.add(jpingresar, "card2");

        jpRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistrar.setName("jpRegistrar"); // NOI18N

        btnminimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Compress_35px.png"))); // NOI18N
        btnminimizar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Compress_55px.png"))); // NOI18N
        btnminimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizar1MouseClicked(evt);
            }
        });

        btncerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px.png"))); // NOI18N
        btncerrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px.png"))); // NOI18N
        btncerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpRegistrarLayout = new javax.swing.GroupLayout(jpRegistrar);
        jpRegistrar.setLayout(jpRegistrarLayout);
        jpRegistrarLayout.setHorizontalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistrarLayout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(btnminimizar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jpRegistrarLayout.setVerticalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnminimizar1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btncerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(580, Short.MAX_VALUE))
        );

        RSPPrincipal.add(jpRegistrar, "card3");

        jPanel3.add(RSPPrincipal, "card2");

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 520, 650));

        p2registrar.setBackground(new java.awt.Color(0, 52, 102));
        p2registrar.setName("p2registrar"); // NOI18N
        p2registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Up_52px_1.png"))); // NOI18N
        btnregistrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Up_62px_2.png"))); // NOI18N
        btnregistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregistrar1MouseClicked(evt);
            }
        });
        p2registrar.add(btnregistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 100, 90, 50));

        btningresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Down_52px_1.png"))); // NOI18N
        btningresar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Down_62px_1.png"))); // NOI18N
        p2registrar.add(btningresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 135, 80, 50));

        cbtning1.setBackground(new java.awt.Color(0, 52, 102));
        p2registrar.add(cbtning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGÍSTRATE");
        jLabel3.setOpaque(true);
        p2registrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 180));

        cbtnreg1.setBackground(new java.awt.Color(255, 255, 255));
        cbtnreg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/drunknown.png"))); // NOI18N
        cbtnreg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbtnreg1MouseClicked(evt);
            }
        });
        p2registrar.add(cbtnreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 52, 102));
        jLabel6.setOpaque(true);
        p2registrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 140));

        RSPRegistrar.add(p2registrar, "card3");

        p1registrar.setBackground(new java.awt.Color(255, 255, 255));
        p1registrar.setName("p1registrar"); // NOI18N
        p1registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGÍSTRATE");
        p1registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 100));

        RSPRegistrar.add(p1registrar, "card2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(RSPRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RSPRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, 320));

        p2ingresar.setBackground(new java.awt.Color(0, 52, 102));
        p2ingresar.setName("p2ingresar"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("INGRESAR");

        javax.swing.GroupLayout p2ingresarLayout = new javax.swing.GroupLayout(p2ingresar);
        p2ingresar.setLayout(p2ingresarLayout);
        p2ingresarLayout.setHorizontalGroup(
            p2ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2ingresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p2ingresarLayout.setVerticalGroup(
            p2ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2ingresarLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        RSPIngresar.add(p2ingresar, "card3");

        p1ingresar.setBackground(new java.awt.Color(255, 255, 255));
        p1ingresar.setName("p1ingresar"); // NOI18N
        p1ingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Up_52px_1.png"))); // NOI18N
        btnregistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Up_62px_2.png"))); // NOI18N
        btnregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregistrarMouseClicked(evt);
            }
        });
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        p1ingresar.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 140, 90, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        p1ingresar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 190, 110, 100));

        cbtnreg.setBackground(new java.awt.Color(255, 255, 255));
        cbtnreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/drunknown.png"))); // NOI18N
        cbtnreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbtnregMouseClicked(evt);
            }
        });
        p1ingresar.add(cbtnreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 52, 102));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INGRESAR");
        jLabel4.setOpaque(true);
        p1ingresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 190));

        btningresar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Down_52px_1.png"))); // NOI18N
        btningresar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Sort_Down_62px_1.png"))); // NOI18N
        btningresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btningresar2MouseClicked(evt);
            }
        });
        p1ingresar.add(btningresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 190, 80, 50));

        cbtning2.setBackground(new java.awt.Color(0, 52, 102));
        p1ingresar.add(cbtning2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel7.setText("jLabel7");
        p1ingresar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        RSPIngresar.add(p1ingresar, "card2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RSPIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(RSPIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 330));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 1290, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        this.dispose();
        //System.exit(WIDTH);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void btnminimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnminimizar1MouseClicked

    private void btncerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncerrar1MouseClicked

    private void cbtnregMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbtnregMouseClicked
        
    }//GEN-LAST:event_cbtnregMouseClicked

    private void cbtnreg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbtnreg1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbtnreg1MouseClicked

    private void btningresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btningresar2MouseClicked
     
        RSPIngresar.setPanelSlider((int) 1.2,p2ingresar, RSPanelsSlider.DIRECT.DOWN);
        p1registrar.setBackground(Color.white);
        RSPRegistrar.setPanelSlider((int) 2.6,p2registrar, RSPanelsSlider.DIRECT.DOWN);
        RSPPrincipal.setPanelSlider((int) 2.6,jpingresar, RSPanelsSlider.DIRECT.DOWN);
    }//GEN-LAST:event_btningresar2MouseClicked

    private void btnregistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregistrar1MouseClicked
        RSPRegistrar.setPanelSlider((int) 1.2,p1registrar, RSPanelsSlider.DIRECT.UP);
        p2ingresar.setBackground(new Color(0,52,102));
        RSPIngresar.setPanelSlider((int)2.6,p1ingresar, RSPanelsSlider.DIRECT.UP);
        RSPPrincipal.setPanelSlider((int)2.6,jpRegistrar, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnregistrar1MouseClicked

    private void btnregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregistrarMouseClicked

    }//GEN-LAST:event_btnregistrarMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSPanelsSlider RSPIngresar;
    private rojerusan.RSPanelsSlider RSPPrincipal;
    private rojerusan.RSPanelsSlider RSPRegistrar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncerrar1;
    private javax.swing.JButton btningresar1;
    private javax.swing.JButton btningresar2;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnminimizar1;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnregistrar1;
    private rojerusan.RSMaterialButtonCircle cbtning1;
    private rojerusan.RSMaterialButtonCircle cbtning2;
    private rojerusan.RSMaterialButtonCircle cbtnreg;
    private rojerusan.RSMaterialButtonCircle cbtnreg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jpRegistrar;
    private javax.swing.JPanel jpingresar;
    private javax.swing.JPanel p1ingresar;
    private javax.swing.JPanel p1registrar;
    private javax.swing.JPanel p2ingresar;
    private javax.swing.JPanel p2registrar;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
