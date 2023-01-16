package GrafoListaPonderado;

import GrafoListaPonderado.Aresta;
import GrafoListaPonderado.Vertice;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoListaPonderado {

    private ArrayList<Vertice> vertices;
    private boolean ponderado;
    private boolean direcionado;

    public GrafoListaPonderado(boolean ponderado, boolean direcionado) {
        this.ponderado = ponderado;
        this.direcionado = direcionado;
        this.vertices = new ArrayList<>();

    }

    public void adicionarVertice(Vertice vertice) {
        this.vertices.add(vertice);
    }

    public void adicionarAresta(Vertice origem, Vertice destino) {

        Integer peso = null;

        origem.adicionarAresta(destino, peso);
        if (!this.direcionado) {
            destino.adicionarAresta(origem, peso);
        }

    }

    public void adicionarAresta(Vertice origem, Vertice destino, Integer peso) {

        origem.adicionarAresta(destino, peso);

        if (!this.direcionado) {
            destino.adicionarAresta(origem, peso);
        }
    }

    public void removerVertice(Vertice vertice) {

        this.vertices.remove(vertice);

    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public Vertice getVerticePorNome(String nome) {

        for (Vertice v : this.vertices) {
            if (v.getNome() == nome) {
                return v;
            }
        }

        return null;

    }

    public void buscarLarcura(Vertice inicio) {

        ArrayList<Vertice> verticesVisitados = new ArrayList<>();

        verticesVisitados.add(inicio);

        Queue<Vertice> visitadosFila = new LinkedList<>();
        visitadosFila.add(inicio);
        while (!visitadosFila.isEmpty()) {
            Object atual = visitadosFila.remove();
            System.out.println(((Vertice) atual).getNome());

            for (Aresta a : (((Vertice) atual).getArestas())) {
                Vertice visinho = a.getDestino();

                if (!verticesVisitados.contains(visinho)) {
                    verticesVisitados.add(visinho);
                    visitadosFila.add(visinho);
                }
            }
        }
    }
    
    public void imprimirArestas() {
        for (Vertice v : vertices) {
            System.out.println("O vertice " + v.getNome() + " tem as conexoes: ");
            if (v.getArestas().size() > 0) {
                for (Aresta a : v.getArestas()) {
                    System.out.print("\t" + a.getDestino().getNome());
                    if (ponderado) {
                        System.out.print("(" + a.getPeso() + ")");
                    }
                }
            } else {
                System.out.print("Nenhuma conexao");
            }
            System.out.println();

        }
    }

}
