package com.institutosemprealerta.graph;

import java.util.ArrayList;

public class Graph<T> {
    private ArrayList<Vertices<T>> vertices;
    private ArrayList<Edge<T>> edges;

    public Graph() {
        this.vertices = new ArrayList<Vertices<T>>();
        this.edges = new ArrayList<Edge<T>>();
    }

    public void addVertices(T value) {
        Vertices<T> newVertice = new Vertices<>(value);
        this.vertices.add(newVertice);
    }

    public void addEdge(Double weight, T startValue, T endValue) {
        Vertices<T> start = this.getVertice(startValue);
        Vertices<T> end = this.getVertice(endValue);
        Edge<T> edge = new Edge<>(weight, start, end);

        start.addExitEdge(edge);
        end.addEntryEdge(edge);

        this.edges.add(edge);
    }

    public Vertices<T> getVertice(T value) {
        Vertices<T> verticeFound = null;
        for (Vertices<T> current : vertices) {
            if (current.getValue().equals(value)) {
                verticeFound = current;
                break;
            }
        }
        return verticeFound;
    }

    public void widthSearch() {
        ArrayList<Vertices<T>> marked = new ArrayList<>();
        ArrayList<Vertices<T>> queue = new ArrayList<>();

        Vertices<T> current = this.vertices.getFirst();
        marked.add(current);
        System.out.println(current.getValue());
        queue.add(current);

        while (!queue.isEmpty()) {
            Vertices<T> visited = queue.getFirst();
            for (int i = 0; i < visited.getExitEdges().size(); i++) {
                Vertices<T> next = visited.getExitEdges().get(i).getEnd();
                if (!marked.contains(next)) { // if the vertice wasn't marked
                    marked.add(next);
                    System.out.println(next.getValue());
                    queue.add(next);
                }
            }
            queue.removeFirst();
        }

    }

    public void deepSearch() {

    }

}
