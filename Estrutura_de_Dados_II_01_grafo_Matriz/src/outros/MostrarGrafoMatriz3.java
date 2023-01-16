package outros;

import grafo.matriz.GrafoMatriz;
import grafo.matriz.GrafoMatriz;

public class MostrarGrafoMatriz3 {

    public static void main(String[] args) {
        Object[] vertices = {"A", "B", "C", "D", "E", "F"};
        GrafoMatriz grafo = new GrafoMatriz(vertices, false, true);
        grafo.setMatriz(new Object[][]{
            {false, 7, false, 7, 1, 3},
            {7, false, 6, 4, false, 8},
            {false, 6, false, 5, 6, false},
            {7, 4, 5, false, false, false},
            {1, false, 6, false, false, 2},
            {3, 8, false, false, 2, false}
        });
        grafo.imprimirMatriz();
        System.out.println("\n");
        grafo.imprimirArestas();
    }
}
