import java.util.Scanner;


public class Actividad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();


        System.out.println("Ingrese su primer apellido:");
        String apellido = scanner.nextLine();


        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("De acuerdo. Eres el estudiante: "+ nombre + " " + apellido + " y tienes: " + edad + " años.");

        System.out.println("Vamos a verificar su promedio de calificaciones: " + nombre + " Ingrese los datos solicitados.");

        System.out.println("Ingrese la calificación del primer corte:");
        int calificacion1 = scanner.nextInt();

        System.out.println("Ingrese la calificación del segundo corte:");
        int calificacion2 = scanner.nextInt();

        System.out.println("Ingrese la calificación del tercer corte:");
        int calificacion3 = scanner.nextInt();

        double promedio = (double) (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.println("El promedio de sus calificaciones es: " + promedio);

        scanner.close();
    }
}