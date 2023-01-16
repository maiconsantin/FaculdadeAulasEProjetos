package GrafoListaPonderado;

import GrafoListaPonderado.Amizade;
import GrafoListaPonderado.Pessoa;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoListaSocial {

    private ArrayList<Pessoa> vertices;
    private boolean direcionado;

    public GrafoListaSocial() {
        this.direcionado = true;
        this.vertices = new ArrayList<>();

    }

    public void adicionarPessoa(Pessoa vertice) {
        this.vertices.add(vertice);
    }

    public void adicionarAmizade(Pessoa origem, Pessoa destino) {

        Integer peso = null;

        origem.adicionarAmizade(destino, peso);
        if (!this.direcionado) {
            destino.adicionarAmizade(origem, peso);
        }

    }


    public void removerPessoa(Pessoa vertice) {

        this.vertices.remove(vertice);

    }

    public ArrayList<Pessoa> getPessoas() {
        return vertices;
    }

    public Pessoa getPessoaPorNome(String nome) {

        for (Pessoa v : this.vertices) {
            if (v.getNome() == nome) {
                return v;
            }
        }

        return null;

    }

    public void buscarLarcura(Pessoa inicio) {

        ArrayList<Pessoa> verticesVisitados = new ArrayList<>();

        verticesVisitados.add(inicio);

        Queue<Pessoa> visitadosFila = new LinkedList<>();
        visitadosFila.add(inicio);
        while (!visitadosFila.isEmpty()) {
            Object atual = visitadosFila.remove();
            System.out.println(((Pessoa) atual).getNome());

            for (Amizade a : (((Pessoa) atual).getAmizades())) {
                Pessoa visinho = a.getDestino();

                if (!verticesVisitados.contains(visinho)) {
                    verticesVisitados.add(visinho);
                    visitadosFila.add(visinho);
                }
            }
        }
    }
    
    public void imprimirAmizades() {
        for (Pessoa v : vertices) {
            System.out.println("A pessoa " + v.getNome() + " tem essas amizades ");
            if (v.getAmizades().size() > 0) {
                for (Amizade a : v.getAmizades()) {
                    System.out.print("\t" + a.getDestino().getNome());
                }
            } else {
                System.out.print("Nao tem nem um amigo");
            }
            System.out.println();

        }
    }

}
