package grafoLista;

import java.util.LinkedList;

public class Pessoa {

    private Integer id;
    private String nome;
    private String email;
    private String nascnimento;
    private LinkedList<Amizade> amigos;
    private boolean ativo;

    public Pessoa() {
        this.amigos = new LinkedList<>();
    }

    public Pessoa(String nome, String email, String nascnimento) {
        this.nome = nome;
        this.email = email;
        this.nascnimento = nascnimento;
        this.ativo = true;
        this.amigos = new LinkedList<Amizade>();
    }

    public void adicionarAmizade(Pessoa destino) {
        this.amigos.add(new Amizade( destino));
    }

    public void removerAmizade(Pessoa destino) {
        this.amigos.removeIf(
                aresta -> amigos.getLast().equals(destino)
        );
    }

    public LinkedList<Amizade> getAmizades() {
        return amigos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNascnimento() {
        return nascnimento;
    }

    public void setNascnimento(String nascnimento) {
        this.nascnimento = nascnimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
