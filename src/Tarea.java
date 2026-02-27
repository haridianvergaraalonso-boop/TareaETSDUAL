public class Tarea {
    //atributos a utilizar
    private String tituloTarea;
    private String descripcionTarea;
    private String asignaturaTarea;
    private double notaTarea;

    //constructor y setters
    public Tarea (String tituloTarea, String descripcionTarea, String asignaturaTarea, double notaTarea){
        this.tituloTarea = tituloTarea;
        this.descripcionTarea = descripcionTarea;
        this.asignaturaTarea = asignaturaTarea;
        this.notaTarea = notaTarea;
    }

    // getters simplemente
    public String getTituloTarea() {
        return tituloTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public String getAsignaturaTarea() {
        return asignaturaTarea;
    }

    public double getNotaTarea() {
        return notaTarea;
    }

    // Setters individuales
    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public void setAsignaturaTarea(String asignaturaTarea) {
        this.asignaturaTarea = asignaturaTarea;
    }

    public void setNotaTarea(double notaTarea) {
        this.notaTarea = notaTarea;
    }

    //override para el array list y toString para que se pueda poner la informacion

    @Override
    public String toString() {
        return "Título: " + tituloTarea +
                "Descripción: " + descripcionTarea +
                "Asignatura: " + asignaturaTarea +
                "Nota: " + notaTarea +
                "----------------------"; //rayas decorativas 🥺
    }
}
