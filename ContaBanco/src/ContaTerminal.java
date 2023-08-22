import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeDoCliente = "";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a agencia: ");
        agencia = scanner.nextLine();


        System.out.print("Digite o nome do Cliente: ");
        nomeDoCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        //scanner.nextLine();

        System.out.println("Olá " + nomeDoCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia +", conta "+ numero + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }


}
