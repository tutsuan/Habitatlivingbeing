package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import static HabitatV3.HabitatSimulacao.*;

public class Main {
    public static void main(String[] args) {
        //criar hambiente de simulacao
        HabitatSimulacao habitatSimulacao= new HabitatSimulacao();
        //adicionar seres ao habitat
        seresVivos.add(salvia);
        seresVivos.add(rosmaninho);
        seresVivos.add(pigmeus);
        seresVivos.add(europeus);
        seresVivos.add(vermelhas);
        seresVivos.add(velozes);
        //executar os passos da simulacao
        habitatSimulacao.executarSimulacao();

    }
}
