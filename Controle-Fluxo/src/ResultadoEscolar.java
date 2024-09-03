public class ResultadoEscolar {
    public static void main(String[] args) {
        
        //Uso de operadores ternários.

        double nota = 4.9;
        String resultado = nota >= 7 ? "Aluno Aprovado" : nota >= 5 && nota < 7 ? "Alune em Recuperação" : "Aluno Reprovado";

        System.out.println(resultado);

    }
    
}
