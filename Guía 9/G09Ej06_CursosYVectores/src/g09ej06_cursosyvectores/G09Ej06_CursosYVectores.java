package g09ej06_cursosyvectores;

import Servicios.CursoServicios;
import Entidades.Curso;

public class G09Ej06_CursosYVectores {

    public static void main(String[] args) {
        CursoServicios cs = new CursoServicios();
        Curso nuevo = cs.crearCurso();
        
        System.out.println(nuevo.toString());
        cs.calcularGananciaSemanal(nuevo);
    }

}
