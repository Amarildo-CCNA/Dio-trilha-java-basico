public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(22);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Sintonizando no canal " + smartTv.canal);
        System.out.println("Nível de volume = " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Nova Condição, ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Nova Condição, ligada? " + smartTv.ligada);
    }
}
