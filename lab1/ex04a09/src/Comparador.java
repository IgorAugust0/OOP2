import java.util.ArrayList;

// Optei por ir pelo caminho de criar um algoritmo de ordenação baseado no selection sort, ao invés de utilizar o método sort() da classe Collections.
// Classe Comparador que será utilizada para ordenar os atletas em ordem alfabética.
public class Comparador {

    // Método ordena que recebe um array de objetos da classe Atleta.
    // Algoritmo de ordenação Selection Sort.
    public void ordena(Comparavel[] a) {
        Comparavel elem, menor;
        int pos;
        for (int i = 0; i < a.length - 1; i++) {
            elem = a[i]; // elemento atual
            menor = a[i + 1]; // menor elemento
            pos = i + 1; // posição do menor elemento
            for (int j = i + 2; j < a.length; j++) {
                if (a[j].ehMenorQue(menor)) { // encontrando o menor elemento
                    menor = a[j]; // atualizando o menor elemento
                    pos = j; // atualizando a posição do menor elemento
                }
            }
            if (menor.ehMenorQue(elem)) { // troca
                a[i] = a[pos]; // atualizando o elemento atual
                a[pos] = elem; // atualizando o menor elemento
            }
        }
    }

    // Sobrecarregando o método ordena para receber um ArrayList.
    public void ordena(ArrayList<Atleta> a) {
        Atleta elem, menor;
        int pos;

        // Utilizando o método get e set para acessar e modificar os elementos ao invés
        // de um array com operador [] (a[i]).
        for (int i = 0; i < a.size() - 1; i++) {
            elem = a.get(i);
            menor = a.get(i + 1);
            pos = i + 1;
            for (int j = i + 2; j < a.size(); j++) {
                if (a.get(j).ehMenorQue(menor)) { // encontrando o menor elemento
                    menor = a.get(j);
                    pos = j;
                }
            }
            if (menor.ehMenorQue(elem)) { // troca
                a.set(i, a.get(pos));
                a.set(pos, elem);
            }
        }
    }

}
