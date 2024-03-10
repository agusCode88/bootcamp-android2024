import java.util.Scanner;

public class SumaLimite {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num;
        int limite = 0;

        limite = pedirLimiteAlUsuario( scanner );

        while( suma <= limite){
            num = llegarAlLimiteSuma( scanner );
            suma = num + suma;
            System.out.println("La sumatoria hasta ahora es: " + suma);
        }
        mostrarPorPantallaResultado(limite);
        scanner.close();
    }

    private static int pedirLimiteAlUsuario( Scanner scanner ) {

        int limiteFuncion;
        System.out.println("***************************************************");
        System.out.println("*    Bienvenido al programa de sumar hasta un      *");
        System.out.println("*               límite.                            *");
        System.out.println("***************************************************");

        while ( true ){

            System.out.println( "Ingrese el limite que debe tener la suma: " );
            if( scanner.hasNextInt() ){
                limiteFuncion = scanner.nextInt();
                if( limiteFuncion > 0 ){
                    break;
                } else{
                    System.out.println(" ******* El límite debe ser positivo ");
                }
            } else {
                System.out.println(" ******* El dato ingresado no es valido ");
                scanner.next(); // Limpia rl buffer de entrada
            }

        }
        return limiteFuncion;
    }

    public static int llegarAlLimiteSuma( Scanner scanner ){
        int numeroUsuario;

        while ( true ){

            System.out.println( "Ingrese el numero que desea ir sumando: " );
            if( scanner.hasNextInt() ){
                numeroUsuario = scanner.nextInt();
                break;
            } else {
                System.out.println(" ******* El dato ingresado no es valido ");
                scanner.next(); // Limpia rl buffer de entrada
            }

        }

        return numeroUsuario;
    }

    private static void mostrarPorPantallaResultado( int limite) {

        System.out.println("La suma de los números ingresados supera el límite de" + limite);
    }
}
