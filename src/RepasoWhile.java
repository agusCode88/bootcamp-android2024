import java.util.Scanner;

public class RepasoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroCero = 0;
        int numeroCien = 100;
        boolean flag = true;
        int num = 0;

        while ( flag ) {
            System.out.println("Ingrese un número:");
            num = scanner.nextInt();
            if ((num == numeroCero) || (num == numeroCien)) {
                flag = false;
            }
        }
        System.out.println("Se ha cumplido la condición, ha ingresado: " + num );
    }
}
