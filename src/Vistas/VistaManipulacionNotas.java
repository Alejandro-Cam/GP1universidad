package Vistas;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Persistencia.AlumnoData;
import Persistencia.InscripcionData;
import Persistencia.MateriaData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaManipulacionNotas extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private MateriaData materiaData;
    private InscripcionData inscripcionData;
    private List<Alumno> alumnos;
    private List<Inscripcion> inscripcionesAlumnos;

    public VistaManipulacionNotas() {
        initComponents();

        alumnoData = new AlumnoData();
        materiaData = new MateriaData();
        inscripcionData = new InscripcionData();

        //cargamos el jComboBOX
        cargarAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        cmbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInscripciones = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnAsistencia = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setText("Formulario de Notas y Asistencia");

        lblAlumno.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblAlumno.setText("Seleccione Alumno:");

        cmbAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnoActionPerformed(evt);
            }
        });

        jtInscripciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Materia", "Materia", "Nota", "Asistencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtInscripciones);
        if (jtInscripciones.getColumnModel().getColumnCount() > 0) {
            jtInscripciones.getColumnModel().getColumn(0).setResizable(false);
            jtInscripciones.getColumnModel().getColumn(1).setResizable(false);
            jtInscripciones.getColumnModel().getColumn(2).setResizable(false);
            jtInscripciones.getColumnModel().getColumn(3).setResizable(false);
        }

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar Nota");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAsistencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAsistencia.setText("Marcar Asistencia");
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(69, 69, 69)
                        .addComponent(btnAsistencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumno)
                    .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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

    //Cargamos la tabla con las inscripciones del alumno
    public void cargarTablaInscripciones() {
        DefaultTableModel modelo = (DefaultTableModel) jtInscripciones.getModel();
        modelo.setRowCount(0); //limpia las filas

        //variable de lo seleccionado en el jcombobox
        int index = cmbAlumno.getSelectedIndex();
        //verificacion del alumno que no sea vacio o este inactivo
        if (index != -1 && alumnos != null && !alumnos.isEmpty()) {
            Alumno seleccionado = alumnos.get(index);
            // obtener las inscripciones por alumno
            inscripcionesAlumnos = inscripcionData.listarInscripcionesPorAlumno(seleccionado.getIdAlumno());

            for (Inscripcion ins : inscripcionesAlumnos) {
                //agregamos a la tabla los datos
                modelo.addRow(new Object[]{
                    ins.getMateria().getIdMateria(), ins.getMateria().getNombre(),
                    ins.getNota(), ins.getAsistencia()
                });
            }
        }
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnoActionPerformed
        //al seleccionar un alumno se muestra en la tabla las inscripciones relacionadas a el 
        cargarTablaInscripciones();
    }//GEN-LAST:event_cmbAlumnoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //variable para saber obtener el numero de fila seleccionada
        int fila = jtInscripciones.getSelectedRow();

        //si no hay fila seleccionada
        if (fila == -1) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione Una Inscripcion de la Tabla");
            return;
        }

        try {
            //obtenemos la inscripcion de la fila seleccionada
            Inscripcion inscripcion = inscripcionesAlumnos.get(fila);

            //obtenemos la nota ingresada
            Object valor = jtInscripciones.getValueAt(fila, 2);

            //si no ingresa nota
            if (valor == null || valor.toString().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe Ingresar Una Nota");
                return;
            }

            double nota = Double.parseDouble(
                    valor.toString().replace(',', '.')
            );

            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(this,
                        "La nota debe estar entre 0 y 10.");
                return;
            }

            //guardamos nota en la BD
            inscripcionData.actualizarNota(inscripcion.getIdInscripcion(), nota);

            //actualizamos la tabla
            cargarTablaInscripciones();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Ingrese una nota numérica válida, por ejemplo 8.5.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        int fila = jtInscripciones.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione una inscripción para marcar asistencia.");
            return;
        }

        // Obtener la inscripción seleccionada
        Inscripcion inscripcion = inscripcionesAlumnos.get(fila);

        // Registrar asistencia en la base de datos
        inscripcionData.registrarAsistencia(
                inscripcion.getIdInscripcion()
        );

        // Actualizar la tabla
        cargarTablaInscripciones();
    }//GEN-LAST:event_btnAsistenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsistencia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtInscripciones;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
