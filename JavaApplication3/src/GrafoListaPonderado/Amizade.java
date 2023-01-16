package GrafoListaPonderado;




import GrafoListaPonderado.Pessoa;

public class Amizade {

    private Pessoa origem;
    private Pessoa destino;
    private Integer peso;

    public Amizade(Pessoa origem, Pessoa destino, Integer peso){
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    public Pessoa getOrigem() {
        return origem;
    }
    
    public Pessoa getDestino() {
        return destino;
    }
    
    public Integer getPeso() {
        return peso;
    }
}

    

