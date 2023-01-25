
import grafoLista.GrafoListaSocial;
import grafoLista.Pessoa;

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

        graf.seguirPessoa(a);
        graf.seguirPessoa(b);
        graf.seguirPessoa(c);
        graf.seguirPessoa(d);
        graf.seguirPessoa(e);
        graf.seguirPessoa(f);
        graf.seguirPessoa(g);
        graf.seguirPessoa(h);
        graf.seguirPessoa(i);
        graf.seguirPessoa(j);
        graf.seguirPessoa(k);
        graf.seguirPessoa(l);
        graf.seguirPessoa(m);
        graf.seguirPessoa(n);

        graf.adicionarSeguindo(a, b);
        graf.adicionarSeguindo(a, c);
        graf.adicionarSeguindo(b, d);
        graf.adicionarSeguindo(b, f);
        graf.adicionarSeguindo(c, b);
        graf.adicionarSeguindo(c, d);
        graf.adicionarSeguindo(c, e);
        graf.adicionarSeguindo(d, e);
        graf.adicionarSeguindo(d, g);
        graf.adicionarSeguindo(e, h);
        graf.adicionarSeguindo(f, i);
        graf.adicionarSeguindo(g, h);
        graf.adicionarSeguindo(h, k);
        graf.adicionarSeguindo(h, m);
        graf.adicionarSeguindo(i, j);
        graf.adicionarSeguindo(j, g);
        graf.adicionarSeguindo(j, l);
        graf.adicionarSeguindo(k, l);
        graf.adicionarSeguindo(l, n);
        graf.adicionarSeguindo(m, n);

        
        graf.imprimirSeguindo();

        graf.buscarLarcura(a);
    }
}
