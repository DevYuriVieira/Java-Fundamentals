package sintaxe;

public class Funcoes {

    void hello(){
        System.out.println("Olá");
    }

    void hello(String nome){
        System.out.println("olá, " +nome+"!");
    }

    String chegada(){
        return "Olá";
    }

    String chegada(String nome){
        return "Olá, "+nome+"!!";
    }

    int sum(int n1, int n2){
        hello();
        return n1+n2;
    }
    
    public static void main(String[] args) {
        new Funcoes().hello();
        new Funcoes().hello("Yuri");
        String x = new Funcoes().chegada();
            System.out.println(x);
        String y = new Funcoes().chegada("Yuri");
            System.out.println(y);
        Integer z = new Funcoes().sum(10,20);
        System.out.println(z);
    }
}
