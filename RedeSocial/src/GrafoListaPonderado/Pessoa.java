package GrafoListaPonderado;

import java.util.LinkedList;

public class Pessoa {

    private String nome;
    private LinkedList<Amizade> amigos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.amigos = new LinkedList<>();
    }

    public void adicionarAmizade(Pessoa destino, Integer peso) {
        this.amigos.add(new Amizade(this, destino, peso));
    }

    public void removerAmizade(Pessoa destino) {
        this.amigos.removeIf(
                aresta -> amigos.getLast().equals(destino)
        );
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Amizade> getAmizades() {
        return amigos;
    }

}
