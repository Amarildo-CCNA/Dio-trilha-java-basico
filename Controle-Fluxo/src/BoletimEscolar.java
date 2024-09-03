public class BoletimEscolar {

    public static void main(String[] args) {
        
        double nota = 6.5;

        if (nota >= 7)

            System.out.println("Aluno aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Aluno em recuperação");

        else

            System.out.println("Aluno reprovado");
    }
}