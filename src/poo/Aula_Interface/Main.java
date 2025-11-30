package Aula_Interface;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.ligar();
        pc.testar();
        pc.desligar();
        Integer x = pc.x;
        int y = pc.y;
        System.out.println(x);
        System.out.println(y);

    }
}
