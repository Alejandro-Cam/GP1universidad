package Vistas;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import Persistencia.AlumnoData;
import Persistencia.InscripcionData;
import Persistencia.MateriaData;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaAlumnosPorMateria extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private MateriaData materiaData;
    private InscripcionData inscripcionesData;
    private List<Alumno> alumnos;
    private List<Materia> materias;

    public VistaAlumnosPorMateria() {
        initComponents();

        alumnoData = new AlumnoData();
        materiaData = new MateriaData();
        inscripcionesData = new InscripcionData();

        cargarMateria();
        cargarTablaAlumnosInscriptos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSelecMateria = new javax.swing.JLabel();
        cmbMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnosMateria = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setText("Formulario de Alumnos por Materias");

        lblSelecMateria.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        lblSelecMateria.setText("Seleccione una Materia");

        cmbMateria.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        cmbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMateriaActionPerformed(evt);
            }
        });

        jtAlumnosMateria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtAlumnosMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "APELLIDO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtAlumnosMateria);
        if (jtAlumnosMateria.getColumnModel().getColumnCount() > 0) {
            jtAlumnosMateria.getColumnModel().getColumn(0).setResizable(false);
            jtAlumnosMateria.getColumnModel().getColumn(1).setResizable(false);
            jtAlumnosMateria.getColumnModel().getColumn(2).setResizable(false);
            jtAlumnosMateria.getColumnModel().getColumn(3).setResizable(false);
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelecMateria)
                                .addGap(75, 75, 75)
                                .addComponent(cmbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelecMateria)
                    .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cargamos materias de base de datos
    private void cargarMateria() {
        cmbMateria.removeAllItems();

        materias = materiaData.listarMaterias();

        for (Materia materia : materias) {
            cmbMateria.addItem(materia.getNombre() + " Año: " + materia.getAnio());
        }
    }

    private void cmbMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMateriaActionPerformed
        cargarTablaAlumnosInscriptos();
    }//GEN-LAST:event_cmbMateriaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    //cargamos los alumnos inscriptos a la materia selecionada
    public void cargarTablaAlumnosInscriptos() {
        DefaultTableModel modelo = (DefaultTableModel) jtAlumnosMateria.getModel();
        modelo.setRowCount(0); //limpia filas anteriores

        //variable de los seleccionado en el cmbMateria
        int index = cmbMateria.getSelectedIndex();

        if (index != -1 && materias != null && !materias.isEmpty()) {
            Materia materiaSeleccionada = materias.get(index);

            // Usamos listarInscripcionesPorMateria 
            List<Inscripcion> inscripciones = inscripcionesData.listarInscripcionesPorMateria(materiaSeleccionada.getIdMateria());
            
            for (Inscripcion ins : inscripciones) {
                Alumno a = ins.getAlumno();
                if (a != null) {
                    modelo.addRow(new Object[]{
                        a.getIdAlumno(),
                        a.getDni(),
                        a.getApellido(),
                        a.getNombre()
                    });
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMateria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlumnosMateria;
    private javax.swing.JLabel lblSelecMateria;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
