package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        String str = "ABC";
        String nome = null;
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int x = 10/0;
            System.out.println("Tamanho da string nome"+nome.length());
            System.out.println(str.charAt(3));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Posição Inválida");
        } catch (NullPointerException e){
            System.out.println("Não existe nome digitado");
        } catch (ArithmeticException e){
            System.out.println("Não existe divisão por 0");
        } catch (InputMismatchException e){
            System.out.println("O numero digitado deve ser do tipo inteiro");
        } catch (Exception e){
            System.out.println("Exceção genérica");
        } finally {
            System.out.println("Executando Finally");
        }


    }
}
