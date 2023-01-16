package GrafoListaPonderado;

import java.util.LinkedList;

public class Vertice {

    private String nome;
    private LinkedList<Aresta> arestas;

    public Vertice(String nome) {
        this.nome = nome;
        this.arestas = new LinkedList<>();
    }

    public void adicionarAresta(Vertice destino, Integer peso) {
        this.arestas.add(new Aresta(this, destino, peso));
    }

    public void removerAresta(Vertice destino) {
        this.arestas.removeIf(
                aresta -> arestas.getLast().equals(destino)
        );
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Aresta> getArestas() {
        return arestas;
    }

}
