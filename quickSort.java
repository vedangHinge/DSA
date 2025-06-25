import java.util.Stack;
public class quickSort
{
public static void main(String gg[]){

int arr[]={36,12,15,7,42,4,60,9,18,75};

int lb,ub,pp=0,e,f,g;

Stack<int[]> stack=new Stack<>();

stack.push(new int[]{0,arr.length-1});

while(!stack.isEmpty()){
int [] range=stack.pop();
lb=range[0];
ub=range[1];
e=lb;
f=ub;
while(e<f){
	while(e<ub && arr[e]<=arr[lb]) e++;
	while(arr[f]>arr[lb])f--;
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
	if(pp+1<ub){
		stack.push(new int[]{pp+1,ub});
	}
	if(lb<pp-1){
		stack.push(new int[]{lb,pp-1});
	}
}
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}