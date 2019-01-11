package com.company;
import net.datastructures.DoublyLinkedList;
import net.datastructures.SinglyLinkedList;

/**
 * Created by bma on 10/29/17.
 */

public class mySingleList <E> implements Cloneable {

    private static class Node<E> {
        private E item;
        private Node<E> next;

        public Node(E value, Node n) {
            item = value;
            next = n;
        }

        public E getItem() {
            return item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }


        }


    //----------END of nested Node Class----------//
    private Node<E> start = null;
    private Node<E> end = null;
    private int size = 0;
    public mySingleList(){

    }
    public int size() {return size;}
    public boolean isEmpty () {
        return size == 0;
    }
    public E firstItem(){
        if(isEmpty()) {
            return null;
        }
        return start.getItem();
    }
    public E lastItem() {
        if(isEmpty()) {
            return null;
        }
        return end.getItem();
    }
    public void addFirst (E e) {
        start = new Node<E>(e, start);
        if (size == 0) {
            end = start;
            size ++;
        }}

        public void addLast(E e) {
        Node <E> newest = new Node<E> (e, null);
        if (isEmpty()) start = newest;
        end = newest;
    }
// removes and returns first element
    public E removeFirst() {
        if (isEmpty()) return null;
    E removed = start.getItem();
        start = start.getNext();
        size --;
        if (size == 0 ) {
            end = null;
        }
        return removed;
    }


public static void main(String[] args){



}

}






