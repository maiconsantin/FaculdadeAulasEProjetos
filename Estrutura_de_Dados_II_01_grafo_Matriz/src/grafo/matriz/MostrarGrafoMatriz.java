package grafo.matriz;

public class MostrarGrafoMatriz {

    public static void main(String[] args) {
        Object[] vertices = {"Brasil ", "Argentina", "Peru   ", "Guyana ", "French Guiana", "Uruguay", "Bolivia", "Ecuador", "Venezuela", "Suriname", "Paraguay", "Chile  ", "Colombia"};
        GrafoMatriz grafo = new GrafoMatriz(vertices, false, false);
        grafo.setMatriz(new Object[][]{
            {false, true, true, true, true, true, true, false, true, true, true, false, true},
            {true, false, false, false, false, true, true, false, false, false, true, true, false},
            {true, false, false, false, false, false, true, true, false, false, false, true, true},
            {true, false, false, false, false, false, false, false, true, true, false, false, false},
            {true, false, false, false, false, false, false, false, false, true, false, false, false},
            {true, true, false, false, false, false, false, false, false, false, false, false, false},
            {true, true, true, false, false, false, false, false, false, false, true, true, false},
            {false, false, true, false, false, false, false, false, false, false, false, false, true},
            {true, false, false, true, false, false, false, false, false, false, false, false, true},
            {true, false, false, true, true, false, false, false, false, false, false, false, false},
            {true, true, false, false, false, false, true, false, false, false, false, false, false},
            {false, true, true, false, false, false, true, false, false, false, false, false, false},
            {true, false, true, false, false, false, false, true, true, false, false, false, false}
        });
        grafo.imprimirMatriz();
        System.out.println("\n");
        grafo.imprimirArestas();
    }
}
