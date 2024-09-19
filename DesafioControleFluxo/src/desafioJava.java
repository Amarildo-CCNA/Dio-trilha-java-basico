import java.util.Scanner;

public class desafioJava{
    public static void main(String[] args) {
            Scanner leitorDeEntradas = new Scanner(System.in);
            float valorSalario = 2900; //leitorDeEntradas.nextFloat();
            float valorBeneficios = 250; //leitorDeEntradas.nextFloat();
            
            float valorImposto = 0;
            if(valorSalario >= 0 && valorSalario <= 1100){
                //Atribui a alíquota de 5% sobre o salário.
                valorImposto = (0.05F * valorSalario);
            }else if(valorSalario >= 1100.01 && valorSalario <= 2500){
                //Atribui a alíquota de 10% sobre o salário.
                valorImposto = (0.1F * valorSalario);   
            }else{
                //Atribui a alíquota de 15% sobre o salário.
                valorImposto = (0.15F * valorSalario);
            }
                
            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("%.2f", saida));
        
    }
}
