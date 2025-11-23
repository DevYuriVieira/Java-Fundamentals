package estruturas_dados;

import java.util.Scanner;

public class EntradaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de linhas: ");
        int l = scanner.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int c = scanner.nextInt();

        int [] [] matriz = new int[l][c];
        System.out.println("Digite os elementos da matriz: ");
        for (int i=0;i<1;i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("estruturas_dados.Matriz lida, agora imprimir-la: ");
        for (int i=0; i<l;i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(matriz[i][j] + " ");
            }
        }
        scanner.close();
    }
}
