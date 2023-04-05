package Itera;

import java.util.Iterator;

// TODO 2.3: Augment the class constructor to implement Iterator.
public class LinkedListIterator<T> {

    private Node<T> current;


    public LinkedListIterator(Node<T> current) {
        this.current = current;
    }

    // TODO 2.4: Implement the hasNext() method. It should return whether the current Node's `next` pointer is null or not.
//    @Override
//    public boolean hasNext() {
//
//    }

    // TODO 2.5: Implement the next() method. It should move the current pointer to the Node stored in the current Node's `next` value, and return the data in the current Node.
//    @Override
//    public T next() {
//
//    }
}
