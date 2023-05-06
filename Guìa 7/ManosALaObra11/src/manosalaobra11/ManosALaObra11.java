package manosalaobra11;

import manosalaobra11.Entidad.Persona;

public class ManosALaObra11 {

    public static void main(String[] args) {
        
        Persona usuarioUno = new Persona();
        
        usuarioUno.setNombre("Micaela");
        usuarioUno.setEdad(26);
        usuarioUno.setDocumento("38859739");
        
        String nombre = usuarioUno.getNombre();
        int edad = usuarioUno.getEdad();
        String documento = usuarioUno.getDocumento();
        
        System.out.println(nombre + ", " + edad + " años, " + documento);
    }
    
}
