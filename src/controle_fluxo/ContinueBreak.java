package controle_fluxo;

public class ContinueBreak {
    public static void main(String[] args) {
        System.out.print("Continue no controle_dados.FOR");
        for (int i=0; i<=20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Break no for");
        for (int i=0; i<=30; i++){
            if (i==10){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Continue no while");
        int a = 0;
        while(a<=20) {
            a++;
            if (a % 2 == 1) {
                continue;
            }
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Break no while");
        a = 0;
        while(a<=30){
            a++;
            if (a == 10){
                break;
            }
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Continue no Do_while");
        int b = 0;
        do {
            b++;
            if(b % 3 == 0){
                continue;
            }
            System.out.println(b+" ");
        }while(b<=20);
        System.out.println();
        System.out.print("Break no Do_while");
        b=0;
        do {
            b++;
            if (b == 30){
                break;
            }
            System.out.println(b+" ");
        } while (b<=40);
        System.out.println();

    }
}
