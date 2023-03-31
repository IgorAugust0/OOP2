/*
4) Crie uma classe abstrata chamada Atleta. Inclua atributos privados (nome,
idade, peso, altura, etc), e getters e setters públicos. Inclua também um construtor
que possa criar a classe com estes atributos setados. A classe tem um método
"aquecer" que recebe o número de minutos de aquecimento e imprime na tela
informações de aquecimento. A classe também possui um método abstrato
"jogar".

5) Implemente o método 'toString' da classe.
*/

public abstract class Atleta implements Comparavel {
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;

    public Atleta(String nome, int idade, String sexo, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Método da interface Comparavel que compara o nome dos atletas em ordem alfabética
    public boolean ehMenorQue(Comparavel obj) {
        Atleta a = (Atleta) obj; // casting explícito
        return (this.nome.compareTo(a.nome) < 0); // compareTo() compara strings
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void aquecer(int minutos) {
        System.out.println("Aquecendo por " + minutos + " minutos");
    }

    // Método abstrato que deve ser implementado nas classes filhas
    public abstract void jogar();

    public void imprime() {
        System.out.println(this.print());
    }

    public String toString() {
        return this.print();
    }
    
    public String print() {
        return "Nome: ," + getNome() + " Idade: , " + getIdade() + " Sexo: , " + getSexo() + " Peso: , " + getPeso()
                + " Altura: , " + getAltura();
    }

}