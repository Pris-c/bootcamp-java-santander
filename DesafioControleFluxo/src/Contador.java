import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("CONTADOR");
        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();


        try {
            testarNumeros(num1, num2);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        imprimirContagem(num1, num2);

    }


    public static boolean testarNumeros(int num1, int num2) throws ParametrosInvalidosException {
        if (num1>num2){
            throw new ParametrosInvalidosException();
        } else {
            return true;
        }
    }

    public static void imprimirContagem(int num1, int num2){
        int contagem = num2 -num1;
        for(int i=1; i<=contagem; i++){
            System.out.println("Imprimindo número " + i);
        }
    }

}
