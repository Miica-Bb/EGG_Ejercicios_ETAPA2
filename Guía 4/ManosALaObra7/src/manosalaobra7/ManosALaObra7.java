package manosalaobra7;

import java.util.Scanner;

public class ManosALaObra7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        int longFrase;
        System.out.println("Ingrese una frase terminada en punto");
        
        do {
            
            frase = leer.nextLine();
            longFrase = frase.length();
            
            if (frase.substring(longFrase - 1, longFrase).equals(".")) {
                break;
            } else {
                System.out.println("No terminó la frase en punto. Intente nuevamente");
            }
            
        } while (!".".equals(frase.substring(longFrase - 1, longFrase)));
        
        String retorno = codificarFrase(frase);
        
        System.out.println(retorno);
               
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    public static String codificarFrase (String frase) {
        
        for (int i = 0; i < frase.length(); i++) {
            String caracter = frase.substring(i, i + 1);
            
            switch (caracter) {
                case "a":
                case "A":
                    frase = frase.replace("a", "@");
                    frase = frase.replace("A", "@");
                    continue;
                case "e":
                case "E":
                    frase = frase.replace("e", "#");
                    frase = frase.replace("E", "#");
                    continue;
                case "i":
                case "I":
                    frase = frase.replace("i", "$");
                    frase = frase.replace("I", "$");
                    continue;
                case "o":
                case "O":
                    frase = frase.replace("o", "%");
                    frase = frase.replace("O", "%");
                    continue;
                case "u":
                case "U":
                    frase = frase.replace("u", "*");
                    frase = frase.replace("U", "*");
            }
            
        }
        
        return frase;
        
    }
    
}
