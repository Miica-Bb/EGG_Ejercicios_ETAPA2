package g08ej03_personapesoyedad;

import Entidad.Persona;
import Servicios.PersonaServicios;

public class G08Ej03_PersonaPesoYEdad {

    public static void main(String[] args) {
        PersonaServicios metodosPer = new PersonaServicios();
        int[] pesoIdeal = new int [4];
        boolean[] mayoriaEdad = new boolean [4];
        
        Persona indUno = metodosPer.crearPersona();
        Persona indDos = metodosPer.crearPersona();
        Persona indTres = metodosPer.crearPersona();
        Persona indCuatro = metodosPer.crearPersona();
        
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    mayoriaEdad[i] = metodosPer.esMayorDeEdad(indUno);
                    pesoIdeal[i] = metodosPer.calcularMC(indUno);
                    continue;
                case 1:
                    mayoriaEdad[i] = metodosPer.esMayorDeEdad(indDos);
                    pesoIdeal[i] = metodosPer.calcularMC(indDos);
                    continue;
                case 2:
                    mayoriaEdad[i] = metodosPer.esMayorDeEdad(indTres);
                    pesoIdeal[i] = metodosPer.calcularMC(indTres);
                    continue;
                case 3:
                    mayoriaEdad[i] = metodosPer.esMayorDeEdad(indCuatro);
                    pesoIdeal[i] = metodosPer.calcularMC(indCuatro);                    
            }
        }
        
        System.out.println("");
        System.out.println("En cuanto a los pesos...");
        metodosPer.porcentajePeso(pesoIdeal);
        System.out.println("");
        System.out.println("En cuanto a las edades...");
        metodosPer.porcentajeEdad(mayoriaEdad);
    }

}
