/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g02ej02;

import java.util.Scanner;

/**
 *
 * @author GABY
 */
public class G02Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Hola " + nombre + "!");
    }
    
}
