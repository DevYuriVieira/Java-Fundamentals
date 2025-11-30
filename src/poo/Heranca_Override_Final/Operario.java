package Heranca_Override_Final;

public class Operario extends Funcionario {
    @Override
    public void saudacao() {
        System.out.println("Olá, tudo bem?");
    }

    @Override
    public void pagarImposto() {
        System.out.println("O operário paga 7% de imposto");
    }

    @Override
    protected float horaExtra(int h, int f) {
        return (h*2)+(f*3);
    }

    public void trabalhar(){

    }
    public void trabalhar(int h){

    }
    public void trabalhar(char g){

    }
    public void trabalhar(int x, int h){

    }
}


