import java.util.Locale;
import java.util.Scanner;

public class DoWhileSimple {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double cantiDadNotas = 0;

        System.out.println(" Ingrese la cantidad de notas para calcular el promedio: ");
        cantiDadNotas = scanner.nextInt();

        if( cantiDadNotas < 0 ){
            System.out.println( "La cantidad de notas debe ser mayor");
            return;
        }

        double maximo = Integer.MAX_VALUE;
        double minimo = Integer.MIN_VALUE;
        double sumaNotas = 0;
        double nota;
        int contador = 0;

        do{
            // Accion que se va a repetir
            System.out.println( "Ingrese la nota" + ( contador + 1 ) + ":");
            nota = scanner.nextDouble();

            minimo = Math.min(minimo,nota);
            maximo = Math.max(maximo,nota);

            sumaNotas = sumaNotas + nota;
            //sumaNotas+= nota;

            contador = contador +1;
            //contador++

        } while( contador < cantiDadNotas);

        double promedio = sumaNotas/cantiDadNotas;

        System.out.println("El valor máximo de ls notas ingresadas es: " + maximo);
        System.out.println("El valor mínimo de ls notas ingresadas es: " + minimo);
        System.out.println("El promedio de notas es: " + promedio);

        scanner.close();

    }

}
