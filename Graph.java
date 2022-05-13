package com.company;

public class Graph {
    public int V; // no of vertices in graph
    public int E; // no of edges in graph
    public int[][] adjMatrix; // 2d array

    public Graph(int nodes){
        this.V= nodes;
        this.E= 0;
        this.adjMatrix  = new int [nodes][nodes];
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // bcoz its an undirected graph
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V +" vertices, "+E+" edges "+"\n");
        for(int v = 0; v < V ; v++) { // this for loop will iterate our each and evvery vertex
            sb.append(v + ": ");
            for (int w : adjMatrix[v]) { //this loop will iterate our adj matrix for particular vertex
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
            Graph g = new Graph(4);
            g.addEdge(0, 1);
            g.addEdge(1, 2);
            g.addEdge(2, 3);
            g.addEdge(3, 0);
        System.out.println(g);

    }
}
