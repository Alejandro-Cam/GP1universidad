
package Entidades;

public class Inscripcion {
     private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private int anioLectivo;
    private int cuatrimestre;
    private Double nota;
    private int asistencia;

    // Constructor completo
    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia,
            int anioLectivo, int cuatrimestre, Double nota, int asistencia) {

        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.anioLectivo = anioLectivo;
        this.cuatrimestre = cuatrimestre;
        this.nota = nota;
        this.asistencia = asistencia;
    }

    // Constructor sin ID
    public Inscripcion(Alumno alumno, Materia materia,
            int anioLectivo, int cuatrimestre, Double nota, int asistencia) {

        this.alumno = alumno;
        this.materia = materia;
        this.anioLectivo = anioLectivo;
        this.cuatrimestre = cuatrimestre;
        this.nota = nota;
        this.asistencia = asistencia;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(int anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Inscripcion{"
                + "idInscripcion=" + idInscripcion
                + ", alumno=" + alumno
                + ", materia=" + materia
                + ", anioLectivo=" + anioLectivo
                + ", cuatrimestre=" + cuatrimestre
                + ", nota=" + nota
                + ", asistencia=" + asistencia
                + '}';
    }
}
