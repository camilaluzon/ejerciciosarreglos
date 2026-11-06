package usuario.interfaz;

import java.util.Scanner;
import usuario.modelo.Usuario;

public class MainUsuario {
    static void main() {
        Scanner sc = new Scanner(System.in);

        final int MAX = 3;
        Usuario usuarios[] = new Usuario[MAX];

        String username, correo;
        int nivel, opc;

        // Llenar todo el arreglo
        for (int i = 0; i < usuarios.length; i++) {

            System.out.println("\nUSUARIO " + (i + 1));

            System.out.print("Ingrese username: ");
            username = sc.nextLine();

            while (username.trim().isEmpty()) {
                System.out.print("Username no válido. Ingrese nuevamente: ");
                username = sc.nextLine();
            }

            System.out.print("Ingrese correo: ");
            correo = sc.nextLine();

            while (correo.trim().isEmpty()) {
                System.out.print("Correo no válido. Ingrese nuevamente: ");
                correo = sc.nextLine();
            }

            System.out.print("Ingrese nivel: ");
            nivel = Integer.parseInt(sc.nextLine());

            while (nivel < 0) {
                System.out.print("Nivel no válido. Ingrese nuevamente: ");
                nivel = Integer.parseInt(sc.nextLine());
            }

            usuarios[i] = new Usuario(username, correo, nivel);
        }

        // Menú
        do {
            System.out.println("\n===== MENU USUARIOS =====");
            System.out.println("1. Mostrar todos los usuarios");
            System.out.println("2. Activar todos los usuarios");
            System.out.println("3. Desactivar todos los usuarios");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opc = Integer.parseInt(sc.nextLine());

            if (opc == 1) {

                for (int i = 0; i < usuarios.length; i++) {
                    System.out.println("\nUsuario " + (i + 1));
                    usuarios[i].mostrarUsuario();
                }

            } else if (opc == 2) {

                for (int i = 0; i < usuarios.length; i++) {
                    usuarios[i].activar();
                }

                System.out.println("Todos los usuarios fueron activados.");

            } else if (opc == 3) {

                for (int i = 0; i < usuarios.length; i++) {
                    usuarios[i].desactivar();
                }

                System.out.println("Todos los usuarios fueron desactivados.");

            } else if (opc == 4) {

                System.out.println("Programa finalizado.");

            } else {
                System.out.println("Opción no válida.");
            }

        } while (opc != 4);

        sc.close();
    }
}
