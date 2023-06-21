package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.ArrayList;

public interface SerVivo {
    String getNome();
    double getProbReproducao();
    int getTaxaReproducao();
    void setProbReproducao(double probReproducao);
    void setTaxaReproducao(int taxaReproducao);
    void reproduzir(ArrayList<SerVivo> serVivos);

    /**
     *
     *Nesse metodo primeiramente contamos o numero de alimento e alimentavel e em seguida, usando um Array auxiliar, removemos os alimentados.
     * caso o alimentavel seja extinto por fome retorna true para extincao
     */
     boolean alimentar(ArrayList<SerVivo> serVivos);


}

