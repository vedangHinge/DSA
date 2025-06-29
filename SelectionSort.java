package SS;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {12,22,54,63,1,2,8,4,15,41};
		int e=0;
		int g=0;
		while(e<=8) {
			int si=e;
			int f=e+1;
			while(f<=9) {
				if(arr[f]<arr[si]) {
					si=f;
				}
				f++;
			}
			g=arr[si];
			arr[si]=arr[e];
			arr[e]=g;
			e++;
		}
		for(int i=0;i<=9;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
