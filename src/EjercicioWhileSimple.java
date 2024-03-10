import java.util.Scanner;

public class EjercicioWhileSimple {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int num;
        int limite = 0;

        System.out.println("***************************************************");
        System.out.println("*    Bienvenido al programa de sumar hasta un      *");
        System.out.println("*               límite.                            *");
        System.out.println("***************************************************");

        System.out.println( "Ingrese el limite que debe tener la suma: " );

        limite = scanner.nextInt();
        //scanner.next();
        scanner = new Scanner(System.in);
        System.out.println( "Ingrese el numero que desea ir sumando: " );

        num = scanner.nextInt();

        while ( suma + num <= limite ) {
              suma += num;
              System.out.println("La sumatoria hasta ahora es: " + suma);
            if (suma < limite) {
                System.out.println("Ingrese otro numero: ");
                num = scanner.nextInt();
            } else {
                break;
            }
        }

        System.out.println("La suma de los números ingresados supera el límite de" + limite);

    }

}
