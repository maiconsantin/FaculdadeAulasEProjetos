package grafoLista;

import java.util.LinkedList;

public class Pessoa {

    private Integer id;
    private String nome;
    private String email;
    private String nascnimento;
    private LinkedList<Seguindo> seguindo;
    private boolean ativo;

    public Pessoa() {
        this.seguindo = new LinkedList<>();
    }

    public Pessoa(String nome, String email, String nascnimento) {
        this.nome = nome;
        this.email = email;
        this.nascnimento = nascnimento;
        this.ativo = true;
        this.seguindo = new LinkedList<Seguindo>();
    }

    public void adicionarSeguindo(Pessoa destino) {
        this.seguindo.add(new Seguindo(destino));
    }

    public void removerSeguindo(Pessoa pessoa) {
        this.seguindo.removeIf(
                seguindo -> seguindo.getDestino().equals(pessoa)
        );
    }

    public LinkedList<Seguindo> getSeguindo() {
        return seguindo;
    }

    public Integer getId() {
        return id;
    }

    public void comparaEmail(String email) {

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
