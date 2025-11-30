package Heranca_Override_Final;

public class Main_Func {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Operario();
        Gerente g1 = new Gerente();
        Operario op1 = new Operario();
        polimorfismo(f1);
        polimorfismo(f2);
        polimorfismo(g1);
        polimorfismo(op1);
    }
    private static void polimorfismo(Funcionario f){
        f.pagarImposto();

    }

}
