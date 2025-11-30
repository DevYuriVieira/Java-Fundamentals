import cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("O seu nome é: "+p.str);
        System.out.println("O ano de nascimento é: "+p.ano_nascimento);
        p.falar();
        p.ano();

        new Cliente();
        Cliente c1 = new Cliente();
        c1.nome2 = "Teste";
        System.out.println(c1.nome2);
    }

}
