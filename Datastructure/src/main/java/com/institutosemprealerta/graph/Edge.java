package com.institutosemprealerta.graph;

public class Edge<T> {
    private Double weight;
    private Vertices<T> start;
    private Vertices<T> end;

    public Edge(Double weight, Vertices<T> start, Vertices<T> end) {
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertices<T> getStart() {
        return start;
    }

    public void setStart(Vertices<T> start) {
        this.start = start;
    }

    public Vertices<T> getEnd() {
        return end;
    }

    public void setEnd(Vertices<T> end) {
        this.end = end;
    }


}
