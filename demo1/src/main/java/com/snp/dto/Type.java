package com.snp.dto;

public class Type {
    private int id;
    private String name;
    private String explain;
    private String graph;

    public Type() {
    }

    public Type(int id, String name, String explain, String graph) {
        this.id = id;
        this.name = name;
        this.explain = explain;
        this.graph = graph;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getGraph() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", explain='" + explain + '\'' +
                ", graph='" + graph + '\'' +
                '}';
    }
}
