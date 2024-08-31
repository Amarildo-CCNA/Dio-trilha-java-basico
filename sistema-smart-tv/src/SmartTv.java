public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal(int canalDigitado){
        //volume = volume + 1;
        canal = canalDigitado;
    }

    public void subirCanal(){
        //volume = volume + 1;
        canal ++;
    }

    public void descerCanal(){
        //volume = volume + 1;
        canal --;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume ++;
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume --;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
