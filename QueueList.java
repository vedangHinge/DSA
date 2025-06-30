package Queue;

public class QueueList {
	Node front,rear;
	class Node{
		int data;
		Node next;
		
			public Node(int val) {
				this.data=val;
				this.next=null;
			}
			
	}
	public QueueList() {
		this.front=null;
		this.rear=null;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	
	public void enQueue(int val) {
		Node node=new Node(val);
		if(isEmpty()) {
			front=node;
		}else {
			rear.next=node;
		}
		rear=node;
		System.out.println("Enqueued "+val);
	}
	public int dequeue() {
		if(!isEmpty()) {
		Node temp=front;
		front=front.next;
		temp.next=null;
		System.out.println(temp.data);
		return temp.data;
		}
		return -1;
	}
	public void display() {
		Node temp=front;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
	}
}
