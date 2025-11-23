package controle_fluxo;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
            while(i<5){
                System.out.print(i+" ");
                i++;
            }
        System.out.println();
            i = 0;
            while(i<5) {
                System.out.print(i + " ");
                i+=2;
            }
        System.out.println();
            i = 0;
            while(i>=5) {
                System.out.print(i + " ");
                i--;
            }
        System.out.println();
            i = 0;
            while(i>=10) {
                System.out.print(i + " ");
                i -= 2;
        }

    }
}
