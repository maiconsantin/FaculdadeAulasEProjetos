
import GrafoListaPonderado.GrafoListaSocial;
import GrafoListaPonderado.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author maico
 */
public class GrafoListaPonderadoPrincipal {

    public static void main(String[] args) {

        GrafoListaSocial graf = new GrafoListaSocial();

        Pessoa a = new Pessoa();
        Pessoa b = new Pessoa();
        Pessoa c = new Pessoa();
        Pessoa d = new Pessoa();
        Pessoa e = new Pessoa();
        Pessoa f = new Pessoa();
        Pessoa g = new Pessoa();
        Pessoa h = new Pessoa();
        Pessoa i = new Pessoa();
        Pessoa j = new Pessoa();
        Pessoa k = new Pessoa();
        Pessoa l = new Pessoa();
        Pessoa m = new Pessoa();
        Pessoa n = new Pessoa();

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

        graf.adicionarAmizade(a, b);
        graf.adicionarAmizade(a, c);
        graf.adicionarAmizade(b, d);
        graf.adicionarAmizade(b, f);
        graf.adicionarAmizade(c, b);
        graf.adicionarAmizade(c, d);
        graf.adicionarAmizade(c, e);
        graf.adicionarAmizade(d, e);
        graf.adicionarAmizade(d, g);
        graf.adicionarAmizade(e, h);
        graf.adicionarAmizade(f, i);
        graf.adicionarAmizade(g, h);
        graf.adicionarAmizade(h, k);
        graf.adicionarAmizade(h, m);
        graf.adicionarAmizade(i, j);
        graf.adicionarAmizade(j, g);
        graf.adicionarAmizade(j, l);
        graf.adicionarAmizade(k, l);
        graf.adicionarAmizade(l, n);
        graf.adicionarAmizade(m, n);

        
        graf.imprimirAmizades();

        graf.buscarLarcura(a);
    }
}
