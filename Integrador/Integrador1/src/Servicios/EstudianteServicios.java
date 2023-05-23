package Servicios;

import Entidades.Estudiante;

public class EstudianteServicios {
    public Estudiante[] crearVectorEstudiantes() {
        Estudiante uno = new Estudiante("Valeria", 8);
        Estudiante dos = new Estudiante("Micaela", 9);
        Estudiante tres = new Estudiante("Luciano", 5);
        Estudiante cuatro = new Estudiante("Gabriela", 7);
        Estudiante cinco = new Estudiante("Victoria", 6);
        Estudiante seis = new Estudiante("Nicolás", 8);
        Estudiante siete = new Estudiante("Lola", 6);
        Estudiante ocho = new Estudiante("Roberto", 7);
        
        Estudiante[] vectorEstudiantes = new Estudiante[8];
        
        vectorEstudiantes[0] = uno;
        vectorEstudiantes[1] = dos;
        vectorEstudiantes[2] = tres;
        vectorEstudiantes[3] = cuatro;
        vectorEstudiantes[4] = cinco;
        vectorEstudiantes[5] = seis;
        vectorEstudiantes[6] = siete;
        vectorEstudiantes[7] = ocho;
        
        return vectorEstudiantes;
    }
    
    public double promedio(Estudiante[] vector) {
        double promedio = 0;
        
        for (int i = 0; i < vector.length; i++) {
            promedio = promedio + vector[i].getNota();
            
            if (i == vector.length - 1) {
                promedio = promedio / vector.length;
            }
        }
        
        return promedio;
    }
    
    public Estudiante[] alumnosNotaAlta(Estudiante[] nuevo, double promedio) {
        int notaAlta = 0, aux = 0;
        
        for (int i = 0; i < nuevo.length; i++) {
            if (nuevo[i].getNota() > promedio) {
                notaAlta++;
            }
        }
        Estudiante[] mayoresNotas = new Estudiante[notaAlta];
        
        for (int i = 0; i < nuevo.length; i++) {
            if (nuevo[i].getNota() > promedio) {
                mayoresNotas[aux] = nuevo[i];
                aux++;
            }
        }
        
        return mayoresNotas;
    }
    
    public void mostrarAlumnosNotaAlta(Estudiante[] mayoresNotas) {
        for (Estudiante mayoresNota : mayoresNotas) {
            System.out.println("Nombre: " + mayoresNota.getNombre() + "; Nota: " + mayoresNota.getNota());
        }
    }

}
