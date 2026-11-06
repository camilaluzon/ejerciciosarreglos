package servicio.interfaz;

import java.util.Scanner;
import servicio.modelo.Servicio;

public class MainServicio {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Servicio servicios[] = new Servicio[MAX];

        int cantidad;
        int opc;
        int posicion;

        String nombre;
        int puerto;

        // Ingresar cantidad de servicios
        System.out.print("¿Cuántos servicios desea ingresar? ");
        cantidad = Integer.parseInt(sc.nextLine());

        while (cantidad < 1 || cantidad > MAX) {
            System.out.print("Cantidad no válida. Ingrese nuevamente: ");
            cantidad = Integer.parseInt(sc.nextLine());
        }

        // Llenar arreglo
        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nSERVICIO " + (i + 1));

            System.out.print("Ingrese nombre: ");
            nombre = sc.nextLine();

            while (nombre.trim().isEmpty()) {
                System.out.print("Nombre no válido. Ingrese nuevamente: ");
                nombre = sc.nextLine();
            }

            System.out.print("Ingrese puerto: ");
            puerto = Integer.parseInt(sc.nextLine());

            while (puerto <= 0) {
                System.out.print("Puerto no válido. Ingrese nuevamente: ");
                puerto = Integer.parseInt(sc.nextLine());
            }

            servicios[i] = new Servicio(nombre, puerto);
        }

        // Menú
        do {

            System.out.println("\n===== MENU SERVICIOS =====");
            System.out.println("1. Mostrar servicio");
            System.out.println("2. Iniciar servicio");
            System.out.println("3. Detener servicio");
            System.out.println("4. Registrar petición");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {

                System.out.print("Ingrese la posición del servicio (1-" + cantidad + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > cantidad) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;

                servicios[posicion].mostrarServicio();

            } else if (opc == 2) {

                System.out.print("Ingrese la posición del servicio (1-" + cantidad + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > cantidad) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;

                servicios[posicion].iniciar();

                System.out.println("Servicio iniciado correctamente.");

            } else if (opc == 3) {

                System.out.print("Ingrese la posición del servicio (1-" + cantidad + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > cantidad) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;

                servicios[posicion].detener();

                System.out.println("Servicio detenido correctamente.");

            } else if (opc == 4) {

                System.out.print("Ingrese la posición del servicio (1-" + cantidad + "): ");
                posicion = Integer.parseInt(sc.nextLine());

                while (posicion < 1 || posicion > cantidad) {
                    System.out.print("Posición no válida. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                posicion--;

                servicios[posicion].registrarPeticion();

                System.out.println("Petición registrada.");

            }

        } while (opc != 5);
        sc.close();
    }
}
