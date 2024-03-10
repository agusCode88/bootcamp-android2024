import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del radio de la esfera:");
        double radio = scanner.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);

        scanner.close();
    }
}