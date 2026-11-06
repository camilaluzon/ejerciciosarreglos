package motor.interfaz;

import java.util.Scanner;
import motor.modelo.Motor;

public class MainMotor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Motor motores[] = new Motor[MAX];

        String nombre;
        double potencia;
        int velocidad;
        int opc;

        // Llenar todo el arreglo
        for (int i = 0; i < motores.length; i++) {

            System.out.println("\nMOTOR " + (i + 1));

            System.out.print("Ingrese nombre: ");
            nombre = sc.nextLine();

            while (nombre.trim().isEmpty()) {
                System.out.print("Nombre no válido. Ingrese nuevamente: ");
                nombre = sc.nextLine();
            }

            System.out.print("Ingrese potencia: ");
            potencia = Double.parseDouble(sc.nextLine());

            while (potencia < 0) {
                System.out.print("Potencia no válida. Ingrese nuevamente: ");
                potencia = Double.parseDouble(sc.nextLine());
            }

            System.out.print("Ingrese velocidad: ");
            velocidad = Integer.parseInt(sc.nextLine());

            while (velocidad < 0 || velocidad > 100) {
                System.out.print("Velocidad no válida. Ingrese nuevamente: ");
                velocidad = Integer.parseInt(sc.nextLine());
            }

            motores[i] = new Motor(nombre, potencia, velocidad);
        }

        // Menú
        do {

            System.out.println("\n===== MENU MOTORES =====");
            System.out.println("1. Mostrar todos los motores");
            System.out.println("2. Encender todos los motores");
            System.out.println("3. Apagar todos los motores");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {

                for (int i = 0; i < motores.length; i++) {
                    System.out.println("\nMOTOR " + (i + 1));
                    motores[i].mostrarMotor();
                }

            } else if (opc == 2) {

                for (int i = 0; i < motores.length; i++) {
                    motores[i].encender();
                }

                System.out.println("Todos los motores fueron encendidos.");

            } else if (opc == 3) {

                for (int i = 0; i < motores.length; i++) {
                    motores[i].apagar();
                }

                System.out.println("Todos los motores fueron apagados.");
            }

        } while (opc != 4);

        sc.close();
    }
}
