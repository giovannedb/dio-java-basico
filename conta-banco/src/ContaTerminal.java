import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso usuário
        System.out.println("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero de sua agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo bancario: ");
        Double saldoBancario = scanner.nextDouble();

        //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é : " + agencia + " , conta: " + numeroConta + " e seu saldo : " + saldoBancario + " já está disponivel ");

        //Exibir a mensagem final
    }
}
