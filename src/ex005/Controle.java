package ex005;

public class Controle {

    private Televisao tv;

    public Controle() {
    }

    public Controle(Televisao tv) {
        this.tv = tv;
    }

    public void ligar(){
        if(!tv.isLigada()){
            tv.setLigada(true);
        } else {
            System.out.println("A televisão já está ligada!");
        }
    }

    public void desligar(){
        if(tv.isLigada()){
            tv.setLigada(false);
        } else {
            System.out.println("A televisão já está desligada!");
        }
    }

    public void aumentarVolume(){
        if (tv.isLigada() && tv.getVolume() < 100) {
            tv.setVolume(tv.getVolume() + 1);
        } else {
            System.out.println("O volume está no máximo ou a tv está desligada");
        }
    }

    public void diminuirVolume(){
        if (tv.isLigada() && tv.getVolume() > 0) {
            tv.setVolume(tv.getVolume() - 1);
        } else {
            System.out.println("O volume está no minimo ou a tv está desligada");
        }
    }

    public void aumentarCanal(){
        if(tv.isLigada()) {
            this.tv.setCanal(this.tv.getCanal() + 1);
        }
    }

    public void diminuirCanal(){
        if (tv.isLigada() && tv.getCanal() != 1) {
            tv.setCanal(tv.getCanal() - 1);
        }
    }

    public void escolherCanal(int canal){
        if (tv.isLigada() && tv.getCanal() != canal && canal != 0){
            tv.setCanal(canal);
        }
    }

    public void consultarVolumeCanal(){
        if (tv.isLigada()) {
            System.out.println(
                    "Volume: " + tv.getVolume() + "\n" +
                            "Canal: " + tv.getCanal()
            );
        } else {
            System.out.println("A tv está desligada");
        }
    }

}
