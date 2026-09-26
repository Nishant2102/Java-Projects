package utilities.list;

public class LinkedList <T>{
	
	private Node<T> start;
	private Node<T> current;
	private Node<T> end;
	
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
	
	public void delete (int index)
	{
		if(start == null || index > maxCount -1)
			return;
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
	public T getFirst()
	{
		if(start == null)
			return null;
		
		current = start;
		
		return current.data;
	}
	
	
	
	public T getLast()
	{
		if(start == null)
			return null;
		
		current = end;
		
		return current.data;
			
	}
	
	public T getNext()
	{
		if(start==null || current.next == null)
			return null;
		else
		{
			current = current.next;
			return current.data;
		}
	}
	
	
	
	public T getPrevious()
	{
		if(start == null || current.previous == null)
			return null;
		else
		{
			current = current.previous;
			return current.data;
		}
	}
	
//	public Node<T> getFirstNode()
//	{
//		if(start == null)
//			return null;
//		
//		current = start;
//		
//		return current;
//	}
//	
//	public Node<T> getNextNode(Node<T> Node)
//	{
//		Node<T> temp = current;
//		if(start==null || current.next == null)
//			return null;
//		else
//		{
//			temp = temp.next;
//			return temp;
//		}
//	}
//	
//	public Node<T> getPreviousNode(Node<T> Node)
//	{
//		Node<T> temp = current;
//		if(start == null || current.previous == null)
//			return null;
//		else
//		{
//			temp = temp.previous;
//			return temp;
//		}
//	}
//	
//	
//	public void swapNodeData(Node<T> node1, Node<T> node2) {
//	    if (node1 == null || node2 == null || node1 == node2) {
//	        return;
//	    }
//
//	    T temp = node1.data;
//	    node1.data = node2.data;
//	    node2.data = temp;
//	}

	

}
