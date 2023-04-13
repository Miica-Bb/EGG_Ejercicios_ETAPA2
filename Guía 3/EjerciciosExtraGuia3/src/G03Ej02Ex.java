public class G03Ej02Ex {


    public static void main(String[] args) {
        
        int A = 3, B = 6, C = 9, D = 12, aux = 0;
        
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        
        // A tiene que ser D
        // B tiene que ser C
        // C tiene que ser A
        // D tiene que ser B

        aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;
        
        System.out.println("Valores finales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
    
}
