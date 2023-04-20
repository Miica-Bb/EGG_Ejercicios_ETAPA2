public class G05Ej05 {

    public static void main(String[] args) {
        
        int matrizUno[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int matrizDos[][] = new int [3][3];
        boolean condicionUno, condicionDos;
        
        for (int j = 0; j < matrizDos[0].length; j++) {
            for (int i = 0; i < matrizDos[0].length; i++) {
                matrizDos[i][j] = matrizUno[j][i];
            }
        }
        
        // MOSTRAR MATRIZ Y SU TRANSPUESTA
        /*
        for (int[] fila: matrizUno) {
            for (int columna: fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int[] fila: matrizDos) {
            for (int columna: fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
        */
        
        
        out:
        for (int i = 0; i < matrizUno[0].length; i++) {
            for (int j = 0; j < matrizUno[0].length; j++) {
                condicionUno = (Math.abs(matrizUno[i][j])) == (Math.abs(matrizDos[i][j]));
                condicionDos = ((matrizUno[i][j] < 0) && (matrizDos[i][j] > 0)) || ((matrizUno[i][j] > 0) && (matrizDos[i][j] < 0) || ((matrizUno[i][j] == 0) && (matrizDos[i][j] == 0)));
                
                if ((condicionUno) && (condicionDos)) {
                    
                    if ((i == matrizUno[0].length - 1) && (j == matrizUno[0].length - 1)) {
                        System.out.println("La matriz es antisimétrica");
                    }
                    
                } else {
                    System.out.println("La matriz NO es antisimétrica");
                    break out;
                }
            }
        }
        
    }
    
}
