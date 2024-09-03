public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 35.00;
        double valorSolicitado = 35.00;

        if (valorSolicitado <= saldo){
            
            saldo = saldo - valorSolicitado;
            
            System.out.println("Retire seu dinheiro: " + valorSolicitado);
            System.out.println("O seu saldo atualizado é: " + saldo);

        }else

            System.out.println("Seu saldo é insuficiente: " + saldo);

        
    }
}
