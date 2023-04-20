
import java.util.Scanner;

public class G05Ej06 {

    public static void main(String[] args) {
        /*
        int matrizMagica[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        
        MOSTRAR MATRIZ
        for(int[] fila: matrizMagica) {
            for(int columna: fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
        */
        
        Scanner leer = new Scanner(System.in);
        int matrizMagica[][] = new int[3][3];
        System.out.println("A continuación se le pedirá que complete una matriz de 3x3 con números del 1 al 9");
        
        for (int i = 0; i < matrizMagica[0].length; i++) {
            System.out.println("FILA " + (i+1) + ":");
            
            for (int j = 0; j < matrizMagica[0].length; j++) {
                do {
                    System.out.println("valor " + (j + 1) + ":");
                    matrizMagica[i][j] = leer.nextInt();
                    if ((matrizMagica[i][j] > 9) || (matrizMagica[i][j] < 1)) {
                        System.out.println("Número ingresado incorrecto. Intente nuevamente (entre 1 y 9, inclusive ambos)");
                    }
                    
                } while ((matrizMagica[i][j] > 9) || (matrizMagica[i][j] < 1));
                
            }
        }
        
        System.out.println("");
        System.out.println("Matriz ingresada:");
        
        for(int[] fila: matrizMagica) {
            for(int columna: fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        
        int referencia = 0, diagonal = 0, comparacion = 0;
                
        out:
        for (int i = 0; i < matrizMagica[0].length; i++) {
            for (int j = 0; j < matrizMagica[0].length; j++) {
                
                if (i == j) {
                    diagonal = diagonal + matrizMagica[i][j];
                }
                
                switch (i) {
                    case 0:
                        referencia = referencia + matrizMagica[i][j];
                        continue;
                    case 1:
                    case 2:
                        comparacion = comparacion + matrizMagica[i][j];
                        
                        if ((j == matrizMagica[0].length - 1) && (comparacion != referencia)) {
                            System.out.println("La matriz no es mágica");
                            break out;
                        } else if ((j == matrizMagica[0].length - 1) && (i == j) && (referencia != diagonal)) {
                            System.out.println("La matriz no es mágica");
                            break out;
                        } else if (j == matrizMagica[0].length - 1) {
                            comparacion = 0;
                        }
                        
                        if ((j == matrizMagica[0].length - 1) && (i == j)) {
                            
                            for (int k = 0; k < matrizMagica[0].length; k++) {
                                for (int l = 0; l < matrizMagica.length; l++) {
                                    
                                    switch (k) {
                                        case 0:
                                        case 1:
                                        case 2:
                                            comparacion = comparacion + matrizMagica[l][k];

                                            if ((l == matrizMagica[0].length - 1) && (comparacion != referencia)) {
                                                System.out.println("La matriz no es mágica");
                                                break out;
                                            } else if ((l == matrizMagica[0].length - 1) && (k == l)) {
                                                System.out.println("La matriz es M Á G I C A");
                                                System.out.println("La suma de los números de filas, columnas y diagonal da igual, siendo " + referencia);
                                                break out;
                                            } else if (l == matrizMagica[0].length - 1) {
                                                comparacion = 0;
                                            }
                                    }
                                    
                                }
                            }
                        }
                        
                        
                }
            }
        }
        
        
        
        
    }
    
}
