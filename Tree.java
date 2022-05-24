package com.company;

public class Tree <E extends Comparable<E>> {
    private Node<E> root;
    //konstruktor
    public Tree(){
        root=null;
    }
    //Insertion & root check
    public void insertNode(E insertValue){
        if (root==null){
            root=new Node<E>(insertValue);
            System.out.println(insertValue +" is a root.");
        }else{
            root.insert(insertValue);
        }
    }
    //BTS Searching
    public void searchBTS(E key){
        boolean result = searchBTSHelper(root, key);

        if (result){
            System.out.println(key+ " found.");
        }else{
            System.out.println(key+ " not found.");
        }
    }

    public boolean searchBTSHelper(Node<E> node, E key){
        boolean result=false;

        if(node!=null){
            if(key.equals(node.getData())){
                result=true;
            }else if(key.compareTo(node.getData())<0){
                result=searchBTSHelper(node.getLeft(), key);
            }else{
                result=searchBTSHelper(node.getRight(), key);
            }
        }
        return result;
    }
}
