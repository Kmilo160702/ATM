package view;

import javax.swing.ImageIcon;

public class Inicio extends javax.swing.JFrame {

        private javax.swing.JButton btCambioClave;
        private javax.swing.JButton btCancelar;
        private javax.swing.JButton btConsulta;
        private javax.swing.JButton btRetiros;
        private javax.swing.JButton btTransferencia;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        public static javax.swing.JLabel lbBienvenido;
        private javax.swing.JLabel lbFondo;
        private javax.swing.JLabel lbTitulo;
        public static javax.swing.JLabel lbUsuario;

        public Inicio() {
                setUndecorated(false);
                initComponents();
        }

        String pass;

        public Inicio(String p) {
                initComponents();
                pass = p;
                setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                btTransferencia = new javax.swing.JButton();
                btCambioClave = new javax.swing.JButton();
                btCancelar = new javax.swing.JButton();
                btConsulta = new javax.swing.JButton();
                btRetiros = new javax.swing.JButton();
                lbTitulo = new javax.swing.JLabel();
                lbBienvenido = new javax.swing.JLabel();
                lbUsuario = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                lbFondo = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setUndecorated(true);
                setResizable(false);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

                btTransferencia.setFont(new java.awt.Font("Roboto", 1, 20));
                btTransferencia.setForeground(new java.awt.Color(240, 240, 240));
                btTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
                btTransferencia.setText("Transferencias");
                btTransferencia.setBorderPainted(false);
                btTransferencia.setContentAreaFilled(false);
                btTransferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btTransferencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
                btTransferencia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btTransferenciaActionPerformed(evt);
                        }
                });

                btCambioClave.setFont(new java.awt.Font("Roboto", 1, 20));
                btCambioClave.setForeground(new java.awt.Color(240, 240, 240));
                btCambioClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
                btCambioClave.setText("Cambio clave");
                btCambioClave.setBorderPainted(false);
                btCambioClave.setContentAreaFilled(false);
                btCambioClave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btCambioClave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
                btCambioClave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btCambioClaveActionPerformed(evt);
                        }
                });

                btCancelar.setFont(new java.awt.Font("Roboto", 1, 20));
                btCancelar.setForeground(new java.awt.Color(240, 240, 240));
                btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
                btCancelar.setText("Cancelar");
                btCancelar.setBorderPainted(false);
                btCancelar.setContentAreaFilled(false);
                btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
                btCancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btCancelarActionPerformed(evt);
                        }
                });

                btConsulta.setFont(new java.awt.Font("Roboto", 1, 20));
                btConsulta.setForeground(new java.awt.Color(240, 240, 240));
                btConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png")));
                btConsulta.setText("Consultar saldo");
                btConsulta.setBorderPainted(false);
                btConsulta.setContentAreaFilled(false);
                btConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btConsulta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png")));
                btConsulta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btConsultaActionPerformed(evt);
                        }
                });

                btRetiros.setFont(new java.awt.Font("Roboto", 1, 20));
                btRetiros.setForeground(new java.awt.Color(240, 240, 240));
                btRetiros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png")));
                btRetiros.setText("Retiros cuenta de ahorros");
                btRetiros.setBorderPainted(false);
                btRetiros.setContentAreaFilled(false);
                btRetiros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btRetiros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png")));
                btRetiros.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btRetirosActionPerformed(evt);
                        }
                });

                lbTitulo.setFont(new java.awt.Font("Roboto", 1, 26));
                lbTitulo.setForeground(new java.awt.Color(4, 89, 160));
                lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbTitulo.setText("Seleccione su transacción");

                lbBienvenido.setFont(new java.awt.Font("Roboto", 1, 50));
                lbBienvenido.setForeground(new java.awt.Color(4, 89, 160));
                lbBienvenido.setText("Bienvenido");

                lbUsuario.setFont(new java.awt.Font("Roboto", 0, 35));
                lbUsuario.setForeground(new java.awt.Color(102, 102, 102));
                lbUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbUsuario.setText("jLabel1");

                lbFondo.setForeground(new java.awt.Color(4, 89, 160));
                lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png")));
                lbFondo.setText("S");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(88, 88, 88)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                850,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addComponent(btTransferencia,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(79, 79, 79)
                                                                .addComponent(btConsulta,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addComponent(btCambioClave,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(358, 358, 358)
                                                                .addComponent(lbBienvenido))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(338, 338, 338)
                                                                .addComponent(lbTitulo))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(538, 538, 538)
                                                                .addComponent(btCancelar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(78, 78, 78)
                                                                .addComponent(btRetiros,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                381,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lbFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1000,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(87, 87, 87)
                                                                .addComponent(lbUsuario,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                853,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(198, 198, 198)
                                                                .addComponent(lbUsuario)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(350, 350, 350)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btTransferencia,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                69,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btConsulta,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                69,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(11, 11, 11)
                                                                .addComponent(btCambioClave,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(128, 128, 128)
                                                                .addComponent(lbBienvenido))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(288, 288, 288)
                                                                .addComponent(lbTitulo))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(698, 698, 698)
                                                                .addComponent(btCancelar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(538, 538, 538)
                                                                .addComponent(btRetiros,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
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

        private void btRetirosActionPerformed(java.awt.event.ActionEvent evt) {
                Cantidades oCantidades = new Cantidades(pass);
                oCantidades.setVisible(true);
                this.dispose();
        }

        private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {
                NumeroCuenta oNumeroCuenta = new NumeroCuenta();
                oNumeroCuenta.setVisible(true);
                this.dispose();
        }

        private void btCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {
                CambioClave oCambioClave = new CambioClave(pass);
                oCambioClave.setVisible(true);
                dispose();
        }

        private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {
                Saldo oSaldo = new Saldo(pass);
                oSaldo.setVisible(true);
                dispose();
        }

        private void btTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {
                Transferencias oTransferencias = new Transferencias(pass);
                oTransferencias.setVisible(true);
                dispose();
        }

}
