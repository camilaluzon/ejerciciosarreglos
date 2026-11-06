package servicio.modelo;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public Servicio(String nombre, int puerto) {
        setNombre(nombre);
        setPuerto(puerto);
        activo = false;
        cantidadPeticiones = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPuerto() {
        return puerto;
    }

    public boolean isActivo() {
        return activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    // Setters
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        }
    }

    // Métodos
    public void iniciar() {
        activo = true;
    }

    public void detener() {
        activo = false;
    }

    public void registrarPeticion() {
        cantidadPeticiones++;
    }

    public void mostrarServicio() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Puerto: " + getPuerto());
        System.out.println("Activo: " + isActivo());
        System.out.println("Cantidad de peticiones: " + getCantidadPeticiones());
    }
}
