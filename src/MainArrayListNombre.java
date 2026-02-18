import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayListNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Añadir nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Mostrar nombres");
            System.out.println("4. Salir");
            System.out.println("Elige que quieres hacer: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre: ");
                    String nombre = scanner.nextLine();
                    nombres.add(nombre);
                    System.out.println(nombre + " Añadido");
                    break;

                case 2:
                    System.out.println("Introduce el nombre a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    if (nombres.remove(nombreEliminar)) {
                        System.out.println("Nombre Eliminado");
                    } else {
                        System.out.println("El nombre no esta en la lista");
                    }
                    break;

                case 3:
                    System.out.println("Lista de nombres: ");
                    if (nombres.isEmpty()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        for (String n : nombres) {
                            System.out.println(" - " + n);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 4);

        scanner.close();
    }
}