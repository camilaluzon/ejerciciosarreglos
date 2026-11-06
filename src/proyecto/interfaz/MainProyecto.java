package proyecto.interfaz;

import java.util.Scanner;
import proyecto.modelo.Proyecto;

public class MainProyecto {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Proyecto proyectos[] = new Proyecto[MAX];
        int indice = 0;

        String nombre;
        String responsable;
        int progreso;
        String continuar;
        int opc;
        int posicion;
        int porcentaje;

        while (indice < MAX) {

            System.out.print("Ingrese nombre del proyecto: ");
            nombre = sc.nextLine();

            System.out.print("Ingrese responsable: ");
            responsable = sc.nextLine();

            System.out.print("Ingrese progreso: ");
            progreso = Integer.parseInt(sc.nextLine());

            proyectos[indice] = new Proyecto(nombre, progreso, responsable, false);

            indice++;

            System.out.print("¿Desea ingresar otro proyecto? (si/no): ");
            continuar = sc.nextLine();

            while (!continuar.equalsIgnoreCase("si") && !continuar.equalsIgnoreCase("no")) {
                System.out.print("Respuesta no válida. Ingrese si o no: ");
                continuar = sc.nextLine();
            }

            if (continuar.equalsIgnoreCase("no")) {
                break;
            }
        }

        do {
            System.out.println("\n===== MENU PROYECTOS =====");
            System.out.println("1. Mostrar proyecto");
            System.out.println("2. Avanzar proyecto");
            System.out.println("3. Finalizar proyecto");
            System.out.println("4. Reabrir proyecto");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {

                System.out.print("Ingrese el índice del proyecto: ");
                posicion = Integer.parseInt(sc.nextLine());

                posicion--;

                while (posicion < 0 || posicion >= indice) {
                    System.out.print("Índice no válido. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                proyectos[posicion].mostrarInformacion();
            }else if (opc == 2) {

                System.out.print("Ingrese el índice del proyecto: ");
                posicion = Integer.parseInt(sc.nextLine());

                posicion--;

                while (posicion < 0 || posicion >= indice) {
                    System.out.print("Índice no válido. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                System.out.print("Ingrese el porcentaje de avance: ");
                porcentaje = Integer.parseInt(sc.nextLine());

                proyectos[posicion].avanzar(porcentaje);

            }else if (opc == 3) {

                System.out.print("Ingrese el índice del proyecto: ");
                posicion = Integer.parseInt(sc.nextLine());

                posicion--;

                while (posicion < 0 || posicion >= indice) {
                    System.out.print("Índice no válido. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                proyectos[posicion].finalizar();

                System.out.println("Proyecto finalizado correctamente.");
            }else if (opc == 4) {
                System.out.print("Ingrese el índice del proyecto: ");
                posicion = Integer.parseInt(sc.nextLine());

                posicion--;

                while (posicion < 0 || posicion >= indice) {
                    System.out.print("Índice no válido. Ingrese nuevamente: ");
                    posicion = Integer.parseInt(sc.nextLine());
                }

                proyectos[posicion].reabrir();

                System.out.println("Proyecto reabierto correctamente.");
            }

        } while (opc != 5);
        sc.close();
    }
}
