import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de la palabra
        System.out.print("Ingresa una palabra (sin espacios): ");
        String palabra = scanner.nextLine();

        int contador = 0;

        // Recorre cada carácter y cuenta vocales
        for (int i = 0; i < palabra.length(); i++) {
            char c = Character.toLowerCase(palabra.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        // Salida del resultado
        System.out.println("La palabra " + palabra + " tiene " + contador + " vocales.");

        scanner.close();
    }
}
