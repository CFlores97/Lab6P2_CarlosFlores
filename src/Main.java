
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
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
        btn_changeAddMenuPort = new javax.swing.JButton();
        jd_estacionaria = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp_numcontroles = new javax.swing.JSpinner();
        tf_almacenamiento = new javax.swing.JTextField();
        cb_conexiones = new javax.swing.JComboBox<>();
        btn_addEstacionaria = new javax.swing.JButton();
        btn_changeAddMenuEst = new javax.swing.JButton();
        jp_showMenu = new javax.swing.JPopupMenu();
        Modificar = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        Juegos = new javax.swing.JMenuItem();
        jd_addJuego = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_descripcion = new javax.swing.JTextField();
        dc_date = new com.toedter.calendar.JDateChooser();
        tf_precioJuego = new javax.swing.JTextField();
        cb_rentable = new javax.swing.JComboBox<>();
        sp_cantDisp = new javax.swing.JSpinner();
        cb_agregado = new javax.swing.JComboBox<>();
        btn_addJuego = new javax.swing.JButton();
        cb_estado = new javax.swing.JComboBox<>();
        jd_listaJuegos = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_juegos = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jp_showMenuJ = new javax.swing.JPopupMenu();
        ModificarJ = new javax.swing.JMenuItem();
        EliminarJ = new javax.swing.JMenuItem();
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

        btn_changeAddMenuPort.setText("Agregar Juego");
        btn_changeAddMenuPort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_changeAddMenuPortMouseClicked(evt);
            }
        });
        btn_changeAddMenuPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeAddMenuPortActionPerformed(evt);
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb_hasEstuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(btn_changeAddMenuPort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(54, 54, 54))
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
                    .addComponent(cb_hasEstuche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_changeAddMenuPort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
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

        btn_changeAddMenuEst.setText("Agregar Juego");
        btn_changeAddMenuEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_changeAddMenuEstMouseClicked(evt);
            }
        });
        btn_changeAddMenuEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeAddMenuEstActionPerformed(evt);
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
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_changeAddMenuEst, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
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
                .addGap(20, 20, 20)
                .addComponent(btn_changeAddMenuEst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
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
        Juegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuegosActionPerformed(evt);
            }
        });
        jp_showMenu.add(Juegos);

        jPanel4.setBackground(new java.awt.Color(38, 38, 38));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Juegos");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Descripcion:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Estado:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Fecha:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Es rentable:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Esta agregado:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad Disponible:");

        cb_rentable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cb_rentable.setSelectedIndex(-1);

        cb_agregado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cb_agregado.setSelectedIndex(-1);

        btn_addJuego.setText("Agregar");
        btn_addJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addJuegoMouseClicked(evt);
            }
        });

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado" }));
        cb_estado.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(309, 309, 309))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(tf_descripcion))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(cb_rentable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(27, 27, 27)
                        .addComponent(cb_agregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(sp_cantDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(dc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tf_precioJuego)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(155, 155, 155)
                .addComponent(btn_addJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_addJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(dc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_precioJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cb_rentable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cb_agregado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(sp_cantDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_addJuegoLayout = new javax.swing.GroupLayout(jd_addJuego.getContentPane());
        jd_addJuego.getContentPane().setLayout(jd_addJuegoLayout);
        jd_addJuegoLayout.setHorizontalGroup(
            jd_addJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_addJuegoLayout.setVerticalGroup(
            jd_addJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(38, 38, 38));

        jl_juegos.setModel(new DefaultListModel());
        jl_juegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_juegosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_juegos);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Lista de Juegos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(287, 287, 287))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_listaJuegosLayout = new javax.swing.GroupLayout(jd_listaJuegos.getContentPane());
        jd_listaJuegos.getContentPane().setLayout(jd_listaJuegosLayout);
        jd_listaJuegosLayout.setHorizontalGroup(
            jd_listaJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_listaJuegosLayout.setVerticalGroup(
            jd_listaJuegosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ModificarJ.setText("Modificar");
        ModificarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarJActionPerformed(evt);
            }
        });
        jp_showMenuJ.add(ModificarJ);

        EliminarJ.setText("Eliminar");
        EliminarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarJActionPerformed(evt);
            }
        });
        jp_showMenuJ.add(EliminarJ);

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

            tienda.getConsolas().add(temp);

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

            tienda.getConsolas().add(temp);
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

            tienda.getConsolas().set(jt_consolas.getSelectedRow(), temp);
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

            tienda.getConsolas().set(jt_consolas.getSelectedRow(), temp);

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
            tienda.getConsolas().remove(selRow);
            jt_consolas.setModel(model);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModificarItemStateChanged

    }//GEN-LAST:event_ModificarItemStateChanged

    private void btn_changeAddMenuPortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_changeAddMenuPortMouseClicked

        jd_addJuego.setVisible(true);
        jd_addJuego.pack();
        jd_addJuego.setLocationRelativeTo(jd_portatil);


    }//GEN-LAST:event_btn_changeAddMenuPortMouseClicked

    private void btn_addJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addJuegoMouseClicked
        DefaultListModel modelList = (DefaultListModel) jl_juegos.getModel();
        boolean isRentable = false;
        boolean isAgregado = false;

        if (cb_rentable.getSelectedItem().equals("Si")) {
            isRentable = true;
        }
        if (cb_agregado.getSelectedItem().equals("Si")) {
            isAgregado = true;
        }

        juegos.add(new Juego(tf_nombre.getText(), tf_descripcion.getText(), cb_estado.getSelectedItem().toString(), dc_date.getDate(), Double.parseDouble(tf_precioJuego.getText()), isRentable, isAgregado, (int) sp_cantDisp.getModel().getValue()));

        modelList.addElement(new Juego(tf_nombre.getText(), tf_descripcion.getText(), cb_estado.getSelectedItem().toString(), dc_date.getDate(), Double.parseDouble(tf_precioJuego.getText()), isRentable, isAgregado, (int) sp_cantDisp.getModel().getValue()));

        tf_almacenamiento.setText("");
        tf_anyosUso.setText("");
        tf_bateria.setText("");
        tf_precioJuego.setText("");
        dc_date.setDate(new Date());
        cb_estado.setSelectedIndex(-1);
        cb_rentable.setSelectedIndex(-1);
        cb_agregado.setSelectedIndex(-1);
        sp_cantDisp.setValue(0);

        JOptionPane.showMessageDialog(jd_addJuego, "Se ha agregado exitosamente");
        jd_addJuego.setVisible(false);
    }//GEN-LAST:event_btn_addJuegoMouseClicked

    private void JuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuegosActionPerformed
        jd_listaJuegos.pack();
        jd_listaJuegos.setVisible(true);
        jd_listaJuegos.setLocationRelativeTo(this);


    }//GEN-LAST:event_JuegosActionPerformed

    private void btn_changeAddMenuPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeAddMenuPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_changeAddMenuPortActionPerformed

    private void btn_changeAddMenuEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_changeAddMenuEstMouseClicked
        jd_addJuego.setVisible(true);
        jd_addJuego.pack();
        jd_addJuego.setLocationRelativeTo(jd_portatil);
    }//GEN-LAST:event_btn_changeAddMenuEstMouseClicked

    private void btn_changeAddMenuEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeAddMenuEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_changeAddMenuEstActionPerformed

    private void EliminarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarJActionPerformed

        int ans = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar la consola?");

        if (ans == JOptionPane.OK_OPTION) {
            DefaultListModel ml = (DefaultListModel) jl_juegos.getModel();
            int selRow = jl_juegos.getSelectedIndex();
            ml.removeElementAt(selRow);

            jl_juegos.setModel(ml);
        }

    }//GEN-LAST:event_EliminarJActionPerformed

    private void jl_juegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_juegosMouseClicked
        if (evt.isMetaDown()) {
            jp_showMenuJ.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_juegosMouseClicked

    private void ModificarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarJActionPerformed
        String nombre, descripcion, estado;
        Date fechaLanz;
        double precio;
        boolean isRentable, isAgregado;
        int cantDisp;
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre");
        descripcion= JOptionPane.showInputDialog("Ingrese descripcion");
        estado = JOptionPane.showInputDialog("Ingrese estado");
        String fecha = JOptionPane.showInputDialog("Ingrese fecha");
        fechaLanz = new Date(fecha);
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio"));
        String agregado = JOptionPane.showInputDialog("Ingrese estado");
        String rentable = JOptionPane.showInputDialog("Ingrese fecha");
        if(agregado.equalsIgnoreCase("Si")){
            isAgregado = true;
        }
        if(rentable.equalsIgnoreCase("Si")){
            isRentable = true;
        }
        cantDisp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad disponible"));
        
        
    }//GEN-LAST:event_ModificarJActionPerformed

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
    Tienda tienda = new Tienda();
    ArrayList<Juego> juegos = new ArrayList<>();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem EliminarJ;
    private javax.swing.JMenuItem Juegos;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem ModificarJ;
    private javax.swing.JButton btn_addEstacionaria;
    private javax.swing.JButton btn_addJuego;
    private javax.swing.JButton btn_addPortatil;
    private javax.swing.JButton btn_changeAddMenuEst;
    private javax.swing.JButton btn_changeAddMenuPort;
    private javax.swing.JComboBox<String> cb_agregado;
    private javax.swing.JComboBox<String> cb_conexiones;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_hasEstuche;
    private javax.swing.JComboBox<String> cb_rentable;
    private javax.swing.JComboBox<String> cb_tipoConsola;
    private com.toedter.calendar.JDateChooser dc_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_addJuego;
    private javax.swing.JDialog jd_estacionaria;
    private javax.swing.JDialog jd_listaJuegos;
    private javax.swing.JDialog jd_portatil;
    private javax.swing.JList<String> jl_juegos;
    private javax.swing.JPopupMenu jp_showMenu;
    private javax.swing.JPopupMenu jp_showMenuJ;
    private javax.swing.JTable jt_consolas;
    private javax.swing.JSpinner sp_cantDisp;
    private javax.swing.JSpinner sp_numcontroles;
    private javax.swing.JTextField tf_almacenamiento;
    private javax.swing.JTextField tf_anyosUso;
    private javax.swing.JTextField tf_bateria;
    private javax.swing.JTextField tf_descripcion;
    private javax.swing.JTextField tf_fabricante;
    private javax.swing.JTextField tf_identificacion;
    private javax.swing.JTextField tf_modelo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pantalla;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_precioJuego;
    // End of variables declaration//GEN-END:variables
}
