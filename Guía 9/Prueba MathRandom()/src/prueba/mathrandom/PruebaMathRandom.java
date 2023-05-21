package prueba.mathrandom;

public class PruebaMathRandom {

    public static void main(String[] args) {
        int random;
        
        // muestra números aleatorios entre el 0 y el 11
        for (int i = 0; i < 30; i++) {
            random = (int) (Math.floor(Math.random()*12));
            System.out.println(random);
        }
        
    }

}
