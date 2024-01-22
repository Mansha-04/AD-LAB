public class LL {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=null;
		}
	}
	static int count() {
		int c=0;
		Node temp=head;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	void insBeg(int data) {
		Node p=new Node(data);
		if(head==null) {
			head=p;
			return;
		}
		p.next=head;
		head=p;	
	}
	void insEnd(int data) {
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
	void insAny(int data,int pos) {
		int c=count();
		if(pos==1) {
			insBeg(data);
			return;
		}
		if(pos==c+1) {
			insEnd(data);
			return;
		}
		else {
			Node p=new Node(data);
			Node temp=head;
		    while(pos-2>0) {
		    	temp=temp.next;
		    	pos--;
		    }
		    p.next=temp.next;
		    temp.next=p;
		}		
	}
	public int delBeg() {
		int x=head.data;
		head=head.next;
		return x;
	}
	public int delEnd() {
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		int x=temp.next.data;
		temp.next=null;
		return x;
	}
	public int delAny(int pos) {
		int c=count();
		if(pos==1) {
			return delBeg();			
		}
		if(pos==c) {
			return delEnd();
		}
		else {
			Node temp=head;
			while(pos-2>0) {
				temp=temp.next;
				pos--;
			}
			int x=temp.next.data;
			temp.next=temp.next.next;
			return x;
		}	
	}
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	void reverse() {
		Node cur=head;
		Node prev=null;
		Node nex=null;
		while(cur!=null) {
			nex=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nex;
		}
		head=prev;
	}

	public static void main(String[] args) {
		LL list=new LL();
		list.insBeg(2);
		list.insEnd(8);
		list.insBeg(5);
		list.insEnd(7);
		list.insBeg(1);
		list.insEnd(9);
		list.insBeg(3);
		list.display();
		list.insAny(4,5);
		list.display();
		list.delAny(6);
		list.display();
		list.delBeg();
		list.delEnd();
		list.display();
		list.reverse();
		list.display();
	}

}
