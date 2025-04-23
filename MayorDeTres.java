import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de los tres números
        System.out.print("Ingresa el primer número: ");
        int n1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int n2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int n3 = scanner.nextInt();

        // Comparación para encontrar el mayor
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        // Salida
        System.out.println("El mayor de los tres es: " + mayor);

        scanner.close();
    }
}
