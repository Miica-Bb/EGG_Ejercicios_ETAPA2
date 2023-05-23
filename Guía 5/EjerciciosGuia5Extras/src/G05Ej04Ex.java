public class G05Ej04Ex {

    public static void main(String[] args) {
        double[][] notasAlumnos = new double[10][5];
        
        llenarMatriz(notasAlumnos);
        mostrarMatriz(notasAlumnos);
        mostrarCantidadAprobados(notasAlumnos);
        
        
        
    }
    
    public static void llenarMatriz (double[][] notasAlumnos) {
        double notaPromedio = 0.0;
        
        for (double[] notasAlumno : notasAlumnos) {
            for (int j = 0; j < notasAlumnos.length; j++) {
                switch (j) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        notasAlumno[j] = Math.random() * 10 + 1;
                        continue;
                    case 4:
                        notaPromedio = notasAlumno[0] * 0.1 + notasAlumno[1] * 0.15 + notasAlumno[2] * 0.25 + notasAlumno[3] * 0.5;
                        notasAlumno[j] = notaPromedio;
                }
            }
        }
    }
    
    public static void mostrarMatriz(double[][] notasAlumnos) {
        String mostrarMatriz = "";
        
        for (double[] elementoFila : notasAlumnos) {
            for (int j = 0; j < elementoFila.length; j++) {
                System.out.print(elementoFila[j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarCantidadAprobados(double[][] notasAlumnos) {
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            if (notasAlumnos[i][4] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("cantidad de aprobados: " + aprobados);
        System.out.println("cantidad de desaprobados: " + desaprobados);
    }

}
