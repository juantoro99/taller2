import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static class Usuario {
        String nombre;
        int edad;
        String estado;

        public Usuario(String nombre, int edad, String estado) {
            this.nombre = nombre;
            this.edad = edad;
            this.estado = estado;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> lista = new ArrayList<>();

        System.out.print("cuantos usuarios desea registrar ");
        int total = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < total; i++) {
            System.out.println("\nUsuario #" + (i + 1));
            System.out.print("Ingresa nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa estado (Activo/Inactivo): ");
            String estado = scanner.nextLine();

            lista.add(new Usuario(nombre, edad, estado));
        }

        int mayores = 0;
        int menores = 0;

        System.out.println("--- Detalles de usuarios ---");
        for (Usuario u : lista) {
            if (u.edad >= 18) {
                System.out.println(u.nombre + " – Edad: " + u.edad + " – Estado: " + u.estado + " – MAYOR de edad");
                mayores++;
            } else {
                System.out.println(u.nombre + " – Edad: " + u.edad + " – Estado: " + u.estado + " – MENOR de edad");
                menores++;
            }
        }

        System.out.println("--- Resumen ---");
        System.out.println("Total de usuarios registrados: " + total);
        System.out.println("Usuarios mayores de edad: " + mayores);
        System.out.println("Usuarios menores de edad: " + menores);

        scanner.close();
    }
}
