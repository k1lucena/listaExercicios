package ex005;

public class Televisao {

    private int volume;
    private int canal;
    private boolean ligada;

    public Televisao() {
        this.volume = 10;
        this.canal = 7;
        this.ligada = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
