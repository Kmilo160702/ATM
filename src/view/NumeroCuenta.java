package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class NumeroCuenta extends javax.swing.JFrame {

    private javax.swing.JButton btIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbClave;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbNoCuenta;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JPasswordField txContraseña;
    private javax.swing.JTextField txNumeroCuenta;

    Statement estado = null;
    ResultSet resultado = null;

    public NumeroCuenta() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txNumeroCuenta = new javax.swing.JTextField();
        txContraseña = new javax.swing.JPasswordField();
        btIngresar = new javax.swing.JButton();
        lbAdvertencia = new javax.swing.JLabel();
        lbNoCuenta = new javax.swing.JLabel();
        lbClave = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        lbTitulo2 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txNumeroCuenta.setFont(new java.awt.Font("Roboto", 0, 24));
        txNumeroCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNumeroCuentaKeyTyped(evt);
            }
        });

        txContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18));
        txContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txContraseñaKeyTyped(evt);
            }
        });

        btIngresar.setFont(new java.awt.Font("Roboto", 1, 20));
        btIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btIngresar.setText("Ingresar");
        btIngresar.setBorderPainted(false);
        btIngresar.setContentAreaFilled(false);
        btIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25));
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbNoCuenta.setFont(new java.awt.Font("Roboto", 1, 18));
        lbNoCuenta.setForeground(new java.awt.Color(4, 89, 160));
        lbNoCuenta.setText("Número de tarjeta:");

        lbClave.setFont(new java.awt.Font("Roboto", 1, 18));
        lbClave.setForeground(new java.awt.Color(4, 89, 160));
        lbClave.setText("Clave");

        lbTitulo1.setFont(new java.awt.Font("Roboto", 1, 26));
        lbTitulo1.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo1.setText("Ingrese su número de tarjeta y clave");

        lbTitulo2.setFont(new java.awt.Font("Roboto", 1, 26));
        lbTitulo2.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo2.setText("Presione \"Ingresar\"");

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(lbTitulo1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lbNoCuenta)
                                .addGap(9, 9, 9)
                                .addComponent(txNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(lbClave))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(lbTitulo2))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 719,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addComponent(lbTitulo2))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(lbTitulo1)
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(lbNoCuenta))
                                                        .addComponent(txNumeroCuenta,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(430, 430, 430)
                                                .addComponent(lbClave)))
                                .addGap(75, 75, 75)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {
        String numero = txNumeroCuenta.getText();
        String contraseña = new String(txContraseña.getPassword());

        if (numero.isEmpty() && contraseña.isEmpty()) {
        } else if (numero.isEmpty()) {
        } else if (contraseña.isEmpty()) {
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2", "root",
                        "2018");
                String SQL = "SELECT * FROM clientes WHERE NoTarjeta like '%" + (numero) + "%'";

                estado = con.createStatement();
                resultado = estado.executeQuery(SQL);

                if (resultado.next() != resultado.isAfterLast()) {
                    // String id = resultado.getString("id");
                    String usuario = resultado.getString("NoTarjeta");
                    String nombre = resultado.getString("Nombre");
                    String clave = resultado.getString("Clave");
                    // String correo = resultado.getString("email");
                    // String balance = resultado.getString("balance");

                    if (numero.equals(usuario) && contraseña.equals(clave)) {

                        Inicio oInicio = new Inicio(contraseña);
                        oInicio.setVisible(true);
                        this.dispose();
                        Inicio.lbUsuario.setText(nombre);
                    } else {
                        lbAdvertencia.setText("Número o clave incorrectos");
                        volver1();
                    }
                } else {
                    lbAdvertencia.setText("La cuenta no existe");
                    volver1();
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println("Error al conectar" + e.getMessage());
            }
        }
    }

    private void txNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txNumeroCuenta.getText().length() == 5) {
            evt.consume();
        }
    }

    private void txContraseñaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txContraseña.getText().length() == 4) {
            evt.consume();
        }
    }

    private void limpiar() {
        txContraseña.setText("");
        txNumeroCuenta.setText("");
        lbAdvertencia.setText("");
    }

    private void volver1() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    limpiar();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }.start();
    }

}
