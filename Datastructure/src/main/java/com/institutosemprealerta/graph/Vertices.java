package com.institutosemprealerta.graph;

import java.util.ArrayList;

public class Vertices<T> {
    private T value;
    private ArrayList<Edge<T>> entryEdges;
    private ArrayList<Edge<T>> exitEdges;

    public Vertices(T value) {
        this.value = value;
        this.entryEdges = new ArrayList<>();
        this.exitEdges = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addEntryEdge(Edge<T> edge) {
        this.entryEdges.add(edge);
    }

    public void addExitEdge(Edge<T> edge) {
        this.exitEdges.add(edge);
    }

    public ArrayList<Edge<T>> getEntryEdges() {
        return entryEdges;
    }

    public void setEntryEdges(ArrayList<Edge<T>> entryEdges) {
        this.entryEdges = entryEdges;
    }

    public ArrayList<Edge<T>> getExitEdges() {
        return exitEdges;
    }

    public void setExitEdges(ArrayList<Edge<T>> exitEdges) {
        this.exitEdges = exitEdges;
    }
}