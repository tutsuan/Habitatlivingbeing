package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.ArrayList;
import java.util.Random;

public class Rosmaninho extends Plantas {

    public Rosmaninho() {
        super("rosmaninho", 40, 2);
    }

    @Override
    public void reproduzir(ArrayList<SerVivo> seresVivos) {
        Random random = new Random();
        int numFilhos = 0;
        for (SerVivo serVivo : seresVivos)
            if (serVivo instanceof Rosmaninho) //modificavel de acorco com a classe do servivo
                if ((random.nextDouble()) * 100 <= getProbReproducao())
                    numFilhos += getTaxaReproducao(); // criar novos filho
        if (numFilhos > 0) {
            System.out.println("Foram gerados mais " + numFilhos + " exemplares de " + getNome());
            for (int i = 0; i < numFilhos; i++)// Agora criar e adicionar os novos seres vivos gerados à lista
                seresVivos.add(new Rosmaninho());
        } else
            System.out.println("Não foram gerados mais " + getNome());
    }


}





