package controle_fluxo;

public class IfAninhado {
    public static void main(String[] args) {
        int v=5;
            if (v%2==0){
                if(v%3==0){
                    if(v % 4 == 0){
                        System.out.println("O número é divisivel por 4 e 6");
                    }else{
                        System.out.println("O número é divisivel por 6");
                    }
                }else{
                    System.out.println("O numero é divisivel por 2");
                }
            }else{
                System.out.println("É divisivel por ele mesmo"+v);
            }
    }
}
