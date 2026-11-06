package proyecto.modelo;

public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public Proyecto(String nombre, int progreso, String responsable, boolean terminado) {
        setNombre(nombre);
        setProgreso(progreso);
        setResponsable(responsable);
        this.terminado = terminado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre!=null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if(progreso>=0 && progreso<=100){
            this.progreso = progreso;
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        if(responsable!=null && !responsable.trim().isEmpty()){
            this.responsable = responsable;
        }
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void avanzar (int porcentaje){
        if(porcentaje>=0 && progreso+porcentaje<=100){
            progreso += porcentaje;
        }
    }

    public void finalizar() {
        terminado = true;
    }

    public void reabrir() {
        terminado = false;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Progreso: " + getProgreso() + "%");
        System.out.println("Responsable: " + getResponsable());
        System.out.println("Terminado: " + isTerminado());
    }

}
