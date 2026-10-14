
package Main;

import Entidades.Alumno;
import Persistencia.AlumnoData;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args){
        
        AlumnoData alumnoData = new AlumnoData();
        
        Alumno a = new Alumno(12345678,
            "Prueba",
            "Alejandro",
            LocalDate.of(2000, 5, 15),
            true);
        
        //guardar alumno en base de datos
        alumnoData.guardarAlumno(a);
    }
    
    
    
}
