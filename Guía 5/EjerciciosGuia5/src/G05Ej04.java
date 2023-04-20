public class G05Ej04 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int)(Math.floor(Math.random() * 20 + 1));
            }
        }
        
        for(int[] fila: matriz) {
            for(int elemento: fila) {
                System.out.print(elemento + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[0].length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
