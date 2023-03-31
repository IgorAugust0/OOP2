public class Futebolista extends Atleta {
    private String posicao;
    private int numCamisa;
    private String time;

    public Futebolista(String nome, int idade, String sexo, double peso, double altura, String posicao,
            int numCamisa, String time) {
        super(nome, idade, sexo, peso, altura);
        this.posicao = posicao;
        this.numCamisa = numCamisa;
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numCamisa;
    }

    public void setNumeroCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void aquecer(int minutos) {
        System.out.println("Aquecendo por " + minutos + " minutos");
    }

    public void treinar() {
        System.out.println("Treinando");
    }

    public void jogar() {
        System.out.println("Jogando futebol");
    }

    public void imprime(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Posição: " + getPosicao() + " Número da camisa: "
                + getNumeroCamisa() + " Time: " + getTime());
    }

    public String print() {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Posição: " + getPosicao() + " Número da camisa: " + getNumeroCamisa()
                + " Time: " + getTime();
    }
}
