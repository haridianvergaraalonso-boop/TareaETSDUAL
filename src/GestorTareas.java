import java.util.ArrayList;
import java.util.Scanner;

    public class GestorTareas {

        private ArrayList<Tarea> listaTareas;

        // Constructor
        public GestorTareas() {
            listaTareas = new ArrayList<>();
        }

        Scanner sc = new Scanner(System.in);

        /**
         * @author haridian
         * Esta clase hace que se puedan crear las tareas como objeto
         */
        public void crearTareas(){
            System.out.println("Añade el nombre de la tarea que quieras añadir");
            String tituloCrear = sc.nextLine();
            System.out.println("Introduce la descripción");
            String descCrear = sc.nextLine();
            System.out.println("De que asignatura es");
            String asigCrear = sc.nextLine();
            System.out.println("Que nota sacaste");
            double notaCrear = sc.nextDouble();
            sc.nextLine();

            Tarea tareas = new Tarea(tituloCrear, descCrear, asigCrear, notaCrear);
            listaTareas.add(tareas);
        }

        /**
         * @deprecated
         */
        public void aniadirTarea(Tarea tareas) {


        }

        /**
         * @author Alberto GF
         */
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
