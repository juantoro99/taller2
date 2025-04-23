import java.util.Scanner;

public class InformacionAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos personales
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        System.out.print("Ingresa tu carrera: ");
        String carrera = scanner.nextLine();

        // Número de materias
        System.out.print(" cuantas asignaturas registrara ");
        int nMaterias = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] asignaturas = new String[nMaterias];
        int[] calificaciones = new int[nMaterias];

        // Lectura de asignaturas y calificaciones
        for (int i = 0; i < nMaterias; i++) {
            System.out.print("Ingresa nombre de la asignatura #" + (i + 1) + ": ");
            asignaturas[i] = scanner.nextLine();

            System.out.print("Ingresa calificacion de " + asignaturas[i] + ": ");
            calificaciones[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
        }

        // Mostrar datos personales
        System.out.println("\nNombre: " + nombre + ", Edad: " + edad + ", Carrera: " + carrera);

        // Mostrar listado de asignaturas y calificaciones
        int suma = 0;
        for (int i = 0; i < nMaterias; i++) {
            System.out.println((i + 1) + ") " + asignaturas[i] + " = " + calificaciones[i]);
            suma += calificaciones[i];
        }

        // Calcular y mostrar promedio
        double promedio = (double) suma / nMaterias;
        System.out.printf("Promedio de calificaciones: %.2f\n", promedio);

        // Estado final
        if (promedio >= 60) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }

        scanner.close();
    }
}
