package g07ej01;

import g07ej01.Entidad.Libro;
import java.util.Scanner;

public class G07Ej01 {

    public static void main(String[] args) {
        
        
        
        pedirInfo();
          
    }
    
    //////////////////////////////////////////pedir datos
    
    public static void pedirInfo () {
        Scanner leer = new Scanner(System.in);
        
        String isbn = "", nombre = "", autor = "", paginas = "";
        System.out.println("A continuación se le pedirán datos de un libro");
        
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    System.out.println("Indique el ISBN");
                    isbn = leer.next();
                    continue;
                case 1:
                    nombre = leer.nextLine();
                    System.out.println("Indique el nombre del libro");
                    nombre = leer.nextLine();
                    continue;
                case 2:
                    System.out.println("Indique el autor del libro");
                    autor = leer.nextLine();
                    continue;
                case 3:
                    System.out.println("Indique la cantidad de páginas que el libro posee");
                    paginas = leer.next();
                    break;
            }
        }
        
        asignarValoresObjecto(isbn, nombre, autor, paginas);
    }
    
    ////////////////////////////////////////////asignar valores y mostrarlos
    
    public static void asignarValoresObjecto (String isbn, String nombre, String autor, String paginas) {
        Libro info1 = new Libro(isbn, nombre, autor, paginas);
        
        System.out.println(info1.toString());
    }
}

