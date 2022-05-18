package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;

public class Cantidades extends javax.swing.JFrame {

    private javax.swing.JButton bt100000;
    private javax.swing.JButton bt20000;
    private javax.swing.JButton bt200000;
    private javax.swing.JButton bt300000;
    private javax.swing.JButton bt400000;
    private javax.swing.JButton bt50000;
    private javax.swing.JButton btOtro;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbFondo;

    private int temp;
    int amount1;

    public Cantidades() {
        initComponents();
    }

    String pass;

    public Cantidades(String p) {
        initComponents();
        pass = p;
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt20000 = new javax.swing.JButton();
        bt50000 = new javax.swing.JButton();
        bt100000 = new javax.swing.JButton();
        bt200000 = new javax.swing.JButton();
        bt300000 = new javax.swing.JButton();
        bt400000 = new javax.swing.JButton();
        btOtro = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbAdvertencia = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        bt20000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt20000.setForeground(new java.awt.Color(255, 255, 255));
        bt20000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        bt20000.setText("$20.000");
        bt20000.setBorderPainted(false);
        bt20000.setContentAreaFilled(false);
        bt20000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt20000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        bt20000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20000ActionPerformed(evt);
            }
        });

        bt50000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt50000.setForeground(new java.awt.Color(255, 255, 255));
        bt50000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        bt50000.setText("$50.000");
        bt50000.setBorderPainted(false);
        bt50000.setContentAreaFilled(false);
        bt50000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt50000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        bt50000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt50000ActionPerformed(evt);
            }
        });

        bt100000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt100000.setForeground(new java.awt.Color(255, 255, 255));
        bt100000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        bt100000.setText("$100.000");
        bt100000.setBorderPainted(false);
        bt100000.setContentAreaFilled(false);
        bt100000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt100000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        bt100000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt100000ActionPerformed(evt);
            }
        });

        bt200000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt200000.setForeground(new java.awt.Color(255, 255, 255));
        bt200000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        bt200000.setText("$200.000");
        bt200000.setBorderPainted(false);
        bt200000.setContentAreaFilled(false);
        bt200000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt200000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        bt200000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt200000ActionPerformed(evt);
            }
        });

        bt300000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt300000.setForeground(new java.awt.Color(255, 255, 255));
        bt300000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        bt300000.setText("$300.000");
        bt300000.setBorderPainted(false);
        bt300000.setContentAreaFilled(false);
        bt300000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt300000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        bt300000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt300000ActionPerformed(evt);
            }
        });

        bt400000.setFont(new java.awt.Font("Roboto", 1, 20));
        bt400000.setForeground(new java.awt.Color(255, 255, 255));
        bt400000.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        bt400000.setText("$400.000");
        bt400000.setBorderPainted(false);
        bt400000.setContentAreaFilled(false);
        bt400000.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt400000.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        bt400000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt400000ActionPerformed(evt);
            }
        });

        btOtro.setFont(new java.awt.Font("Roboto", 1, 20));
        btOtro.setForeground(new java.awt.Color(255, 255, 255));
        btOtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btOtro.setText("Otro valor");
        btOtro.setBorderPainted(false);
        btOtro.setContentAreaFilled(false);
        btOtro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOtro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btOtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOtroActionPerformed(evt);
            }
        });

        btVolver.setFont(new java.awt.Font("Roboto", 1, 20));
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btVolver.setText("Volver");
        btVolver.setBorderPainted(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 26));
        jLabel1.setForeground(new java.awt.Color(4, 89, 160));
        jLabel1.setText("Seleccione el valor a retirar");

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25));
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 340,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(bt20000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(bt300000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(bt50000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(bt400000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(bt100000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(bt200000, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt20000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt300000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt50000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt400000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt100000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt200000, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void bt20000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 20000) {

                    amount1 = 20000 * 4 / 1000;
                    setTemp((cbal - 20000) - amount1);

                    System.out.println(getTemp());
                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 20000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void volver1() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    lbAdvertencia.setText("");
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }.start();
    }

    private void bt50000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 50000) {

                    amount1 = 50000 * 4 / 1000;
                    setTemp((cbal - 50000) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 50000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void bt100000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 100000) {

                    amount1 = 100000 * 4 / 1000;
                    setTemp((cbal - 100000) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 100000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void bt200000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 200000) {

                    amount1 = 200000 * 4 / 1000;
                    setTemp((cbal - 200000) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 200000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void bt300000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 300000) {

                    amount1 = 300000 * 4 / 1000;
                    setTemp((cbal - 300000) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 300000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void bt400000ActionPerformed(java.awt.event.ActionEvent evt) {
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
                String numero = rs.getString("NoCuenta");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 400000) {

                    amount1 = 400000 * 4 / 1000;
                    setTemp((cbal - 400000) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Recibo oRecibo = new Recibo(pass);
                        oRecibo.setVisible(true);
                        Recibo.lbRetiro.setText(String.valueOf("$ 400000"));
                        Recibo.lbUsuario.setText(numero);
                        Recibo.lbSaldo.setText(String.valueOf("$ " + getTemp()));
                        Recibo.lbCosto.setText(String.valueOf("$ " + amount1));
                        Fecha();

                        dispose();
                    }
                } else {
                    lbAdvertencia.setText("No tiene suficiente dinero");
                    volver1();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private void btOtroActionPerformed(java.awt.event.ActionEvent evt) {
        Retiros oRetiros = new Retiros(pass);
        oRetiros.setVisible(true);
        dispose();
    }

    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {
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
                String nombre = rs.getString("Nombre");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 0) {

                    amount1 = 0 * 4 / 1000;
                    setTemp((cbal - 0) - amount1);

                    System.out.println(getTemp());

                    String SQL1 = "SELECT * FROM clientes";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(SQL1);

                    String strSQL = "Update clientes set balance = " + (getTemp()) + " where Clave = " + (pass);
                    int rowsEffected = stmt.executeUpdate(strSQL);
                    if (rowsEffected == 0) {
                        System.out.println("No se realizo el retiro");
                    } else {
                        Inicio oInicio = new Inicio(pass);
                        oInicio.setVisible(true);
                        Inicio.lbUsuario.setText(nombre);
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

    public void Fecha() {
        Calendar fecha = new GregorianCalendar();
        String anio = Integer.toString(fecha.get(Calendar.YEAR));
        String mes = Integer.toString(fecha.get(Calendar.MONTH) + 1);
        String dia = Integer.toString(fecha.get(Calendar.DATE));
        String fechaFin = dia + "/" + mes + "/" + anio;

        String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
        String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
        String horaFin = hora + ":" + minuto;

        Recibo.lbFecha.setText(fechaFin + " -- " + horaFin);
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

}
