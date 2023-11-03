import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las palabras deseadas (separadas por comas y finalice con enter): ");
        String palabras = scanner.nextLine();
        List<String> listaPalabras = Arrays.asList(palabras.split(", "));
        System.out.println("Lista de palabras:");
        for (String palabra : listaPalabras) {
            System.out.println(palabra);
        }
        crearListado listadoAConvertir = list -> {
            list.replaceAll(String::toUpperCase);
            return list;
        };
        List<String> listaEnMayusculas = listadoAConvertir.convertirAMayusculas(listaPalabras);

        System.out.println("Lista en mayúsculas:");
        for (String palabra : listaEnMayusculas) {
            System.out.println(palabra);
        }
    }
}
