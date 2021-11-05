package com.essadeq.datastructure.stack;

import com.essadeq.datastructure.linked.Node;

public class StackLinkedList {
    private Node head;

    public StackLinkedList() {
    }

    public StackLinkedList(Node element) {
        this.head = element;
    }

    public void push(Node element) {
        element.setNext(head);
        head = element;
    }

    public void pop() {
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
