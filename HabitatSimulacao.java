package HabitatV3;
//Matheus Nascimento 23484
//Camila Mayara Lenke Vieira 21872
import java.util.*;

/**
 * Cria o habitat com os diversos seres vivos e aplica suas funcoes de se alimentar e reproduzir
 */
public class HabitatSimulacao {

    public static ArrayList<SerVivo> seresVivos = new ArrayList<>();
    static int LIMITE_SERES_VIVOS=200;
    int numPassos=-1;
    int numeroDeExemplares=0;
    static Salvia salvia= new Salvia();
    static Rosmaninho rosmaninho=new Rosmaninho();
    static Pigmeus pigmeus=new Pigmeus();
    static Europeus europeus=new Europeus();
    static Vermelhas vermelhas=new Vermelhas();
    static Velozes velozes=new Velozes();
    int contadorParagem=0;
    public String opcaoValoresPredefinidos="";
    Scanner scanner=new Scanner(System.in);


    public void preAdicionarSeres(){
        for (int i = 0; i < 4; i++) {
            seresVivos.add(new Pigmeus());
            seresVivos.add(new Europeus());
        }
        for (int i = 0; i < 10; i++) {
            seresVivos.add(new Rosmaninho());
            seresVivos.add(new Salvia());
        }
        for (int i = 0; i < 2; i++) {
            seresVivos.add(new Velozes());
            seresVivos.add(new Vermelhas());
        }
    }

    public void alimentar() {
        SerVivo[] seres = { pigmeus, europeus, velozes, vermelhas };
        for (SerVivo serVivo : seres) {
            if (serVivo.alimentar(seresVivos)) {//caso retorne true para extincao para a alimentacao
                contadorParagem++;
                break;
            }
        }
    }



    /**
     * Metodo para reproduzir todos os animais em um ciclo apartir da probabilidade aleatoria
     */
    public boolean reproduzir(){
        if(seresVivos.size()<LIMITE_SERES_VIVOS && contadorParagem==0) {
            salvia.reproduzir(seresVivos);
            rosmaninho.reproduzir(seresVivos);
            pigmeus.reproduzir(seresVivos);
            europeus.reproduzir(seresVivos);
            vermelhas.reproduzir(seresVivos);
            velozes.reproduzir(seresVivos);
        }else if(seresVivos.size()>=LIMITE_SERES_VIVOS) {
            System.out.println("***Habitat lotado***");
            return true;
        }
        return false;
    }

    /**
     * define os valores dos parametros do Habitat de acordo com o utilizador, com verificacao incluida
     * @param scanner receber valores
     */

    private void definirValoresHabitats(Scanner scanner) {
        // Criar uma cópia da lista seresVivos para evitar a modificação durante o loop
        ArrayList<SerVivo> copiaSeresVivos = new ArrayList<>(seresVivos);

        for (SerVivo serVivo : copiaSeresVivos) {
            System.out.println("Espécie: " + serVivo.getNome());
            numeroDeExemplares = (InputValidation2.validateInt(scanner, "Digite o número inicial de exemplares:"));

            for (int i = 0; i < numeroDeExemplares; i++) {
                seresVivos.add(serVivo);
            }
            serVivo.setProbReproducao(InputValidation2.validationDouble(scanner, "Digite a probabilidade de reprodução (%):"));
            serVivo.setTaxaReproducao(InputValidation2.validateInt(scanner, "Digite a taxa de reprodução:"));
            System.out.println();
        }
    }



    /**
     percorre a lista de seres vivos presentes no habitat e exibe o estado atual de cada animal.
     Para cada ser vivo na lista, o método imprime o nome da espécie através do método "getNome()" e a quantidade
     correspondente.
     A quantidade de cada espécie é determinada pelo tamanho da lista de seres vivos, que representa
     a quantidade de animais daquela espécie presentes no habitat.
     Além disso, o método também exibe a probabilidade de reprodução e a taxa de reprodução de cada ser vivo.
     Map para contar a quantidade de cada espécie de animal
     */
    void exibirEstado() {
        System.out.println("\nValores atuais do habitat:\n");
        Map<String, Integer> contagemAnimais = new HashMap<>();
        for (SerVivo serVivo : seresVivos) {
            String especie = serVivo.getNome();
            contagemAnimais.put(especie, contagemAnimais.getOrDefault(especie, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : contagemAnimais.entrySet()) {
            String especie = entry.getKey();
            int quantidade = entry.getValue();
            System.out.println("Espécie: " + especie + " | Quantidade: " + quantidade);
        }
    }



    /**
     * verifica se os animais foram extintos e caso sim a simulacao acaba imediatamente por desequilibrio no habitat
     * verifica atravez do retorno true quer dizer que a alimentacao falhou por falta de alimento.
     */



    public int solicitarPassos(Scanner scanner){
        return InputValidation2.validateInt(scanner,
                "Digite o número de passos da proxima simulação (0 para sair): ");
    }

    /**
     * alimenta, reproduz e checa o habitat
     * @param numPassos numero de passos
     */

    private void executarPassosSimulacao(int numPassos) {
        for (int i = 1; i <= numPassos; i++) {
            System.out.println("\n----- Passo " + i + " -----");
            alimentar();
            //verificarExtincaoEspecies();
            reproduzir();
            //verificarExtincaoEspecies();
            verificarLimiteSeresVivos();
            if(contadorParagem>0)
                break;
        }
    }

    private void verificarLimiteSeresVivos() {
        if(seresVivos.size()>LIMITE_SERES_VIVOS)
            contadorParagem++;
    }

    /**
     * gere a funcao de usar os parametros predefinidos ou se o utilizador deseja modificar e executa os passos ate sair
     */

    public void executarSimulacao() {
        opcaoValoresPredefinidos = InputValidation2.validationLine(scanner,
                "Deseja utilizar os valores predefinidos? (S/N): ");
        if (opcaoValoresPredefinidos.equalsIgnoreCase("N"))
            definirValoresHabitats(scanner);
        else if(opcaoValoresPredefinidos.equalsIgnoreCase("S"))
            preAdicionarSeres();
        while((numPassos!=0)) {
            numPassos = solicitarPassos(scanner);
            System.out.println("\n---------- SIMULAÇÃO DO HABITAT ----------\n");
            exibirEstado();
            executarPassosSimulacao(numPassos);
            if(contadorParagem>0) {
                System.out.println("Condicoes para a paragem da simulacao atingidas... Obrigado");
                break;
            }
        }
        System.out.println("\n---------- FIM DA SIMULAÇÃO ----------");
        exibirEstado();
    }

}
