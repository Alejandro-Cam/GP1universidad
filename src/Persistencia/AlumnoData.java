package Persistencia;

import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection conexion;

    // Constructor
    public AlumnoData() {
        conexion = Conexion.getConexion();
    }

    // INSERT
    public void guardarAlumno(Alumno a) {

        String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNac, estado) "
                + "VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNac()));
            ps.setBoolean(5, a.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                a.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado con éxito. ID: " + a.getIdAlumno());
            }

            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar alumno: " + ex.getMessage());
        }
    }

    // SELECT - buscar un alumno por ID
    public Alumno buscarAlumno(int id) {

        Alumno a = null;

        String sql = "SELECT * FROM alumno WHERE idAlumno = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                a = new Alumno(
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
            System.out.println("Error al buscar alumno: " + ex.getMessage());
        }

        return a;
    }

    // SELECT - Buscar por DNI
    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno a = null;
        String sql = "SELECT * FROM alumno WHERE dni = ? AND estado = 1";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = new Alumno(
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
            JOptionPane.showMessageDialog(null, "Error al buscar por DNI: " + ex.getMessage());
        }
        return a;
    }

    // SELECT - Listar alumnos activos
    public List<Alumno> listarAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE estado = 1";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alumno a = new Alumno(
                        rs.getInt("idAlumno"),
                        rs.getInt("dni"),
                        rs.getString("apellido"),
                        rs.getString("nombre"),
                        rs.getDate("fechaNac").toLocalDate(),
                        rs.getBoolean("estado")
                );
                alumnos.add(a);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar alumnos: " + ex.getMessage());
        }
        return alumnos;
    }

    // UPDATE - Modificar Alumno
    public void modificarAlumno(Alumno a) {
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNac = ? WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellido());
            ps.setString(3, a.getNombre());
            ps.setDate(4, Date.valueOf(a.getFechaNac()));
            ps.setInt(5, a.getIdAlumno());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar alumno: " + ex.getMessage());
        }
    }

    // DELETE Lógico - Desactivar Alumno (estado = 0)
    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado (dado de baja) correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar alumno: " + ex.getMessage());
        }
    }
}
