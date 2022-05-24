package com.company;

public class Main {
    public static void main(String[]args){
        Tree<String> tree = new Tree<>();

        tree.insertNode("F");
        tree.insertNode("E");
        tree.insertNode("H");
        tree.insertNode("D");
        tree.insertNode("G");
        tree.insertNode("C");
        tree.insertNode("B");
        tree.insertNode("H");
        tree.insertNode("K");
        tree.insertNode("J");

        tree.searchBTS("K");
        tree.searchBTS("A");
    }
}
