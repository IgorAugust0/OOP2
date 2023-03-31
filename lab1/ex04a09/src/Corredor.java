public class Corredor extends Atleta {
    private String tipoCorrida;
    private String tempoMedio;

    public Corredor(String nome, int idade, String sexo, double peso, double altura, String tipoCorrida,
            String tempoMedio) {
        super(nome, idade, sexo, peso, altura);
        this.tipoCorrida = tipoCorrida;
        this.tempoMedio = tempoMedio;
    }

    public String getTipoCorrida() {
        return tipoCorrida;
    }

    public void setTipoCorrida(String tipoCorrida) {
        this.tipoCorrida = tipoCorrida;
    }

    public String getTempoMedio() {
        return tempoMedio;
    }

    public void setTempoMedio(String tempoMedio) {
        this.tempoMedio = tempoMedio;
    }

    public void aquecer(int minutos) {
        System.out.println("Aquecendo por " + minutos + " minutos");
    }

    public void treinar() {
        System.out.println("Treinando");
    }

    public void jogar() {
        System.out.println("Correndo");
    }

    public void imprime(){
        System.out.println("Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Tipo de corrida: " + getTipoCorrida() + " Tempo médio: "
                + getTempoMedio());
    }

    public String print() {
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo() + " Peso: " + getPeso()
                + " Altura: " + getAltura() + " Tipo de corrida: " + getTipoCorrida() + " Tempo médio: "
                + getTempoMedio();
    }
}
