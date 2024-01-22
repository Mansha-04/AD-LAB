
public class missing{
	public static void missingNum(int a[],int n) {
		int temp[]=new int[n+1];
		for(int i=0;i<=n;i++) {
			temp[i]=0;
		}
		for(int i=0;i<n;i++) {
			temp[a[i]-1]=1;
		}
		int ans=0;
		for(int i=0;i<=n;i++) {
			if(temp[i]==0) {
				ans=i+1;
			}
		}
		System.out.print(ans);

	}
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		int n=a.length;
		missingNum(a,n);
	}
}