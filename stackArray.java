import java.util.*;
public class stackArray {
	int a[];
	int top;
	stackArray(int n){
		a=new int[n];
		top=-1;
	}
	void push(int data, int n) {
		if(top==n-1) {
			System.out.println("overflow");
		}
		top++;
		a[top]=data;		
	}
	int pop() {
		if(top==-1) {
			System.out.println("underflow");
		}
		int x=a[top];
		top--;
		return x;
	}
	void peek() {
		if(top==-1) {
			System.out.println("underflow");
		}
		System.out.println(a[top]);
		}
	void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		stackArray s=new stackArray(n);
		s.push(5,n);
		s.push(2,n);
		s.push(9,n);
		s.push(8,n);
		s.display();
		int x=s.pop();
		int y=s.pop();
		System.out.println("popped no.s "+x+" "+y);
		s.display();
		s.peek();
	}

}
