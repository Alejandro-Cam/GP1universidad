
package Main;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import java.time.LocalDate;
import java.util.List;

public class Main {
    //esta comentado el metodo main porque en netbeans arranca desde esta clase y nos desde VistaPrincipal
    /*
    public static void main(String[] args){
        
        AlumnoData alumnoData = new AlumnoData();
        
        Alumno a = new Alumno(12345678,
            "Prueba",
            "Alejandro",
            LocalDate.of(2000, 5, 15),
            true);
        
        //guardar alumno en base de datos
       
        alumnoData.guardarAlumno(a);
        System.out.println("Alumno guadado: " + a.toString());
        
       
        //MODIFICAR ALUMNO
        //asigno a la variable el alumno creado
        Alumno encontrado = alumnoData.buscarAlumnoPorDni(12345678);
        
        //modifico nombre y apellido
        encontrado.setApellido("Camargo");
        encontrado.setNombre("Cesar Alejandro");
        
        //modifico la base de datos
        alumnoData.modificarAlumno(encontrado);
        
        
        //ELIMINADO LOGICO DE ALUMNO
        
        //elimino alumno(estado = 0), el 23 es el id en la base de datos
        alumnoData.eliminarAlumno(23);
        
        //LISTAR LOS ALUMNOS DE LA BASE DE DATOS
        List<Alumno> lista = alumnoData.listarAlumnos();
        
        for (Alumno alumno : lista) {
            System.out.println(alumno);
        }
        
    } 
    */
}
