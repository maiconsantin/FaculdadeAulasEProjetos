package outros;

import grafo.matriz.GrafoMatriz;
import grafo.matriz.GrafoMatriz;

public class MostrarGrafoMatriz2 {

    public static void main(String[] args) {
        Object[] vertices = {"A", "B", "C", "D"};
        GrafoMatriz grafo = new GrafoMatriz(vertices, true, false);
        grafo.setMatriz(new Object[][]{
            {false, true, true, true},
            {false, false, false, true},
            {false, false, false, true},
            {false, false, true, false}
        });
        grafo.imprimirMatriz();
        System.out.println("\n");
        grafo.imprimirArestas();
    }
}
