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

        Vertice a = new Vertice("A");
        Vertice b = new Vertice("B");
        Vertice c = new Vertice("C");
        Vertice d = new Vertice("D");
        Vertice e = new Vertice("E");
        Vertice f = new Vertice("F");
        Vertice g = new Vertice("G");
        Vertice h = new Vertice("H");
        Vertice i = new Vertice("I");
        Vertice j = new Vertice("J");
        Vertice k = new Vertice("K");
        Vertice l = new Vertice("L");
        Vertice m = new Vertice("M");
        Vertice n = new Vertice("N");

        graf.adicionarVertice(a);
        graf.adicionarVertice(b);
        graf.adicionarVertice(c);
        graf.adicionarVertice(d);
        graf.adicionarVertice(e);
        graf.adicionarVertice(f);
        graf.adicionarVertice(g);
        graf.adicionarVertice(h);
        graf.adicionarVertice(i);
        graf.adicionarVertice(j);
        graf.adicionarVertice(k);
        graf.adicionarVertice(l);
        graf.adicionarVertice(m);
        graf.adicionarVertice(n);

        graf.adicionarAresta(a, b, 17);
        graf.adicionarAresta(a, c, 10);
        graf.adicionarAresta(b, d, 1);
        graf.adicionarAresta(b, f, 1);
        graf.adicionarAresta(c, b, 5);
        graf.adicionarAresta(c, d, 9);
        graf.adicionarAresta(c, e, 11);
        graf.adicionarAresta(d, e, 6);
        graf.adicionarAresta(d, g, 1);
        graf.adicionarAresta(e, h, 1);
        graf.adicionarAresta(f, i, 1);
        graf.adicionarAresta(g, h, 1);
        graf.adicionarAresta(h, k, 1);
        graf.adicionarAresta(h, m, 1);
        graf.adicionarAresta(i, j, 1);
        graf.adicionarAresta(j, g, 1);
        graf.adicionarAresta(j, l, 1);
        graf.adicionarAresta(k, l, 1);
        graf.adicionarAresta(l, n, 1);
        graf.adicionarAresta(m, n, 1);

        
        graf.imprimirArestas();

        graf.buscarLarcura(a);
    }
}
