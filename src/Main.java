import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int opcion = 0;
        GestorTareas gt = new GestorTareas();
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("1.Añadir tarea");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    gt.crearTareas();
            }

        }while (opcion !=3);

    }
}
