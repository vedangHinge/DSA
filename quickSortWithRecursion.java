public class quickSortWithRecursion{
public static void main(String args[]){
int arr[]={36,12,15,7,42,4,60,9,18,75};
quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
}
static void quickSort(int[] arr,int lb,int ub){
if(lb<ub){
int pp=partition(arr,lb,ub);
quickSort(arr,lb,pp-1);
quickSort(arr,pp+1,ub);
}
}
static int partition(int[] arr,int lb,int ub){
int e=lb;
int f=ub;
int g=0;
int pp=0;
while(e<f){
while(e<ub && arr[e]<=arr[lb])e++;
while(arr[f]>arr[lb]) f--;
if(e<f){
g=arr[e];
arr[e]=arr[f];
arr[f]=g;
}
else{
g=arr[lb];
arr[lb]=arr[f];
arr[f]=g;
pp=f;
}

}
return pp;
}
}