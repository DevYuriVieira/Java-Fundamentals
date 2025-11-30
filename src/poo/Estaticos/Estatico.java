package Estaticos;

public class Estatico {
    protected static int contador=0;
    public static int o=10;
    public Estatico(){
        contador++;
    }

    public static  int j(){
        return 1+1;
    }
    public static String mensagem(){
        return "Qual o seu nome?";
    }
    public static void mensagem_2(){
        System.out.println("Testando void");
        System.out.println(mensagem());
        System.out.println(j());
        int h = o;
        System.out.println(h);
    }


}
