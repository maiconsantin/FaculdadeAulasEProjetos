/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acervo.bean;

/**
 *
 * @author maico
 */
public class Livro {

    private int livro_id;
    private String livro_nome;
    private String livro_descricao;
    private String livro_edicao;
    private int livro_quantidade;
    private Autor autor;
    private Editora editora;

    public Livro() {
    }

    public Livro(int livro_id, String livro_nome, String livro_descricao, String livro_edicao, int livro_quantidade, Autor autor, Editora editora) {
        this.livro_id = livro_id;
        this.livro_nome = livro_nome;
        this.livro_descricao = livro_descricao;
        this.livro_edicao = livro_edicao;
        this.livro_quantidade = livro_quantidade;
        this.autor = autor;
        this.editora = editora;
    }
    
    public int getLivro_id() {
        return livro_id;
    }

    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public String getLivro_nome() {
        return livro_nome;
    }

    public void setLivro_nome(String livro_nome) {
        this.livro_nome = livro_nome;
    }

    public String getLivro_descricao() {
        return livro_descricao;
    }

    public void setLivro_descricao(String livro_descricao) {
        this.livro_descricao = livro_descricao;
    }

    public String getLivro_edicao() {
        return livro_edicao;
    }

    public void setLivro_edicao(String livro_edicao) {
        this.livro_edicao = livro_edicao;
    }

    public int getLivro_quantidade() {
        return livro_quantidade;
    }

    public void setLivro_quantidade(int livro_quantidade) {
        this.livro_quantidade = livro_quantidade;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
