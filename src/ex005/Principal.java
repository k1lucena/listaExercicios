package ex005;

public class Principal {

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        Controle controle = new Controle(tv);

        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();

        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();

        controle.escolherCanal(10);

        controle.consultarVolumeCanal();
    }




}
