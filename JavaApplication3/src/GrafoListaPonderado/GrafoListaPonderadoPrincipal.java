/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrafoListaPonderado;

/**
 *
 * @author maico
 */
public class GrafoListaPonderadoPrincipal {

    public static void main(String[] args) {

        GrafoListaPonderado graf = new GrafoListaPonderado(true, false);

        Pessoa a = new Pessoa("A");
        Pessoa b = new Pessoa("B");
        Pessoa c = new Pessoa("C");
        Pessoa d = new Pessoa("D");
        Pessoa e = new Pessoa("E");
        Pessoa f = new Pessoa("F");
        Pessoa g = new Pessoa("G");
        Pessoa h = new Pessoa("H");
        Pessoa i = new Pessoa("I");
        Pessoa j = new Pessoa("J");
        Pessoa k = new Pessoa("K");
        Pessoa l = new Pessoa("L");
        Pessoa m = new Pessoa("M");
        Pessoa n = new Pessoa("N");

        graf.adicionarPessoa(a);
        graf.adicionarPessoa(b);
        graf.adicionarPessoa(c);
        graf.adicionarPessoa(d);
        graf.adicionarPessoa(e);
        graf.adicionarPessoa(f);
        graf.adicionarPessoa(g);
        graf.adicionarPessoa(h);
        graf.adicionarPessoa(i);
        graf.adicionarPessoa(j);
        graf.adicionarPessoa(k);
        graf.adicionarPessoa(l);
        graf.adicionarPessoa(m);
        graf.adicionarPessoa(n);

        graf.adicionarAmizade(a, b, 17);
        graf.adicionarAmizade(a, c, 10);
        graf.adicionarAmizade(b, d, 1);
        graf.adicionarAmizade(b, f, 1);
        graf.adicionarAmizade(c, b, 5);
        graf.adicionarAmizade(c, d, 9);
        graf.adicionarAmizade(c, e, 11);
        graf.adicionarAmizade(d, e, 6);
        graf.adicionarAmizade(d, g, 1);
        graf.adicionarAmizade(e, h, 1);
        graf.adicionarAmizade(f, i, 1);
        graf.adicionarAmizade(g, h, 1);
        graf.adicionarAmizade(h, k, 1);
        graf.adicionarAmizade(h, m, 1);
        graf.adicionarAmizade(i, j, 1);
        graf.adicionarAmizade(j, g, 1);
        graf.adicionarAmizade(j, l, 1);
        graf.adicionarAmizade(k, l, 1);
        graf.adicionarAmizade(l, n, 1);
        graf.adicionarAmizade(m, n, 1);

        
        graf.imprimirAmizades();

        graf.buscarLarcura(a);
    }
}
