package grafo.matriz;

public class GrafoMatriz {

    private Object[] vertices;
    private boolean direcionado;
    private boolean ponderado;
    private Object[][] matriz;
    private boolean[][] isSetMatriz;

    public GrafoMatriz() {
    }

    public GrafoMatriz(Object[] vertices, boolean direcionado, boolean ponderado) {
        this.vertices = vertices;
        this.direcionado = direcionado;
        this.ponderado = ponderado;
        this.matriz = new Object[vertices.length][vertices.length];
        this.isSetMatriz = new boolean[vertices.length][vertices.length];
    }

    public void adicionarAresta(int origem, int destino) {
        int aresta = 1;
        if (ponderado) {
            aresta = 0;
        }
        matriz[origem][destino] = aresta;
        isSetMatriz[origem][destino] = true;
        if (!direcionado) {
            matriz[destino][origem] = aresta;
            isSetMatriz[destino][origem] = true;
        }
    }

    public void adicionarAresta(int origem, int destino, Object peso) {
        Object aresta = peso;
        if (!ponderado) {
            aresta = 1;
        }
        matriz[origem][destino] = aresta;
        isSetMatriz[origem][destino] = true;
        if (!direcionado) {
            matriz[destino][origem] = aresta;
            isSetMatriz[destino][origem] = true;
        }
    }

    public void imprimirMatriz() {
        System.out.print("\t\t");
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + "\t");
        }
        System.out.print("\n\t-----------------------------------\n");
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + "|\t\t");
            for (int j = 0; j < vertices.length; j++) {
                if (isSetMatriz[i][j]) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("#" + "\t");
                }
            }
            System.out.println();
        }
    }

    public void imprimirArestas() {
        for (int i = 0; i < vertices.length; i++) {
            System.out.print("|" + vertices[i] + "|\t");
            for (int j = 0; j < vertices.length; j++) {
                if (isSetMatriz[i][j]) {
                    System.out.print("->\t" + vertices[j]);
                }
            }
            System.out.println();
        }
    }

    public boolean temAresta(int origem, int destino) {
        return isSetMatriz[origem][destino];
    }

    public Object getValorAresta(int origem, int destino) {
        if (!ponderado || !isSetMatriz[origem][destino]) {
            return null;
        }
        return matriz[origem][destino];
    }

    public void setMatriz(Object[][] matriz) {
        this.matriz = matriz;
        if (!ponderado) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (!((boolean) matriz[i][j] == false)) {
                        isSetMatriz[i][j] = true;
                    }
                }
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if ((matriz[i][j].getClass() == Integer.class) || (matriz[i][j].getClass() == String.class)) {
                        isSetMatriz[i][j] = true;
                    }
                }
            }
        }
    }

}
