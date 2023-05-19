/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.personal.iud.app;

import com.mycompany.personal.iud.controller.FuncionarioController;
import com.mycompany.personal.iud.domain.Funcionario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Main21 extends javax.swing.JFrame {

    private final FuncionarioController funcionarioController;
    private final static String[] COLUMNS = {"ID", "TIPO DE IDENTIFICACION", "NOMBRES", "APELLIDOS", "N IDENTIFICACION", "ESTADO", "SEXO", "DIRECCION", "TELEFONO", "FECHA NACIMIENTO"};
    private final static String SELECCIONE = "--SELECCIONE--";

    /**
     * Creates new form Main2
     */
    public Main21() {
        initComponents();
        txtIdEdit.setEditable(false);
        funcionarioController = new FuncionarioController();
        listFuncionarios();
        agregarListener();
    }

    private void listFuncionarios() {

        cbxFuncionarios.removeAllItems();
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setTipo_identificacion(SELECCIONE);
        funcionario1.setNombre("");
        funcionario1.setApellido("");
        /*funcionario1.setN_identificacion(String.valueOf(""));*/
        cbxFuncionarios.addItem(funcionario1);
        tblFuncionarios.removeAll();
        try {
            DefaultTableModel defaultTableModel = new DefaultTableModel();
            for (String COLUMN : COLUMNS) {
                defaultTableModel.addColumn(COLUMN);
            }
            tblFuncionarios.setModel(defaultTableModel);
            List<Funcionario> funcionarios = funcionarioController.obtenerFuncionario();
            
            if (funcionarios.isEmpty()) {
                return;

            }
            defaultTableModel.setRowCount(funcionarios.size());
            int row = 0;
            for (Funcionario funcionario : funcionarios) {
                defaultTableModel.setValueAt(funcionario.getId_funcionario(), row, 0);
                defaultTableModel.setValueAt(funcionario.getTipo_identificacion(), row, 1);
                defaultTableModel.setValueAt(funcionario.getNombre(), row, 2);
                defaultTableModel.setValueAt(funcionario.getApellido(), row, 3);
                defaultTableModel.setValueAt(funcionario.getN_identificacion(), row, 4);
                defaultTableModel.setValueAt(funcionario.getEstado(), row, 5);
                defaultTableModel.setValueAt(funcionario.getSexo(), row, 6);
                defaultTableModel.setValueAt(funcionario.getDireccion(), row, 7);
                defaultTableModel.setValueAt(funcionario.getTelefono(), row, 8);
                defaultTableModel.setValueAt(funcionario.getFecha_nacimiento(), row, 9);
                row++;

                cbxFuncionarios.addItem(funcionario);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarListener() {
        cbxFuncionarios.addItemListener(event -> {
            Funcionario selectedFuncionario = (Funcionario) event.getItem();
            if (selectedFuncionario.getTipo_identificacion().equals(SELECCIONE)) {
                txtIdEdit.setText("");
                txtTDocumentoEdit.setText("");
                txtNombreEdit.setText("");
                txtApellidoEdit.setText("");
                txtINdentificacionEdit.setText("");
                txtEstadoEdit.setText("");
                txtSexoEdit.setText("");
                txtDireccionEdit.setText("");
                txtTelefonoEdit.setText("");
                txtFechaNaciminentoEdit.setText("");
            } else {
                txtIdEdit.setText(String.valueOf(selectedFuncionario.getId_funcionario()));
                txtTDocumentoEdit.setText(String.valueOf(selectedFuncionario.getId_tidentificacion()));
                txtNombreEdit.setText(selectedFuncionario.getNombre());
                txtApellidoEdit.setText(selectedFuncionario.getApellido());
                txtINdentificacionEdit.setText(String.valueOf(selectedFuncionario.getN_identificacion()));
                txtEstadoEdit.setText(String.valueOf(selectedFuncionario.getId_estado()));
                txtSexoEdit.setText(String.valueOf(selectedFuncionario.getId_sexo()));
                txtDireccionEdit.setText(selectedFuncionario.getDireccion());
                txtTelefonoEdit.setText(selectedFuncionario.getTelefono());
                txtFechaNaciminentoEdit.setText(selectedFuncionario.getFecha_nacimiento());
            }
            System.out.println("selectedFuncionario =" + selectedFuncionario);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTPanel = new javax.swing.JTabbedPane();
        jPFuncionarios = new javax.swing.JPanel();
        jPcampos = new javax.swing.JPanel();
        lblTIdentificacion = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNIdentificacion = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblDirecccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        txtTIdentificacion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNIdentificacion = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        bntAgregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        panelEdit = new javax.swing.JPanel();
        cbxFuncionarios = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtIdEdit = new javax.swing.JTextField();
        txtTDocumentoEdit = new javax.swing.JTextField();
        lblIdFuncionarioEdit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstadoEdit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaNaciminentoEdit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtINdentificacionEdit = new javax.swing.JTextField();
        lblNombreEdit = new javax.swing.JLabel();
        txtNombreEdit = new javax.swing.JTextField();
        lblApellidoEdit = new javax.swing.JLabel();
        txtApellidoEdit = new javax.swing.JTextField();
        lblSexoEdit = new javax.swing.JLabel();
        txtSexoEdit = new javax.swing.JTextField();
        lblDirecccionEdit = new javax.swing.JLabel();
        txtDireccionEdit = new javax.swing.JTextField();
        lblTelefonoEdit = new javax.swing.JLabel();
        txtTelefonoEdit = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 50)); // NOI18N
        jLabel2.setText("FUNCIONARIOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jTPanel.setToolTipText("");

        jPcampos.setBorder(javax.swing.BorderFactory.createTitledBorder("digite los siguientes campos"));

        lblTIdentificacion.setText("Tipo de Identificación");

        lblNombre.setText("Nombres");

        lblApellidos.setText("Apellidos");

        lblNIdentificacion.setText("N. identificación ");

        lblEstado.setText("Estado");

        lblSexo.setText("Sexo");

        lblDirecccion.setText("Dirección");

        lblTelefono.setText("Telefono");

        lblFechaNacimiento.setText("Fecha Nacimiento ");

        txtTIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTIdentificacionActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtNIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIdentificacionActionPerformed(evt);
            }
        });

        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        bntAgregar.setText("CREAR");
        bntAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("1: TI");

        jLabel8.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("2: CC");

        jLabel9.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("1: SOLTERO");

        jLabel10.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("2: CASADO");

        jLabel13.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("2: FEMENINO");

        jLabel14.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("1: MASCU");

        javax.swing.GroupLayout jPcamposLayout = new javax.swing.GroupLayout(jPcampos);
        jPcampos.setLayout(jPcamposLayout);
        jPcamposLayout.setHorizontalGroup(
            jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addComponent(lblTIdentificacion)
                        .addGap(93, 93, 93)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDirecccion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addComponent(lblNIdentificacion)
                        .addGap(133, 133, 133)
                        .addComponent(lblApellidos)
                        .addGap(145, 145, 145)
                        .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(lblFechaNacimiento)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcamposLayout.createSequentialGroup()
                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPcamposLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPcamposLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPcamposLayout.createSequentialGroup()
                                        .addComponent(txtTIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(30, 30, 30))
                                    .addComponent(txtNIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos))
                                .addGap(18, 18, 18)
                                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPcamposLayout.createSequentialGroup()
                                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEstado))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPcamposLayout.setVerticalGroup(
            jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTIdentificacion)
                    .addComponent(lblNombre)
                    .addComponent(lblEstado)
                    .addComponent(lblDirecccion))
                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)))
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addGap(9, 9, 9)
                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNIdentificacion)
                    .addComponent(lblApellidos)
                    .addComponent(lblSexo)
                    .addComponent(lblTelefono)
                    .addComponent(lblFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcamposLayout.createSequentialGroup()
                                .addGroup(jPcamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcamposLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntAgregar)
                        .addGap(18, 18, 18))
                    .addGroup(jPcamposLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel7.getAccessibleContext().setAccessibleName("1: TI \\n\n2:CC");

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblFuncionarios);

        javax.swing.GroupLayout jPFuncionariosLayout = new javax.swing.GroupLayout(jPFuncionarios);
        jPFuncionarios.setLayout(jPFuncionariosLayout);
        jPFuncionariosLayout.setHorizontalGroup(
            jPFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPcampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPFuncionariosLayout.setVerticalGroup(
            jPFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFuncionariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPanel.addTab("Agregar", jPFuncionarios);

        panelEdit.setBorder(javax.swing.BorderFactory.createTitledBorder("modifique los siguientes campos"));

        cbxFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFuncionariosActionPerformed(evt);
            }
        });

        jLabel1.setText("Funcionarios");

        txtIdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEditActionPerformed(evt);
            }
        });

        txtTDocumentoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTDocumentoEditActionPerformed(evt);
            }
        });

        lblIdFuncionarioEdit.setText("ID");

        jLabel3.setText("Tipo Identificación ");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha Nacimiento");

        txtFechaNaciminentoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNaciminentoEditActionPerformed(evt);
            }
        });

        jLabel4.setText("N Identificación");

        lblNombreEdit.setText("Nombre");

        txtNombreEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditActionPerformed(evt);
            }
        });

        lblApellidoEdit.setText("Apellido");

        txtApellidoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEditActionPerformed(evt);
            }
        });

        lblSexoEdit.setText("Sexo");

        txtSexoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoEditActionPerformed(evt);
            }
        });

        lblDirecccionEdit.setText("Dirección");

        txtDireccionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionEditActionPerformed(evt);
            }
        });

        lblTelefonoEdit.setText("Telefono");

        txtTelefonoEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEditActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("2: CC");

        jLabel15.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("1: TI");

        jLabel16.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("1: SOLTERO");

        jLabel17.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("2: CASADO");

        jLabel18.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("1: MASCU");

        jLabel19.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("2: FEMENINO");

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(105, 105, 105)
                                .addComponent(lblNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(lblApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(157, 157, 157)
                                .addComponent(lblSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtFechaNaciminentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditLayout.createSequentialGroup()
                                        .addComponent(lblTelefonoEdit)
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDirecccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditLayout.createSequentialGroup()
                                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelEditLayout.createSequentialGroup()
                                                .addComponent(txtINdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEditLayout.createSequentialGroup()
                                                .addComponent(txtTDocumentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(47, 47, 47)
                                                .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(20, 20, 20)
                                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEstadoEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtSexoEdit))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(227, 227, 227))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdFuncionarioEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addComponent(cbxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblIdFuncionarioEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblNombreEdit)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTDocumentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEstadoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lblApellidoEdit)
                            .addComponent(lblSexoEdit)))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtINdentificacionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtApellidoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSexoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel19))
                            .addComponent(jLabel18))
                        .addGap(14, 14, 14)))
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoEdit)
                    .addComponent(jLabel6)
                    .addComponent(lblDirecccionEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNaciminentoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 924, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPanel.addTab("Editar", jPanel4);

        getContentPane().add(jTPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 930, 360));

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("NOTA: El tipo identificacion, Estado Civil y Sexo se bebe ingresar por codigo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFuncionariosActionPerformed

    private void txtIdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditActionPerformed

    private void txtTDocumentoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTDocumentoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTDocumentoEditActionPerformed

    private void txtNombreEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditActionPerformed

    private void txtApellidoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEditActionPerformed

    private void txtSexoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoEditActionPerformed

    private void txtDireccionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEditActionPerformed

    private void txtTelefonoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEditActionPerformed

    private void txtFechaNaciminentoEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNaciminentoEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNaciminentoEditActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
                                                   
        if (txtIdEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Funcionario de la lista");
            txtIdEdit.requestFocus();
            return;
        }

        if (txtTDocumentoEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el tipo de identificacion");
            txtTDocumentoEdit.requestFocus();
            return;
        }
        if (txtNombreEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el nombres o nombres");
            txtNombreEdit.requestFocus();
            return;
        }
        if (txtApellidoEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el apellido o apellidos");
            txtApellidoEdit.requestFocus();
            return;
        }
        if (txtINdentificacionEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el numero de identificacion");
            txtINdentificacionEdit.requestFocus();
            return;
        }
        if (txtEstadoEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el estado");
            txtEstadoEdit.requestFocus();
            return;
        }
        if (txtSexoEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el sexo");
            txtSexoEdit.requestFocus();
            return;
        }
        if (txtTelefonoEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el telefono");
            txtTelefonoEdit.requestFocus();
            return;
        }
        if (txtDireccionEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese la direccion");
            txtDireccionEdit.requestFocus();
            return;
        }
        if (txtFechaNaciminentoEdit.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese la fecha de nacimiento");
            txtFechaNaciminentoEdit.requestFocus();
            return;
        }

        Funcionario funcionario = new Funcionario();
        funcionario.setId_tidentificacion(Integer.parseInt(txtTDocumentoEdit.getText().trim()));
        funcionario.setNombre(txtNombreEdit.getText().trim());
        funcionario.setApellido(txtApellidoEdit.getText().trim());
        funcionario.setN_identificacion(Integer.parseInt(txtINdentificacionEdit.getText().trim()));
        funcionario.setId_estado(Integer.parseInt(txtEstadoEdit.getText().trim()));
        funcionario.setId_sexo(Integer.parseInt(txtSexoEdit.getText().trim()));
        funcionario.setDireccion(txtDireccionEdit.getText().trim());
        funcionario.setTelefono(txtTelefonoEdit.getText().trim());
        funcionario.setFecha_nacimiento(txtFechaNaciminentoEdit.getText().trim());

        int opt = JOptionPane.showConfirmDialog(null, "DESEA ACTUALIZAR EL CARRO?",
                "CONFIRMAR SALIDA", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {
            
            try {
                funcionarioController.actualizarFuncionario(Integer.parseInt(txtIdEdit.getText()), funcionario);
                txtIdEdit.setText("");
                txtTDocumentoEdit.setText("");
                txtNombreEdit.setText("");
                txtApellidoEdit.setText("");
                txtINdentificacionEdit.setText("");
                txtEstadoEdit.setText("");
                txtSexoEdit.setText("");
                txtTelefonoEdit.setText("");
                txtDireccionEdit.setText("");
                txtFechaNaciminentoEdit.setText("");
                listFuncionarios();
                JOptionPane.showMessageDialog(null,"se ha actualizado correctamente");
                
                
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"no se ha actualizado correctamente");

            }

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed

    private void txtNIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIdentificacionActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtTIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTIdentificacionActionPerformed

    private void bntAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarActionPerformed

        if (txtTIdentificacion.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Digite el tipo de identificacion");
            txtTIdentificacion.requestFocus();
            return;
        }
        if (txtNombres.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el nombres o nombres");
            txtNombres.requestFocus();
            return;
        }
        if (txtApellidos.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el apellido o apellidos");
            txtApellidos.requestFocus();
            return;
        }
        if (txtNIdentificacion.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el numero de identificacion");
            txtNIdentificacion.requestFocus();
            return;
        }
        if (txtEstado.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el estado");
            txtEstado.requestFocus();
            return;
        }
        if (txtSexo.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el sexo");
            txtSexo.requestFocus();
            return;
        }
        if (txtTelefono.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese el telefono");
            txtTelefono.requestFocus();
            return;
        }
        if (txtDireccion.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese la direccion");
            txtDireccion.requestFocus();
            return;
        }
        if (txtFechaNacimiento.getText().trim().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Ingrese la fecha de nacimiento");
            txtFechaNacimiento.requestFocus();
            return;
        }

        try {

            Funcionario funcionario = new Funcionario();
            funcionario.setId_tidentificacion(Integer.parseInt(txtTIdentificacion.getText().trim()));
            funcionario.setNombre(txtNombres.getText().trim());
            funcionario.setApellido(txtApellidos.getText().trim());
            funcionario.setN_identificacion(Integer.parseInt(txtNIdentificacion.getText().trim()));
            funcionario.setId_estado(Integer.parseInt(txtEstado.getText().trim()));
            funcionario.setId_sexo(Integer.parseInt(txtSexo.getText().trim()));
            funcionario.setDireccion(txtDireccion.getText().trim());
            funcionario.setTelefono(txtTelefono.getText().trim());
            funcionario.setFecha_nacimiento(txtFechaNacimiento.getText().trim());

            funcionarioController.crear(funcionario);

            txtTIdentificacion.setText("");
            txtNombres.setText("");
            txtApellidos.setText("");
            txtNIdentificacion.setText("");
            txtEstado.setText("");
            txtSexo.setText("");
            txtDireccion.setText("");
            txtTelefono.setText("");
            txtFechaNacimiento.setText("");
            listFuncionarios();
            JOptionPane.showConfirmDialog(null, "Carro creado con exito");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showConfirmDialog(null, "No se pudo crear el funcionario");
        }
    }//GEN-LAST:event_bntAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtIdEdit.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Funcionario de la lista");
            txtIdEdit.requestFocus();
            return;
        }
        int opt = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR EL CARRO?",
                "CONFIRMAR SALIDA", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (opt == 0) {

            try {
                funcionarioController.eliminarFuncionario(Integer.parseInt(txtIdEdit.getText()));
                txtIdEdit.setText("");
                txtTDocumentoEdit.setText("");
                txtNombreEdit.setText("");
                txtApellidoEdit.setText("");
                txtINdentificacionEdit.setText("");
                txtEstadoEdit.setText("");
                txtSexoEdit.setText("");
                txtTelefonoEdit.setText("");
                txtDireccionEdit.setText("");
                txtFechaNaciminentoEdit.setText("");
                listFuncionarios();
                JOptionPane.showMessageDialog(null, "se ha eliminado correctamente");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "no se ha eliminado correctamente");

            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Main21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main21.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main21().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Funcionario> cbxFuncionarios;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPFuncionarios;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPcampos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblApellidoEdit;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDirecccion;
    private javax.swing.JLabel lblDirecccionEdit;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblIdFuncionarioEdit;
    private javax.swing.JLabel lblNIdentificacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEdit;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSexoEdit;
    private javax.swing.JLabel lblTIdentificacion;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoEdit;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtApellidoEdit;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEdit;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoEdit;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtFechaNaciminentoEdit;
    private javax.swing.JTextField txtINdentificacionEdit;
    private javax.swing.JTextField txtIdEdit;
    private javax.swing.JTextField txtNIdentificacion;
    private javax.swing.JTextField txtNombreEdit;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSexoEdit;
    private javax.swing.JTextField txtTDocumentoEdit;
    private javax.swing.JTextField txtTIdentificacion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEdit;
    // End of variables declaration//GEN-END:variables
}
