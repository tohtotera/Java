package practice3_6;

public class StrongBox<E> {
	private E instance;
	private KeyType key;
	
	public void setKey(KeyType k){this.key = k;}
	public void put(E e){this.instance = e;}
	public E get(){return this.instance;}
	StrongBox(KeyType type){ setKey(type); }
	
}
