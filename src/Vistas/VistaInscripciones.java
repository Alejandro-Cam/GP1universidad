package Vistas;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.InscripcionData;
import Persistencia.MateriaData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaInscripciones extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private MateriaData materiaData;
    private InscripcionData inscripcionData;
    private List<Alumno> alumnos;
    private List<Materia> materias;

    public VistaInscripciones() {
        initComponents();

        alumnoData = new AlumnoData();
        materiaData = new MateriaData();
        inscripcionData = new InscripcionData();

        //cargamos comboBox al entrar en la vista
        cargarAlumnos();

        //cargamos tabla al iniciar
        cargarTablaMaterias();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        cmbAlumno = new javax.swing.JComboBox<>();
        lblListadoMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnInscribir = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        rbtMateriaInscripta = new javax.swing.JRadioButton();
        rbtMateriaNoInscrita = new javax.swing.JRadioButton();

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setText("Formulario de Inscripcion");

        lblAlumno.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblAlumno.setText("Seleccione un Alumno:");

        cmbAlumno.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        cmbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnoActionPerformed(evt);
            }
        });

        lblListadoMaterias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblListadoMaterias.setText("Listado de Materias");

        jTable1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Materia", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        btnInscribir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnAnular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAnular.setText("Anular Inscripcion");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtMateriaInscripta);
        rbtMateriaInscripta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtMateriaInscripta.setSelected(true);
        rbtMateriaInscripta.setText("Materias Inscriptas");
        rbtMateriaInscripta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMateriaInscriptaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtMateriaNoInscrita);
        rbtMateriaNoInscrita.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbtMateriaNoInscrita.setText("Materias No Inscriptas");
        rbtMateriaNoInscrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMateriaNoInscritaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rbtMateriaInscripta)
                                .addGap(227, 227, 227)
                                .addComponent(rbtMateriaNoInscrita))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAlumno)
                                    .addGap(88, 88, 88)
                                    .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(225, 225, 225)
                                    .addComponent(lblListadoMaterias))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTitulo)
                                    .addGap(100, 100, 100))))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumno)
                    .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblListadoMaterias)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtMateriaInscripta)
                    .addComponent(rbtMateriaNoInscrita))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarAlumnos() {
        //borramos los item por defecto
        cmbAlumno.removeAllItems();
        //usamos el metodo de AlumnoData
        alumnos = alumnoData.listarAlumnos();

        //recorremos lista y agregamos los alumnos a cmb
        for (Alumno a : alumnos) {
            cmbAlumno.addItem(a.getApellido() + " " + a.getNombre() + " DNI: " + a.getDni());
        }
    }

    //cargamos la tabla con las materias del alumno seleccionado
    public void cargarTablaMaterias() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); //limpia las filas

        //obtenemos alumno seleccionado en una variable
        int indice = cmbAlumno.getSelectedIndex();

        //validacion que no este seleccionado o  este vacio
        if (indice == -1 || alumnos == null) {
            return;
        }

        Alumno alumnoSeleccionado = alumnos.get(indice);

        //obtenemos todas las materias de la BD
        materias = materiaData.listarMaterias();

        //obtenemos las inscripciones del alumno seleccionado
        List<Inscripcion> inscripciones = inscripcionData.listarInscripcionesPorAlumno(alumnoSeleccionado.getIdAlumno());

        //recorremos todas las materias
        for (Materia materia : materias) {
            //creo booleano para distinguir las materias
            boolean estaInscripto = false;

            //comprobar si el alumno esta inscrito en la materia
            for (Inscripcion inscripcione : inscripciones) {
                //si la inscripcion coincide con el id materia esta inscripto
                if (inscripcione.getMateria().getIdMateria() == materia.getIdMateria()) {
                    //el booleano es true
                    estaInscripto = true;
                    break;
                }
            }
            //cargamos la tabla segun el radio button seleccionad 
            if (rbtMateriaInscripta.isSelected() && estaInscripto) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            } else if (rbtMateriaNoInscrita.isSelected() && !estaInscripto) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
            }
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnoActionPerformed
        cargarTablaMaterias();
    }//GEN-LAST:event_cmbAlumnoActionPerformed

    private void rbtMateriaInscriptaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMateriaInscriptaActionPerformed
        btnInscribir.setEnabled(false);
        btnAnular.setEnabled(true);
        cargarTablaMaterias();
    }//GEN-LAST:event_rbtMateriaInscriptaActionPerformed

    private void rbtMateriaNoInscritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMateriaNoInscritaActionPerformed
        btnInscribir.setEnabled(true);
        //desabilito boton anular
        btnAnular.setEnabled(false);
        cargarTablaMaterias();
    }//GEN-LAST:event_rbtMateriaNoInscritaActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        //Indice alumno seleccionado en el comboBox
        int indiceAlumno = cmbAlumno.getSelectedIndex();
        //fila seleccionada en la tabla
        int fila = jTable1.getSelectedRow();

        //comprobar si no hay seleccion en el comboBox y en la tabla
        if (indiceAlumno == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno");
            return;
        }
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia en la tabla");
            return;
        }

        //obtengo alumno
        Alumno alumno = alumnos.get(indiceAlumno);

        //obtengo id de la materia seleccionada
        int idMateria = (Integer) jTable1.getValueAt(fila, 0);
        //busco la materia por id
        Materia materia = materiaData.buscarMateria(idMateria);

        if (materia == null) {
            JOptionPane.showMessageDialog(this, "Materia no encontrada");
            return;
        }

        int anioMateria = materia.getAnio();

        //validacion si ya esta inscripto
        Inscripcion existente = inscripcionData.buscarInscripcionPorDatos(
                alumno.getIdAlumno(), idMateria, anioMateria);

        if (existente != null) {
            JOptionPane.showMessageDialog(this, "El alumno ya se encuentra inscripto en esta materia");
            return;
        }

        //creo una inscripcion y la guardo en la BD
        Inscripcion nueva = new Inscripcion(
                alumno,
                materia,
                anioMateria,
                null, 0);

        inscripcionData.guardarInscripcion(nueva);

        //actualiza tabla
        rbtMateriaInscripta.setSelected(true);
        btnInscribir.setEnabled(false);
        btnAnular.setEnabled(true);
        cargarTablaMaterias();
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        int indiceAlumno = cmbAlumno.getSelectedIndex();
        int fila = jTable1.getSelectedRow();

        if (indiceAlumno == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno.");
            return;
        }
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia de la tabla.");
            return;
        }

        Alumno alumno = alumnos.get(indiceAlumno);
        int idMateria = (Integer) jTable1.getValueAt(fila, 0);

        // Buscar el ID de la inscripción para ese alumno y materia
        List<Inscripcion> inscripciones = inscripcionData.listarInscripcionesPorAlumno(alumno.getIdAlumno());
        Inscripcion inscripcionEncontrada = null;

        for (Inscripcion ins : inscripciones) {
            if (ins.getMateria().getIdMateria() == idMateria) {
                inscripcionEncontrada = ins;
                break;
            }
        }

        if (inscripcionEncontrada != null) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de anular la inscripción a esta materia?",
                    "Confirmar Anulación",
                    JOptionPane.YES_NO_OPTION
            );

            if (confirmacion == JOptionPane.YES_OPTION) {
                inscripcionData.eliminarInscripcion(inscripcionEncontrada.getIdInscripcion());
                cargarTablaMaterias();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el registro de la inscripción.");
        }
    }//GEN-LAST:event_btnAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblListadoMaterias;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtMateriaInscripta;
    private javax.swing.JRadioButton rbtMateriaNoInscrita;
    // End of variables declaration//GEN-END:variables

}
