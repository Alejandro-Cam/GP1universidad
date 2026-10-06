package Vistas;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        // centrar ventana al medio 
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnAlumno = new javax.swing.JMenu();
        jmiFormularioAlumno = new javax.swing.JMenuItem();
        jmnMateria = new javax.swing.JMenu();
        jmiFormularioMateria = new javax.swing.JMenuItem();
        jmnAdministracion = new javax.swing.JMenu();
        jmiManejoInscripciones = new javax.swing.JMenuItem();
        jmiManipulacionNotas = new javax.swing.JMenuItem();
        jmnConsultas = new javax.swing.JMenu();
        jmiAlumnosPorMaterias = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestion Universitaria");

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmnAlumno.setText("Alumno");
        jmnAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiFormularioAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jmiFormularioAlumno.setText("Formulario Alumnos");
        jmiFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAlumnoActionPerformed(evt);
            }
        });
        jmnAlumno.add(jmiFormularioAlumno);

        jMenuBar1.add(jmnAlumno);

        jmnMateria.setText("Materia");
        jmnMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiFormularioMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jmiFormularioMateria.setText("Formulario de Materias");
        jmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMateriaActionPerformed(evt);
            }
        });
        jmnMateria.add(jmiFormularioMateria);

        jMenuBar1.add(jmnMateria);

        jmnAdministracion.setText("Administracion");
        jmnAdministracion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiManejoInscripciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jmiManejoInscripciones.setText("Manejo de Inscripciones");
        jmnAdministracion.add(jmiManejoInscripciones);

        jmiManipulacionNotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jmiManipulacionNotas.setText("Manipulacion de Notas");
        jmnAdministracion.add(jmiManipulacionNotas);

        jMenuBar1.add(jmnAdministracion);

        jmnConsultas.setText("Consultas");
        jmnConsultas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jmiAlumnosPorMaterias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jmiAlumnosPorMaterias.setText("Alumnos por Materias");
        jmnConsultas.add(jmiAlumnosPorMaterias);

        jMenuBar1.add(jmnConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAlumnoActionPerformed
        Escritorio.removeAll(); // Limpia ventanas 
        Escritorio.repaint();   // Redibuja el escritorio

        VistaAlumno va = new VistaAlumno(); // Instancia la vista
        va.setVisible(true);                 // Hace visible la ventana
        Escritorio.add(va);                  // La agrega al JDesktopPane
        Escritorio.moveToFront(va);          // La trae al frente

    }//GEN-LAST:event_jmiFormularioAlumnoActionPerformed

    private void jmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();

        VistaMateria vm = new VistaMateria();

        vm.setVisible(true);

        Escritorio.add(vm);

        Escritorio.moveToFront(vm);
    }//GEN-LAST:event_jmiFormularioMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAlumnosPorMaterias;
    private javax.swing.JMenuItem jmiFormularioAlumno;
    private javax.swing.JMenuItem jmiFormularioMateria;
    private javax.swing.JMenuItem jmiManejoInscripciones;
    private javax.swing.JMenuItem jmiManipulacionNotas;
    private javax.swing.JMenu jmnAdministracion;
    private javax.swing.JMenu jmnAlumno;
    private javax.swing.JMenu jmnConsultas;
    private javax.swing.JMenu jmnMateria;
    // End of variables declaration//GEN-END:variables
}
