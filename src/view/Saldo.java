package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Saldo extends javax.swing.JFrame {

    private javax.swing.JLabel Saldo;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btVolver;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo;

    private String cuser;

    public Saldo() {
        setUndecorated(true);
        initComponents();
    }

    String pass;

    public Saldo(String p) {
        initComponents();
        pass = p;
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        Saldo = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbTitulo.setFont(new java.awt.Font("Roboto", 1, 26));
        lbTitulo.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo.setText("Presione \"Consultar\" para ver su saldo");

        btConsultar.setFont(new java.awt.Font("Roboto", 1, 20));
        btConsultar.setForeground(new java.awt.Color(240, 240, 240));
        btConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btConsultar.setText("Consultar");
        btConsultar.setBorderPainted(false);
        btConsultar.setContentAreaFilled(false);
        btConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
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

        Saldo.setFont(new java.awt.Font("Roboto", 0, 26));
        Saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Saldo.setText("xxx.xxx.xxx");

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 460,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(370, 370, 370)
                                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 250,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(430, 430, 430)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
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

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {

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
                String cpass = rs.getString("Clave");
                String cbal = rs.getString("balance");
                if (cpass.equals(pass)) {
                    Saldo.setText("$" + cbal);
                    getObjetos(false);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void getObjetos(boolean estConsultar) {
        btConsultar.setText("Volver");
        setEstaoBotones(estConsultar);
    }

    private void setEstaoBotones(boolean estConsultar) {
        btConsultar.setEnabled(estConsultar);
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
                String nombre = rs.getString("Nombre");
                int cbal = Integer.parseInt(rs.getString("balance"));
                if (cbal >= 0) {

                    amount1 = 0 * 4 / 1000;
                    temp = ((cbal - 0) - amount1);

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
                }
                con.close();
                stmt.close();
                rs.close();
            }
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }
}
