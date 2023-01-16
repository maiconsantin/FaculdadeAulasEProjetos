package outros;

import grafo.matriz.GrafoMatriz;
import grafo.matriz.GrafoMatriz;

public class MostrarGrafoMatriz1 {

    public static void main(String[] args) {
        Object[] vertices = {"A", "B", "C", "D"};
        GrafoMatriz grafo = new GrafoMatriz(vertices, false, false);
        grafo.setMatriz(new Object[][]{
            {false, true, false, false},
            {false, false, true, false},
            {false, false, false, true},
            {true, false, false, false}
        });
        grafo.imprimirMatriz();
        System.out.println("\n");
        grafo.imprimirArestas();
    }
}
