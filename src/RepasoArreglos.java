import java.util.Scanner;

public class RepasoArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] paises = new String[5];
        String[] paisesFrontera = {"Chile","Argentina","Perú","Bolivia"};

        System.out.println("Programa pra ingresar 5 países de Sudamerica:");

        for(int i=0 ; i < 5 ; i++){
            System.out.println("Ingrese el nombre del país: " + (i+1) + ":" );
            paises[i] = scanner.nextLine();

        }

        System.out.println("Los países ingresados son:");
        for(int i=0 ; i < 5 ; i++){
            System.out.println(( i +1 ) + " : " + paises[i] );
        }

        System.out.println("Los países frontera de Chile son(FOREACH):");
        for(String paisFrontera : paisesFrontera){
            System.out.println("El país frontera es: " + paisFrontera);
        }

    }
}
