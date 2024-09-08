import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class processoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Adriana", "Júlia", "Isabel", "Tamara", "Talita"};
                
        for(String candidato : candidatos){
            entrarEmContato(candidato);
                
        }
      
    }
    //Método para entrar em contato com o candidato.
    static void entrarEmContato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas ++;
            else
                   System.out.println("Contato realizado com sucesso");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("Sucesso no contato com: " + candidato + " na " + tentativasRealizadas + " tentativa");

        else
        System.out.println("Sem sucesso no contato com: " + candidato + " nas " + tentativasRealizadas + " tentativas");
    }

    //Método auxiliar para chamar os candidatos
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){

        String [] candidatos = {"Adriana", "Júlia", "Isabel", "Tamara", "Talita"};
                System.out.println("Lista de candidatos por indice no Array: ");
                //Forma extensa com o "For" tradicional
                for (int indice = 0; indice < candidatos.length; indice ++){
                    System.out.println("O candidato de nº " + (indice + 1)  + " é: " + candidatos[indice]);
                }

                //Forma abreviada usando o "For each"
                for(String candidato : candidatos){
                    System.out.println("O candidato selecionado foi: " + candidato);
                }

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
            if(salarioBase >= salarioPretendido)
                System.out.println("O candidato: " + candidato + " foi seiecionado");
                candidatosSelecionados ++;
            
            candidatoAtual ++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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
