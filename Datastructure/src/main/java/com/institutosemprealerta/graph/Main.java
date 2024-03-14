package com.institutosemprealerta.graph;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addVertices("Matheus");
        graph.addVertices("Natalia");
        graph.addVertices("Shirley");
        graph.addVertices("Tú");
        graph.addVertices("Grazi");


        graph.addEdge(2.0, "Matheus", "Natalia");
        graph.addEdge(3.0, "Natalia", "Tú");
        graph.addEdge(1.0, "Tú", "Shirley");
        graph.addEdge(1.0, "Matheus", "Shirley");
        graph.addEdge(2.0, "Grazi", "Natalia");
        graph.addEdge(3.0, "Grazi", "Matheus");

        graph.widthSearch();
    }
}
