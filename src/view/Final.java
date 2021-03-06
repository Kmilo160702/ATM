package view;

import javax.swing.ImageIcon;

public class Final extends javax.swing.JFrame {

        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel lbFondo;
        private javax.swing.JLabel lbTitulo1;
        private javax.swing.JLabel lbTitulo2;
        private javax.swing.JLabel lbTitulo3;
        private javax.swing.JLabel lbTitulo4;
        private javax.swing.JLabel lbTitulo5;

        public Final() {
                setUndecorated(true);
                initComponents();
                setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
                setResizable(false);
                setLocationRelativeTo(null);
                getObjetos();
                detener();
        }

        private void getObjetos() {
                lbTitulo1.setText("Transacción");
                lbTitulo2.setText("finalizada");
                lbTitulo3.setText("Gracias por utilizar");
                lbTitulo4.setText("nuestra red de cajeros");
                lbTitulo5.setText("No olvide retirar su tarjeta");
        }

        private void detener() {
                new Thread() {
                        @Override
                        public void run() {
                                try {
                                        Thread.sleep(4000);
                                        NumeroCuenta oNumeroCuenta = new NumeroCuenta();
                                        oNumeroCuenta.setVisible(true);
                                        dispose();
                                } catch (InterruptedException ex) {
                                        System.out.println(ex.getMessage());
                                }
                        }
                }.start();
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                lbTitulo1 = new javax.swing.JLabel();
                lbTitulo2 = new javax.swing.JLabel();
                lbTitulo3 = new javax.swing.JLabel();
                lbTitulo4 = new javax.swing.JLabel();
                lbTitulo5 = new javax.swing.JLabel();
                lbFondo = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                lbTitulo1.setFont(new java.awt.Font("Roboto", 1, 50));
                lbTitulo1.setForeground(new java.awt.Color(4, 89, 160));
                lbTitulo1.setText("lb1");

                lbTitulo2.setFont(new java.awt.Font("Roboto", 0, 35));
                lbTitulo2.setForeground(new java.awt.Color(4, 89, 160));
                lbTitulo2.setText("lb2");

                lbTitulo3.setFont(new java.awt.Font("Roboto", 0, 40));
                lbTitulo3.setForeground(new java.awt.Color(102, 102, 102));
                lbTitulo3.setText("lb3");

                lbTitulo4.setFont(new java.awt.Font("Roboto", 0, 25));
                lbTitulo4.setForeground(new java.awt.Color(102, 102, 102));
                lbTitulo4.setText("lb4");

                lbTitulo5.setFont(new java.awt.Font("Roboto", 0, 28));
                lbTitulo5.setForeground(new java.awt.Color(76, 165, 237));
                lbTitulo5.setText("lb5");

                lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(400, 400, 400)
                                                                .addComponent(lbTitulo4))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(350, 350, 350)
                                                                .addComponent(lbTitulo5))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(130, 130, 130)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                800,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(430, 430, 430)
                                                                .addComponent(lbTitulo2))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(350, 350, 350)
                                                                .addComponent(lbTitulo3))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(360, 360, 360)
                                                                .addComponent(lbTitulo1))
                                                .addComponent(lbFondo));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(490, 490, 490)
                                                                .addComponent(lbTitulo4)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(lbTitulo5))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(343, 343, 343)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(270, 270, 270)
                                                                .addComponent(lbTitulo2))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(430, 430, 430)
                                                                .addComponent(lbTitulo3))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(210, 210, 210)
                                                                .addComponent(lbTitulo1))
                                                .addComponent(lbFondo));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
        }

}
