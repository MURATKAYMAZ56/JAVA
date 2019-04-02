package linkedList;



public class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}

//	Node head = new Node(4);
//	Node nodeB = new Node(5);
//	Node nodeC = new Node(6);
//	head.next=nodeB;
//	nodeB.next =nodeC;
//	noedB.next=nodeC
			
	public int counrNode(Node head) {
		int count=0;
		Node currentNode=head;
		while(currentNode.next!=null) {
			currentNode.next=currentNode;
			count++;
		}
		
	return count;
	}
	
	

}
