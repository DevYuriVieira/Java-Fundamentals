package Heranca_Override_Final;

public abstract class Funcionario { // Final usado na classe restringe a mesma de herança.
    public String nome;
    protected  int idade;
    protected float salario;
    protected float bonus;

    public abstract void pagarImposto();

    public final int teste=20; //Não realiza mudança para outro valor da variável (Constante)

    protected float horaExtra(int h, int f){
        return (h*1.5f)+(f*2f);
    }
    public void saudacao(){ // Final -> Método não disponível para override
        System.out.println("Olá");
    }
}
