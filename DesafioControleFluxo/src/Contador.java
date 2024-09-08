import java.util.Scanner;

public class Contador{
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        int parametroUm   = terminal.nextInt();
        int parametroDois = terminal.nextInt();

        System.out.println("Digite o primeiro Número: ");
        parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo Número: ");
        parametroDois = terminal.nextInt();
    }
}
