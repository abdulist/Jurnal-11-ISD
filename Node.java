package com.company;

public class Node<E extends Comparable<E>> {
    private E data;
    private Node<E>left;
    private Node<E>right;

    public Node(E element){
        data=element;
        left = right = null;
    }

    public E getData(){
        return data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    //untuk insert data & membandingkan data
    public void insert(E value){
        if(value.compareTo(data)<0){
            if(left==null){
                left=new Node<E>(value);
                System.out.println(value + " successfully inserted to the left of " + data);
            }else{
                left.insert(value);
            }
        }else if(value.compareTo(data)>0){
            if(right==null){
                right=new Node<E>(value);
                System.out.println(value + " successfully inserted to the right of " + data);
            }else{
                right.insert(value);
            }
        }
    }
}
