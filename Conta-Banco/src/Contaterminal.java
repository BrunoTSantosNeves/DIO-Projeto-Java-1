import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Pedindo ao usuário que digite o nome do titular da conta, o sobrenome, o saldo, o número da agência e o número da conta.
         */
        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do titular da conta: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        /*
         * Exibindo as informações da conta do usuário.
         */
        System.out.println("Seja bem-vindo(a) " + nome + " " + sobrenome + "!");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: R$" + saldo);

        int operacao = 0; // Inicializamos a variável para controle do loop

        /*
         * Mantém o loop enquanto a operação for inválida.
         */
        while (true) {
            System.out.println("Digite qual operação deseja realizar (1 para Depósito ou 2 para Saque): ");
            operacao = scanner.nextInt();

            if (operacao == 1) { // Depósito
                System.out.println("Digite o valor do depósito: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Saldo atualizado: R$" + saldo);
                break; // Sai do loop após operação válida
            } else if (operacao == 2) { // Saque
                System.out.println("Digite o valor do saque: ");
                double valorSaque = scanner.nextDouble();
                
                if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
                break; // Sai do loop após operação válida
            } else { // Operação inválida
                System.out.println("Operação inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
