
import java.util.Scanner;



public class MisNombres {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nombre completo: ");
      String nombreCompleto = scanner.nextLine();
     
      analizadorNombres(nombreCompleto);
    }
    
    public static String analizadorNombres(String nombreCompleto) {
        String [] partes_nombre = nombreCompleto.split(" ");
        // En caso de tener nombre compuesto
        if (partes_nombre.length >= 4) {
            String nombre1 = partes_nombre[0];
            String nombre2 = partes_nombre[1];
            String apellido1 = partes_nombre[partes_nombre.length -2];
            String apellido2 = partes_nombre[partes_nombre.length -1];
            nombreCompleto = "Nombres: " + nombre1 + "  " + nombre2 + "\nApellido1: " + apellido1 + "\nApellido2: " + apellido2;
            System.out.println(nombreCompleto);
        }else if (partes_nombre.length <= 3) { // En caso de tener nombre y dos apellidos
            String nombre1 = partes_nombre[0];
            String apellido1 = partes_nombre[partes_nombre.length -2];
            String apellido2 = partes_nombre[partes_nombre.length -1];
            nombreCompleto = "Nombre: " + nombre1  + "\nApellido1: " + apellido1 + "\nApellido2: " + apellido2;
            System.out.println(nombreCompleto);
        }

        return nombreCompleto;
        
        }
       
    
}


