import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, Digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, Digite o Nome do Cliente: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.print("Por favor, Digite o Saldo do Cliete: ");
        double saldoCliente = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        System.out.println("Olá " + nomeDoCliente + ", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo " +
                saldoCliente + " já está disponível para saque");
    }
}