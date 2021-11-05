package com.essadeq.datastructure.linked;

public class LinkedList {
    private Node head;

    public LinkedList() {
    }

    public LinkedList(Node element) {
        this.head = element;
    }

    public void add(Node element) {
        element.setNext(head);
        head = element;
    }

    public void delete() {
        head = head.getNext();
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(" > " + n.getValue());
            n = n.getNext();
        }
    }
}
