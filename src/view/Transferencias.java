package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Transferencias extends javax.swing.JFrame {

    private javax.swing.JButton btTransferir;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPasswordField txClave;
    private javax.swing.JTextField txMonto;
    private javax.swing.JTextField txNoCuenta;

    public Transferencias() {
        initComponents();
    }

    String pass;

    public Transferencias(String p) {
        initComponents();
        pass = p;
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txNoCuenta = new javax.swing.JTextField();
        btTransferir = new javax.swing.JButton();
        txMonto = new javax.swing.JTextField();
        txClave = new javax.swing.JPasswordField();
        btVolver = new javax.swing.JButton();
        lbAdvertencia = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 26));
        jLabel3.setForeground(new java.awt.Color(4, 89, 160));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese su clave");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 26));
        jLabel2.setForeground(new java.awt.Color(4, 89, 160));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Monto");

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 26));
        jLabel1.setForeground(new java.awt.Color(4, 89, 160));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese número de cuenta destinataria");

        txNoCuenta.setFont(new java.awt.Font("Roboto", 0, 24));
        txNoCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNoCuentaKeyTyped(evt);
            }
        });

        btTransferir.setFont(new java.awt.Font("Roboto", 1, 20));
        btTransferir.setForeground(new java.awt.Color(240, 240, 240));
        btTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btTransferir.setText("Transferir");
        btTransferir.setBorderPainted(false);
        btTransferir.setContentAreaFilled(false);
        btTransferir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTransferir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });

        txMonto.setFont(new java.awt.Font("Roboto", 0, 24));
        txMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txMontoKeyTyped(evt);
            }
        });

        txClave.setFont(new java.awt.Font("Roboto", 0, 24));
        txClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txClaveKeyTyped(evt);
            }
        });

        btVolver.setFont(new java.awt.Font("Roboto", 1, 20));
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        btVolver.setText("Volver");
        btVolver.setBorderPainted(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVolver.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25));
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(txClave, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(440, 440, 440)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(btTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(txNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(txMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(390, 390, 390)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(580, 580, 580)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addComponent(txClave, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(btTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(txNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(txMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(450, 450, 450)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {
        int amount = Integer.parseInt(txMonto.getText());
        String amt1 = txMonto.getText();
        String pass2 = new String(txClave.getPassword());
        String username1 = txNoCuenta.getText();
        if (username1.isEmpty() && amt1.isEmpty() && pass2.isEmpty()) {
            lbAdvertencia.setText("Ingrese Monto, Clave y NoCuenta");
        } else if (username1.isEmpty()) {
            lbAdvertencia.setText("Ingrese NoCuenta");
        } else if (amt1.isEmpty()) {
            lbAdvertencia.setText("Ingrese Monto");
        } else if (pass2.isEmpty()) {
            lbAdvertencia.setText("Ingrese clave");
        } else {

            if (pass2.equals(pass)) {

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2",
                            "root", "2018");
                    Statement stmt = null;
                    ResultSet rs = null;

                    String SQL = "SELECT * FROM clientes WHERE Clave like '%" + (pass) + "%'";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL);

                    if (rs.next() != rs.isAfterLast()) {
                        String cpass = rs.getString("Clave");
                        int cbal = Integer.parseInt(rs.getString("balance"));
                        if (cpass.equals(pass) && amount <= cbal) {
                            int temp = cbal - amount;
                            user_transfer(username1, amount);

                            System.out.println(temp);

                            String SQL1 = "SELECT * FROM clientes";
                            stmt = con.createStatement();
                            rs = stmt.executeQuery(SQL1);

                            String strSQL = "Update clientes set balance = " + (temp) + " where Clave = " + (pass);
                            int rowsEffected = stmt.executeUpdate(strSQL);
                            if (rowsEffected == 0) {
                                lbAdvertencia.setText("No se pudo realizar la transacion");
                            } else {
                                Final oFinal = new Final();
                                oFinal.setVisible(true);
                                dispose();
                                System.out.println("Realizada");
                            }
                        } else {
                            lbAdvertencia.setText("No tienes suficiente dinero");
                            volver1();
                        }

                        con.close();
                        stmt.close();
                        rs.close();

                    }
                } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                    System.out.println("Error" + e.getMessage());
                }

            } else {
                lbAdvertencia.setText("Clave incorrecta");
                volver1();
            }

        }

    }

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {
        int amount1;
        int temp;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2", "root",
                    "2018");
            Statement stmt = null;
            ResultSet rs = null;

            String SQL = "SELECT * FROM clientes WHERE Clave like '%" + (pass) + "%'";

            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            if (rs.next() != rs.isAfterLast()) {
                String cuser = rs.getString("Nombre");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 0) {

                    amount1 = 0 * 4 / 1000;
                    temp = ((cbal - 0) - amount1);

                    System.out.println(temp);
                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (temp) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Inicio oInicio = new Inicio(pass);
                        oInicio.setVisible(true);
                        Inicio.lbUsuario.setText(cuser);

                        dispose();
                    }
                } else {
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    private void txMontoKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }

    private void txClaveKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txClave.getText().length() == 4) {
            evt.consume();
        }
    }

    private void txNoCuentaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txNoCuenta.getText().length() == 6) {
            evt.consume();
        }
    }

    private void limpiar() {
        txMonto.setText("");
        txClave.setText("");
        txNoCuenta.setText("");
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

    private void user_transfer(String user, int amt) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2", "root",
                    "2018");
            Statement stmt = null;
            ResultSet rs = null;

            String SQL = "SELECT * FROM clientes WHERE NoCuenta like '%" + (user) + "%'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            if (rs.next() != rs.isAfterLast()) {
                String cpass = rs.getString("Clave");
                String cuser = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cuser.equals(user)) {
                    int temp = cbal + amt;

                    System.out.println(temp);

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (temp) + " where Clave = " + (cpass);
                    int rowsEffected = stmt.executeUpdate(strSQL);

                } else {
                    System.out.println("El usuario no existe");
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());

        }

    }
}
