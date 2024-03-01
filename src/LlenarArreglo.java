public class LlenarArreglo {

    public static void main(String[] args) {
        int[] arregloNumerosEnteros = new int[5000];

        for(int i=0; i<5000; i++){
            arregloNumerosEnteros[i] = 100 - i;
        }

        System.out.println("Los 100 primero numeros mostrados en forma descendente:");
        System.out.println("Linea nueva");
        for(int i=0; i<5000;i++){
            System.out.println(arregloNumerosEnteros[i] + "");
            /*if(arregloNumerosEnteros[i] == 55){
                System.out.println("Encontré el numero"+ arregloNumerosEnteros[i] + "Que está en la posición " + i  );
                break;
            }*/
        }
    }
}
