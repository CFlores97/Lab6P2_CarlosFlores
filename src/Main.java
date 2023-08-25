
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_portatil = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_pantalla = new javax.swing.JTextField();
        tf_bateria = new javax.swing.JTextField();
        cb_hasEstuche = new javax.swing.JComboBox<>();
        btn_addPortatil = new javax.swing.JButton();
        jd_estacionaria = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp_numcontroles = new javax.swing.JSpinner();
        tf_almacenamiento = new javax.swing.JTextField();
        cb_conexiones = new javax.swing.JComboBox<>();
        btn_addEstacionaria = new javax.swing.JButton();
        jp_showMenu = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Juegos = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_fabricante = new javax.swing.JTextField();
        tf_identificacion = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        tf_anyosUso = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_consolas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cb_tipoConsola = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pantalla:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bateria:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tiene Estuche:");

        cb_hasEstuche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cb_hasEstuche.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_hasEstucheItemStateChanged(evt);
            }
        });

        btn_addPortatil.setBackground(new java.awt.Color(51, 51, 51));
        btn_addPortatil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addPortatil.setForeground(new java.awt.Color(0, 0, 0));
        btn_addPortatil.setText("Agregar");
        btn_addPortatil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addPortatilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_bateria, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(tf_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_addPortatil, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_hasEstuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tf_bateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_hasEstuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btn_addPortatil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout jd_portatilLayout = new javax.swing.GroupLayout(jd_portatil.getContentPane());
        jd_portatil.getContentPane().setLayout(jd_portatilLayout);
        jd_portatilLayout.setHorizontalGroup(
            jd_portatilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_portatilLayout.setVerticalGroup(
            jd_portatilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero de Controles:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Almacenamiento:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo de Conexion:");

        cb_conexiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDMI", "USB-C", "USB", "AV-1", "AV-2" }));

        btn_addEstacionaria.setBackground(new java.awt.Color(51, 51, 51));
        btn_addEstacionaria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addEstacionaria.setForeground(new java.awt.Color(0, 0, 0));
        btn_addEstacionaria.setText("Agregar");
        btn_addEstacionaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addEstacionariaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_numcontroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_almacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_conexiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_addEstacionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sp_numcontroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_almacenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cb_conexiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btn_addEstacionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jd_estacionariaLayout = new javax.swing.GroupLayout(jd_estacionaria.getContentPane());
        jd_estacionaria.getContentPane().setLayout(jd_estacionariaLayout);
        jd_estacionariaLayout.setHorizontalGroup(
            jd_estacionariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_estacionariaLayout.setVerticalGroup(
            jd_estacionariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Modificar.setText("Modificar");
        Modificar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModificarItemStateChanged(evt);
            }
        });
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jp_showMenu.add(Modificar);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jp_showMenu.add(Eliminar);

        Juegos.setText("Ver Juegos");
        jp_showMenu.add(Juegos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 38, 38));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Consola");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identificacion:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fabricante:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Años de uso:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio:");

        tf_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_fabricanteActionPerformed(evt);
            }
        });

        tf_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_identificacionActionPerformed(evt);
            }
        });

        tf_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modeloActionPerformed(evt);
            }
        });

        jt_consolas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Fabricante", "Modelo", "Años de uso", "Precio", "Pantalla", "Bateria", "Estuche", "Controles", "Almacenamiento", "Tipo de Conexion", "Consola"
            }
        ));
        jt_consolas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_consolasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_consolas);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Consola:");

        cb_tipoConsola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portatil", "Estacionaria" }));
        cb_tipoConsola.setSelectedIndex(-1);
        cb_tipoConsola.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_tipoConsolaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(241, 241, 241))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(3, 3, 3)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_fabricante)
                                        .addComponent(tf_identificacion)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_anyosUso)
                                        .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_precio))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(395, 395, 395))
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_tipoConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(tf_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7)
                    .addComponent(cb_tipoConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(tf_fabricante))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(tf_modelo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(tf_anyosUso))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_fabricanteActionPerformed

    private void tf_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_identificacionActionPerformed

    private void tf_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_modeloActionPerformed

    private void cb_tipoConsolaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_tipoConsolaItemStateChanged

        if (cb_tipoConsola.getSelectedItem().equals("Portatil")) {
            jd_estacionaria.setVisible(false);
            jd_portatil.setVisible(true);
            jd_portatil.pack();
            jd_portatil.setLocationRelativeTo(this);
        }
        if (cb_tipoConsola.getSelectedItem().equals("Estacionaria")) {
            jd_portatil.setVisible(false);
            jd_estacionaria.setVisible(true);
            jd_estacionaria.pack();
            jd_estacionaria.setLocationRelativeTo(this);

        }
    }//GEN-LAST:event_cb_tipoConsolaItemStateChanged

    private void btn_addPortatilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addPortatilMouseClicked

        try {
            DefaultTableModel model = (DefaultTableModel) jt_consolas.getModel();
            Portatil temp = new Portatil(tf_pantalla.getText(), Integer.parseInt(tf_bateria.getText()), hasEst, tf_identificacion.getText(), tf_fabricante.getText(), tf_modelo.getText(), Integer.parseInt(tf_anyosUso.getText()), Integer.parseInt(tf_precio.getText()));
            String tieneEst = cb_hasEstuche.getSelectedItem().toString();
            Object[] row = {temp.getIdentificacion(), temp.getFabricante(), temp.getModelo(), temp.getAñosUso(), temp.getPrecio(), temp.getPantalla(), temp.getBateria(), tieneEst, 0, 0, 0, cb_tipoConsola.getSelectedItem().toString()};

            model.addRow(row);

            jt_consolas.setModel(model);

            jd_portatil.setVisible(false);

            tf_identificacion.setText("");
            tf_anyosUso.setText("");
            tf_almacenamiento.setText("");
            tf_fabricante.setText("");
            tf_modelo.setText("");
            tf_pantalla.setText("");
            tf_precio.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se puede agregar");
        }


    }//GEN-LAST:event_btn_addPortatilMouseClicked

    private void cb_hasEstucheItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_hasEstucheItemStateChanged
        if (cb_hasEstuche.getSelectedItem().equals("Si")) {
            hasEst = true;
        }
    }//GEN-LAST:event_cb_hasEstucheItemStateChanged

    private void btn_addEstacionariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addEstacionariaMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) jt_consolas.getModel();
            int numControles = Integer.parseInt(sp_numcontroles.getModel().getValue().toString());
            int almacenamiento = Integer.parseInt(tf_almacenamiento.getText());
            String conexiones = cb_conexiones.getModel().getSelectedItem().toString();

            Estacionaria temp = new Estacionaria(numControles, almacenamiento, conexiones, tf_identificacion.getText(), tf_fabricante.getText(), tf_modelo.getText(), Integer.parseInt(tf_anyosUso.getText()), Double.parseDouble(tf_precio.getText()));

            //Estacionaria temp = new Estacionaria((int)sp_numcontroles.getModel().getValue(), tf_almacenamiento.getText(), cb_conexiones.getModel().getSelectedItem(), tf_identificacion.getText(), tf_fabricante.getText(), tf_modelo.getText(), Integer.parseInt(tf_anyosUso.getText()), tf_precio.getText());
            Object[] row = {temp.getIdentificacion(), temp.getFabricante(), temp.getModelo(), temp.getAñosUso(), temp.getPrecio(), 0, 0, hasEst, temp.getNumControles(), temp.getAlmacenamiento(), temp.getTipoConexion(), cb_tipoConsola.getSelectedItem().toString()};

            model.addRow(row);

            jt_consolas.setModel(model);

            jd_estacionaria.setVisible(false);

            tf_identificacion.setText("");
            tf_anyosUso.setText("");
            tf_almacenamiento.setText("");
            tf_fabricante.setText("");
            tf_modelo.setText("");
            tf_pantalla.setText("");
            tf_precio.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se puede agregar");
        }
    }//GEN-LAST:event_btn_addEstacionariaMouseClicked

    private void jt_consolasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_consolasMouseClicked
        if (evt.isMetaDown()) {
            jp_showMenu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_consolasMouseClicked

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Object selRowType = jt_consolas.getValueAt(jt_consolas.getSelectedRow(), 11);

        DefaultTableModel model = (DefaultTableModel) jt_consolas.getModel();

        if (selRowType.equals("Portatil")) {

            String identificacion, fabricante, modelo;
            int añosUso;
            double precio;
            String pantalla;
            int bateria;
            boolean hasEstuche;

            identificacion = JOptionPane.showInputDialog("Ingrese la nueva identifiacion");
            fabricante = JOptionPane.showInputDialog("Ingrese el nuevo fabricante");
            modelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo");
            pantalla = JOptionPane.showInputDialog("Ingrese la pantalla");

            añosUso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de uso"));
            bateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la bateria"));

            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));

            String tieneEstuche = JOptionPane.showInputDialog("Tiene estuche? Responda si o no");

            if (tieneEstuche.equalsIgnoreCase("si")) {
                hasEstuche = true;
            } else {
                hasEstuche = false;
            }

            Portatil temp = new Portatil(pantalla, bateria, hasEstuche, identificacion, fabricante, modelo, añosUso, precio);

            Object[] row = {temp.getIdentificacion(), temp.getFabricante(), temp.getModelo(), temp.getAñosUso(), temp.getPrecio(), temp.getPantalla(), temp.getBateria(), hasEstuche, 0, 0, 0, cb_tipoConsola.getSelectedItem().toString()};

            int selRow = jt_consolas.getSelectedRow();
            model.removeRow(selRow);

            model.addRow(row);

            jt_consolas.setModel(model);

        }

        if (selRowType.equals("Estacionaria")) {

            String identificacion, fabricante, modelo;
            int añosUso;
            double precio;
            int numControles, almacenamiento;
            String tipoConexion;

            identificacion = JOptionPane.showInputDialog("Ingrese la nueva identifiacion");
            fabricante = JOptionPane.showInputDialog("Ingrese el nuevo fabricante");
            modelo = JOptionPane.showInputDialog("Ingrese el nuevo modelo");
            tipoConexion = JOptionPane.showInputDialog("Ingrese el tipo de conexion");

            añosUso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de uso"));
            numControles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de controles"));
            almacenamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el almacenamiento"));

            precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));

            Estacionaria temp = new Estacionaria(numControles, almacenamiento, tipoConexion, identificacion, fabricante, modelo, añosUso, precio);

            Object[] row = {temp.getIdentificacion(), temp.getFabricante(), temp.getModelo(), temp.getAñosUso(), temp.getPrecio(), 0, 0, hasEst, temp.getNumControles(), temp.getAlmacenamiento(), temp.getTipoConexion(), cb_tipoConsola.getSelectedItem().toString()};

            int selRow = jt_consolas.getSelectedRow();
            model.removeRow(selRow);

            model.addRow(row);

            jt_consolas.setModel(model);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int ans = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar la consola?");

        if (ans == JOptionPane.OK_OPTION) {
            DefaultTableModel model = (DefaultTableModel) jt_consolas.getModel();
            int selRow = jt_consolas.getSelectedRow();
            model.removeRow(selRow);
            jt_consolas.setModel(model);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModificarItemStateChanged

    }//GEN-LAST:event_ModificarItemStateChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public boolean hasEst;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Juegos;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton btn_addEstacionaria;
    private javax.swing.JButton btn_addPortatil;
    private javax.swing.JComboBox<String> cb_conexiones;
    private javax.swing.JComboBox<String> cb_hasEstuche;
    private javax.swing.JComboBox<String> cb_tipoConsola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog jd_estacionaria;
    private javax.swing.JDialog jd_portatil;
    private javax.swing.JPopupMenu jp_showMenu;
    private javax.swing.JTable jt_consolas;
    private javax.swing.JSpinner sp_numcontroles;
    private javax.swing.JTextField tf_almacenamiento;
    private javax.swing.JTextField tf_anyosUso;
    private javax.swing.JTextField tf_bateria;
    private javax.swing.JTextField tf_fabricante;
    private javax.swing.JTextField tf_identificacion;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_pantalla;
    private javax.swing.JTextField tf_precio;
    // End of variables declaration//GEN-END:variables
}
