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

public class Retiros extends javax.swing.JFrame {

    private javax.swing.JButton btRetirar;
    private javax.swing.JButton btVolver;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JTextField txMonto;

    private int temp;
    int amount;
    int amount1;

    public Retiros() {
        initComponents();
    }

    String pass;

    public Retiros(String p) {
        initComponents();
        pass = p;
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        btRetirar = new javax.swing.JButton();
        txMonto = new javax.swing.JTextField();
        btVolver = new javax.swing.JButton();
        lbTitulo2 = new javax.swing.JLabel();
        lbAdvertencia = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbTitulo1.setFont(new java.awt.Font("Roboto", 1, 26));
        lbTitulo1.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo1.setText("Ingrese el monto que desea retirar");

        btRetirar.setFont(new java.awt.Font("Roboto", 1, 20));
        btRetirar.setForeground(new java.awt.Color(240, 240, 240));
        btRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btRetirar.setText("Retirar");
        btRetirar.setBorderPainted(false);
        btRetirar.setContentAreaFilled(false);
        btRetirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRetirar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });

        txMonto.setFont(new java.awt.Font("Roboto", 0, 24));
        txMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txMontoKeyReleased(evt);
            }

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txMontoKeyTyped(evt);
            }
        });

        btVolver.setFont(new java.awt.Font("Roboto", 1, 20));
        btVolver.setForeground(new java.awt.Color(255, 255, 255));
        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
        btVolver.setText("Volver");
        btVolver.setBorderPainted(false);
        btVolver.setContentAreaFilled(false);
        btVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        lbTitulo2.setFont(new java.awt.Font("Roboto", 1, 26));
        lbTitulo2.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo2.setText("Presione \"Retirar\"");

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25));
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAdvertencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbFondo.setFont(new java.awt.Font("Roboto", 1, 26));
        lbFondo.setForeground(new java.awt.Color(4, 89, 160));
        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 420,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(txMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(btRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(lbTitulo2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 821,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(txMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)
                                .addComponent(btRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(440, 440, 440)
                                .addComponent(lbTitulo2))
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }

    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {

        amount = (Integer.parseInt(txMonto.getText()));

        if (amount > 2500000) {
            lbAdvertencia.setText("No puedes retirar mas de 2.500.000");
            volver1();
        } else if (amount % 50000 != 0 && amount % 20000 != 0) {
            lbAdvertencia.setText("No puede retirar");
            volver1();

        } else {

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
                    // String cuser = rs.getString("NoTarjeta");
                    String numero = rs.getString("NoCuenta");
                    // String cpass = rs.getString("Clave");
                    int cbal = Integer.parseInt(rs.getString("balance"));
                    if (cbal >= amount) {

                        amount1 = amount * 4 / 1000;
                        setTemp((cbal - amount) - amount1);

                        System.out.println(getTemp());
                        // System.out.println(amount);

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
                            Recibo.lbRetiro.setText("$ " + txMonto.getText());
                            Recibo.lbUsuario.setText(numero);
                            Recibo.lbSaldo.setText(String.valueOf(getTemp()));
                            Recibo.lbCosto.setText(String.valueOf(amount1));
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
                // String cuser = rs.getString("NoTarjeta");
                // String cpass = rs.getString("Clave");
                String nombre = rs.getString("Nombre");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 0) {

                    amount1 = 0 * 4 / 1000;
                    temp = ((cbal - 0) - amount1);

                    // System.out.println(temp);
                    // System.out.println(amount);
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
                        Inicio.lbUsuario.setText(nombre);
                        dispose();
                    }
                } else {
                    // lbAdvertencia.setText("No tiene suficiente dinero");
                    // limpiar();
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    private void limpiar() {
        txMonto.setText("");
    }

    private void volver1() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    lbAdvertencia.setText("");
                    limpiar();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }.start();
    }

    private void txMontoKeyReleased(java.awt.event.KeyEvent evt) {
        if (txMonto.getText().length() > 0) {
            if (Integer.parseInt(txMonto.getText()) % 50000 != 0 && Integer.parseInt(txMonto.getText()) % 20000 != 0) {
                lbAdvertencia.setText("Solo puedes retirar multiplos de 20.000 o de 50.000");
            } else {
                lbAdvertencia.setText("");
            }
        }
    }

    private void txMontoKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
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
