package GUI;

import JavaClass.Reloj;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Interface extends javax.swing.JFrame {

    Reloj HiloReloj = new Reloj();
    //public static DefaultListModel modelo = new DefaultListModel();
    public static DefaultListModel modelo = new DefaultListModel();
    public static ArrayList<String> paradasBus1 = new ArrayList<>();
    public static ArrayList<String> paradasBus2 = new ArrayList<>();
    public static ArrayList<String> paradasBus3 = new ArrayList<>();
    public static ArrayList<String> paradasBus4 = new ArrayList<>();
    public static ArrayList<String> paradasBus5 = new ArrayList<>();
    public static ArrayList<String> paradasBus6 = new ArrayList<>();
    public static ArrayList<String> paradasBus7 = new ArrayList<>();
    public static ArrayList<String> paradasBus8 = new ArrayList<>();
    public static ArrayList<String> paradasBus9 = new ArrayList<>();
    public static ArrayList<String> paradasBus10 = new ArrayList<>();
    
    int z = 0;
    public static String BusUno = "BusAmarillo.png", BusDos = "BusAzul.png", BusTres = "BusBlanco.png", BusCuatro = "BusCafe.png", BusCinco = "BusMorado.png";
    public static String BusSeis = "BusNaranja.png", BusSiete ="BusNegro.png", BusOcho = "BusRojo.png", BusNueve = "BusTurqueza.png", BusDiez = "BusVerde.png";
    public static String imgnull = "vacio.png";
    
    static ServerSocket ss; //agregue
    static Socket s; //
    static DataInputStream din; //
    static DataOutputStream dout; //
    
    public Interface() {
        initComponents();
        ListaParadas.setModel(modelo);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanelMapa = new javax.swing.JPanel();
        Parada70 = new javax.swing.JLabel();
        Parada69 = new javax.swing.JLabel();
        Parada68 = new javax.swing.JLabel();
        Parada67 = new javax.swing.JLabel();
        Parada66 = new javax.swing.JLabel();
        Parada65 = new javax.swing.JLabel();
        Parada64 = new javax.swing.JLabel();
        Parada63 = new javax.swing.JLabel();
        Parada62 = new javax.swing.JLabel();
        Parada61 = new javax.swing.JLabel();
        Parada60 = new javax.swing.JLabel();
        Parada59 = new javax.swing.JLabel();
        Parada58 = new javax.swing.JLabel();
        Parada57 = new javax.swing.JLabel();
        Parada56 = new javax.swing.JLabel();
        Parada55 = new javax.swing.JLabel();
        Parada54 = new javax.swing.JLabel();
        Parada53 = new javax.swing.JLabel();
        Parada52 = new javax.swing.JLabel();
        Parada51 = new javax.swing.JLabel();
        Parada50 = new javax.swing.JLabel();
        Parada49 = new javax.swing.JLabel();
        Parada48 = new javax.swing.JLabel();
        Parada47 = new javax.swing.JLabel();
        Parada46 = new javax.swing.JLabel();
        Parada45 = new javax.swing.JLabel();
        Parada44 = new javax.swing.JLabel();
        Parada43 = new javax.swing.JLabel();
        Parada42 = new javax.swing.JLabel();
        Parada41 = new javax.swing.JLabel();
        Parada40 = new javax.swing.JLabel();
        Parada39 = new javax.swing.JLabel();
        Parada38 = new javax.swing.JLabel();
        Parada37 = new javax.swing.JLabel();
        Parada36 = new javax.swing.JLabel();
        Parada35 = new javax.swing.JLabel();
        Parada34 = new javax.swing.JLabel();
        Parada33 = new javax.swing.JLabel();
        Parada32 = new javax.swing.JLabel();
        Parada31 = new javax.swing.JLabel();
        Parada30 = new javax.swing.JLabel();
        Parada29 = new javax.swing.JLabel();
        Parada28 = new javax.swing.JLabel();
        Parada27 = new javax.swing.JLabel();
        Parada26 = new javax.swing.JLabel();
        Parada25 = new javax.swing.JLabel();
        Parada24 = new javax.swing.JLabel();
        Parada23 = new javax.swing.JLabel();
        Parada22 = new javax.swing.JLabel();
        Parada21 = new javax.swing.JLabel();
        Parada20 = new javax.swing.JLabel();
        Parada19 = new javax.swing.JLabel();
        Parada18 = new javax.swing.JLabel();
        Parada17 = new javax.swing.JLabel();
        Parada16 = new javax.swing.JLabel();
        Parada15 = new javax.swing.JLabel();
        Parada14 = new javax.swing.JLabel();
        Parada13 = new javax.swing.JLabel();
        Parada12 = new javax.swing.JLabel();
        Parada11 = new javax.swing.JLabel();
        Parada10 = new javax.swing.JLabel();
        Parada9 = new javax.swing.JLabel();
        Parada8 = new javax.swing.JLabel();
        Parada7 = new javax.swing.JLabel();
        Parada6 = new javax.swing.JLabel();
        Parada5 = new javax.swing.JLabel();
        Parada4 = new javax.swing.JLabel();
        Parada3 = new javax.swing.JLabel();
        Parada2 = new javax.swing.JLabel();
        Parada1 = new javax.swing.JLabel();
        Ruta = new javax.swing.JLabel();
        FondoPanel = new javax.swing.JPanel();
        JButton_Start = new javax.swing.JButton();
        JButton_Exit = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        lblParadasRegistradas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaParadas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        MSG_Area = new javax.swing.JTextArea();
        msg_escribir = new javax.swing.JTextField();
        BotonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Periferica L1");
        setName("Interface"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Parada70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada70.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada70, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 50, 30));

        Parada69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada69.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada69, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 50, 30));

        Parada68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada68.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada68, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 50, 30));

        Parada67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada67.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada67, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 50, 30));

        Parada66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada66.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada66, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 50, 30));

        Parada65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada65.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 50, 30));

        Parada64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada64.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada64, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 50, 30));

        Parada63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada63.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada63, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 50, 30));

        Parada62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada62.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada62, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 50, 30));

        Parada61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada61.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 50, 30));

        Parada60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada60.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 50, 30));

        Parada59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada59.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada59, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 50, 30));

        Parada58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada58.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada58, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 50, 30));

        Parada57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada57.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada57, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 50, 30));

        Parada56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada56.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada56, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 50, 30));

        Parada55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada55.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada55, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 50, 30));

        Parada54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada54.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada54, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 50, 30));

        Parada53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada53.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada53, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 50, 30));

        Parada52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada52.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada52, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 50, 30));

        Parada51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada51.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada51, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 50, 30));

        Parada50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada50.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada50, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 50, 30));

        Parada49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada49.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada49, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 50, 30));

        Parada48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada48.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada48, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 50, 30));

        Parada47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada47.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada47, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 50, 30));

        Parada46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada46.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada46, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 50, 30));

        Parada45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada45.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada45, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 50, 30));

        Parada44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada44.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada44, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 50, 30));

        Parada43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada43.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada43, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 50, 30));

        Parada42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada42.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada42, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, 50, 30));

        Parada41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada41.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada41, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 50, 30));

        Parada40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada40.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada40, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 210, 50, 30));

        Parada39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada39.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada39, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 50, 30));

        Parada38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada38.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada38, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 50, 30));

        Parada37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada37.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada37, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 50, 30));

        Parada36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada36.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada36, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 50, 30));

        Parada35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada35.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada35, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 50, 30));

        Parada34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada34.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada34, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 50, 30));

        Parada33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada33.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada33, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 50, 30));

        Parada32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada32.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 50, 30));

        Parada31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada31.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 50, 30));

        Parada30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada30.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 50, 30));

        Parada29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada29.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada29, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 50, 30));

        Parada28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada28.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 50, 30));

        Parada27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada27.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 50, 30));

        Parada26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada26.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 50, 30));

        Parada25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada25.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 50, 30));

        Parada24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada24.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada24, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 50, 30));

        Parada23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada23.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 50, 30));

        Parada22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada22.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 50, 30));

        Parada21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada21.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 50, 30));

        Parada20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada20.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 50, 30));

        Parada19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada19.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 50, 30));

        Parada18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada18.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 50, 30));

        Parada17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada17.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 50, 30));

        Parada16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada16.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 30));

        Parada15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada15.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 50, 30));

        Parada14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada14.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 50, 30));

        Parada13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada13.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 30));

        Parada12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada12.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 50, 30));

        Parada11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada11.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 50, 30));

        Parada10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada10.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, 30));

        Parada9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada9.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 50, 30));

        Parada8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada8.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 50, 30));

        Parada7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada7.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 50, 30));

        Parada6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada6.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 50, 30));

        Parada5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada5.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 50, 30));

        Parada4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada4.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 50, 30));

        Parada3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada3.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 60, 30));

        Parada2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada2.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 50, 30));

        Parada1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Parada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vacio.png"))); // NOI18N
        Parada1.setBorder(new javax.swing.border.MatteBorder(null));
        FondoPanelMapa.add(Parada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 30));

        Ruta.setForeground(new java.awt.Color(0, 0, 0));
        Ruta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RutaL1.png"))); // NOI18N
        Ruta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FondoPanelMapa.add(Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 560));

        getContentPane().add(FondoPanelMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 560));

        FondoPanel.setBackground(new java.awt.Color(51, 51, 51));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButton_Start.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JButton_Start.setText("START");
        JButton_Start.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButton_Start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_StartActionPerformed(evt);
            }
        });
        FondoPanel.add(JButton_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 81, -1));

        JButton_Exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JButton_Exit.setText("EXIT");
        JButton_Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButton_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_ExitActionPerformed(evt);
            }
        });
        FondoPanel.add(JButton_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 81, -1));

        lblReloj.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(255, 255, 255));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReloj.setText("Reloj:");
        FondoPanel.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 90, 50));

        Hora.setFont(new java.awt.Font("OCR A Extended", 0, 36)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setText("00:00:00");
        FondoPanel.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 310, 50));

        lblParadasRegistradas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblParadasRegistradas.setForeground(new java.awt.Color(255, 255, 255));
        lblParadasRegistradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParadasRegistradas.setText("Lista de paradas registradas:");
        FondoPanel.add(lblParadasRegistradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 60, 290, 30));

        jScrollPane1.setViewportView(ListaParadas);

        FondoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 450, 620));

        MSG_Area.setColumns(20);
        MSG_Area.setRows(5);
        jScrollPane2.setViewportView(MSG_Area);

        FondoPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 490, -1));
        FondoPanel.add(msg_escribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 670, 410, -1));

        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        FondoPanel.add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 80, -1));

        getContentPane().add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1620, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_StartActionPerformed

        if (HiloReloj.isAlive() == false) {
            HiloReloj = new Reloj();
            HiloReloj.activo = true;
            HiloReloj.start();
            z = 1;
        }
    }//GEN-LAST:event_JButton_StartActionPerformed

    private void JButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_ExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_JButton_ExitActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        // TODO add your handling code here:
      try{
      String msgout = "";
      msgout = msg_escribir.getText().trim();
      dout.writeUTF(msgout);
      
      
      }catch(Exception e){
      
      }
        
    }//GEN-LAST:event_BotonEnviarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        String mensaje = "";
        try{
    ss = new ServerSocket(1201);
    s = ss.accept();
    
    din = new DataInputStream(s.getInputStream());
    dout = new DataOutputStream(s.getOutputStream());
    
        while (!mensaje.equals("Exit")){
        mensaje = din.readUTF();
        MSG_Area.setText(MSG_Area.getText().trim()+"\n"+mensaje);
        
            if (mensaje.startsWith("Fin")) {
            String msgout = "";
            msgout = "Vuelva pronto cliente";
            dout.writeUTF(msgout);
             }
            if (mensaje.startsWith("Parada bus 1")) {
            String msgout = "";
            msgout = "El bus 1 se ecuentra en : " + paradasBus1;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 2")) {
            String msgout = "";
            msgout = "El bus 2 se ecuentra en : " + paradasBus2;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 3")) {
            String msgout = "";
            msgout = "El bus 3 se ecuentra en : " + paradasBus3;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 4")) {
            String msgout = "";
            msgout = "El bus 4 se ecuentra en : " + paradasBus4;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 5")) {
            String msgout = "";
            msgout = "El bus 5 se ecuentra en : " + paradasBus5;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 6")) {
            String msgout = "";
            msgout = "El bus 6 se ecuentra en : " + paradasBus6;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 7")) {
            String msgout = "";
            msgout = "El bus 7 se ecuentra en : " + paradasBus7;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 8")) {
            String msgout = "";
            msgout = "El bus 8 se ecuentra en : " + paradasBus8;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 9")) {
            String msgout = "";
            msgout = "El bus 9 se ecuentra en : " + paradasBus9;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Parada bus 10")) {
            String msgout = "";
            msgout = "El bus 10 se ecuentra en : " + paradasBus10;
            dout.writeUTF(msgout);
            }
            if (mensaje.startsWith("Hola")) {
            String msgout = "";
            
            msgout = "Hola cliente en que lo puedo ayudar?";
            dout.writeUTF(msgout);
            }
        }
        }catch(Exception e){
           
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel FondoPanelMapa;
    public static javax.swing.JLabel Hora;
    private javax.swing.JButton JButton_Exit;
    public javax.swing.JButton JButton_Start;
    protected static javax.swing.JList<String> ListaParadas;
    private static javax.swing.JTextArea MSG_Area;
    public static javax.swing.JLabel Parada1;
    public static javax.swing.JLabel Parada10;
    public static javax.swing.JLabel Parada11;
    public static javax.swing.JLabel Parada12;
    public static javax.swing.JLabel Parada13;
    public static javax.swing.JLabel Parada14;
    public static javax.swing.JLabel Parada15;
    public static javax.swing.JLabel Parada16;
    public static javax.swing.JLabel Parada17;
    public static javax.swing.JLabel Parada18;
    public static javax.swing.JLabel Parada19;
    public static javax.swing.JLabel Parada2;
    public static javax.swing.JLabel Parada20;
    public static javax.swing.JLabel Parada21;
    public static javax.swing.JLabel Parada22;
    public static javax.swing.JLabel Parada23;
    public static javax.swing.JLabel Parada24;
    public static javax.swing.JLabel Parada25;
    public static javax.swing.JLabel Parada26;
    public static javax.swing.JLabel Parada27;
    public static javax.swing.JLabel Parada28;
    public static javax.swing.JLabel Parada29;
    public static javax.swing.JLabel Parada3;
    public static javax.swing.JLabel Parada30;
    public static javax.swing.JLabel Parada31;
    public static javax.swing.JLabel Parada32;
    public static javax.swing.JLabel Parada33;
    public static javax.swing.JLabel Parada34;
    public static javax.swing.JLabel Parada35;
    public static javax.swing.JLabel Parada36;
    public static javax.swing.JLabel Parada37;
    public static javax.swing.JLabel Parada38;
    public static javax.swing.JLabel Parada39;
    public static javax.swing.JLabel Parada4;
    public static javax.swing.JLabel Parada40;
    public static javax.swing.JLabel Parada41;
    public static javax.swing.JLabel Parada42;
    public static javax.swing.JLabel Parada43;
    public static javax.swing.JLabel Parada44;
    public static javax.swing.JLabel Parada45;
    public static javax.swing.JLabel Parada46;
    public static javax.swing.JLabel Parada47;
    public static javax.swing.JLabel Parada48;
    public static javax.swing.JLabel Parada49;
    public static javax.swing.JLabel Parada5;
    public static javax.swing.JLabel Parada50;
    public static javax.swing.JLabel Parada51;
    public static javax.swing.JLabel Parada52;
    public static javax.swing.JLabel Parada53;
    public static javax.swing.JLabel Parada54;
    public static javax.swing.JLabel Parada55;
    public static javax.swing.JLabel Parada56;
    public static javax.swing.JLabel Parada57;
    public static javax.swing.JLabel Parada58;
    public static javax.swing.JLabel Parada59;
    public static javax.swing.JLabel Parada6;
    public static javax.swing.JLabel Parada60;
    public static javax.swing.JLabel Parada61;
    public static javax.swing.JLabel Parada62;
    public static javax.swing.JLabel Parada63;
    public static javax.swing.JLabel Parada64;
    public static javax.swing.JLabel Parada65;
    public static javax.swing.JLabel Parada66;
    public static javax.swing.JLabel Parada67;
    public static javax.swing.JLabel Parada68;
    public static javax.swing.JLabel Parada69;
    public static javax.swing.JLabel Parada7;
    public static javax.swing.JLabel Parada70;
    public static javax.swing.JLabel Parada8;
    public static javax.swing.JLabel Parada9;
    private javax.swing.JLabel Ruta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblParadasRegistradas;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JTextField msg_escribir;
    // End of variables declaration//GEN-END:variables

}
