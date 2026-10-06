package Vistas;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class VistaAlumno extends javax.swing.JInternalFrame {

    //conexion con alumnodato
    private AlumnoData alumnoData;
    //saber si es alumno nuevo o existente
    private Alumno alumnoActual = null;

    public VistaAlumno() {
        initComponents();
        //inicializamos la persistencia
        alumnoData = new AlumnoData();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jcbEstado = new javax.swing.JCheckBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setTitle("Gestion de Alumnos");

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        lblTitulo.setText("Formulario De Alumno");

        lblDni.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblDni.setText("DNI:");

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblApellido.setText("Apellido:");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblNombre.setText("Nombre:");

        lblFechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento:");

        lblEstado.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblEstado.setText("Estado:");

        txtDni.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N

        jcbEstado.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jcbEstado.setText("Activo");

        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

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
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstado)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido)
                            .addComponent(lblDni))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApellido)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                            .addComponent(jcbEstado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(jcbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            int dni = Integer.parseInt(txtDni.getText());
            // Invocamos el método de la capa de datos
            alumnoActual = alumnoData.buscarAlumnoPorDni(dni);

            if (alumnoActual != null) {
                txtApellido.setText(alumnoActual.getApellido());
                txtNombre.setText(alumnoActual.getNombre());
                jcbEstado.setSelected(alumnoActual.isEstado());
                jdcFechaNacimiento.setDate(java.sql.Date.valueOf(alumnoActual.getFechaNac()));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún alumno activo con ese DNI.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número de DNI válido.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //cargar alumno nuevo
        alumnoActual = null;

        txtDni.setText("");
        txtApellido.setText("");
        txtNombre.setText("");

        jdcFechaNacimiento.setDate(null);

        jcbEstado.setSelected(true);

        txtDni.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            //comprobar que los campos no esten vacios
            if (txtDni.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Debe completar todos los campos obligatorios");
                return;
            }
            if (jdcFechaNacimiento.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de nacimiento.");
                return;
            }

            //obtenemos datos 
            int dni = Integer.parseInt(txtDni.getText());
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();

            java.time.LocalDate fechaNac = jdcFechaNacimiento.getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

            boolean estado = jcbEstado.isSelected();

            //creo alumno
            Alumno alumno = new Alumno(
                    dni,
                    apellido,
                    nombre,
                    fechaNac,
                    estado
            );

            //guardo alumno con INSERT
            alumnoData.guardarAlumno(alumno);

            alumnoActual = alumno;

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "El DNI debe ser un número.");

        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Debe seleccionar una fecha de nacimiento.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (alumnoActual == null) {

            JOptionPane.showMessageDialog(
                    this,
                    "Primero debe buscar un alumno."
            );

            return;
        }

        try {

            alumnoActual.setDni(
                    Integer.parseInt(txtDni.getText())
            );

            alumnoActual.setApellido(
                    txtApellido.getText()
            );

            alumnoActual.setNombre(
                    txtNombre.getText()
            );

            alumnoActual.setFechaNac(
                    jdcFechaNacimiento.getDate()
                            .toInstant()
                            .atZone(java.time.ZoneId.systemDefault())
                            .toLocalDate()
            );

            alumnoActual.setEstado(
                    jcbEstado.isSelected()
            );

            alumnoData.modificarAlumno(alumnoActual);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "El DNI debe ser un número."
            );

        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar una fecha de nacimiento."
            );
        }
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
