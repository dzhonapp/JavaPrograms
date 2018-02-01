/**
 * Created by bma on 1/13/18.
 */
import java.util.Iterator;
public interface myPositionalList<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    myPosition<E> first();
    myPosition<E> last();
    myPosition<E> before(myPosition<E> p);
    myPosition<E> after(myPosition<E> p);
    myPosition<E> addFirst(E e);
    myPosition<E> addLast(E e);
    myPosition<E>addBefore(myPosition<E> p, E e) throws IllegalArgumentException;
    myPosition<E> addAfter(myPosition<E> p, E e) throws IllegalArgumentException;
    E set(myPosition<E> p, E e) throws IllegalArgumentException;
    E remove(myPosition<E> p) throws IllegalArgumentException;
    Iterator<E> iterator(); // I don't understand this, why we need it here?
    Iterable<myPosition<E>> positions();

}
