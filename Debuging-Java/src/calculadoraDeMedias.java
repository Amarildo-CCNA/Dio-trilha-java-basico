import java.util.Scanner;

public class calculadoraDeMedias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String[] alunos = {"Camila", "Luciana", "Bruna", "Carla"}; 
        
        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.println("A média da turma %.3f: " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){

        double soma = 0;

        for(String aluno : alunos){

            System.out.printf("A nota do acadêmico %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }



    

}
