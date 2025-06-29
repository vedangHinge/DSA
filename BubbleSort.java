package BB;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {12,22,54,63,1,2,8,4,15,41};
		int g=0;
		int m=arr.length-2;
		for(int i=m;i>=0;i--) {
			int e=0;
			int f=1;
			while(e<=m) {
				if(arr[f]<arr[e]) {
					 System.out.println("Swapping: " + arr[e] + " and " + arr[f]);
					g=arr[e];
					arr[e]=arr[f];
					arr[f]=g;
					
				}
				e++;
				f++;
				
				
			}
		}
	      System.out.println("\nSorted array:");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
