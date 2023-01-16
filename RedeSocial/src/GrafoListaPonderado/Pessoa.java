package GrafoListaPonderado;

import java.util.LinkedList;

public class Pessoa {

    private String nome;
    private LinkedList<Amizade> arestas;

    public Pessoa(String nome) {
        this.nome = nome;
        this.arestas = new LinkedList<>();
    }

    public void adicionarAmizade(Pessoa destino, Integer peso) {
        this.arestas.add(new Amizade(this, destino, peso));
    }

    public void removerAmizade(Pessoa destino) {
        this.arestas.removeIf(
                aresta -> arestas.getLast().equals(destino)
        );
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Amizade> getAmizades() {
        return arestas;
    }

}
