package com.company;

import java.util.Locale;

public class Trie {

    public TrieNode root; // instance

    public Trie(){
        root = new TrieNode(); // root is empty
    }
    public class TrieNode{
        public TrieNode[] children;
        public boolean isWord;

        public TrieNode()   {
            this.children = new TrieNode[26]; // storing engish words -> a to z
            this.isWord = false;
        }
    }

    public void insert(String word){
        if(word == null || word.isEmpty()){
            throw new IllegalArgumentException("invalid input");
        }
       word = word.toLowerCase(Locale.ROOT);
        TrieNode current = root;
        for(int i = 0;i < word.length(); i++){
            char c = word.charAt(i);
            int index = c-'a';
            if(current.children[index] == null){ // if it's null means this char is not inserted into trie
            TrieNode node = new TrieNode();      // inorder to insert this node we'll create a new trienode
             current.children[index] = node;
             current  = node;
            } else{
                current = current.children[index];
            }
        }
        current.isWord = true;
    }

    public boolean search(String word){
        return false;
    }

    public static void main(String[] args) {
    Trie t = new Trie();
    t.insert("cat");
    t.insert("cab");
    t.insert("sun");
    t.insert("so");
        System.out.println("values inserted successfully");
    }
}
