/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author Nahomi
 */
public class splash1 extends javax.swing.JFrame {

    /**
     * Creates new form splash1
     */
    double i=50, j=1;
    cargar hilo;
    public splash1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Progreso.setUI(new BasicProgressBarUI(){
            protected void paintDeterminate(Graphics g, JComponent jc)
                {
                     Graphics2D g2d = (Graphics2D)g;
                     int ancho = Progreso.getWidth();
                     int alto = Progreso.getHeight();    
                     
                     int espAncho = ancho ;
                     int espAlto = alto ;
                     
                     double porcentajep = Progreso.getPercentComplete();
                     
                     espAncho = (int) (espAncho*porcentajep);
                     g2d.setColor(new Color(134, 238, 225));
                     Rectangle p1 = new Rectangle(3,3,espAncho, espAlto);
                     g2d.fill(p1);
                }
        });
        AWTUtilities.setWindowOpaque(this,false);
        hilo = new cargar(getProgreso());
        hilo.start();
        hilo = null;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progreso = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Progreso.setForeground(new java.awt.Color(0, 255, 255));
        Progreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgresoStateChanged(evt);
            }
        });
        getContentPane().add(Progreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 360, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/splashb.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgresoStateChanged
        if(Progreso.getValue()==i)
        {
            if(j!=101)
            {
                AWTUtilities.setWindowOpacity(this, Float.valueOf((100-j)/100+"f"));
                i++;
                j+=2;
            }
        }
        if(Progreso.getValue()==100)
        {
            this.dispose();
            Login l = new Login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_ProgresoStateChanged

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
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(splash1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new splash1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Progreso
     */
    public javax.swing.JProgressBar getProgreso() {
        return Progreso;
    }

    /**
     * @param Progreso the Progreso to set
     */
    public void setProgreso(javax.swing.JProgressBar Progreso) {
        this.Progreso = Progreso;
    }
}