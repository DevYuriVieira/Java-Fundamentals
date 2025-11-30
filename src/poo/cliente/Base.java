package cliente;

public class Base {
    public static void main(String[] args) {
        try{
            Cliente c = new Cliente();
            c.nome = "Yuri";
            System.out.println("O nome informado é: "+c.nome);
            c.consumo = 1090f;
            System.out.println("O seu consumo foi de: "+c.consumo);
            c.setAnoNascimento(1998);
            System.out.println("O ano de nascimento é: "+c.getAnoNascimento());
        }catch (Exception e){
            System.err.println(e.getMessage());

        }


    }
}
