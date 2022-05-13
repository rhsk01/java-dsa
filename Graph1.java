package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Graph1 {
    public LinkedList<Integer>[]adj;
    public int V; //number of vertices
    public int E; //number of edges

    public Graph1(int nodes){
        this.V = nodes;
        this.E = 0 ;
        this.adj = new LinkedList[nodes];
        for(int v = 0; v < V; v++){ //by the help of this for loop we'll iterate our each and every vertex and we'll create a separate ll for  each an every
                                    //index of array
            adj[v] = new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }
    public String  toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices, "+E+" edges "+"\n");
        for(int v = 0; v < V;v++){
            sb.append(v+": ");
            for(int w : adj[v]) {// inorder to itrate our ll assosiated with particular vertex
                sb.append(w +" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    //breadth first search algorithm

    public void bfs(int s){
        boolean [] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");


            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    //depth first search algorithm
    public void dfs(int  s ){ // s is source node
        boolean[] visited = new boolean[V];
        Stack<Integer> stack  = new Stack();
        stack.push(s);

        while(!stack.isEmpty()){
           int u =  stack.pop();
           if(!visited[u]){
               visited[u] = true;
               System.out.print(u+" ");

               for(int v : adj[u]){
                   if(!visited[v]){
                       stack.push(v);
                   }
               }
           }
        }
    }
    //recursive approach to dfs algorithm
    public void DFS(){
        boolean [] visited = new boolean[V];
        for(int v = 0;v < V;v++){
            if(!visited[v]){
                DFS(v,visited);
            }
        }
    }
    public  void DFS(int v,boolean[]visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                DFS(w, visited);
            }
        }
    }
    public static void main(String[] args) {
        Graph1 g=  new Graph1(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
//        System.out.println(g);

//        g.bfs(0);
        g.dfs(0);



    }
}
