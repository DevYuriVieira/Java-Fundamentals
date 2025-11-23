package controle_fluxo;

public class LoopFor {
    public static void main(String[] args) {
        //int i; tira int de todos os for
        for (int i=0; i < 10; i++){
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i=9;i>=0;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0;i<10;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=9;i>=0;i-=2) {
            System.out.print(i + " ");
        }
    }
}
