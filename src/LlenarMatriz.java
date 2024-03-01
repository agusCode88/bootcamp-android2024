public class LlenarMatriz {
    public static void main(String[] args) {

        int numeroEnteros[][] = new int[10][10];

        int numero=100;
        for(int i=0 ; i<10 ; i++){
            for(int j=0 ; j<10 ; j++){
                numeroEnteros[i][j] = numero--;
            }
        }

        System.out.println("Los 100 primeros numeros en una mztriz de datos descendente son: ");
        for(int i=0 ; i<10 ; i++){
            for(int j=0 ; j<10 ; j++){
                System.out.print(numeroEnteros[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
