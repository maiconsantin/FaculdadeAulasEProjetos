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

    public void seguirPessoa(Pessoa pessoa) {
        pessoa.setId(novoID());
        this.pessoas.add(pessoa);
    }

    public void adicionarSeguindo(Pessoa origem, Pessoa destino) {
        origem.adicionarSeguindo(destino);
    }

    public void atualizaPessoa(Pessoa pessoa, Pessoa atualPessoa) {
        pessoas.set(pessoas.indexOf(pessoa), atualPessoa);
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

    public boolean getTemPessoaPorEmail(String e) {
        for (Pessoa p : this.pessoas) {
            if (p.getEmail().equals(e)) {
                return true;
            }
        }
        return false;
    }




}
