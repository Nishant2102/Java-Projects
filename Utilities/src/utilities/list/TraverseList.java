package utilities.list;

public interface TraverseList<T> {
	T getFirst() throws LinkedListException;
	T getLast() throws LinkedListException;
	T getNext() throws LinkedListException;
	T getPrevious() throws LinkedListException;
}
