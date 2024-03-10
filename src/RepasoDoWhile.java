import java.util.Scanner;

public class RepasoDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limiteSuma;
        int sumaValoresIngresados = 0;
        int numeroUsuario;

        System.out.println("Ingrese el límite de la suma de números:");
        limiteSuma = scanner.nextInt();

        if( limiteSuma <= 0 ){
            System.out.println("Por favor ingrese un numero positivo");
            return;
        }

        do {

            System.out.println("Ingrese el numero a sumar: ");
            numeroUsuario = scanner.nextInt();

            sumaValoresIngresados  += numeroUsuario;

        }while ( sumaValoresIngresados <= limiteSuma );

        System.out.printf("La suma total de los número s es:" + sumaValoresIngresados + "Donde el límite era: " + limiteSuma);
        scanner.close();
    }
}
