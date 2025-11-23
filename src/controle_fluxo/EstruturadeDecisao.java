package controle_fluxo;

public class EstruturadeDecisao {
    void media(float nota){
        if(nota>=7){
            System.out.println("Aluno Aprovado");
        } else if (nota>=4 && nota <=6.99) {
            System.out.println("Aluno de recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
    public static void main(String[] args) {
        float a = 5.5f, b = 4.0f, c = 10f, d = 9f;
        float media = (a + b + c + d)/4;
        System.out.println("A média final do aluno é "+media);
        new EstruturadeDecisao().media(media);
    }
}
