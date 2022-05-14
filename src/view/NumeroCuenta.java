package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author camil
 */
public class NumeroCuenta extends javax.swing.JFrame {

    Statement estado = null;
    ResultSet resultado = null;

    /**
     * Creates new form NumeroCuenta
     */
    public NumeroCuenta() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
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

        txNumeroCuenta.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txNumeroCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNumeroCuentaKeyTyped(evt);
            }
        });

        txContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txContraseñaKeyTyped(evt);
            }
        });

        btIngresar.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        btIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        btIngresar.setText("Ingresar");
        btIngresar.setBorderPainted(false);
        btIngresar.setContentAreaFilled(false);
        btIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        lbAdvertencia.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        lbAdvertencia.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvertencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbNoCuenta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbNoCuenta.setForeground(new java.awt.Color(4, 89, 160));
        lbNoCuenta.setText("Número de cuenta");

        lbClave.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbClave.setForeground(new java.awt.Color(4, 89, 160));
        lbClave.setText("Clave");

        lbTitulo1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo1.setText("Ingrese su número de cuenta y clave");

        lbTitulo2.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        lbTitulo2.setForeground(new java.awt.Color(4, 89, 160));
        lbTitulo2.setText("Presione \"Ingresar\"");

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N

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
                .addComponent(txNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(lbClave))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(lbTitulo2))
            .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(700, 700, 700)
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(lbTitulo2))
            .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(lbTitulo1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lbNoCuenta))
                            .addComponent(txNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(txContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(lbClave)))
                .addGap(75, 75, 75)
                .addComponent(lbAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        String numero = txNumeroCuenta.getText();
        String contraseña = new String(txContraseña.getPassword());

        if (numero.isEmpty() && contraseña.isEmpty()) {
        } else if (numero.isEmpty()) {
        } else if (contraseña.isEmpty()) {
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm2", "root", "2018");
                String SQL = "SELECT * FROM details WHERE username like '%" + (numero) + "%'";

                estado = con.createStatement();
                resultado = estado.executeQuery(SQL);

                if (resultado.next() != resultado.isAfterLast()) {
                    String id = resultado.getString("id");
                    String usuario = resultado.getString("username");
                    String clave = resultado.getString("password");
                    String correo = resultado.getString("email");
                    String balance = resultado.getString("balance");

                    if (numero.equals(usuario) && contraseña.equals(clave)) {
                        
                        Inicio oInicio = new Inicio(contraseña);
                        oInicio.setVisible(true);
                        this.dispose();
                        Inicio.lbUsuario.setText(usuario);
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
    }//GEN-LAST:event_btIngresarActionPerformed

    private void txNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNumeroCuentaKeyTyped

    }//GEN-LAST:event_txNumeroCuentaKeyTyped

    private void txContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txContraseñaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txContraseña.getText().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_txContraseñaKeyTyped
   private void limpiar(){
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
            java.util.logging.Logger.getLogger(NumeroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumeroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumeroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumeroCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumeroCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
