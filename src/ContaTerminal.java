import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu número cadastral: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
    }
}