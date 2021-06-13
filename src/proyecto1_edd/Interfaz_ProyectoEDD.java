/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_edd;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ThecnoMacVZLA
 */
public class Interfaz_ProyectoEDD extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_ProyectoEDD
     */
    public Interfaz_ProyectoEDD() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        exitbutton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Inicio = new javax.swing.JPanel();
        textinicio = new javax.swing.JLabel();
        bienvenido1 = new javax.swing.JLabel();
        barradecolor = new javax.swing.JTextField();
        imagenhombre = new javax.swing.JLabel();
        textinicio1 = new javax.swing.JLabel();
        textinicio2 = new javax.swing.JLabel();
        buttonarchivo = new javax.swing.JButton();
        bdisponibilidad = new javax.swing.JButton();
        buttoncomprar = new javax.swing.JButton();
        buttongrafo = new javax.swing.JButton();
        buttongestion = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();
        JFileChooser = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ExploradorArchivo = new javax.swing.JTextField();
        titlearchivo = new javax.swing.JLabel();
        textarchivo = new javax.swing.JLabel();
        textarchivo2 = new javax.swing.JLabel();
        textarchivo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        ReporteDisponibilidad = new javax.swing.JPanel();
        titlearchivo1 = new javax.swing.JLabel();
        textdisp = new javax.swing.JLabel();
        buttond_ayp = new javax.swing.JButton();
        textdisp1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        searchdisp = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        aypinfo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodinfo = new javax.swing.JTextArea();
        fondo3 = new javax.swing.JLabel();
        Pedidos = new javax.swing.JPanel();
        comprartitle = new javax.swing.JLabel();
        textcplistado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listadoprod = new javax.swing.JTextArea();
        amountproduct = new javax.swing.JTextField();
        nameproduct = new javax.swing.JTextField();
        reloadicon = new javax.swing.JButton();
        shopcart = new javax.swing.JButton();
        verificarlista = new javax.swing.JLabel();
        textcpcomprar = new javax.swing.JLabel();
        textcpcomprar1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listacompras = new javax.swing.JTextArea();
        listaalmacenes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        fondo4 = new javax.swing.JLabel();
        Gestiones = new javax.swing.JPanel();
        gestiontitle = new javax.swing.JLabel();
        aumentarstock = new javax.swing.JButton();
        añadirproducto = new javax.swing.JButton();
        buttonea = new javax.swing.JButton();
        buttonaa = new javax.swing.JButton();
        textgalmacen1 = new javax.swing.JLabel();
        textgalmacen = new javax.swing.JLabel();
        textgaoe = new javax.swing.JLabel();
        listaalmacenes1 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fondo5 = new javax.swing.JLabel();
        Grafo = new javax.swing.JPanel();
        fondo6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbutton.setBackground(new java.awt.Color(204, 0, 0));
        exitbutton.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(255, 255, 255));
        exitbutton.setText("X");
        exitbutton.setBorder(null);
        exitbutton.setBorderPainted(false);
        exitbutton.setFocusPainted(false);
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 40, 30));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 51));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Inicio.setBackground(new java.awt.Color(0, 0, 51));
        Inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textinicio.setFont(new java.awt.Font("Corbel Light", 0, 21)); // NOI18N
        textinicio.setForeground(new java.awt.Color(0, 0, 51));
        textinicio.setText("navegando por las pestañas");
        Inicio.add(textinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 50));

        bienvenido1.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        bienvenido1.setForeground(new java.awt.Color(0, 0, 51));
        bienvenido1.setText("¡Bienvenido!");
        Inicio.add(bienvenido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        barradecolor.setBackground(new java.awt.Color(0, 0, 51));
        barradecolor.setBorder(null);
        Inicio.add(barradecolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 482, 510, 10));

        imagenhombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/hombre-señalando-derecha-min-removebg-preview.png"))); // NOI18N
        Inicio.add(imagenhombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 250, 270));

        textinicio1.setFont(new java.awt.Font("Corbel Light", 2, 24)); // NOI18N
        textinicio1.setForeground(new java.awt.Color(0, 0, 51));
        textinicio1.setText("¡Gracias por utilizar nuestra plataforma!");
        Inicio.add(textinicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 370, 40));

        textinicio2.setFont(new java.awt.Font("Corbel Light", 0, 21)); // NOI18N
        textinicio2.setForeground(new java.awt.Color(0, 0, 51));
        textinicio2.setText("Explore las diferentes  opciones");
        Inicio.add(textinicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 290, 40));

        buttonarchivo.setBackground(new java.awt.Color(1, 1, 22));
        buttonarchivo.setForeground(new java.awt.Color(204, 204, 204));
        buttonarchivo.setText("Seleccionar Archivo");
        buttonarchivo.setBorderPainted(false);
        buttonarchivo.setFocusable(false);
        buttonarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonarchivoActionPerformed(evt);
            }
        });
        Inicio.add(buttonarchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, -1));

        bdisponibilidad.setBackground(new java.awt.Color(1, 1, 22));
        bdisponibilidad.setForeground(new java.awt.Color(204, 204, 204));
        bdisponibilidad.setText("Disponibilidad productos");
        bdisponibilidad.setBorderPainted(false);
        bdisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdisponibilidadActionPerformed(evt);
            }
        });
        Inicio.add(bdisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, -1));

        buttoncomprar.setBackground(new java.awt.Color(1, 1, 22));
        buttoncomprar.setForeground(new java.awt.Color(204, 204, 204));
        buttoncomprar.setText("Realizar una compra");
        buttoncomprar.setBorderPainted(false);
        buttoncomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncomprarActionPerformed(evt);
            }
        });
        Inicio.add(buttoncomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, -1));

        buttongrafo.setBackground(new java.awt.Color(1, 1, 22));
        buttongrafo.setForeground(new java.awt.Color(204, 204, 204));
        buttongrafo.setText("Visualizar Grafo");
        buttongrafo.setBorderPainted(false);
        buttongrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttongrafoActionPerformed(evt);
            }
        });
        Inicio.add(buttongrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, -1));

        buttongestion.setBackground(new java.awt.Color(1, 1, 22));
        buttongestion.setForeground(new java.awt.Color(204, 204, 204));
        buttongestion.setText("Gestionar almacen/productos");
        buttongestion.setBorderPainted(false);
        buttongestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttongestionActionPerformed(evt);
            }
        });
        Inicio.add(buttongestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, -1));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo1.setText("jLabel1");
        Inicio.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Inicio", Inicio);

        JFileChooser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JFileChooser.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        ExploradorArchivo.setEnabled(false);
        ExploradorArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExploradorArchivoActionPerformed(evt);
            }
        });
        JFileChooser.add(ExploradorArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, -1));

        titlearchivo.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        titlearchivo.setForeground(new java.awt.Color(0, 0, 51));
        titlearchivo.setText("Cargar datos");
        JFileChooser.add(titlearchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        textarchivo.setFont(new java.awt.Font("Corbel Light", 2, 18)); // NOI18N
        textarchivo.setForeground(new java.awt.Color(0, 0, 51));
        textarchivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textarchivo.setText("Debe ser un archivo .txt");
        textarchivo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JFileChooser.add(textarchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 340, 40));

        textarchivo2.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        textarchivo2.setForeground(new java.awt.Color(0, 0, 51));
        textarchivo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textarchivo2.setText("los datos a utilizar por el programa");
        JFileChooser.add(textarchivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, 40));

        textarchivo1.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        textarchivo1.setForeground(new java.awt.Color(0, 0, 51));
        textarchivo1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textarchivo1.setText("Seleccione el archivo que contiene ");
        JFileChooser.add(textarchivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 340, 40));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo2.setText("jLabel1");
        JFileChooser.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Archivo", JFileChooser);

        ReporteDisponibilidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlearchivo1.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        titlearchivo1.setForeground(new java.awt.Color(0, 0, 51));
        titlearchivo1.setText("Disponibilidad");
        ReporteDisponibilidad.add(titlearchivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        textdisp.setFont(new java.awt.Font("Corbel Light", 0, 21)); // NOI18N
        textdisp.setForeground(new java.awt.Color(0, 0, 51));
        textdisp.setText("Buscar producto específico:");
        ReporteDisponibilidad.add(textdisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 230, 40));

        buttond_ayp.setBackground(new java.awt.Color(1, 1, 22));
        buttond_ayp.setForeground(new java.awt.Color(204, 204, 204));
        buttond_ayp.setText("Almacenes y sus productos");
        ReporteDisponibilidad.add(buttond_ayp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 210, -1));

        textdisp1.setFont(new java.awt.Font("Corbel Light", 0, 21)); // NOI18N
        textdisp1.setForeground(new java.awt.Color(0, 0, 51));
        textdisp1.setText("Haga clic para desglosar:");
        ReporteDisponibilidad.add(textdisp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 40));

        jTextField1.setText("(Ej.) Procesador");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        ReporteDisponibilidad.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 150, -1));

        searchdisp.setBackground(new java.awt.Color(1, 1, 22));
        searchdisp.setForeground(new java.awt.Color(204, 204, 204));
        searchdisp.setText("Buscar");
        searchdisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdispActionPerformed(evt);
            }
        });
        ReporteDisponibilidad.add(searchdisp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 70, -1));

        aypinfo.setColumns(20);
        aypinfo.setRows(5);
        aypinfo.setEnabled(false);
        jScrollPane2.setViewportView(aypinfo);

        ReporteDisponibilidad.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, 260));

        prodinfo.setColumns(20);
        prodinfo.setRows(5);
        prodinfo.setEnabled(false);
        jScrollPane1.setViewportView(prodinfo);

        ReporteDisponibilidad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 230, 260));

        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo3.setText("jLabel1");
        ReporteDisponibilidad.add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Disponibilidad", ReporteDisponibilidad);

        Pedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comprartitle.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        comprartitle.setForeground(new java.awt.Color(0, 0, 51));
        comprartitle.setText("Comprar Productos");
        Pedidos.add(comprartitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        textcplistado.setFont(new java.awt.Font("Corbel Light", 0, 21)); // NOI18N
        textcplistado.setForeground(new java.awt.Color(0, 0, 51));
        textcplistado.setText("Listado del stock:");
        textcplistado.setToolTipText("");
        Pedidos.add(textcplistado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 50));

        listadoprod.setColumns(20);
        listadoprod.setRows(5);
        listadoprod.setEnabled(false);
        jScrollPane3.setViewportView(listadoprod);

        Pedidos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, 310));

        amountproduct.setText("Cantidad producto");
        amountproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountproductActionPerformed(evt);
            }
        });
        Pedidos.add(amountproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 150, -1));

        nameproduct.setText("Nombre producto");
        Pedidos.add(nameproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, -1));

        reloadicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/reload.png"))); // NOI18N
        reloadicon.setContentAreaFilled(false);
        reloadicon.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/rsombreado.png"))); // NOI18N
        Pedidos.add(reloadicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, 40));

        shopcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/carritomercado.png"))); // NOI18N
        shopcart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 102), null, new java.awt.Color(0, 0, 51)));
        shopcart.setContentAreaFilled(false);
        shopcart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        shopcart.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/cmsombreado.png"))); // NOI18N
        Pedidos.add(shopcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        verificarlista.setFont(new java.awt.Font("Corbel Light", 1, 14)); // NOI18N
        verificarlista.setForeground(new java.awt.Color(0, 0, 51));
        verificarlista.setText("Verifique su lista y seleccione Almacen:");
        verificarlista.setToolTipText("");
        Pedidos.add(verificarlista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 240, 30));

        textcpcomprar.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        textcpcomprar.setForeground(new java.awt.Color(0, 0, 51));
        textcpcomprar.setText("Haga clic en carrito para añadir producto");
        textcpcomprar.setToolTipText("");
        Pedidos.add(textcpcomprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 240, 30));

        textcpcomprar1.setFont(new java.awt.Font("Corbel Light", 3, 14)); // NOI18N
        textcpcomprar1.setForeground(new java.awt.Color(0, 0, 51));
        textcpcomprar1.setText("y su cantidad a la lista de compra");
        textcpcomprar1.setToolTipText("");
        Pedidos.add(textcpcomprar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 240, 30));

        listacompras.setColumns(20);
        listacompras.setRows(5);
        listacompras.setEnabled(false);
        jScrollPane4.setViewportView(listacompras);

        Pedidos.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 220, -1));

        listaalmacenes.setBackground(new java.awt.Color(0, 0, 51));
        listaalmacenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Pedidos.add(listaalmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 220, -1));

        jButton2.setBackground(new java.awt.Color(1, 1, 22));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Realizar Compra");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pedidos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 220, 50));

        fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo4.setText("jLabel1");
        Pedidos.add(fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Comprar", Pedidos);

        Gestiones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestiontitle.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        gestiontitle.setForeground(new java.awt.Color(0, 0, 51));
        gestiontitle.setText("Gestionar Almacenes");
        Gestiones.add(gestiontitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        aumentarstock.setBackground(new java.awt.Color(1, 1, 22));
        aumentarstock.setForeground(new java.awt.Color(204, 204, 204));
        aumentarstock.setText("Aumentar Stock");
        aumentarstock.setBorderPainted(false);
        aumentarstock.setFocusable(false);
        aumentarstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarstockActionPerformed(evt);
            }
        });
        Gestiones.add(aumentarstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 190, -1));

        añadirproducto.setBackground(new java.awt.Color(1, 1, 22));
        añadirproducto.setForeground(new java.awt.Color(204, 204, 204));
        añadirproducto.setText("Añadir Producto");
        añadirproducto.setBorderPainted(false);
        añadirproducto.setFocusable(false);
        añadirproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirproductoActionPerformed(evt);
            }
        });
        Gestiones.add(añadirproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 190, -1));

        buttonea.setBackground(new java.awt.Color(1, 1, 22));
        buttonea.setForeground(new java.awt.Color(204, 204, 204));
        buttonea.setText("Eliminar Almacén");
        buttonea.setBorderPainted(false);
        buttonea.setFocusable(false);
        buttonea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneaActionPerformed(evt);
            }
        });
        Gestiones.add(buttonea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, -1));

        buttonaa.setBackground(new java.awt.Color(1, 1, 22));
        buttonaa.setForeground(new java.awt.Color(204, 204, 204));
        buttonaa.setText("Añadir Almacén");
        buttonaa.setBorderPainted(false);
        buttonaa.setFocusable(false);
        buttonaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaaActionPerformed(evt);
            }
        });
        Gestiones.add(buttonaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, -1));

        textgalmacen1.setFont(new java.awt.Font("Corbel Light", 1, 17)); // NOI18N
        textgalmacen1.setForeground(new java.awt.Color(0, 0, 51));
        textgalmacen1.setText("Si desea editar el stock de un Almacen entonces haga lo siguiente:");
        textgalmacen1.setToolTipText("");
        Gestiones.add(textgalmacen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 450, 30));

        textgalmacen.setFont(new java.awt.Font("Corbel Light", 0, 15)); // NOI18N
        textgalmacen.setForeground(new java.awt.Color(0, 0, 51));
        textgalmacen.setText("Seleccione almacen para editar:");
        textgalmacen.setToolTipText("");
        Gestiones.add(textgalmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, 30));

        textgaoe.setFont(new java.awt.Font("Corbel Light", 0, 15)); // NOI18N
        textgaoe.setForeground(new java.awt.Color(0, 0, 51));
        textgaoe.setText("Haga clic en lo que desee realizar:");
        textgaoe.setToolTipText("");
        Gestiones.add(textgaoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        listaalmacenes1.setBackground(new java.awt.Color(0, 0, 51));
        listaalmacenes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Gestiones.add(listaalmacenes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 190, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane5.setViewportView(jTextArea1);

        Gestiones.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 130));

        fondo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo5.setText("jLabel1");
        Gestiones.add(fondo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Gestion", Gestiones);

        Grafo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_interfaz/Fondointerfaz.jpeg"))); // NOI18N
        fondo6.setText("jLabel1");
        Grafo.add(fondo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jTabbedPane1.addTab("Grafo", Grafo);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        if(filename.contains(".txt")){
            DataManage txt = new DataManage();
            txt.readtxt(filename);
            ExploradorArchivo.setText("Datos cargados, ya puede comenzar a trabajar");
        }else{
            JOptionPane.showMessageDialog(this, "Tipo de archivo no válido","ALERTA", JOptionPane.WARNING_MESSAGE);
            ExploradorArchivo.setText("Tipo de archivo no válido. Se requiere: txt");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttoncomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncomprarActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_buttoncomprarActionPerformed

    private void buttongrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttongrafoActionPerformed
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_buttongrafoActionPerformed

    private void buttonarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonarchivoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_buttonarchivoActionPerformed

    private void bdisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdisponibilidadActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_bdisponibilidadActionPerformed

    private void buttongestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttongestionActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_buttongestionActionPerformed

    private void ExploradorArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExploradorArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExploradorArchivoActionPerformed

    private void searchdispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdispActionPerformed
        String a = jTextField1.getText();
        prodinfo.setText(a);
    }//GEN-LAST:event_searchdispActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void amountproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountproductActionPerformed

    private void buttonaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonaaActionPerformed

    private void buttoneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoneaActionPerformed

    private void añadirproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añadirproductoActionPerformed

    private void aumentarstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aumentarstockActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_ProyectoEDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_ProyectoEDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_ProyectoEDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_ProyectoEDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_ProyectoEDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExploradorArchivo;
    private javax.swing.JPanel Gestiones;
    private javax.swing.JPanel Grafo;
    private javax.swing.JPanel Inicio;
    private javax.swing.JPanel JFileChooser;
    private javax.swing.JPanel Pedidos;
    private javax.swing.JPanel ReporteDisponibilidad;
    private javax.swing.JTextField amountproduct;
    private javax.swing.JButton aumentarstock;
    private javax.swing.JTextArea aypinfo;
    private javax.swing.JButton añadirproducto;
    private javax.swing.JTextField barradecolor;
    private javax.swing.JButton bdisponibilidad;
    private javax.swing.JLabel bienvenido1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonaa;
    private javax.swing.JButton buttonarchivo;
    private javax.swing.JButton buttoncomprar;
    private javax.swing.JButton buttond_ayp;
    private javax.swing.JButton buttonea;
    private javax.swing.JButton buttongestion;
    private javax.swing.JButton buttongrafo;
    private javax.swing.JLabel comprartitle;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JLabel fondo4;
    private javax.swing.JLabel fondo5;
    private javax.swing.JLabel fondo6;
    private javax.swing.JLabel gestiontitle;
    private javax.swing.JLabel imagenhombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> listaalmacenes;
    private javax.swing.JComboBox<String> listaalmacenes1;
    private javax.swing.JTextArea listacompras;
    private javax.swing.JTextArea listadoprod;
    private javax.swing.JTextField nameproduct;
    private javax.swing.JTextArea prodinfo;
    private javax.swing.JButton reloadicon;
    private javax.swing.JButton searchdisp;
    private javax.swing.JButton shopcart;
    private javax.swing.JLabel textarchivo;
    private javax.swing.JLabel textarchivo1;
    private javax.swing.JLabel textarchivo2;
    private javax.swing.JLabel textcpcomprar;
    private javax.swing.JLabel textcpcomprar1;
    private javax.swing.JLabel textcplistado;
    private javax.swing.JLabel textdisp;
    private javax.swing.JLabel textdisp1;
    private javax.swing.JLabel textgalmacen;
    private javax.swing.JLabel textgalmacen1;
    private javax.swing.JLabel textgaoe;
    private javax.swing.JLabel textinicio;
    private javax.swing.JLabel textinicio1;
    private javax.swing.JLabel textinicio2;
    private javax.swing.JLabel titlearchivo;
    private javax.swing.JLabel titlearchivo1;
    private javax.swing.JLabel verificarlista;
    // End of variables declaration//GEN-END:variables
}
