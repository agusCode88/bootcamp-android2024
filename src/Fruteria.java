import java.util.Scanner;

public class Fruteria {

    public static void main(String[] arg){

        double valorKilogramo;
        String frutaUsuario;

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Bienvenido a tu fruteria preferida:" );

        System.out.println( "Ingrese el nombre de la fruta a comprar:" );
        frutaUsuario = scanner.nextLine().toLowerCase();

        switch ( frutaUsuario ){
            case "platano":
                valorKilogramo = 2.5;
                break;

            case "naranja":
                valorKilogramo = 8.5;
                break;

            case "papaya":
                valorKilogramo = 12.5;
                break;

            case "frutilla":
                valorKilogramo = 22.8;
                break;

            case "manzana":
                valorKilogramo = 45.9;
                break;

            default:
                System.out.println("La fruta ingresada no la tenemos");
                return; // Salir del programa si no es ninguna de las frutas ingresadas
        }

        System.out.println("El valor del kilogramo de la fruta " + frutaUsuario + "es:"+ valorKilogramo + "$");
        scanner.close();

    }
}
