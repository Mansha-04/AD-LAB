
public class queueLL {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void enqueue(int data) {
//		insEnd
		Node p=new Node(data);
		if(head==null) {
			head=p;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=p;
	}
	void dequeue() {
//		delBeg
		if(head==null) {
			System.out.println("empty");
		}
		if(head.next==null) {
			head=null;
			return;
		}
		head=head.next;
	}
	void peek() {
//		front/head value
		System.out.println(head.data);
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		queueLL q=new queueLL();
		q.enqueue(5);
		q.enqueue(2);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(7);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		q.peek();
	}

}
