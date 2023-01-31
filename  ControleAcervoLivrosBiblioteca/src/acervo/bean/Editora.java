/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acervo.bean;

/**
 *
 * @author maico
 */
public class Editora {

    private int editora_id;
    private String editora_nome;
    private String editora_endereco;
    private String editora_cnpj;

    public Editora() {
    }

    public Editora(int editora_id, String editora_nome, String editora_endereco, String editora_cnpj) {
        this.editora_id = editora_id;
        this.editora_nome = editora_nome;
        this.editora_endereco = editora_endereco;
        this.editora_cnpj = editora_cnpj;
    }

    public int getEditora_id() {
        return editora_id;
    }

    public void setEditora_id(int editora_id) {
        this.editora_id = editora_id;
    }

    public String getEditora_nome() {
        return editora_nome;
    }

    public void setEditora_nome(String editora_nome) {
        this.editora_nome = editora_nome;
    }

    public String getEditora_endereco() {
        return editora_endereco;
    }

    public void setEditora_endereco(String editora_endereco) {
        this.editora_endereco = editora_endereco;
    }

    public String getEditora_cnpj() {
        return editora_cnpj;
    }

    public void setEditora_cnpj(String editora_cnpj) {
        this.editora_cnpj = editora_cnpj;
    }

}
