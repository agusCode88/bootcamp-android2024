import java.util.Scanner;

public class RellenarDiasSemana {

    public static void main(String[] args) {
        String[] diasSemana = new String[7];
        cargarDias(diasSemana);
    }

    public static void cargarDias(String[] diasSemana){
        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i < diasSemana.length ; i++){
            System.out.println("Ingrese el día de la semana : " + (i+1) );
            diasSemana[i] = scanner.nextLine();
        }

        for(int i=0 ; i < diasSemana.length ; i++){
            System.out.println("El dia DE LA SEMANA ES: " + diasSemana[i] );
        }
    }
}
