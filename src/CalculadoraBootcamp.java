import java.util.Scanner;

public class CalculadoraBootcamp {
    /**
     * @author Agustín Romero
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String accionUsuario = "";
        String operador = "";

        System.out.println("Bienvenido a la calculadora de terminal");

        do {

            try {
                // Aca muestro por pantalla
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextInt();

                System.out.println("Ingrese el número segundo:");
                num2 = scanner.nextInt();

                System.out.println("Ingrese el operador ( + , / , - , * ):");
                operador = scanner.next();

                switch (operador) {
                    case "+":
                        resultado = sumar(num1, num2);
                        break;
                    case "-":
                        resultado = restar(num1, num2);
                        break;
                    case "*":
                        resultado = multiplicar(num1, num2);
                        break;
                    case "/":
                        resultado = dividir(num1, num2);
                        break;
                    default:
                        System.out.println("Operador inválido");
                        break;
                }
                if (operador.equals("+") ||
                        operador.equals("-") ||
                        operador.equals("*") ||
                        operador.equals("/")
                ) {
                    System.out.println("El resultado es: " + resultado);
                }

            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            } finally {
                System.out.println(" ");
                System.out.println("Stop para detener la app, 's' para seguir");
                accionUsuario = scanner.next();
            }

        } while (!accionUsuario.toLowerCase().equals("stop"));
        System.out.println("Calculadora finalizada");
    }

    /**
     * Este método realiza la suma de dos números ingresados por teclado
     *
     * @param a  es el primer número que ingresa eL USUARIO POR TECLADO
     * @param b  es el segundo que ingresa eL USUARIO POR TECLADO
     * @return La suma de los dos numeros ingresados por teclado
     */
    public static int sumar(int a, int b) {
        return a + b;
    }

    /**
     *  aakjakjakjakjakjakja
     * @param a   xxxxxxxxxxxxxxxx
     * @param b   yyyyyyyyyyyyyyyyyy
     * @return     zzzzzzzzzzzzzzzzzzzzzzz
     */
    public static int restar(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    /**
     * @author Agustín Romero
     * @param a     sdsdsds
     * @param b  sdsfsf
     * @return   fsfsfsfsf
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}