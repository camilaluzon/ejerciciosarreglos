package motor.interfaz;

import java.util.Scanner;
import motor.modelo.Motor;

public class MainMotor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Motor motores[] = new Motor[MAX];

        int opc;
        int posicion;
        int velocidad;
        double potencia;
        String nombre;

        // Llenar arreglo
        for (int i = 0; i < motores.length; i++) {
            System.out.println("\nMOTOR " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            nombre = sc.nextLine();

            while (nombre.trim().isEmpty()) {
                System.out.print("Nombre no válido. Ingrese nuevamente: ");
                nombre = sc.nextLine();
            }

            System.out.print("Ingrese la potencia: ");
            potencia = Double.parseDouble(sc.nextLine());

            while (potencia < 0) {
                System.out.print("Potencia no válida. Ingrese nuevamente: ");
                potencia = Double.parseDouble(sc.nextLine());
            }

            System.out.print("Ingrese la velocidad (0-100): ");
            velocidad = Integer.parseInt(sc.nextLine());

            while (velocidad < 0 || velocidad > 100) {
                System.out.print("Velocidad no válida. Ingrese nuevamente: ");
                velocidad = Integer.parseInt(sc.nextLine());
            }

            motores[i] = new Motor(nombre, potencia, velocidad);
        }

        // Menú de opciones
        do {
            System.out.println("\n===== MENU MOTORES =====");
            System.out.println("1. Mostrar motor");
            System.out.println("2. Encender motor");
            System.out.println("3. Apagar motor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {
                System.out.print("Ingrese la posición del motor (1-" + motores.length + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > motores.length) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;
                motores[posicion].mostrarMotor();

            } else if (opc == 2) {
                System.out.print("Ingrese la posición del motor (1-" + motores.length + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > motores.length) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;
                motores[posicion].encender();
                System.out.println("Motor encendido correctamente.");

            } else if (opc == 3) {
                System.out.print("Ingrese la posición del motor (1-" + motores.length + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > motores.length) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;
                motores[posicion].apagar();
                System.out.println("Motor apagado correctamente.");
            }

        } while (opc != 4);

        sc.close();
    }
}
