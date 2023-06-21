package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.ArrayList;

class Raposas extends Animal{
     public Raposas(String nome, double probReproducao, int taxaReproducao) {
         super(nome, probReproducao, taxaReproducao);
     }

    @Override
    public void reproduzir(ArrayList<SerVivo> serVivos) {

    }

    @Override
    public boolean alimentar(ArrayList<SerVivo> serVivos) {

        return false;
    }
}
