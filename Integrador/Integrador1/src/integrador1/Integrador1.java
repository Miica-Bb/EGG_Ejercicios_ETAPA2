package integrador1;

import Entidades.Estudiante;
import Servicios.EstudianteServicios;

public class Integrador1 {

    public static void main(String[] args) {
        EstudianteServicios es = new EstudianteServicios();
        
        Estudiante[] vectorEstudiantes = es.crearVectorEstudiantes();
        double promedio = es.promedio(vectorEstudiantes);
        System.out.println("El promedio es: " + promedio);
        Estudiante[] notasAltas = es.alumnosNotaAlta(vectorEstudiantes, promedio);
        System.out.println("");
        System.out.println("Alumnos con nota mayor al promedio:");
        es.mostrarAlumnosNotaAlta(notasAltas);
        
        
    }

}
