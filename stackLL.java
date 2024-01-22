
public class stackLL {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	void push(int data) {
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
	void pop() {
//		delEnd
		if(head==null) {
			System.out.println("empty");
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	void peek() {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		System.out.println(temp.data);
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
		stackLL s=new stackLL();
		s.push(4);
		s.push(2);
		s.push(9);
		s.push(6);
		s.display();
		s.pop();
		s.display();
		s.peek();
		s.display();
		
	}

}
