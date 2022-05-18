package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class CambioClave extends javax.swing.JFrame {

    private javax.swing.JButton btCambiar;
    private javax.swing.JButton btVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAdvertencia;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JLabel lbTitulo3;
    private javax.swing.JLabel lbTitulo4;
    private javax.swing.JPasswordField txClaveAntigua;
    private javax.swing.JPasswordField txClaveNueva;
    private javax.swing.JPasswordField txClaveReNueva;

    public CambioClave() {
        initComponents();
    }

    String pass;

    public CambioClave(String p) {
        initComponents();
        pass = p;
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());

    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo3 = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        lbTitulo2 = new javax.swing.JLabel();
        txClaveAntigua = new javax.swing.JPasswordField();
        txClaveNueva = new javax.swing.JPasswordField();
        txClaveReNueva = new javax.swing.JPasswordField();
        btCambiar = new javax.swing.JButton();
        btVolver = new javax.swing.JButton();
        lbTitulo4 = new javax.swing.JLabel();
        lbAdvertencia = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lbTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo3.setFont(new java.awt.Font("Roboto", 1, 20));
        lbTitulo3.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo3.setText("Vuelva a ingresar su nueva clave");

        lbTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo1.setFont(new java.awt.Font("Roboto", 1, 20));
        lbTitulo1.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo1.setText("Ingrese su clave anterior");

        lbTitulo2.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo2.setFont(new java.awt.Font("Roboto", 1, 20));
        lbTitulo2.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo2.setText("Ingrese su nueva clave");

        txClaveAntigua.setFont(new java.awt.Font("Segoe UI", 0, 26));
        txClaveAntigua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txClaveAntigua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txClaveAntiguaKeyTyped(evt);
            }
        });

        txClaveNueva.setFont(new java.awt.Font("Segoe UI", 0, 26));
        txClaveNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txClaveNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txClaveNuevaKeyTyped(evt);
            }
        });

        txClaveReNueva.setFont(new java.awt.Font("Segoe UI", 0, 26));
        txClaveReNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txClaveReNueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txClaveReNuevaKeyTyped(evt);
            }
        });

        btCambiar.setFont(new java.awt.Font("Roboto", 1, 20));
        btCambiar.setForeground(new java.awt.Color(240, 240, 240));
        btCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
        btCambiar.setText("Cambiar");
        btCambiar.setBorderPainted(false);
        btCambiar.setContentAreaFilled(false);
        btCambiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCambiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
        btCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarActionPerformed(evt);
            }
        });

        btVolver.setFont(new java.awt.Font("Roboto", 1, 20));
        btVolver.setForeground(new java.awt.Color(240, 240, 240));
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

        lbTitulo4.setFont(new java.awt.Font("Tahoma", 1, 24));
        lbTitulo4.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo4.setText("Presione \"cambiar\"");

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25));
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAdvertencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(txClaveAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(lbTitulo2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(txClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(lbTitulo3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(lbTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 436,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(540, 540, 540)
                                .addComponent(btCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(txClaveReNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                javax.swing.GroupLayout.PREFERRED_SIZE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(lbTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txClaveAntigua, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lbTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txClaveNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lbTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(lbTitulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(btCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(700, 700, 700)
                                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addComponent(txClaveReNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
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
                String nombre = rs.getString("Nombre");
                // String cpass = rs.getString("Clave");
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

    private void btCambiarActionPerformed(java.awt.event.ActionEvent evt) {
        String old_pass = new String(txClaveAntigua.getPassword());
        String new_pass = new String(txClaveNueva.getPassword());
        String re_new_pass = new String(txClaveReNueva.getPassword());

        if (old_pass.isEmpty()) {
            lbAdvertencia.setText("Ingrese su clave antigua");
        } else if (new_pass.isEmpty() && re_new_pass.isEmpty()) {
            lbAdvertencia.setText("Ingrese su nueva clave");
        } else if (new_pass.equals(re_new_pass)) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2", "root",
                        "2018");
                Statement stmt = null;
                ResultSet rs = null;

                String SQL = "SELECT * FROM clientes WHERE Clave like '%" + (old_pass) + "%'";

                stmt = con.createStatement();
                rs = stmt.executeQuery(SQL);

                if (rs.next() != rs.isAfterLast()) {

                    String cpass = rs.getString("Clave");

                    if (cpass.equals(old_pass)) {
                        String SQL1 = "SELECT * FROM clientes";
                        stmt = con.createStatement();
                        rs = stmt.executeQuery(SQL1);

                        String strSQL = "Update clientes set Clave = " + (new_pass) + " where Clave = " + (old_pass);
                        int rowsEffected = stmt.executeUpdate(strSQL);
                        if (rowsEffected == 0) {
                            System.out.println("No pudo cambiarse");
                        } else {
                            System.out.println("La clave ha cambiada");
                            volver();
                        }
                    }
                    con.close();
                    stmt.close();
                    rs.close();
                } else {
                    lbAdvertencia.setText("La clave antigua no coincide");
                    txClaveAntigua.setText("");
                    txClaveNueva.setText("");
                    txClaveReNueva.setText("");
                    limpiar();
                    volver1();
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println("Error" + e.getMessage());
            }
        } else {
            lbAdvertencia.setText("Las claves no coinciden");
            limpiar();
            volver1();
        }
    }

    private void txClaveAntiguaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txClaveAntigua.getText().length() == 4) {
            evt.consume();
        }
    }

    private void txClaveNuevaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txClaveNueva.getText().length() == 4) {
            evt.consume();
        }
    }

    private void txClaveReNuevaKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txClaveReNueva.getText().length() == 4) {
            evt.consume();
        }
    }

    private void volver() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    Final oFinal = new Final();
                    oFinal.setVisible(true);
                    dispose();
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }.start();
    }

    private void limpiar() {
        txClaveAntigua.setText("");
        txClaveNueva.setText("");
        txClaveReNueva.setText("");
    }

    private void volver1() {
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    lbAdvertencia.setText("");
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }.start();
    }

}
