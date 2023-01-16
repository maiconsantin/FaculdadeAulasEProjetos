package grafoLista;

public class GrafoPrincipal {

    public static void main(String[] args) {
        GrafoLista grafoNaoDirecionado = new GrafoLista(false);
        GrafoLista grafoDirecionado = new GrafoLista(true);

        No a = new No(6, "A");
        No b = new No(6, "B");
        No c = new No(6, "C");
        No d = new No(6, "D");
        No e = new No(6, "E");

        grafoNaoDirecionado.adicionaAresta(a, b);
        grafoNaoDirecionado.adicionaAresta(a, c);
        grafoNaoDirecionado.adicionaAresta(a, d);
        grafoNaoDirecionado.adicionaAresta(a, e);
        grafoNaoDirecionado.adicionaAresta(b, c);
        grafoNaoDirecionado.adicionaAresta(b, d);
        grafoNaoDirecionado.adicionaAresta(b, e);
        grafoNaoDirecionado.adicionaAresta(c, d);
        grafoNaoDirecionado.adicionaAresta(c, e);
        grafoNaoDirecionado.adicionaAresta(d, e);

        grafoNaoDirecionado.imprimirArestas();
        System.out.println("\n");

        grafoDirecionado.adicionaAresta(a, b);
        grafoDirecionado.adicionaAresta(a, c);
        grafoDirecionado.adicionaAresta(a, d);
        grafoDirecionado.adicionaAresta(a, e);
        grafoDirecionado.adicionaAresta(b, c);
        grafoDirecionado.adicionaAresta(b, d);
        grafoDirecionado.adicionaAresta(b, e);
        grafoDirecionado.adicionaAresta(c, d);
        grafoDirecionado.adicionaAresta(c, e);
        grafoDirecionado.adicionaAresta(d, e);

        grafoDirecionado.imprimirArestas();
        System.out.println("\n");
    }

}
