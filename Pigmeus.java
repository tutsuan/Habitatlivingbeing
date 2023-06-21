package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.ArrayList;
import java.util.Random;

public class Pigmeus extends Coelhos {

    public Pigmeus() {
        super("coelho pigmeu", 50, 5);
    }
    public boolean alimentar(ArrayList<SerVivo> seresVivos) {
        int animaisFamintos = 0, alimento = 0;
        ArrayList<SerVivo> AlimentoParaRemover = new ArrayList<>();
        for (SerVivo cadeiaAlimentar : seresVivos) {
            if (cadeiaAlimentar instanceof Pigmeus)//alimentavel
                animaisFamintos++;
            if (cadeiaAlimentar instanceof Salvia)//alimento
                alimento++;
        }
        if (alimento > animaisFamintos) {
            for (SerVivo serVivo : seresVivos) {
                if (serVivo instanceof Salvia) {//alimento
                    AlimentoParaRemover.add(serVivo);
                    if (AlimentoParaRemover.size() >= animaisFamintos) {
                        break; // Interrompe o loop após coletar a quantidade suficiente de salvia
                    }
                }
            }
            for (SerVivo serVivo : AlimentoParaRemover) {
                seresVivos.remove(serVivo);
                System.out.println("Um " + getNome() + " comeu uma erva salvia");//mudavel
            }        } else if (alimento == animaisFamintos) {//extincao
            System.out.println(getNome() + " foram instintos por ter a mesma quantidade de alimentos e especimes");
            seresVivos.removeIf(serVivo -> serVivo instanceof Pigmeus);
            return true;
        }
        else {//exticao
            System.out.println(getNome() + " morreu de fome por não ter mais seu alimento, FORAM EXTINTOS");
            seresVivos.removeIf(serVivo -> serVivo instanceof Pigmeus);
            return true;
        }
        return false;
    }




    public void reproduzir(ArrayList<SerVivo> seresVivos) {
        Random random = new Random();
        int numFilhos = 0;
        for (SerVivo serVivo : seresVivos)
            if (serVivo instanceof Pigmeus) //modificavel de acorco com a classe do servivo
                if ((random.nextDouble()) * 100 <= getProbReproducao())
                    numFilhos += getTaxaReproducao(); // criar novos filho
        if (numFilhos > 0) {
            System.out.println("Foram gerados mais " + numFilhos + " exemplares de " + getNome());
            for (int i = 0; i < numFilhos; i++)// Agora criar e adicionar os novos seres vivos gerados à lista
                seresVivos.add(new Pigmeus());
        } else
            System.out.println(getNome() + " não foram gerados novos ");
    }
}