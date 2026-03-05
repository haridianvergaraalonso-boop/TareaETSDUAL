import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int opcion = 0;
        GestorTareas gt = new GestorTareas();
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("1.Añadir tarea \n2.listar \n3.salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    gt.crearTareas();
                    break;
                case 2:
                    gt.mostrarTareas();
                    break;
                case 3:
                    System.out.println("saliendo de la app");
                    break;
                default:
                    System.out.println("opcion invalida");
            }

        } while (opcion != 3);

    }
}
