import java.util.ArrayList;

    public class GestorTareas {

        private ArrayList<Tarea> listaTareas;

        // Constructor
        public GestorTareas() {
            listaTareas = new ArrayList<>();
        }

        // Método para añadir tareas (probablemente lo hace el Alumno A)
        public void añadirTarea(Tarea tarea) {
            listaTareas.add(tarea);
        }


        public void mostrarTareas() {

            if (listaTareas.isEmpty()) {
                System.out.println("No hay tareas registradas.");
            } else {
                for (Tarea tarea : listaTareas) {
                    System.out.println(tarea);
                }
            }
        }
}
