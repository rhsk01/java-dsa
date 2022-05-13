package com.company;

import java.awt.*;

public class MaxPQ {
    Integer[]heap;
    int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }

    public void insert(int x){
        if(n == heap.length-1){ // if n== heap.length-1 it means integer array is filled completely and there is no space to insert the new element
            resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }
    private void swim(int k){
        while(k >1 && heap[k/2] < heap[k]){ // in this while loop we'll simply compare newly inserted value to its parents
             int temp  = heap[k];
             heap[k]   = heap[k/2];
             heap[k/2] = temp;
                    k  = k/2; // traversing to its parents by assigning k/2 to k b coz we need to continue shifting up
                              // till new value inserted is at correct position
        }
    }
    public void resize(int capacity){ // after resizing we will copy the elements of the heap to newly created integer array
        Integer[] temp = new Integer[ capacity];
        for(int i =0;i<= heap.length; i++){
            temp[i] = heap[i];  // now here heap elements are copied in to newly created integer array
        }
        heap = temp; // reassigned temp to heap now heap will point to an array which is of length twice of its current length now heap have more space
    }

    public  void printMaxHeap(){
        for(int i=1;i<=n;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public static void main(String[] args) {

//        System.out.println(pq.size());
//        System.out.print(pq.isEmpty());
        MaxPQ pq = new MaxPQ(6);
        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        System.out.println(pq.size());
        pq.printMaxHeap();

    }
}
