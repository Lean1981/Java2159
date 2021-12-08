/*
 * JAVA/POO - Unidad 2 - Actividad practica obligatoria
 */
package javau2apo;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class JavaU2APO {

    /**
     * @param args the command line arguments
     * Crear un programa en java en el cual se pida al usuario ingresar
     * su nombre, apellido, edad, hobbie, editor de código preferido,
     * sistema operativo que utiliza, luego deberá mostrarse por consola
     * los datos ingresados.
     */
    public static void main(String[] args) {
        String nombre, apellido, hobbie, editor, sisop;
        int edad;
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Ingrese su nombre: ");
        nombre= SC.nextLine();
         
        System.out.print("Ingrese su apellido: ");
        apellido=SC.nextLine();
 
        System.out.print("Cual es tu hobbie?: ");
        hobbie=SC.nextLine();
        
        System.out.print("Cual es tu editor preferido?: ");
        editor=SC.nextLine();
        
        System.out.print("Cual es tu sistema operativo?: ");
        sisop=SC.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad=SC.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Hobbie preferido: " + hobbie);
        System.out.println("Editor de codigo preferido: " + editor);
        System.out.println("Sistema Operativo: " + sisop);
        
    }
    
}
