
public class repeated {
	public static int repeat(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					return a[i];
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {2,9,1,40,5,3,6,1,8};
		int x=repeat(a);
		System.out.println(x);
	}

}
