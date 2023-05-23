public class G05Ej03Ex {

    public static void main(String[] args) {
        int[][] matriz = new int[3][5];
        
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        
    }
    
    public static void llenarMatriz (int[][] matriz) {
        for (int[] elementoFila : matriz) {
            for (int j = 0; j < elementoFila.length; j++) {
                elementoFila[j] = (int) Math.floor(Math.random()*(30-20+1)+20);
            }
        }
    }
    
    public static void mostrarMatriz (int[][] matriz) {
        String mostrarMatriz = "";
        
        for (int[] elementoFila : matriz) {
            for (int j = 0; j < elementoFila.length; j++) {
                System.out.print(elementoFila[j] + " ");
            }
            System.out.println("");
        }
    }
    

}
