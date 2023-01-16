package outros;

import grafo.matriz.GrafoMatriz;
import grafo.matriz.GrafoMatriz;

public class MostrarGrafoMatriz4 {

    public static void main(String[] args) {
        Object[] vertices = {"V1", "V2", "V3", "V4", "V5"};
        GrafoMatriz grafo = new GrafoMatriz(vertices, false, true);
        grafo.setMatriz(new Object[][]{
            {false, "1", "1", "1", "1"},
            {"1", false, "1", "1", "1"},
            {"1", "1", false, "1", "1"},
            {"1", "1", "1", false, "1"},
            {"1", "1", "1", "1", false}
        });
        grafo.imprimirMatriz();
        System.out.println("\n");
        grafo.imprimirArestas();
    }
}
