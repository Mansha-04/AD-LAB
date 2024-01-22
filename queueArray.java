import java.util.*;
public class queueArray {
	int a[];
	int front,rear;
	queueArray(int n){
		a=new int[n];
		front=0;
		rear=-1;
	}
	void enqueue(int data,int n) {
		if(rear==n+2) {
			System.out.println("overflow");
		}
		rear++;
		a[rear]=data;

	}
	int dequeue() {
		if(front==rear) {
			System.out.println("empty");
		}
		int x=a[front];
		front++;
		return x;
	}
	void peek() {
		System.out.println(a[front]);
	}
	void display() {
		for(int i=front;i<rear;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		queueArray q=new queueArray(n);
		q.enqueue(8, n);
		q.enqueue(9, n);
		q.enqueue(1, n);
		q.enqueue(0, n);
		q.enqueue(7, n);
		q.enqueue(2, n);
		q.display();
		int x=q.dequeue();
		int y=q.dequeue();
		System.out.println("dequeued: "+x+" "+y);
		q.display();
		q.peek();
		
	}

}
