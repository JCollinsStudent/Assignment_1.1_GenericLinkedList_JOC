package linkedList;
/**
 * @author njohnson3
 *
 */
@SuppressWarnings({"rawtypes", "unchecked"})

public class LinkedList {
	

	Node head;
	int length;
	Node tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public Node getList()
	{
		return head;
	}
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	public static void main(String[] args) {
		LinkedList myList=new LinkedList();
		
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<String> anotherNode = new Node<String>();
		anotherNode.setData("This is a generic linked list");
		myList.addNode(anotherNode);
		
		Node<Boolean> boolNode = new Node<Boolean>();
		boolNode.setData(true);
		myList.addNode(boolNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
	}

}