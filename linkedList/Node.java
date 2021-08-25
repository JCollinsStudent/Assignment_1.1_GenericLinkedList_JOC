/**
 * 
 */
package linkedList;

/**
 * @author njohnson3
 *
 */
@SuppressWarnings("rawtypes")
class Node<T> {
	T data;

	Node nextNode;
	public Node()
	{
		nextNode=null;
	}
	public void setData(T data) {
		this.data=data;
	}
	public Node getNode() {
		return this;
	}
	public void setNextNode(Node nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}