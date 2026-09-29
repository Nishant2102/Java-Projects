package utilities.list;

public interface ManipulateList<T> {

	void add(T Data) throws LinkedListException;
	void delete(int index) throws LinkedListException;
}
