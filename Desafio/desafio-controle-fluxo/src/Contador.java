import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }

        scanner.close();

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }

}