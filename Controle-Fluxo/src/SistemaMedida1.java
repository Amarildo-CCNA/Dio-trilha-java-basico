public class SistemaMedida1 {
    public static void main(String[] args) {
        
        String sigla = "E";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
             case "M":{
                System.out.println("Médio");
                break;

             }
             case "G":{
                System.out.println("Grande");
                break;
             }
             default:
                System.out.println("Indefinido");


        }
       
    }
    
}
