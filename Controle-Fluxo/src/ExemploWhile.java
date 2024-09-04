import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {


    public static void main(String[] args) {
        
        double salario = 50.00;

        while (salario > 0){
            double valorCompra = valorAleatorio();

            if (valorCompra > salario)
                valorCompra = salario;

                System.out.println("Valor da Compra " + valorCompra 
                + " Adicionado ao Carrinho" );
                salario = salario - valorCompra;
        
        }

        System.out.println("Salário: " + salario);
        System.out.println("Foi gasto todo o salário na compra");
        
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
