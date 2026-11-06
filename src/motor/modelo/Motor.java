package motor.modelo;

public class Motor {
    private String nombre;
    private double potencia;
    private int velocidad;
    private boolean encendido;

    public Motor(String nombre, double potencia, int velocidad) {
        setNombre(nombre);
        setPotencia(potencia);
        setVelocidad(velocidad);
        encendido = false;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    // Setters
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPotencia(double potencia) {
        if (potencia >= 0) {
            this.potencia = potencia;
        }
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0 && velocidad <= 100) {
            this.velocidad = velocidad;
        }
    }

    // Métodos
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void mostrarMotor() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Potencia: " + getPotencia());
        System.out.println("Velocidad: " + getVelocidad());
        System.out.println("Encendido: " + isEncendido());
    }
}
