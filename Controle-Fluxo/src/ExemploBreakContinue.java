public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 7; numero ++){

        if (numero == 5)
                break;

                System.out.println(numero);
        }

        for(int numero = 1; numero <= 7; numero ++){

            if (numero == 5)
                    continue;
    
                    System.out.println(numero);
            }

    }
    
}
