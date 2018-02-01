/**
 * Created by bma on 1/13/18.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class myLinkedPosList<E> implements myPositionalList<E> {

    private static class Node<E> implements myPosition<E>{
        private E element;
        private Node<E> next;
        private Node<E> prev;

        public Node(E e, Node<E> p, Node<E> n) {
            this.element = e;
            this.prev = p;
            this.next = n;

        }
//Getters
        public E getElement() throws IllegalStateException
        { if (next == null) {
            throw new IllegalStateException("Position not available anymore!");
        }
            return this.element;
        }
        public Node<E> getNext() {return next;}
        public Node<E> getPrev(){return prev;}
//Setters
        public void setElement(E e) {this.element = e;}
        public void setNext(Node<E> n) {this.next = n;}
        public void setPrev(Node<E> p) {this.prev = p;}

    }// End of NODE CLASS WHICH IMPLEMENTS myPositions

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public myLinkedPosList() {
        header = new Node<> (null, null, null);
        trailer = new Node<> (null, header, null);
        header.setNext(trailer);

    }

    private Node<E> validate(myPosition<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
        Node<E> node = (Node<E>) p;     // safe cast
        if (node.getNext() == null)     // convention for defunct node
            throw new IllegalArgumentException("p is no longer in the list");
        return node;
    }

private myPosition<E> position(Node<E> node) {
    if(node == header || node == trailer)
        return null;
    return node;
}

    @Override
    public int size (){
        return size;
    }
    @Override
    public boolean isEmpty()
    {return size == 0;}

    @Override
    public myPosition<E> first() {
        return this.position(header.getNext());
    }
    @Override
    public myPosition<E> last() {
        return this.position(trailer.getPrev());
    }
@Override
    public myPosition<E> before(myPosition<E> p) throws IllegalArgumentException {
    Node<E> e = validate(p);
    return position(e.getPrev());

}

    @Override
    public myPosition<E> after (myPosition<E> p) throws IllegalArgumentException {
        Node<E> e = validate(p);
        return position(e.getNext());
    }




    public myPosition<E> addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> node = new Node<E>(e, pred, succ);
        pred.setNext(node);
        succ.setPrev(node);
        size++;
        return node;
    }
    @Override
    public myPosition<E> addFirst(E e) {
       return addBetween(e, header, header.getNext());

    }

    @Override
    public myPosition<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    @Override
    public myPosition<E> addBefore(myPosition<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node.getNext());
    }

    @Override
    public myPosition<E> addAfter(myPosition<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());

    }

    @Override
    public E set(myPosition<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);

        return null;
    }

    @Override
    public E remove(myPosition<E> p) throws IllegalArgumentException {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<myPosition<E>> positions() {
        return null;
    }

}
