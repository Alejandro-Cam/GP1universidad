
package Persistencia;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection conexion;

    // Constructor
    public InscripcionData() {
        conexion = Conexion.getConexion();
    }

    // INSERT - Guardar inscripción

    public void guardarInscripcion(Inscripcion i) {

        String sql = "INSERT INTO inscripcion "
                + "(idAlumno, idMateria, anioLectivo, cuatrimestre, nota, asistencia) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = conexion.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setInt(1, i.getAlumno().getIdAlumno());
            ps.setInt(2, i.getMateria().getIdMateria());
            ps.setInt(3, i.getAnioLectivo());
            ps.setInt(4, i.getCuatrimestre());

            if (i.getNota() == null) {
                ps.setNull(5, java.sql.Types.DECIMAL);
            } else {
                ps.setDouble(5, i.getNota());
            }

            ps.setInt(6, i.getAsistencia());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                i.setIdInscripcion(rs.getInt(1));

                JOptionPane.showMessageDialog(
                        null,
                        "Inscripción guardada con éxito. ID: "
                        + i.getIdInscripcion()
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al guardar inscripción: "
                    + ex.getMessage()
            );
        }
    }

    // SELECT - Buscar inscripción por ID

    public Inscripcion buscarInscripcion(int id) {

        Inscripcion inscripcion = null;

        String sql = "SELECT * FROM inscripcion "
                + "WHERE idInscripcion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Alumno alumno = buscarAlumno(rs.getInt("idAlumno"));
                Materia materia = buscarMateria(rs.getInt("idMateria"));

                Double nota = rs.getObject("nota", Double.class);

                inscripcion = new Inscripcion(
                        rs.getInt("idInscripcion"),
                        alumno,
                        materia,
                        rs.getInt("anioLectivo"),
                        rs.getInt("cuatrimestre"),
                        nota,
                        rs.getInt("asistencia")
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al buscar inscripción: "
                    + ex.getMessage()
            );
        }

        return inscripcion;
    }

    // SELECT - Listar todas las inscripciones

    public List<Inscripcion> listarInscripciones() {

        List<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alumno = buscarAlumno(
                        rs.getInt("idAlumno")
                );

                Materia materia = buscarMateria(
                        rs.getInt("idMateria")
                );

                Double nota = rs.getObject(
                        "nota",
                        Double.class
                );

                Inscripcion i = new Inscripcion(
                        rs.getInt("idInscripcion"),
                        alumno,
                        materia,
                        rs.getInt("anioLectivo"),
                        rs.getInt("cuatrimestre"),
                        nota,
                        rs.getInt("asistencia")
                );

                inscripciones.add(i);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al listar inscripciones: "
                    + ex.getMessage()
            );
        }

        return inscripciones;
    }

    // SELECT - Buscar inscripciones de un alumno

    public List<Inscripcion> listarInscripcionesPorAlumno(int idAlumno) {

        List<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion "
                + "WHERE idAlumno = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idAlumno);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alumno = buscarAlumno(
                        rs.getInt("idAlumno")
                );

                Materia materia = buscarMateria(
                        rs.getInt("idMateria")
                );

                Double nota = rs.getObject(
                        "nota",
                        Double.class
                );

                Inscripcion i = new Inscripcion(
                        rs.getInt("idInscripcion"),
                        alumno,
                        materia,
                        rs.getInt("anioLectivo"),
                        rs.getInt("cuatrimestre"),
                        nota,
                        rs.getInt("asistencia")
                );

                inscripciones.add(i);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al listar inscripciones del alumno: "
                    + ex.getMessage()
            );
        }

        return inscripciones;
    }

    // SELECT - Buscar alumnos inscriptos en una materia

    public List<Inscripcion> listarInscripcionesPorMateria(int idMateria) {

        List<Inscripcion> inscripciones = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion "
                + "WHERE idMateria = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Alumno alumno = buscarAlumno(
                        rs.getInt("idAlumno")
                );

                Materia materia = buscarMateria(
                        rs.getInt("idMateria")
                );

                Double nota = rs.getObject(
                        "nota",
                        Double.class
                );

                Inscripcion i = new Inscripcion(
                        rs.getInt("idInscripcion"),
                        alumno,
                        materia,
                        rs.getInt("anioLectivo"),
                        rs.getInt("cuatrimestre"),
                        nota,
                        rs.getInt("asistencia")
                );

                inscripciones.add(i);
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al listar alumnos de la materia: "
                    + ex.getMessage()
            );
        }

        return inscripciones;
    }

    // UPDATE - Modificar inscripción

    public void modificarInscripcion(Inscripcion i) {

        String sql = "UPDATE inscripcion SET "
                + "idAlumno = ?, "
                + "idMateria = ?, "
                + "anioLectivo = ?, "
                + "cuatrimestre = ?, "
                + "nota = ?, "
                + "asistencia = ? "
                + "WHERE idInscripcion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, i.getAlumno().getIdAlumno());
            ps.setInt(2, i.getMateria().getIdMateria());
            ps.setInt(3, i.getAnioLectivo());
            ps.setInt(4, i.getCuatrimestre());

            if (i.getNota() == null) {
                ps.setNull(5, java.sql.Types.DECIMAL);
            } else {
                ps.setDouble(5, i.getNota());
            }

            ps.setInt(6, i.getAsistencia());
            ps.setInt(7, i.getIdInscripcion());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(
                        null,
                        "Inscripción modificada con éxito."
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al modificar inscripción: "
                    + ex.getMessage()
            );
        }
    }

    // UPDATE - Registrar / modificar nota

    public void actualizarNota(int idInscripcion, double nota) {

        String sql = "UPDATE inscripcion "
                + "SET nota = ? "
                + "WHERE idInscripcion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setDouble(1, nota);
            ps.setInt(2, idInscripcion);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(
                        null,
                        "Nota registrada correctamente."
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al registrar nota: "
                    + ex.getMessage()
            );
        }
    }

    // UPDATE - Registrar asistencia

    public void registrarAsistencia(int idInscripcion) {

        String sql = "UPDATE inscripcion "
                + "SET asistencia = asistencia + 1 "
                + "WHERE idInscripcion = ? "
                + "AND asistencia < 30";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idInscripcion);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(
                        null,
                        "Asistencia registrada correctamente."
                );

            } else {

                JOptionPane.showMessageDialog(
                        null,
                        "No se pudo registrar la asistencia. "
                        + "El alumno ya tiene 30 asistencias."
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al registrar asistencia: "
                    + ex.getMessage()
            );
        }
    }

    // DELETE - Eliminar inscripción

    public void eliminarInscripcion(int id) {

        String sql = "DELETE FROM inscripcion "
                + "WHERE idInscripcion = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(
                        null,
                        "Inscripción eliminada correctamente."
                );
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al eliminar inscripción: "
                    + ex.getMessage()
            );
        }
    }

    // MÉTODOS AUXILIARES

    private Alumno buscarAlumno(int idAlumno) {

        Alumno alumno = null;

        String sql = "SELECT * FROM alumno "
                + "WHERE idAlumno = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idAlumno);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                alumno = new Alumno(
                        rs.getInt("idAlumno"),
                        rs.getInt("dni"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getDate("fechaNac").toLocalDate(),
                        rs.getBoolean("estado")
                );
            }

            ps.close();

        } catch (SQLException ex) {

            System.out.println(
                    "Error al buscar alumno: "
                    + ex.getMessage()
            );
        }

        return alumno;
    }

    private Materia buscarMateria(int idMateria) {

        Materia materia = null;

        String sql = "SELECT * FROM materia "
                + "WHERE idMateria = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idMateria);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                materia = new Materia(
                        rs.getInt("idMateria"),
                        rs.getString("nombre"),
                        rs.getInt("anio"),
                        rs.getBoolean("estado")
                );
            }

            ps.close();

        } catch (SQLException ex) {

            System.out.println(
                    "Error al buscar materia: "
                    + ex.getMessage()
            );
        }

        return materia;
    }
}
    
