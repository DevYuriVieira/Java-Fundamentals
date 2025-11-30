package Aula_Interface;

public class Computador implements Maquina, Teste{
    @Override
    public void ligar() {
        System.out.println("Computador ligando... ");

    }

    @Override
    public void desligar() {
        System.out.println("Computador desligando... ");

    }

    @Override
    public void testar() {
        System.out.println("Computador realizando testes...");

    }
}
