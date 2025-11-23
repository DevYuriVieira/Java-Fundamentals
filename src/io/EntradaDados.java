package io;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Informe um numero do tipo inteiro: ");
        int x = sc.nextInt();
        System.out.println("O numero digitado foi: "+x);

        System.out.print("Informe um numero do tipo decimal");
        Double y = sc.nextDouble();
        System.out.println("O numero digitado foi: "+y);

        sc.nextLine();
        System.out.println("Informe um nome: ");
        String str = sc.nextLine();
        System.out.println("O nome digitado foi: "+str);
    }
}
