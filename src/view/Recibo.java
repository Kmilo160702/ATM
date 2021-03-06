package view;

import javax.swing.ImageIcon;

public class Recibo extends javax.swing.JFrame {

        public static javax.swing.JButton btImprimir;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JLabel lbAdvertencia;
        public static javax.swing.JLabel lbCosto;
        public static javax.swing.JLabel lbFecha;
        private javax.swing.JLabel lbFondo;
        public static javax.swing.JLabel lbRetiro;
        public static javax.swing.JLabel lbSaldo;
        public static javax.swing.JLabel lbUsuario;

        public Recibo() {
                setUndecorated(true);
                initComponents();
        }

        String pass;

        public Recibo(String p) {
                initComponents();
                pass = p;
                setLocationRelativeTo(null);
                setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                lbFecha = new javax.swing.JLabel();
                lbSaldo = new javax.swing.JLabel();
                lbRetiro = new javax.swing.JLabel();
                lbUsuario = new javax.swing.JLabel();
                lbCosto = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                btImprimir = new javax.swing.JButton();
                lbAdvertencia = new javax.swing.JLabel();
                lbFondo = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
                jPanel2.setForeground(new java.awt.Color(153, 153, 153));
                jPanel2.setMaximumSize(new java.awt.Dimension(200, 200));

                lbFecha.setFont(new java.awt.Font("Roboto", 0, 17));
                lbFecha.setForeground(new java.awt.Color(125, 125, 125));
                lbFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbFecha.setText("jLabel1");

                lbSaldo.setFont(new java.awt.Font("Roboto", 0, 18));
                lbSaldo.setForeground(new java.awt.Color(102, 102, 102));
                lbSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lbSaldo.setText("jLabel1");

                lbRetiro.setFont(new java.awt.Font("Roboto", 0, 18));
                lbRetiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbRetiro.setText("jLabel2");

                lbUsuario.setFont(new java.awt.Font("Roboto", 0, 18));
                lbUsuario.setForeground(new java.awt.Color(102, 102, 102));
                lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lbUsuario.setText("jLabel1");

                lbCosto.setFont(new java.awt.Font("Roboto", 0, 18));
                lbCosto.setForeground(new java.awt.Color(102, 102, 102));
                lbCosto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                lbCosto.setText("jLabel1");

                jLabel1.setFont(new java.awt.Font("Roboto", 1, 18));
                jLabel1.setForeground(new java.awt.Color(102, 102, 102));
                jLabel1.setText("Numero Cuenta:");

                jLabel3.setFont(new java.awt.Font("Roboto", 1, 18));
                jLabel3.setForeground(new java.awt.Color(102, 102, 102));
                jLabel3.setText("Saldo:");

                jLabel5.setFont(new java.awt.Font("Roboto", 1, 18));
                jLabel5.setForeground(new java.awt.Color(102, 102, 102));
                jLabel5.setText("Costo:");

                jLabel6.setFont(new java.awt.Font("Roboto", 1, 24));
                jLabel6.setForeground(new java.awt.Color(2, 61, 110));
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel6.setText("BANCO DE BOGOT??");

                jLabel7.setFont(new java.awt.Font("Roboto", 1, 16));
                jLabel7.setForeground(new java.awt.Color(4, 89, 160));
                jLabel7.setText("??RETIRO EXITOSO!");

                jLabel2.setForeground(new java.awt.Color(153, 153, 153));
                jLabel2.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

                jLabel4.setForeground(new java.awt.Color(153, 153, 153));
                jLabel4.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                55,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel1))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(lbSaldo,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                137,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(lbCosto,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                137,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(lbUsuario,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                137,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addContainerGap())
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel2Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(lbRetiro,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(lbFecha,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jLabel7))
                                                                                                                .addGap(114, 114,
                                                                                                                                114))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(53, Short.MAX_VALUE)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                285,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4))
                                                                .addGap(30, 30, 30)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                53,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lbRetiro)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(lbFecha)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbSaldo,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(lbCosto))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbUsuario)
                                                                                .addComponent(jLabel1))
                                                                .addContainerGap(112, Short.MAX_VALUE)));

                btImprimir.setFont(new java.awt.Font("Roboto", 1, 20));
                btImprimir.setForeground(new java.awt.Color(255, 255, 255));
                btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
                btImprimir.setText("Imprimir");
                btImprimir.setBorderPainted(false);
                btImprimir.setContentAreaFilled(false);
                btImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
                btImprimir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btImprimirActionPerformed(evt);
                        }
                });

                lbAdvertencia.setFont(new java.awt.Font("Roboto", 1, 22));
                lbAdvertencia.setForeground(new java.awt.Color(4, 89, 160));

                lbFondo.setFont(new java.awt.Font("Roboto", 1, 26));
                lbFondo.setForeground(new java.awt.Color(4, 89, 160));
                lbFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(300, 300, 300)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(300, 300, 300)
                                                                .addComponent(lbAdvertencia,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                370,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(540, 540, 540)
                                                                .addComponent(btImprimir,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(160, 160, 160)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(lbAdvertencia,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(80, 80, 80)
                                                                .addComponent(btImprimir,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 810,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {
                volver1();
                volver();
        }

        private void volver1() {
                new Thread() {
                        @Override
                        public void run() {
                                try {
                                        Thread.sleep(1000);
                                        btImprimir.setVisible(false);
                                        lbAdvertencia.setText("Imprimiendo...");
                                } catch (InterruptedException ex) {
                                        System.out.println(ex.getMessage());
                                }
                        }
                }.start();
        }

        private void volver() {
                new Thread() {
                        @Override
                        public void run() {
                                try {
                                        Thread.sleep(4000);
                                        Final oFinal = new Final();
                                        oFinal.setVisible(true);
                                        dispose();
                                } catch (InterruptedException ex) {
                                        System.out.println(ex.getMessage());
                                }
                        }
                }.start();
        }

}
