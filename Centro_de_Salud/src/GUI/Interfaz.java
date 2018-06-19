/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import clases.ReporteInventario;
import clases.bien;
import clases.departamento;
import clases.empleado;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;
import rojerusan.RSPanelsSlider;

/**
 *
 * @author Nahomi
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    private final bien bi;
    private final departamento dep;
    private final empleado emp;
    private boolean alergiasEmpleado = false;
    public Interfaz() {
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width, this.getBounds().height,35,35);
        AWTUtilities.setWindowShape(this, forma);
        this.setLocationRelativeTo(null);
        transparencia();
        bi = new bien();
        dep = new departamento();
        emp = new empleado();
        cmbDep.setModel(dep.mostrarDepartamentos());
    }
    private void transparencia()
    {
        btnminimizar.setOpaque(false);
        btnminimizar.setBorderPainted(false);
        btnminimizar.setContentAreaFilled(false);
        btncerrar.setOpaque(false);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        cmbFungible.setBackground(new Color(0,0,0,0));
        txtDes.setBackground(new Color(0,0,0,0));
        txtPrecio.setBackground(new Color(0,0,0,0));
        cmbDep.setBackground(new Color(0,0,0,0));
        cmbDonado.setBackground(new Color(0,0,0,0));
        txtCodigo.setBackground(new Color(0,0,0,0));
        cmbEstado.setBackground(new Color(0,0,0,0));
        txtCant.setBackground(new Color(0,0,0,0));
        txtsueldo.setBackground(new Color(0,0,0,0));
        txtnombreE.setBackground(new Color(0,0,0,0));
        cmbclasificacion.setBackground(new Color(0,0,0,0));
        txtmunicipio.setBackground(new Color(0,0,0,0));
        cmbdepartamento.setBackground(new Color(0,0,0,0));
        cmbrenglonp.setBackground(new Color(0,0,0,0));
        txtapellidoE.setBackground(new Color(0,0,0,0));
        cmblugar.setBackground(new Color(0,0,0,0));
        cmbtipo.setBackground(new Color(0,0,0,0));
        txtcargo.setBackground(new Color(0,0,0,0));
        txtpuesto.setBackground(new Color(0,0,0,0));
        txtdpi.setBackground(new Color(0,0,0,0));
        btnhome.setOpaque(false);
        btnhome.setBorderPainted(false);
        btnhome.setContentAreaFilled(false);
        btn_Inp.setOpaque(false);
        btn_Inp.setBorderPainted(false);
        btn_Inp.setContentAreaFilled(false);
        btnatras.setOpaque(false);
        btnatras.setBorderPainted(false);
        btnatras.setContentAreaFilled(false);
        btnguardar.setOpaque(false);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnminimizar1.setOpaque(false);
        btnminimizar1.setBorderPainted(false);
        btnminimizar1.setContentAreaFilled(false);
        btncerrar1.setOpaque(false);
        btncerrar1.setBorderPainted(false);
        btncerrar1.setContentAreaFilled(false);
        btn_IngP.setOpaque(false);
        btn_IngP.setBorderPainted(false);
        btn_IngP.setContentAreaFilled(false);
        Bcodigo.setBackground(new Color(0,0,0,0));
        btnminimizar2.setOpaque(false);
        btnminimizar2.setBorderPainted(false);
        btnminimizar2.setContentAreaFilled(false);
        btncerrar2.setOpaque(false);
        btncerrar2.setBorderPainted(false);
        btncerrar2.setContentAreaFilled(false);
        btnhome1.setOpaque(false);
        btnhome1.setBorderPainted(false);
        btnhome1.setContentAreaFilled(false);
        menuE.setOpaque(false);
        menuE.setBorderPainted(false);
        menuE.setContentAreaFilled(false);
        btnMenuB.setOpaque(false);
        btnMenuB.setBorderPainted(false);
        btnMenuB.setContentAreaFilled(false);
        btnVerI.setOpaque(false);
        btnVerI.setBorderPainted(false);
        btnVerI.setContentAreaFilled(false);
        btnPacientes.setOpaque(false);
        btnPacientes.setBorderPainted(false);
        btnPacientes.setContentAreaFilled(false);
    }
    private void Limpiar()
    {
        txtDes.setText("");
        txtPrecio.setText("");
        txtCodigo.setText("");
        txtCant.setText("");
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
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        menu = new javax.swing.JPanel();
        btnminimizar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_IngP = new javax.swing.JButton();
        btnPacientes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rSMaterialButtonCircle8 = new rojerusan.RSMaterialButtonCircle();
        btnVerI = new javax.swing.JButton();
        rSMaterialButtonCircle4 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle7 = new rojerusan.RSMaterialButtonCircle();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSMaterialButtonCircle9 = new rojerusan.RSMaterialButtonCircle();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IngresarInventario = new javax.swing.JPanel();
        cmbFungible = new javax.swing.JComboBox<>();
        txtDes = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        cmbDep = new javax.swing.JComboBox<>();
        cmbDonado = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        txtCant = new javax.swing.JTextField();
        btn_Inp = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        btnminimizar1 = new javax.swing.JButton();
        btncerrar1 = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        rSMaterialButtonCircle3 = new rojerusan.RSMaterialButtonCircle();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        VerInventario = new javax.swing.JPanel();
        rSPanelsSlider2 = new rojerusan.RSPanelsSlider();
        InventarioCod = new javax.swing.JPanel();
        scrollgai1 = new javax.swing.JScrollPane();
        tableInventario = new rojerusan.RSTableMetro();
        Bcodigo = new javax.swing.JTextField();
        btnhome1 = new javax.swing.JButton();
        btnminimizar2 = new javax.swing.JButton();
        btncerrar2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        rSPanelsSlider3 = new rojerusan.RSPanelsSlider();
        Magia = new javax.swing.JPanel();
        menuE = new javax.swing.JButton();
        rSMaterialButtonCircle6 = new rojerusan.RSMaterialButtonCircle();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPMenuE = new javax.swing.JPanel();
        buenEstado = new javax.swing.JLabel();
        malEstado = new javax.swing.JLabel();
        Donado = new javax.swing.JLabel();
        noDonado = new javax.swing.JLabel();
        Fungible = new javax.swing.JLabel();
        btnMenuB = new javax.swing.JButton();
        NoFungible = new javax.swing.JLabel();
        rSMaterialButtonCircle5 = new rojerusan.RSMaterialButtonCircle();
        Departamento = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnreporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Empleado = new javax.swing.JPanel();
        btnminimizar3 = new javax.swing.JButton();
        btncerrar3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        txtnombreE = new javax.swing.JTextField();
        rSMaterialButtonRectangle5 = new rojerusan.RSMaterialButtonRectangle();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbclasificacion = new javax.swing.JComboBox<>();
        txtmunicipio = new javax.swing.JTextField();
        cmbdepartamento = new javax.swing.JComboBox<>();
        cmbrenglonp = new javax.swing.JComboBox<>();
        txtapellidoE = new javax.swing.JTextField();
        txtdpi = new javax.swing.JTextField();
        rSMaterialButtonRectangle6 = new rojerusan.RSMaterialButtonRectangle();
        cmblugar = new javax.swing.JTextField();
        cmbtipo = new javax.swing.JComboBox<>();
        txtcargo = new javax.swing.JTextField();
        txtpuesto = new javax.swing.JTextField();
        txttelE = new javax.swing.JTextField();
        fechadE = new rojeru_san.componentes.RSDateChooser();
        fechaiE = new rojeru_san.componentes.RSDateChooser();
        jLabel32 = new javax.swing.JLabel();
        rSMaterialButtonRectangle17 = new rojerusan.RSMaterialButtonRectangle();
        jLabel33 = new javax.swing.JLabel();
        rSMaterialButtonRectangle18 = new rojerusan.RSMaterialButtonRectangle();
        jLabel34 = new javax.swing.JLabel();
        rSMaterialButtonRectangle19 = new rojerusan.RSMaterialButtonRectangle();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        rSMaterialButtonRectangle20 = new rojerusan.RSMaterialButtonRectangle();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        rSMaterialButtonRectangle21 = new rojerusan.RSMaterialButtonRectangle();
        jLabel37 = new javax.swing.JLabel();
        rSMaterialButtonRectangle22 = new rojerusan.RSMaterialButtonRectangle();
        jLabel38 = new javax.swing.JLabel();
        rSMaterialButtonRectangle23 = new rojerusan.RSMaterialButtonRectangle();
        jLabel39 = new javax.swing.JLabel();
        rSMaterialButtonRectangle24 = new rojerusan.RSMaterialButtonRectangle();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        rSMaterialButtonRectangle25 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle26 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle27 = new rojerusan.RSMaterialButtonRectangle();
        jLabel43 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle3 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle28 = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle29 = new rojerusan.RSMaterialButtonRectangle();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 780));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setName("menu"); // NOI18N
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizarMouseClicked(evt);
            }
        });
        menu.add(btnminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, 57));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
        });
        menu.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, -1, 57));

        jLabel10.setBackground(new java.awt.Color(0, 54, 102));
        jLabel10.setOpaque(true);
        menu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 60));

        btn_IngP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Add_70px_2.png"))); // NOI18N
        btn_IngP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Add_100px.png"))); // NOI18N
        btn_IngP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IngPMouseClicked(evt);
            }
        });
        menu.add(btn_IngP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 170));

        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_User_Account_70px_1.png"))); // NOI18N
        btnPacientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_User_Account_100px.png"))); // NOI18N
        btnPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPacientesMouseClicked(evt);
            }
        });
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        menu.add(btnPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 160, 170));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_User_Groups_70px.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_User_Groups_100px.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 160, 170));

        rSMaterialButtonCircle8.setBackground(new java.awt.Color(0, 52, 102));
        menu.add(rSMaterialButtonCircle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 160, 170));

        btnVerI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Bulleted_List_70px_1.png"))); // NOI18N
        btnVerI.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Bulleted_List_100px.png"))); // NOI18N
        btnVerI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerIMouseClicked(evt);
            }
        });
        btnVerI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerIActionPerformed(evt);
            }
        });
        menu.add(btnVerI, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 170));

        rSMaterialButtonCircle4.setBackground(new java.awt.Color(0, 52, 102));
        menu.add(rSMaterialButtonCircle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 170));

        rSMaterialButtonCircle7.setBackground(new java.awt.Color(0, 52, 102));
        menu.add(rSMaterialButtonCircle7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 170));

        jLabel16.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel16.setText("Ingresar Empleado");
        menu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 260, 80));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("Ingresar Artículo");
        menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 250, 80));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setText("Ver Inventario");
        menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 210, 80));

        rSMaterialButtonCircle9.setBackground(new java.awt.Color(0, 52, 102));
        menu.add(rSMaterialButtonCircle9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 160, 170));

        jLabel17.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel17.setText("Ingresar Paciente");
        menu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 190, 80));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/menu.png"))); // NOI18N
        menu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 720));

        rSPanelsSlider1.add(menu, "card2");

        IngresarInventario.setBackground(new java.awt.Color(255, 255, 255));
        IngresarInventario.setName("IngresarInventario"); // NOI18N
        IngresarInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbFungible.setBackground(new java.awt.Color(0, 52, 102));
        cmbFungible.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        cmbFungible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        IngresarInventario.add(cmbFungible, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 230, 40));

        txtDes.setColumns(20);
        txtDes.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtDes.setRows(5);
        txtDes.setBorder(null);
        IngresarInventario.add(txtDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 410, 110));

        txtPrecio.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtPrecio.setBorder(null);
        IngresarInventario.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 307, 220, 40));

        cmbDep.setBackground(new java.awt.Color(0, 52, 102));
        cmbDep.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        IngresarInventario.add(cmbDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 516, 410, 30));

        cmbDonado.setBackground(new java.awt.Color(0, 52, 102));
        cmbDonado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        cmbDonado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        IngresarInventario.add(cmbDonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 580, 230, 40));

        txtCodigo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtCodigo.setBorder(null);
        IngresarInventario.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 280, 40));

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Save_70px.png"))); // NOI18N
        btnguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Save_100px.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        IngresarInventario.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 130, 140));

        cmbEstado.setBackground(new java.awt.Color(0, 52, 102));
        cmbEstado.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Malo" }));
        IngresarInventario.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 220, 40));

        txtCant.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        txtCant.setBorder(null);
        IngresarInventario.add(txtCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 220, 40));

        btn_Inp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Add_70px_2.png"))); // NOI18N
        btn_Inp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Add_100px.png"))); // NOI18N
        btn_Inp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_InpMouseClicked(evt);
            }
        });
        IngresarInventario.add(btn_Inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 130, 140));

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Back_Arrow_70px.png"))); // NOI18N
        btnatras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/ingresar/icons8_Back_Arrow_100px.png"))); // NOI18N
        btnatras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnatrasMouseClicked(evt);
            }
        });
        IngresarInventario.add(btnatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1105, 610, 140, 140));

        btnminimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizar1MouseClicked(evt);
            }
        });
        IngresarInventario.add(btnminimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, 57));

        btncerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrar1MouseClicked(evt);
            }
        });
        IngresarInventario.add(btncerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, -1, 57));

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Home_35px.png"))); // NOI18N
        btnhome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Home_55px.png"))); // NOI18N
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });
        IngresarInventario.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 80, 60));

        jLabel11.setBackground(new java.awt.Color(0, 54, 102));
        jLabel11.setOpaque(true);
        IngresarInventario.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 60));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 52, 102));
        IngresarInventario.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 610, 130, 140));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(0, 52, 102));
        IngresarInventario.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, 130, 140));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(0, 52, 102));
        IngresarInventario.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, 130, 140));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setText("Otro Artículo");
        IngresarInventario.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 190, 80));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setText("Guardar Artículo");
        IngresarInventario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 230, 80));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel7.setText("  Ingresar");
        IngresarInventario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 190, 80));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel8.setText(" Regresar");
        IngresarInventario.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, 130, 80));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/ingresara.png"))); // NOI18N
        IngresarInventario.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 720));

        rSPanelsSlider1.add(IngresarInventario, "card3");

        VerInventario.setName("VerInventario"); // NOI18N
        VerInventario.setLayout(new java.awt.CardLayout());

        InventarioCod.setName("InventarioCod"); // NOI18N
        InventarioCod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableInventario = new rojerusan.RSTableMetro(){
            public boolean isCellEditable(int rowIndex, int ColIndex){
                return false;
            }
        };
        tableInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Cantidad", "Precio unitario", "Estado", "Fungible", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableInventario.setColorBackgoundHead(new java.awt.Color(22, 54, 77));
        tableInventario.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tableInventario.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tableInventario.setColorFilasBackgound1(new java.awt.Color(163, 214, 249));
        tableInventario.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tableInventario.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tableInventario.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tableInventario.setColorSelBackgound(new java.awt.Color(22, 54, 77));
        tableInventario.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableInventario.setFuenteFilas(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableInventario.setFuenteFilasSelect(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        tableInventario.setFuenteHead(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        tableInventario.setGrosorBordeFilas(0);
        tableInventario.setGrosorBordeHead(0);
        tableInventario.setRowHeight(22);
        tableInventario.getTableHeader().setReorderingAllowed(false);
        scrollgai1.setViewportView(tableInventario);
        if (tableInventario.getColumnModel().getColumnCount() > 0) {
            tableInventario.getColumnModel().getColumn(4).setHeaderValue("");
            tableInventario.getColumnModel().getColumn(5).setHeaderValue("Fungible");
            tableInventario.getColumnModel().getColumn(6).setHeaderValue("Total");
        }

        InventarioCod.add(scrollgai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 940, 470));

        Bcodigo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        Bcodigo.setBorder(null);
        Bcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BcodigoKeyPressed(evt);
            }
        });
        InventarioCod.add(Bcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 206, 300, 40));

        btnhome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Home_35px.png"))); // NOI18N
        btnhome1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Home_55px.png"))); // NOI18N
        btnhome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhome1MouseClicked(evt);
            }
        });
        InventarioCod.add(btnhome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 0, 80, 60));

        btnminimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizar2MouseClicked(evt);
            }
        });
        InventarioCod.add(btnminimizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, -1, 57));

        btncerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrar2MouseClicked(evt);
            }
        });
        InventarioCod.add(btncerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, -1, 57));

        jButton1.setBackground(new java.awt.Color(0, 52, 102));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver Todo");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        InventarioCod.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 180, 50));

        jLabel14.setBackground(new java.awt.Color(0, 54, 102));
        jLabel14.setOpaque(true);
        InventarioCod.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 60));

        Magia.setName("Magia"); // NOI18N
        Magia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Double_Left_70px.png"))); // NOI18N
        menuE.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Double_Left_100px.png"))); // NOI18N
        menuE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEMouseClicked(evt);
            }
        });
        Magia.add(menuE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 130, 110));

        rSMaterialButtonCircle6.setEnabled(false);
        Magia.add(rSMaterialButtonCircle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 150, 150));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel9.setText("  Otras Opciones");
        Magia.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 220, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/inventario.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        Magia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1012, -201, 1280, 910));

        rSPanelsSlider3.add(Magia, "card2");

        JPMenuE.setBackground(new java.awt.Color(153, 255, 255));
        JPMenuE.setName("JPMenuE"); // NOI18N
        JPMenuE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buenEstado.setBackground(new java.awt.Color(133, 163, 198));
        buenEstado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        buenEstado.setForeground(new java.awt.Color(255, 255, 255));
        buenEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buenEstado.setText("              Buen Estado");
        buenEstado.setOpaque(true);
        buenEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buenEstadoMouseClicked(evt);
            }
        });
        JPMenuE.add(buenEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 70));

        malEstado.setBackground(new java.awt.Color(200, 213, 229));
        malEstado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        malEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        malEstado.setText("               Mal estado");
        malEstado.setOpaque(true);
        malEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                malEstadoMouseClicked(evt);
            }
        });
        JPMenuE.add(malEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 70));

        Donado.setBackground(new java.awt.Color(90, 83, 135));
        Donado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Donado.setForeground(new java.awt.Color(255, 255, 255));
        Donado.setText("                           Donado");
        Donado.setOpaque(true);
        Donado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonadoMouseClicked(evt);
            }
        });
        JPMenuE.add(Donado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 70));

        noDonado.setBackground(new java.awt.Color(72, 118, 170));
        noDonado.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        noDonado.setForeground(new java.awt.Color(255, 255, 255));
        noDonado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noDonado.setText("                No Donado");
        noDonado.setOpaque(true);
        noDonado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noDonadoMouseClicked(evt);
            }
        });
        JPMenuE.add(noDonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 70));

        Fungible.setBackground(new java.awt.Color(34, 3, 73));
        Fungible.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Fungible.setForeground(new java.awt.Color(255, 255, 255));
        Fungible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fungible.setText("               Fungible");
        Fungible.setOpaque(true);
        Fungible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FungibleMouseClicked(evt);
            }
        });
        JPMenuE.add(Fungible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 260, 70));

        btnMenuB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Circled_Right_45px.png"))); // NOI18N
        btnMenuB.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Circled_Right_60px.png"))); // NOI18N
        btnMenuB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuBMouseClicked(evt);
            }
        });
        btnMenuB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBActionPerformed(evt);
            }
        });
        JPMenuE.add(btnMenuB, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 80, 80));

        NoFungible.setBackground(new java.awt.Color(56, 32, 97));
        NoFungible.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        NoFungible.setForeground(new java.awt.Color(255, 255, 255));
        NoFungible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NoFungible.setText("                No Fungible");
        NoFungible.setOpaque(true);
        NoFungible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoFungibleMouseClicked(evt);
            }
        });
        JPMenuE.add(NoFungible, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 70));

        rSMaterialButtonCircle5.setBackground(new java.awt.Color(0, 52, 102));
        rSMaterialButtonCircle5.setToolTipText("");
        rSMaterialButtonCircle5.setEnabled(false);
        JPMenuE.add(rSMaterialButtonCircle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, 70, 70));

        Departamento.setBackground(new java.awt.Color(236, 241, 246));
        Departamento.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Departamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Departamento.setText("               Departamento");
        Departamento.setOpaque(true);
        Departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepartamentoMouseClicked(evt);
            }
        });
        JPMenuE.add(Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 260, 70));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        jLabel15.setText("            Inventario por:");
        jLabel15.setToolTipText("");
        jLabel15.setOpaque(true);
        JPMenuE.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        rSPanelsSlider3.add(JPMenuE, "card3");

        InventarioCod.add(rSPanelsSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 260, 570));

        btnreporte.setBackground(new java.awt.Color(0, 52, 102));
        btnreporte.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        btnreporte.setForeground(new java.awt.Color(255, 255, 255));
        btnreporte.setText("Imprimir");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });
        InventarioCod.add(btnreporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/inventario.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        InventarioCod.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 720));

        rSPanelsSlider2.add(InventarioCod, "card2");

        VerInventario.add(rSPanelsSlider2, "card2");

        rSPanelsSlider1.add(VerInventario, "card4");

        Empleado.setName("Empleado"); // NOI18N
        Empleado.setPreferredSize(new java.awt.Dimension(1280, 780));
        Empleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnminimizar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_35px.png"))); // NOI18N
        btnminimizar3.setBorder(null);
        btnminimizar3.setBorderPainted(false);
        btnminimizar3.setContentAreaFilled(false);
        btnminimizar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Chevron_Down_55px.png"))); // NOI18N
        btnminimizar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizar3MouseClicked(evt);
            }
        });
        Empleado.add(btnminimizar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 70, 57));

        btncerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_35px_1.png"))); // NOI18N
        btncerrar3.setBorder(null);
        btncerrar3.setBorderPainted(false);
        btncerrar3.setContentAreaFilled(false);
        btncerrar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_Cancel_55px_1.png"))); // NOI18N
        btncerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrar3MouseClicked(evt);
            }
        });
        Empleado.add(btncerrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 70, 57));

        jLabel18.setBackground(new java.awt.Color(0, 54, 102));
        jLabel18.setOpaque(true);
        Empleado.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1300, 60));

        txtsueldo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtsueldo.setBorder(null);
        Empleado.add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 280, 30));

        txtnombreE.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtnombreE.setBorder(null);
        Empleado.add(txtnombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 30));

        rSMaterialButtonRectangle5.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle5.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 320, 50));

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel20.setText("Nombres:");
        Empleado.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, 30));

        jLabel23.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel23.setText("Apellidos:");
        Empleado.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, 30));

        cmbclasificacion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        cmbclasificacion.setForeground(new java.awt.Color(0, 52, 102));
        cmbclasificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una clasificación", "Tipo A", "Tipo B" }));
        cmbclasificacion.setEnabled(false);
        Empleado.add(cmbclasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 180, 30));

        txtmunicipio.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtmunicipio.setBorder(null);
        Empleado.add(txtmunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 300, 30));

        cmbdepartamento.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        cmbdepartamento.setForeground(new java.awt.Color(0, 52, 102));
        cmbdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Totonicapán", "Quetzaltenango", "Guatemala", "Izabal", "Petén", "Huehuetenango", "Quiché", "Alta Verapaz", "San Marcos", "Sololá", "Chimaltenango", "Sacatepéquez", "Baja Verapaz", "El Progreso", "Jalapa", "Zacapa", "Chiquimula", "Retalhuleu", "Suchitepéquez", "Escuintla", "Santa Rosa", "Jutiapa" }));
        Empleado.add(cmbdepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 410, -1));

        cmbrenglonp.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        cmbrenglonp.setForeground(new java.awt.Color(0, 52, 102));
        cmbrenglonp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "011", "182", "189", "029", "036" }));
        Empleado.add(cmbrenglonp, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 290, 100, 30));

        txtapellidoE.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtapellidoE.setBorder(null);
        Empleado.add(txtapellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 300, 30));

        txtdpi.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtdpi.setBorder(null);
        Empleado.add(txtdpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 300, 30));

        rSMaterialButtonRectangle6.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle6.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 320, 50));

        cmblugar.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        cmblugar.setBorder(null);
        cmblugar.setEnabled(false);
        Empleado.add(cmblugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 330, 30));

        cmbtipo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        cmbtipo.setForeground(new java.awt.Color(0, 52, 102));
        cmbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centro de Salud", "Puesto de Salud", "Racana", "Territorio I", "Territorio II", "Territorio III", "Territorio IV", "Territorio V", "Territorio VI", "Territorio VII" }));
        cmbtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtipoItemStateChanged(evt);
            }
        });
        Empleado.add(cmbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 270, -1));

        txtcargo.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtcargo.setBorder(null);
        Empleado.add(txtcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 300, 30));

        txtpuesto.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txtpuesto.setBorder(null);
        Empleado.add(txtpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 380, 30));

        txttelE.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        txttelE.setBorder(null);
        Empleado.add(txttelE, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 690, 180, 30));
        Empleado.add(fechadE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 380, 30));
        Empleado.add(fechaiE, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 380, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel32.setText("Municipio:");
        Empleado.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 130, 30));

        rSMaterialButtonRectangle17.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle17.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 320, 50));

        jLabel33.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel33.setText("Departamento:");
        Empleado.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 190, 30));

        rSMaterialButtonRectangle18.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle18.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 430, 50));

        jLabel34.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel34.setText("Tipo:");
        Empleado.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 80, 30));

        rSMaterialButtonRectangle19.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle19.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 290, 50));

        jLabel35.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel35.setText("Clasificación:");
        Empleado.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 160, 30));

        jLabel36.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel36.setText("Lugar:");
        Empleado.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, 90, 30));

        rSMaterialButtonRectangle20.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle20.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, 350, 50));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jRadioButton3.setText("Otro");
        Empleado.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, -1, 30));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jRadioButton4.setText("Otro");
        Empleado.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 570, -1, -1));

        rSMaterialButtonRectangle21.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle21.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 400, 50));

        jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel37.setText("Fecha de deserción:");
        Empleado.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 330, 30));

        rSMaterialButtonRectangle22.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle22.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 400, 50));

        jLabel38.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel38.setText("Emergencia(tel):");
        Empleado.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 690, 200, 30));

        rSMaterialButtonRectangle23.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle23.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 620, 300, 50));

        jLabel39.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel39.setText("Fecha de contraración:");
        Empleado.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 330, 30));

        rSMaterialButtonRectangle24.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle24.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 400, 50));

        jLabel40.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel40.setText("Puesto:");
        Empleado.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 290, 30));

        jLabel41.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel41.setText("Renglón presupuestario:");
        Empleado.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 290, 30));

        jLabel42.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel42.setText("DPI:");
        Empleado.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, 30));

        rSMaterialButtonRectangle25.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle25.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle25, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 320, 50));

        rSMaterialButtonRectangle26.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle26.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle26, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 120, 50));

        rSMaterialButtonRectangle27.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle27.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 200, 50));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 45)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Ingresar");
        Empleado.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 42, 220, 90));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/general/icons8_User_Groups_100px.png"))); // NOI18N
        Empleado.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 53, 110, 120));

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 45)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("empleado");
        Empleado.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 90));

        jLabel21.setBackground(new java.awt.Color(0, 52, 102));
        jLabel21.setOpaque(true);
        Empleado.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 350, 110));

        rSMaterialButtonRectangle1.setText("Alergias");
        rSMaterialButtonRectangle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle1MouseClicked(evt);
            }
        });
        Empleado.add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 180, 70));

        rSMaterialButtonRectangle2.setText("Guardar");
        rSMaterialButtonRectangle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonRectangle2MouseClicked(evt);
            }
        });
        Empleado.add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, 180, 70));

        rSMaterialButtonRectangle3.setText("Imprimir");
        Empleado.add(rSMaterialButtonRectangle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, 180, 70));

        rSMaterialButtonRectangle28.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle28.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 680, 200, 50));

        rSMaterialButtonRectangle29.setBackground(new java.awt.Color(186, 240, 255));
        rSMaterialButtonRectangle29.setEnabled(false);
        Empleado.add(rSMaterialButtonRectangle29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 320, 50));

        jLabel45.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel45.setText("Cargo:");
        Empleado.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 150, 30));

        jLabel46.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        jLabel46.setText("Sueldo:");
        Empleado.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, 90, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondos/ingp.png"))); // NOI18N
        Empleado.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 720));

        rSPanelsSlider1.add(Empleado, "card5");

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rSPanelsSlider1.add(jPanel3, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelsSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String codigo = txtCodigo.getText();
        String descripcion = txtDes.getText();
        int cantidad = Integer.parseInt(txtCant.getText());
        double preciou = Double.parseDouble(txtPrecio.getText());
        double preciot = cantidad*preciou;
        int departamento = dep.seleccionarDepartamento(cmbDep.getSelectedItem().toString());
        boolean estado;
        boolean donado;
        boolean fungible;
        if(cmbEstado.getSelectedItem().toString().equals("Bueno"))
        {
            estado = true;
        }
        else
        {
            estado = false;
        }
        if(cmbDonado.getSelectedItem().toString().equals("Sí"))
        {
            donado = true;
        }
        else
        {
            donado = false;
        }
        if(cmbFungible.getSelectedItem().toString().equals("Sí"))
        {
            fungible = true;
        }
        else
        {
            fungible = false;
        }
        if(bi.ingresarBien(codigo, descripcion, cantidad, preciou, preciot, estado, donado, fungible, departamento))
        {
            new rojerusan.RSNotifyFade("¡ACEPTADA!", "Ingreso Correcto", Color.WHITE, Color.BLACK, Color.BLACK, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        }
        else
        {
            new rojerusan.RSNotifyFade("¡ERROR!", "Ingreso incorrecto", Color.white, Color.black, Color.black, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizarMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btn_IngPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_IngPMouseClicked
        rSPanelsSlider1.setPanelSlider(IngresarInventario, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btn_IngPMouseClicked

    private void btnminimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizar1MouseClicked

    private void btncerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar1MouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrar1MouseClicked

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        rSPanelsSlider1.setPanelSlider(menu, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btnatrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnatrasMouseClicked
         rSPanelsSlider1.setPanelSlider(menu, RSPanelsSlider.DIRECT.RIGHT);
         Limpiar();
    }//GEN-LAST:event_btnatrasMouseClicked

    private void btnhome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhome1MouseClicked
        rSPanelsSlider1.setPanelSlider(menu, RSPanelsSlider.DIRECT.RIGHT);
        limpiarTabla();
    }//GEN-LAST:event_btnhome1MouseClicked

    private void btnminimizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizar2MouseClicked
         this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizar2MouseClicked

    private void btncerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar2MouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrar2MouseClicked

    private void btnMenuBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuBActionPerformed

    private void btnMenuBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuBMouseClicked
        rSPanelsSlider3.setPanelSlider(Magia, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_btnMenuBMouseClicked

    private void menuEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEMouseClicked
        rSPanelsSlider3.setPanelSlider(JPMenuE, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_menuEMouseClicked

    private void btnVerIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerIMouseClicked
        rSPanelsSlider1.setPanelSlider(VerInventario, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_btnVerIMouseClicked

    private void buenEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buenEstadoMouseClicked
        Bcodigo.setText("");
        tableInventario.setModel(bi.bienesPorEstado(tableInventario, true));
    }//GEN-LAST:event_buenEstadoMouseClicked

    private void malEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_malEstadoMouseClicked
        Bcodigo.setText("");
        tableInventario.setModel(bi.bienesPorEstado(tableInventario, false));
    }//GEN-LAST:event_malEstadoMouseClicked

    private void DonadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonadoMouseClicked
        Bcodigo.setText("");
        tableInventario.setModel(bi.bienesDonacion(tableInventario, true));
    }//GEN-LAST:event_DonadoMouseClicked

    private void noDonadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noDonadoMouseClicked
        Bcodigo.setText("");
        tableInventario.setModel(bi.bienesDonacion(tableInventario, false));
    }//GEN-LAST:event_noDonadoMouseClicked

    private void BcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcodigoKeyPressed
        tableInventario.setModel(bi.bienes(Bcodigo.getText(), tableInventario));
    }//GEN-LAST:event_BcodigoKeyPressed

    private void FungibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FungibleMouseClicked
        Bcodigo.setText("");
        tableInventario.setModel(bi.bienesFungible(tableInventario, true));
    }//GEN-LAST:event_FungibleMouseClicked

    private void btnVerIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerIActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        tableInventario.setModel(bi.todosBienes(tableInventario));
    }//GEN-LAST:event_jButton1MouseClicked

    private void limpiarTabla()
    {
        for(int i = 0; i <= tableInventario.getRowCount(); i++)
        {
            ((DefaultTableModel)tableInventario.getModel()).removeRow(i);
        }
        for(int i = 0; i <= tableInventario.getRowCount(); i++)
        {
            ((DefaultTableModel)tableInventario.getModel()).removeRow(i);
        }
    }
    private void btn_InpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InpMouseClicked
        Limpiar();
    }//GEN-LAST:event_btn_InpMouseClicked

    private void NoFungibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoFungibleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NoFungibleMouseClicked

    private void DepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepartamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartamentoMouseClicked

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
//        try {
//            List lista = new ArrayList();
//            for(int i = 0; i <= tableInventario.getRowCount(); i++)
//            {
//                ReporteInventario repo = new ReporteInventario(tableInventario.getValueAt(i, 2).toString(), tableInventario.getValueAt(i, 1).toString(),tableInventario.getValueAt(i, 3).toString(),tableInventario.getValueAt(i,4).toString(), tableInventario.getValueAt(i, 0).toString());
//                lista.add(repo);
//            }
//            File file = new File("/GUI/Reportes/Inventario.jasper");
//            JasperReport  r  = (JasperReport) JRLoader.loadObject(file);
//            Map parametro = new HashMap();
//            parametro.put("TipoI", "General");
//            JasperPrint jprint = JasperFillManager.fillReport(r, parametro, new JRBeanCollectionDataSource(lista));
//            JasperViewer.viewReport(jprint);
//        } catch (JRException ex) {
//            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPacientesMouseClicked
        this.dispose();
        Doctor D = new Doctor();
        D.setVisible(true);
        
    }//GEN-LAST:event_btnPacientesMouseClicked

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void btnminimizar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizar3MouseClicked
         this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnminimizar3MouseClicked

    private void btncerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrar3MouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrar3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        rSPanelsSlider1.setPanelSlider(Empleado, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_jButton2MouseClicked

    private void rSMaterialButtonRectangle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1MouseClicked
       Alergias a = new Alergias();
       a.setVisible(true);
       alergiasEmpleado = true;
    }//GEN-LAST:event_rSMaterialButtonRectangle1MouseClicked

    private void cmbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtipoItemStateChanged
        String tipo = cmbtipo.getSelectedItem().toString();
        if(tipo.equals("Centro de Salud"))
        {
            cmbclasificacion.setEnabled(true);
            cmblugar.setEnabled(false);
            cmblugar.setText("");
        }
        else if(tipo.equals("Puesto de Salud"))
        {
            cmblugar.setEnabled(true);
            cmbclasificacion.setEnabled(false);
            cmbclasificacion.setSelectedIndex(0);
        }
        else
        {
            cmblugar.setEnabled(false);
            cmbclasificacion.setEnabled(false);
            cmblugar.setText("");
            cmbclasificacion.setSelectedItem(0);
        }
    }//GEN-LAST:event_cmbtipoItemStateChanged

    private void rSMaterialButtonRectangle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2MouseClicked
        String nombre = txtnombreE.getText();
        String apellido = txtapellidoE.getText();
        String municipio = txtmunicipio.getText();
        String departamento = cmbdepartamento.getSelectedItem().toString();
        String tipo;
        String alergias = "";
        if(alergiasEmpleado == true)
        {
            try {
                RandomAccessFile raf = new RandomAccessFile("./alergia.txt", "rw");
                File fichero = new File("./alergia.txt");
                int contador = 0;
                while(contador < raf.length())
                {
                    alergias = alergias + (char)raf.readByte();
                    contador++;
                }
                fichero.delete();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Pacientes_Consultas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Pacientes_Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
            alergiasEmpleado = false;
        }
        if(jRadioButton4.isSelected())
        {
            tipo = JOptionPane.showInputDialog("Ingrese el tipo");
        }
        else tipo = cmbtipo.getSelectedItem().toString();
        String clasificacion;
        if(jRadioButton3.isSelected())
        {
            clasificacion = JOptionPane.showInputDialog("Ingrese la clasificación");
        }
        else if(cmbclasificacion.getSelectedItem().toString().equals("Seleccione una clasificación"))
        {
            clasificacion = "";
        }
        else clasificacion = cmbclasificacion.getSelectedItem().toString();
        String lugar = cmblugar.getText();
        String dpi = txtdpi.getText();
        String renglon = cmbrenglonp.getSelectedItem().toString();
        String cargo = txtcargo.getText();
        String puesto = txtpuesto.getText();
        String fechai;
        if(fechaiE.getDatoFecha() == null)
        {
            fechai = "0/0/0";
        } else fechai = formato.format(fechaiE.getDatoFecha());
        String fechad;
        if(fechadE.getDatoFecha() == null)
        {
            fechad = "0/0/0";
        } else fechad = formato.format(fechadE.getDatoFecha());
        String telefono = txttelE.getText();
        double sueldo = Double.parseDouble(txtsueldo.getText());
        if(emp.ingresarEmpleado(nombre, apellido, dpi, municipio, departamento, tipo, clasificacion, lugar, cargo, renglon, puesto, fechai, fechad, sueldo, telefono, alergias))
        {
            new rojerusan.RSNotifyFade("¡ACEPTADA!", "Ingreso Correcto", Color.WHITE, Color.BLACK, Color.BLACK, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        }
        else
        {
            new rojerusan.RSNotifyFade("¡ERROR!", "Ingreso incorrecto", Color.white, Color.black, Color.black, SOMEBITS, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        }
    }//GEN-LAST:event_rSMaterialButtonRectangle2MouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    private final SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bcodigo;
    private javax.swing.JLabel Departamento;
    private javax.swing.JLabel Donado;
    private javax.swing.JPanel Empleado;
    private javax.swing.JLabel Fungible;
    private javax.swing.JPanel IngresarInventario;
    private javax.swing.JPanel InventarioCod;
    private javax.swing.JPanel JPMenuE;
    private javax.swing.JPanel Magia;
    private javax.swing.JLabel NoFungible;
    private javax.swing.JPanel VerInventario;
    private javax.swing.JButton btnMenuB;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JButton btnVerI;
    private javax.swing.JButton btn_IngP;
    private javax.swing.JButton btn_Inp;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btncerrar1;
    private javax.swing.JButton btncerrar2;
    private javax.swing.JButton btncerrar3;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnhome1;
    private javax.swing.JButton btnminimizar;
    private javax.swing.JButton btnminimizar1;
    private javax.swing.JButton btnminimizar2;
    private javax.swing.JButton btnminimizar3;
    private javax.swing.JButton btnreporte;
    private javax.swing.JLabel buenEstado;
    private javax.swing.JComboBox<String> cmbDep;
    private javax.swing.JComboBox<String> cmbDonado;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFungible;
    private javax.swing.JComboBox<String> cmbclasificacion;
    private javax.swing.JComboBox<String> cmbdepartamento;
    private javax.swing.JTextField cmblugar;
    private javax.swing.JComboBox<String> cmbrenglonp;
    private javax.swing.JComboBox<String> cmbtipo;
    private rojeru_san.componentes.RSDateChooser fechadE;
    private rojeru_san.componentes.RSDateChooser fechaiE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel malEstado;
    private javax.swing.JPanel menu;
    private javax.swing.JButton menuE;
    private javax.swing.JLabel noDonado;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle4;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle5;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle6;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle7;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle8;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle9;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle17;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle18;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle19;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle20;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle21;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle22;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle23;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle24;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle25;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle26;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle27;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle28;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle29;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle3;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle5;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle6;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSPanelsSlider rSPanelsSlider2;
    private rojerusan.RSPanelsSlider rSPanelsSlider3;
    private javax.swing.JScrollPane scrollgai1;
    private rojerusan.RSTableMetro tableInventario;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtapellidoE;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtdpi;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtnombreE;
    private javax.swing.JTextField txtpuesto;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JTextField txttelE;
    // End of variables declaration//GEN-END:variables
}
