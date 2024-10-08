import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        //Criando o objeto Scanner.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite a agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o nùmero da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Seu nome é: " + nome + " " + sobrenome);
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Saldo disponível para saque: " + saldo);


    }
}
