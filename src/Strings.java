import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra de longitud 8:");
        String entrada = scanner.nextLine();

        if (entrada.length() == 8) {
            // Si la longitud es 8, imprimir "CORRECTO" y la frase en mayúsculas
            System.out.println("CORRECTO");
            System.out.println(entrada.toUpperCase());
        } else {
            // Si la longitud no es 8, imprimir "INCORRECTO" y la frase en minúsculas
            System.out.println("INCORRECTO");
            System.out.println(entrada.toLowerCase());
        }

        scanner.close();
    }
}
