import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {

        // Generación de usuario

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();


        System.out.println("Ingrese su nacionalidad:");
        String nacionalidad = scanner.nextLine();

        System.out.println("Ingrese su ocupación actual:");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su Salario mensual:");
        int salario = scanner.nextInt();

        // Calcular el año de nacimiento
        System.out.println("Ingrese el año actual:");
        int anioActual = scanner.nextInt();

        int nacimiento = anioActual - edad;

        // Imprimir información
        System.out.println("Nombre completo del usuario: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Año de nacimeinto: " + nacimiento);
        System.out.println("Nacionalidad: " + nacionalidad );
        System.out.println("Ocupación Actual: " + ocupacion);
        System.out.println("Salario Mensual: "+ "$ " + salario);

        scanner.close();
    }
}
