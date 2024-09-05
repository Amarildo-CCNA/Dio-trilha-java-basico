import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu nome do meio");
            String nomeMeio = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

             System.out.println("Digite sua idade");
             int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //Código antigo.
             /*String nome = args [0];
            *String nomeMeio = args [1];
            String sobrenome = args [2];
            *int idade = Integer.valueOf(args[3]);
            *double altura = Double.valueOf(args[4]);
            */
            System.out.println("Eu me chamo " + nome + " " + nomeMeio + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + " cm");

        }
        catch(InputMismatchException a){
            System.out.println("O campo Idade aceita somente números");
            System.out.println("No campo Altura use apenas ponto. Não use vìrgula");
        }    
    }
}
