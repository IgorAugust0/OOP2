public class Tenista extends Atleta {
    private String tipoTorneio;
    private String tempoMedio;
    private String ranking;

    public Tenista(String nome, int idade, String sexo, double peso, double altura, String tipoTorneio,
            String tempoMedio, String ranking) {
        super(nome, idade, sexo, peso, altura);
        this.tipoTorneio = tipoTorneio;
        this.tempoMedio = tempoMedio;
        this.ranking = ranking;
    }

    public String getTipoTorneio() {
        return tipoTorneio;
    }

    public void setTipoTorneio(String tipoTorneio) {
        this.tipoTorneio = tipoTorneio;
    }

    public String getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void aquecer(int minutos) {
        System.out.println("Aquecendo por " + minutos + " minutos");
    }

    public void treinar() {
        System.out.println("Treinando");
    }

    public void jogar() {
        System.out.println("Jogando tênis");
    }

    public void imprime(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Tipo de torneio: " + getTipoTorneio() + " Tempo médio: "
                + getTempoMedio()
                + " Ranking: " + getRanking());
    }
    
    public String print() {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Tipo de torneio: " + getTipoTorneio() + " Tempo médio: "
                + getTempoMedio()
                + " Ranking: " + getRanking();
    }
    
}
