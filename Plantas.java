package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.ArrayList;

abstract class Plantas implements SerVivo {
     private final String nome;
     private double probReproducao;
     private int taxaReproducao;
     public Plantas(String nome,double probReproducao, int taxaReproducao) {
         this.nome = nome;
         this.probReproducao = probReproducao;
         this.taxaReproducao = taxaReproducao;
     }
     public String getNome() {return nome;}
     public double getProbReproducao() {
         return probReproducao;
     }
     public void setProbReproducao(double probReproducao) {
         this.probReproducao = probReproducao;
     }
     public int getTaxaReproducao() {return taxaReproducao; }
     public void setTaxaReproducao(int taxaReproducao) {
         this.taxaReproducao = taxaReproducao;
     }
    @Override
    public boolean alimentar(ArrayList<SerVivo> serVivos) {

        return false;
    }
     public String toString(){
         return "|Planta: "+getNome();
     }
 }
