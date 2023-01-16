package GrafoListaPonderado;

import java.util.LinkedList;

public class Pessoa {

    private String nome;
    private String email;
    
    private LinkedList<Amizade> amigos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.amigos = new LinkedList<>();
    }

    public void adicionarAmizade(Pessoa destino, Integer peso) {
        this.amigos.add(new Amizade(this, destino));
    }

    public void removerAmizade(Pessoa destino) {
        this.amigos.removeIf(
                aresta -> amigos.getLast().equals(destino)
        );
    }

    public LinkedList<Amizade> getAmizades() {
        return amigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
