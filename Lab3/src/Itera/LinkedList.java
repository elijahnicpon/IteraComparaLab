package Itera;

import java.util.Iterator;

// TODO 2.1: Augment the class constructor to implement Iterable.
public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    /**
     * The method to add to the data structure. Don't stress about this now. You'll have a lot more time to worry about it in CS 1332.
     * @param data the data to be added
     */
    public void add(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (head == null) {
            tail = head = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // TODO 2.2: Implement the iterator() to satisfy the Iterable interface. It should only return a LinkedListIterator, to be completed in a later step.
    @Override
    public Iterator<T> iterator() {
        return null;
    }



    // ------------------------------
    // Getters Below...
    // ------------------------------

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }
}
