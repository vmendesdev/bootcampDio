public class SmartTv {

    public static final boolean desligar = false;
	boolean ligada = true;
    int canal = 1;
    static int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal ++;
    }

    public void diminuirCanal() {
        canal --;
    }

    public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: ");
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Dimuindo o volume para: " + SmartTv.volume);
    }

    public void ligar() {
        ligada=true;
    }
    public void desligar(){
        desligar=false;
    }
}