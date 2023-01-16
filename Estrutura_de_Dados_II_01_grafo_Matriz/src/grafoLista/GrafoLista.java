package grafoLista;

import java.util.HashMap;
import java.util.LinkedList;

public class GrafoLista {

    private boolean direcionado;
    private HashMap<No, LinkedList<No>> mapaAdjacencia;

    public GrafoLista(boolean direcionado) {
        this.direcionado = direcionado;
        mapaAdjacencia = new HashMap<>();
    }

    public void adicionaAresta(No origem, No destino) {
        if (!mapaAdjacencia.keySet().contains(origem)) {
            mapaAdjacencia.put(origem, null);
        }
        if (!mapaAdjacencia.keySet().contains(destino)) {
            mapaAdjacencia.put(destino, null);
        }
        adcionarArestaHelper(origem, destino);
        if (!direcionado) {
            adcionarArestaHelper(destino, origem);
        }
    }

    private void adcionarArestaHelper(No origem, No destino) {
        LinkedList<No> temp = mapaAdjacencia.get(origem);
        if (temp != null) {
            temp.remove(destino);
        } else {
            temp = new LinkedList<>();
        }
        temp.add(destino);
        mapaAdjacencia.put(origem, temp);
    }

    public void imprimirArestas() {
        for (No no : mapaAdjacencia.keySet()) {
            System.out.print("O " + no.getNome() + " tem as ligações: ");
            if (mapaAdjacencia.get(no) != null) {
                for (No destino : mapaAdjacencia.get(no)) {
                    System.out.print("\t" + destino.getNome());
                }
                System.out.println();
            } else {
                System.out.println("nenhum!");
            }
        }
    }

    public boolean temAresta(No origem, No destino) {
        return mapaAdjacencia.containsKey(origem)
                && mapaAdjacencia.get(origem) != null
                && mapaAdjacencia.get(origem).contains(destino);
    }
}
