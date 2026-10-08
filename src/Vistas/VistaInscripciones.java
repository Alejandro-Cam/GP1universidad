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

        cargarAlumno();
        cargarMateria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        cmbAlumno = new javax.swing.JComboBox<>();
        lblMateria = new javax.swing.JLabel();
        cmbMateria = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnAnular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblAnioLectivo = new javax.swing.JLabel();
        txtAnioLectivo = new javax.swing.JTextField();
        lblCuatrimestre = new javax.swing.JLabel();
        txtCuatrimestre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("Formulario de Inscripciones");

        lblAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAlumno.setText("Seleccione Alumno");

        cmbAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlumnoActionPerformed(evt);
            }
        });

        lblMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMateria.setText("Seleccione Materia");

        cmbMateria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInscribir.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnAnular.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblAnioLectivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAnioLectivo.setText("Año Lectivo:");

        txtAnioLectivo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblCuatrimestre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCuatrimestre.setText("Cuatrimestre:");

        txtCuatrimestre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAlumno)
                            .addComponent(lblMateria)
                            .addComponent(lblAnioLectivo)
                            .addComponent(lblCuatrimestre))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAnioLectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                .addComponent(txtCuatrimestre))
                            .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnInscribir)
                .addGap(98, 98, 98)
                .addComponent(btnAnular)
                .addGap(50, 50, 50)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlumno)
                    .addComponent(cmbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(cmbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnioLectivo)
                    .addComponent(txtAnioLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuatrimestre)
                    .addComponent(txtCuatrimestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnular, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cargamos alumnos desde la base de datos con listarAlumno
    private void cargarAlumno() {
        cmbAlumno.removeAllItems();

        alumnos = alumnoData.listarAlumnos();

        for (Alumno alumno : alumnos) {
            cmbAlumno.addItem(alumno.getApellido() + " " + alumno.getNombre() + " DNI: " + alumno.getDni());
        }
    }

    //cargamos materias de base de datos
    private void cargarMateria() {
        cmbMateria.removeAllItems();

        materias = materiaData.listarMaterias();

        for (Materia materia : materias) {
            cmbMateria.addItem(materia.toString());
        }
    }
    private void cmbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnoActionPerformed

    }//GEN-LAST:event_cmbAlumnoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed

        try {
            //obtenemos atributos para crear Inscripcion
            int indiceAlumno = cmbAlumno.getSelectedIndex();
            int indiceMateria = cmbMateria.getSelectedIndex();

            Alumno alumno = alumnos.get(indiceAlumno);
            Materia materia = materias.get(indiceMateria);
            int anioLectivo = Integer.parseInt(txtAnioLectivo.getText());
            int cuatrimestre = Integer.parseInt(txtCuatrimestre.getText());

            //si no selecciona alumno o materia
            if (alumno == null || materia == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno y materia");
                return;
            }

            //si escribe un cuatrimestre mal
            if (cuatrimestre != 1 && cuatrimestre != 2) {
                JOptionPane.showMessageDialog(this, "El cuatrimestre debe ser 1 o 2");
                return;
            }

            //creamos inscripcion sin nota y asistencia 0
            Inscripcion inscripcion = new Inscripcion(alumno, materia, anioLectivo, cuatrimestre, null, 0);

            //agregamos inscripcion en la base de datos
            inscripcionData.guardarInscripcion(inscripcion);

        } catch (NumberFormatException e) {
            //solo si escribe letras o double en año y cuatrimestre
            JOptionPane.showMessageDialog(this, "Debe ingresar numeros enteros en año lectivo y cuatrimestre");
        }

    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed

        try {
            // Validar que haya un alumno y una materia seleccionados
            int indiceAlumno = cmbAlumno.getSelectedIndex();
            int indiceMateria = cmbMateria.getSelectedIndex();

            if (indiceAlumno == -1 || indiceMateria == -1) {
                JOptionPane.showMessageDialog(this,"Debe seleccionar un alumno y una materia.");
                return;
            }

            //Obtener el alumno y la materia seleccionados
            Alumno alumno = alumnos.get(indiceAlumno);
            Materia materia = materias.get(indiceMateria);

            //Obtener año lectivo y cuatrimestre
            int anioLectivo = Integer.parseInt(txtAnioLectivo.getText());
            int cuatrimestre = Integer.parseInt(txtCuatrimestre.getText());

            if (cuatrimestre != 1 && cuatrimestre != 2) {
                JOptionPane.showMessageDialog(this,
                        "El cuatrimestre debe ser 1 o 2.");
                return;
            }

            //Buscar la inscripción exacta
            Inscripcion inscripcion = inscripcionData.buscarInscripcionPorDatos(
                    alumno.getIdAlumno(),
                    materia.getIdMateria(),
                    anioLectivo,
                    cuatrimestre
            );

            if (inscripcion == null) {
                JOptionPane.showMessageDialog(this,"No existe una inscripción con esos datos.");
                return;
            }

            //Pedir confirmación antes de eliminar
            int respuesta = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de anular esta inscripción?\n"
                    + "Alumno: " + alumno.getApellido() + " " + alumno.getNombre()
                    + "\nMateria: " + materia.getNombre()
                    + "\nAño lectivo: " + anioLectivo
                    + "\nCuatrimestre: " + cuatrimestre,
                    "Confirmar anulación",
                    JOptionPane.YES_NO_OPTION
            );

            //Eliminar solamente si confirma
            if (respuesta == JOptionPane.YES_OPTION) {
                inscripcionData.eliminarInscripcion(
                        inscripcion.getIdInscripcion()
                );
            }

        } catch (NumberFormatException e) {JOptionPane.showMessageDialog(this,"El año lectivo y el cuatrimestre deben ser números enteros.");
        }
    }//GEN-LAST:event_btnAnularActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbAlumno;
    private javax.swing.JComboBox<String> cmbMateria;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblAnioLectivo;
    private javax.swing.JLabel lblCuatrimestre;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnioLectivo;
    private javax.swing.JTextField txtCuatrimestre;
    // End of variables declaration//GEN-END:variables

}
