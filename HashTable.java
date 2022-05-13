package com.company;

public class HashTable {
    private HashNode [] buckets;
    private int numOfBuckets;  // capacity
    private int size ;         // number of key value pairs in hashtable or number of hashnodes

    public HashTable(){
        this(10); //default capacity
    }
    public HashTable(int capacity){
        this.numOfBuckets = capacity;
        buckets =  new HashNode[numOfBuckets];
        this.size = 0;
    }
    private class HashNode{
        private Integer key;   // can be any generic type
        private String value;  // can be any generic type
        private HashNode next; // reference to next HashNode

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public  boolean isEmpty(){
        return size == 0;
    }

    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("key or value is null");
        }
        int bucketIndex = getBucketIndex(key);
         HashNode head = buckets[bucketIndex];
         while(head!=null){
             if(head.key.equals(key)){
                 head.value = value;
                 return;
             }
             head = head.next;
         }
         size++;
         head  = buckets[bucketIndex];
         HashNode node = new HashNode(key,value);  // (key,value) --> null
         node.next = head; //  inserting node at first
        buckets[bucketIndex] = node;
    }
    //we are using modulor has function
    private int getBucketIndex(Integer key){
        return  key % numOfBuckets; //buckets,length
    }

    public String get(Integer key){
        if(key == null){
            throw new IllegalArgumentException("key is null");
        }
        int bucketIndex =  getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head!= null){
            if(head.key.equals(key)){
                return head.value; // if key is present its corresponding value will be returned otherwise null will be returned
            }
            head = head.next; // if key will not be matched then will move head to its next
        }
        return null;
    }

    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("key is null");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex]; //{21, "tom"} --> (31,"raja") -->(41,"sana") --> null
        HashNode previous = null;

        while (head!=null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){
            return null;
        }
        size--;
        if(previous != null){
            previous.next = head.next;
        }else{
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }


    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(105,"tom");
        ht.put(21,"raja");
        ht.put(31,"sana");
        System.out.println(ht.size); //{105, "tom"} --> (21,"raja") -->(31,"sana") --> null

//        System.out.println(ht.get(21));
        System.out.println(ht.remove(21));
        System.out.println(ht.remove(31));
        System.out.println(ht.remove(105));
        System.out.println(ht.size());
        }
}
