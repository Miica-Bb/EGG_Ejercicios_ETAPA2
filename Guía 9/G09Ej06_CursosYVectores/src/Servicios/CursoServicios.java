package Servicios;

import java.util.Scanner;
import Entidades.Curso;

public class CursoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Curso crearCurso() {
        Curso nuevo = new Curso();
        
        System.out.println("Indicar nombre del curso");
        nuevo.setNombreCurso(leer.next());
        System.out.println("Ingrese el turno de cursado (mañana o tarde)");
        nuevo.setTurno(leer.next());
        System.out.println("¿Cuántas horas por día se cursa?");
        nuevo.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("¿Cuántos días por semana se cursa?");
        nuevo.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Indique el precio por hora que tiene el curso");
        nuevo.setPrecioPorHora(leer.nextInt());
        System.out.println("");
        nuevo.setAlumnos(cargarAlumnos());
        
        return nuevo;
    }
    
    public String[] cargarAlumnos() {
        String[] nombreAlumnos = new String[5];
        
        System.out.println("A continuación, ingrese el nombre del: ");
        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.println((i + 1) + "° alumno");
            nombreAlumnos[i] = leer.next();
        }
        
        return nombreAlumnos;
    }
    
    public void calcularGananciaSemanal(Curso nuevo) {
        int cantAlumnos = nuevo.getAlumnos().length;
        int gananciaSemanal = nuevo.getCantidadHorasPorDia() * nuevo.getPrecioPorHora() * cantAlumnos * nuevo.getCantidadDiasPorSemana();
        
        System.out.println("Por semana ganará $" + gananciaSemanal);
    }
}
