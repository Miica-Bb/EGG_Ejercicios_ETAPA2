public class G05Ej03 {

    public static void main(String[] args) {
        
        System.out.println("Este vector contiene 50 números generados al azar que tienen hasta 5 cifras");
        System.out.println("A continuación se indicará cuándos números hay de cada cifra");
        
        int[] nums = new int[50];
        int numsAleatorios;
        
        for (int i = 0; i < 50; i++) {
            numsAleatorios = (int)(Math.floor(Math.random()*(10999 - 1 + 1) + 1));
            nums[i] = numsAleatorios;
        }
        
        int contador = 0, iCifra = 0, iiCifra = 0, iiiCifra = 0, ivCifra = 0, vCifra = 0;
        double aux;
        
        for (int i = 0; i < 50; i++) {
            aux = nums[i];
            do {
                contador++;
                aux = Math.floor(aux/10);
            } while (aux >= 1);
            
            switch (contador) {
                case 1:
                    iCifra = iCifra + 1;
                    contador = 0;
                    continue;
                case 2:
                    iiCifra = iiCifra + 1;
                    contador = 0;
                    continue;
                case 3:
                    iiiCifra = iiiCifra + 1;
                    contador = 0;
                    continue;
                case 4:
                    ivCifra = ivCifra + 1;
                    contador = 0;
                    continue;
                case 5:
                    vCifra = vCifra + 1;
                    contador = 0;
            }
            
           
        }
        
        System.out.println("De una cifra: " + iCifra);
        System.out.println("De dos cifras: " + iiCifra);
        System.out.println("De tres cifras: " + iiiCifra);
        System.out.println("De cuatro cifras: " + ivCifra);
        System.out.println("De cinco cifras: " + vCifra);
        
    }
    
}
