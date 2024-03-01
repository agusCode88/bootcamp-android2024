import java.util.Scanner;

public class EjercicioEntradas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precioEntrada;

        System.out.println("Bienvenido a los juegos del hambre:");
        System.out.println("Por favor ingresa la edad de la persona:");

        int edad = scanner.nextInt();
        if(edad < 4){
            precioEntrada = 0;
        } else if((edad >= 4 ) && (edad < 18)){
            precioEntrada= 5.000;
        } else{
            precioEntrada = 10.000;
        }

        System.out.println("El valor de la entrada es:" + precioEntrada +"$");

        scanner.close();
    }
}
