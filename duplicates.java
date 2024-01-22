
public class duplicates {
	public static void duplicate(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
		    }
		}
		System.out.println("are duplicates");
	}
	public static void main(String[] args) {
		int a[]= {9,3,6,8,3,8,5,3,8,2,9,4,2};
		duplicate(a);
	}

}
