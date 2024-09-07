import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) throws Exception {
      
                
    }

    static void selecaoCandidatos(){
        //Array com a lista dos candidatos
        String [] candidatos = {"Adriana", "Júlia", "Isabel", "Tamara", "Talita", "Márcia"};
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " pretende este valor= " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato: " + candidato + " foi seiecionado");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCadidato(double salarioPretendido){

        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato ");

        }else if(salarioBase == salarioPretendido)
            System.out.println("Ligar com contra propósta ");

        else{
            System.out.println("Aguardar os demais candidatos ");
        }
    
    }
           

}
