package utilities.list;

import utilities.list.LinkedListException;
import utilities.list.ManipulateList;
import utilities.list.TraverseList;
import utilities.list.LinkedList;

public class LinkedList <T> implements TraverseList<T>, ManipulateList<T>{
	
	Node<T> start;
	Node<T> current;
	Node<T> end;
	
	private int maxCount;
	
	public Node<T> getHeadNode() {
        return start;
    }
	
	public void add (T data)
	{
		Node<T> tmpNode = new Node<T>(data);
		if(start==null)
			start = end = current = tmpNode;
		else
		{
			end.next = tmpNode;
			tmpNode.previous = end;
			end = tmpNode;
		}
		maxCount++;
	}
	
	public int getMaxCount() {
        return maxCount;
    }
	
	public void delete (int index) throws LinkedListException
	{
		if(start == null || index > maxCount -1) throw new LinkedListException("Invalid index or empty list.");
		if(start == end)
			start = end = current = null;
		else if(index==0)
		{
			start = start.next;
			start.previous = null;
			current = start;
		}
		else if(index == maxCount -1)
		{
			end = end.previous;
			end.next = null;
			current = start;
		}
		else
		{
			Node<T> tmpNode = start;
			for(int tmp =0; tmp<index; tmp ++, tmpNode = tmpNode.next);
			
			tmpNode.next.previous = tmpNode.previous;
			tmpNode.previous.next = tmpNode.next;
		}
		maxCount--;
	}
	
	public T getFirst() throws LinkedListException
	{
		if(start == null)
			throw new LinkedListException("Empty list.");
		
		current = start;
		
		return current.data;
	}
	
	
	public T getLast() throws LinkedListException
	{
		if(start == null) throw new LinkedListException("Empty list.");
			
		
		current = end;
		
		return current.data;
			
	}
	
	public T getNext() throws LinkedListException
	{
		if(start==null || current.next == null) throw new LinkedListException("Empty List or Currently at last element.");
			
		else
		{
			current = current.next;
			return current.data;
		}
	}
	
	
	public T getPrevious() throws LinkedListException
	{
		if(start == null || current.previous == null) throw new LinkedListException("Empty List or Currently at starting element.");
		else
		{
			current = current.previous;
			return current.data;
		}
	}

	

	
	
	
}






