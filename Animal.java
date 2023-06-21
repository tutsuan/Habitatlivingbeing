package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
abstract class Animal implements SerVivo {
    private final String nome;
    private double probReproducao;
    private int taxaReproducao;
    public Animal(String nome, double probReproducao, int taxaReproducao) {
        this.nome = nome;
        this.probReproducao = probReproducao;
        this.taxaReproducao = taxaReproducao;
    }
    public String getNome() {
        return nome;
    }

    public double getProbReproducao() {
        return probReproducao;
    }

    public void setProbReproducao(double probReproducao) {
        this.probReproducao = probReproducao;
    }

    public int getTaxaReproducao() {
        return taxaReproducao;
    }

    public void setTaxaReproducao(int taxaReproducao) {
        this.taxaReproducao = taxaReproducao;
    }

    public String toString() {return "|" + getNome()+ " (" + getProbReproducao() + "%," + getTaxaReproducao()+")|";}
}