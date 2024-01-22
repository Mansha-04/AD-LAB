
public class maximumRepeat {
	public static int freq(int a[],int n) {
		int maxcount=0;
		int num=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==a[i]) {
					count++;					
				}
				if(count>num) {
					maxcount=count;
					num=a[i];
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,2,6,7,3,8,3,9,4,2};
		int n=a.length;
		int x=freq(a,n);
		System.out.println(x);
	}

}
