import java.util.Scanner;

public class LargoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textoUsuario;

        System.out.println("Ingrese el texto que quiera evaluarr: ");

        textoUsuario = scanner.nextLine();
        if( textoUsuario.length() == 8 ){
            System.out.println("CORRECTO");
            System.out.println( textoUsuario.toUpperCase() );

        }else{
            System.out.println("INCORRECTO");
            System.out.println( textoUsuario.toLowerCase() );
        }
    }
}
