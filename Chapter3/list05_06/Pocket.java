package list05_06;

public class Pocket<E> {
    private E data;
    public void put(E d) { this.data = d; }        /* すべてのEがStringに置き換わった */
    public E get() { return this.data; }
}
