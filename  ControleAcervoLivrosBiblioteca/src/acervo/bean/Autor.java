/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acervo.bean;

/**
 *
 * @author maico
 */
public class Autor {

    private int autor_id;
    private String autor_nome;

    public Autor() {
    }

    public Autor(String autor_nome) {
        this.autor_nome = autor_nome;
    }

    public Autor(int autor_id, String autor_nome) {
        this.autor_id = autor_id;
        this.autor_nome = autor_nome;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getAutor_nome() {
        return autor_nome;
    }

    public void setAutor_nome(String autor_nome) {
        this.autor_nome = autor_nome;
    }

    @Override
    public String toString() {
        return "\nAutor{"
                + "\n\t" + "autor_id   = " + autor_id + ","
                + "\n\t" + "autor_nome = " + autor_nome
                + "\n}";
    }

}
