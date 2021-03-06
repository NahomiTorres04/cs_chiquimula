/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import clases.usuario;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import static java.awt.image.ImageObserver.SOMEBITS;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.apache.commons.codec.digest.DigestUtils;
import rojerusan.RSNotifyFade;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class Login extends javax.swing.JFrame {
    int x, y;
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
        cmbusuario.setModel(us.mostrarU());
    }
    private void transparencia()
    {
        btnminimizar.setOpaque(false);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btncerrar.setOpaque(false);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btnminimizar1.setOpaque(false);
        btnminimizar1.setBorderPainted(false);
        btnminimizar1.setContentAreaFilled(false);
        btncerrar1.setOpaque(false);
        btncerrar1.setBorderPainted(false);
        btncerrar1.setContentAreaFilled(false);
        jPanel2.setBackground(new Color(0,0,0,0));
        cmbusuario.setBackground(new Color(0,0,0,0));
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
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        RSPPrincipal = new rojerusan.RSPanelsSlider();
        jpingresar = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnminimizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pswcon = new javax.swing.JPasswordField();
        lbIngresar = new javax.swing.JLabel();
        cmbusuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jpRegistrar = new javax.swing.JPanel();
        btnminimizar1 = new javax.swing.JButton();
        btncerrar1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtUsuarioN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswVContrasenia = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        pswContrasenia = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtApellidoN = new javax.swing.JTextField();
        txtNombreN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lbRegistrar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
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
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelHora1.setFont(new java.awt.Font("Roboto Bold", 1, 48)); // NOI18N
        jPanel1.add(rSLabelHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 350, 100));

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelFecha1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        jPanel1.add(rSLabelFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, -1, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Bienvenido");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 290, 120));

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/logo-24131_960_720.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -10, 1040, 780));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/0ff4a61bd6b090ea9e8d50d498eca17f.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 0, 510, 750));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(517, 700));
        jPanel3.setLayout(new java.awt.CardLayout());

        RSPPrincipal.setMinimumSize(new java.awt.Dimension(517, 700));

        jpingresar.setBackground(new java.awt.Color(255, 255, 255));
        jpingresar.setName("jpingresar"); // NOI18N
        jpingresar.setPreferredSize(new java.awt.Dimension(517, 700));
        jpingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        jpingresar.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 57));

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        jpingresar.add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 57));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel16.setText("Usuario");
        jpingresar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel17.setText("Contraseña");
        jpingresar.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        pswcon.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        pswcon.setText("jPasswordField2");
        pswcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pswcon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswconFocusGained(evt);
            }
        });
        pswcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pswconMouseClicked(evt);
            }
        });
        pswcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswconActionPerformed(evt);
            }
        });
        pswcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswconKeyPressed(evt);
            }
        });
        jpingresar.add(pswcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        lbIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbIngresarMouseClicked(evt);
            }
        });
        lbIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbIngresarKeyPressed(evt);
            }
        });
        jpingresar.add(lbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 250, 50));

        cmbusuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        cmbusuario.setForeground(new java.awt.Color(0, 52, 102));
        cmbusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpingresar.add(cmbusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/login2.png"))); // NOI18N
        jpingresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 450, 680));

        RSPPrincipal.add(jpingresar, "card2");

        jpRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistrar.setName("jpRegistrar"); // NOI18N
        jpRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizar1MouseClicked(evt);
            }
        });
        jpRegistrar.add(btnminimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 13, -1, 57));

        btncerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrar1MouseClicked(evt);
            }
        });
        jpRegistrar.add(btncerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 13, -1, 57));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel10.setText("Usuario");
        jpRegistrar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtUsuarioN.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtUsuarioN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpRegistrar.add(txtUsuarioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 320, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel2.setText("Verificar contraseña");
        jpRegistrar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        pswVContrasenia.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        pswVContrasenia.setText("jPasswordField2");
        pswVContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pswVContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswVContraseniaFocusGained(evt);
            }
        });
        jpRegistrar.add(pswVContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 320, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel13.setText("Apellidos");
        jpRegistrar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        pswContrasenia.setFont(new java.awt.Font("Yu Gothic UI", 0, 15)); // NOI18N
        pswContrasenia.setText("jPasswordField2");
        pswContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pswContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswContraseniaFocusGained(evt);
            }
        });
        jpRegistrar.add(pswContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel14.setText("Contraseña");
        jpRegistrar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        txtApellidoN.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtApellidoN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpRegistrar.add(txtApellidoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 160, 30));

        txtNombreN.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtNombreN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpRegistrar.add(txtNombreN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel15.setText("Nombres");
        jpRegistrar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lbRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRegistrarMouseClicked(evt);
            }
        });
        jpRegistrar.add(lbRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 240, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/registro.png"))); // NOI18N
        jpRegistrar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 450, 680));

        RSPPrincipal.add(jpRegistrar, "card3");

        jPanel3.add(RSPPrincipal, "card2");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 20, 450, 680));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        cbtning1.setBackground(new java.awt.Color(53, 190, 226));
        p2registrar.add(cbtning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/1reg.png"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        p2registrar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 180));

        cbtnreg1.setBackground(new java.awt.Color(255, 255, 255));
        cbtnreg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/drunknown.png"))); // NOI18N
        cbtnreg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbtnreg1MouseClicked(evt);
            }
        });
        p2registrar.add(cbtnreg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, -1, -1));

        jLabel6.setBackground(new java.awt.Color(53, 190, 226));
        jLabel6.setOpaque(true);
        p2registrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 140));

        RSPRegistrar.add(p2registrar, "card3");

        p1registrar.setBackground(new java.awt.Color(255, 255, 255));
        p1registrar.setName("p1registrar"); // NOI18N
        p1registrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/reg.png"))); // NOI18N
        p1registrar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -15, 200, -1));

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

        p2ingresar.setBackground(new java.awt.Color(53, 190, 226));
        p2ingresar.setName("p2ingresar"); // NOI18N
        p2ingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/ing.png"))); // NOI18N
        p2ingresar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -3, 200, 480));

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

        jLabel4.setBackground(new java.awt.Color(53, 190, 226));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/1ing.png"))); // NOI18N
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

        cbtning2.setBackground(new java.awt.Color(53, 190, 226));
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 49, 1240, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void btnminimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizar1MouseClicked

    private void btncerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar1MouseClicked
        this.dispose();
        System.exit(0);
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
        p2ingresar.setBackground(new Color(53, 190, 226));
        RSPIngresar.setPanelSlider((int)2.6,p1ingresar, RSPanelsSlider.DIRECT.UP);
        RSPPrincipal.setPanelSlider((int)2.6,jpRegistrar, RSPanelsSlider.DIRECT.UP);
    }//GEN-LAST:event_btnregistrar1MouseClicked

    private void btnregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregistrarMouseClicked

    }//GEN-LAST:event_btnregistrarMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lbRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRegistrarMouseClicked
        String nombre = txtNombreN.getText();
        String apellido = txtApellidoN.getText();
        String usuario = txtUsuarioN.getText();
        String psw = pswContrasenia.getText();
        String vpsw = pswVContrasenia.getText();
        if(psw.equals(vpsw))
        {
            psw = DigestUtils.md5Hex(psw);
            if(us.ingresar(nombre, apellido, usuario, psw))
            {
                new rojerusan.RSNotifyFade("¡Excelente!", "Usuario Ingresado Correctamente", Color.WHITE, Color.BLACK, Color.BLACK, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                cmbusuario.setModel(us.mostrarU());
            } else {
                new rojerusan.RSNotifyFade("¡ERROR!", "Error al ingresar usuario", Color.white, Color.black, Color.black, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        } else {
            new rojerusan.RSNotifyFade("¡ERROR!", "las contraseñas no coinciden", Color.white, Color.black, Color.black, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_lbRegistrarMouseClicked

    private void pswconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswconMouseClicked
        
    }//GEN-LAST:event_pswconMouseClicked

    private void pswContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswContraseniaFocusGained
        pswContrasenia.setText("");
    }//GEN-LAST:event_pswContraseniaFocusGained

    private void pswVContraseniaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswVContraseniaFocusGained
        pswVContrasenia.setText("");
    }//GEN-LAST:event_pswVContraseniaFocusGained

    private void pswconFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswconFocusGained
        pswcon.setText("");
    }//GEN-LAST:event_pswconFocusGained

    private void lbIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbIngresarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbIngresarKeyPressed

    private void lbIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIngresarMouseClicked
        iniciosesion();
    }//GEN-LAST:event_lbIngresarMouseClicked

    private void pswconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswconKeyPressed
        char c = evt.getKeyChar();
        if (c == 10) {
            iniciosesion();
        }
    }//GEN-LAST:event_pswconKeyPressed

    private void pswconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswconActionPerformed
    public void iniciosesion()
    {
        String pass = DigestUtils.md5Hex(pswcon.getText());
        if(us.verificarContrasenia(pass, cmbusuario.getSelectedItem().toString()))
        {
            this.dispose();
            Interfaz obj = new Interfaz();
            obj.setVisible(true);
        } else {
            new rojerusan.RSNotifyFade("¡ERROR!", "La contraseña es incorrecta, ingrese de nuevo", Color.white, Color.black, Color.black, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            pswcon.setText("");
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

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
    private javax.swing.JComboBox<String> cmbusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel lbIngresar;
    private javax.swing.JLabel lbRegistrar;
    private javax.swing.JPanel p1ingresar;
    private javax.swing.JPanel p1registrar;
    private javax.swing.JPanel p2ingresar;
    private javax.swing.JPanel p2registrar;
    private javax.swing.JPasswordField pswContrasenia;
    private javax.swing.JPasswordField pswVContrasenia;
    private javax.swing.JPasswordField pswcon;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTextField txtApellidoN;
    private javax.swing.JTextField txtNombreN;
    private javax.swing.JTextField txtUsuarioN;
    // End of variables declaration//GEN-END:variables
}
