package Persistencia;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection conexion;

    // Constructor
    public MateriaData() {
        conexion = Conexion.getConexion();
    }

    // INSERT
    public void guardarMateria(Materia m) {

        String sql = "INSERT INTO materia(nombre, anio, estado) "
                + "VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(
                    sql,
                    Statement.RETURN_GENERATED_KEYS
            );

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setBoolean(3, m.isEstado());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                m.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada con éxito. ID: " + m.getIdMateria());
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error al insertar materia: " + ex.getMessage()
            );
        }
    }
    

    // SELECT - buscar un materia por ID
    public Materia buscarMateria(int id) {

        Materia m = null;

        String sql = "SELECT * FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                m = new Materia(
                        rs.getInt("idMateria"),
                        rs.getString("nombre"),
                        rs.getInt("anio"),
                        rs.getBoolean("estado")
                );
            }

            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al buscar materia: " + ex.getMessage());
        }

        return m;
    }

    // SELECT - Buscar por nombre
    public Materia buscarMateriaPorNombre(String nombre) {
        Materia m = null;
        String sql = "SELECT * FROM materia WHERE nombre = ? AND estado = 1";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                m = new Materia(
                        rs.getInt("idMateria"),
                        rs.getString("nombre"),
                        rs.getInt("anio"),
                        rs.getBoolean("estado")
                );
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar por nombre: " + ex.getMessage());
        }
        return m;
    }

    // SELECT - Listar materias activas
    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE estado = 1";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia m = new Materia(
                        rs.getInt("idMateria"),
                        rs.getString("nombre"),
                        rs.getInt("anio"),
                        rs.getBoolean("estado")
                );
                materias.add(m);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar materias: " + ex.getMessage());
        }
        return materias;
    }

    // UPDATE - Modificar Materia
    public void modificarMateria(Materia m) {
        String sql = "UPDATE materia SET nombre = ?, anio = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getAnio());
            ps.setInt(3, m.getIdMateria());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada con éxito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar materia: " + ex.getMessage());
        }
    }

    // DELETE Lógico - Desactivar Materia (estado = 0)
    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada (dada de baja) correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar materia: " + ex.getMessage());
        }

    }
}
