package estruturas_dados;

public class Matriz {
    public static void main(String[] args) {
       int[][] matriz = new int [4][4];
       for (int i=0; i< matriz.length;i++){
           int[][] mt = new int [4][];
           mt[0] = new int[5];
           mt[1] = new int[3];
           mt[2] = new int[8];
           mt[3] = new int[9];
           for (int j=0; j<mt[i].length;j++){
               System.out.println(mt[i][j]+ " ");
                    mt[i][j]= i+j;
           }
       }
        for (int i=0; i< mt.length;i++) {
            for (int j = 0; j < mt[i].length; j++) {
                System.out.println(mt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j=0; j<matriz[i].length;j++){
            System.out.println(matriz[i][j]+ " ");
            matriz[i][j]= i+j
        }
        System.out.println();
    }
        for (int i=0; i< matriz.length;i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.println(matriz[i][j] + " ");
        }
    }
}
