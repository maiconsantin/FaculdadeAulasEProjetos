package grafoLista;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoListaSocial {

    private ArrayList<Pessoa> pessoas;
    private static int ids;

    public GrafoListaSocial() {
        this.pessoas = new ArrayList<>();
        ids = 0;
    }

    public int novoID() {
        return this.ids += 1;
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoa.setId(novoID());
        this.pessoas.add(pessoa);
    }

    public void adicionarAmizade(Pessoa origem, Pessoa destino) {


        origem.adicionarAmizade(destino);

    }
    
    public void atualizaPessoa(Pessoa pessoa){
        pessoas.set(pessoas.indexOf(pessoa)-1, pessoa);
    }

    public void removerPessoa(Pessoa pessoa) {

        this.pessoas.remove(pessoa);

    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoaPorId(String id) {

        for (Pessoa v : this.pessoas) {
            if (v.getId().equals(id)) {
                return v;
            }
        }

        return null;

    }

    public Pessoa getPessoaPorNome(String nome) {

        for (Pessoa v : this.pessoas) {
            if (v.getNome().equals(nome)) {
                return v;
            }
        }

        return null;

    }

    public Pessoa getPessoaPorEmail(String email) {
        for (Pessoa v : this.pessoas) {
            if (v.getEmail().equals(email)) {
                return v;
            }
        }

        return null;

    }

    public void buscarLarcura(Pessoa inicio) {

        ArrayList<Pessoa> pessoasVisitados = new ArrayList<>();

        pessoasVisitados.add(inicio);

        Queue<Pessoa> visitadosFila = new LinkedList<>();
        visitadosFila.add(inicio);
        while (!visitadosFila.isEmpty()) {
            Object atual = visitadosFila.remove();
            System.out.println(((Pessoa) atual).getNome());

            for (Amizade a : (((Pessoa) atual).getAmizades())) {
                Pessoa visinho = a.getDestino();

                if (!pessoasVisitados.contains(visinho)) {
                    pessoasVisitados.add(visinho);
                    visitadosFila.add(visinho);
                }
            }
        }
    }

    public void imprimirAmizades() {
        for (Pessoa v : pessoas) {
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
