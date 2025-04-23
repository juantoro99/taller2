import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada del número
        System.out.print("Ingresa un número para ver su tabla de multiplicar: ");
        int num = scanner.nextInt();

        // Bucle para mostrar la tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }

        scanner.close();
    }
}
