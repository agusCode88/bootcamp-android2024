import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Main clase = new Main();

        while(true) {
            System.out.println("Ingrese el primer numero: ");
            // Si el usuario ingresa un numero
            if(scanner.hasNextInt()){
                int numero1 = scanner.nextInt();
                System.out.println(calcularNumeroPar(numero1));

            } else{
                System.out.println("El dato ingresado no es un número");
                break;
            }
        }
    }

    // Funcion que calcula el resto de una division de dos numeros
    // Si el resto es cero , es par , sino es impar
    public static String calcularNumeroPar( int numero1 ){

        int resultado = 0;
        String esPar = "Es impar";
        resultado = numero1 % 2;
        if( resultado == 0 ){
            return "Es par";
        }
        return esPar;
    }
}