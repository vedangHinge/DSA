package Stack;

public class StackUsingArray {
	private int arr[];
	private int top;
	public StackUsingArray() {
		arr =new int[5];
		top=-1;
		
	}
	public StackUsingArray(int size) {
		arr=new int[size];
		top=-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(int val) {
		if(!isFull()) {
			top++;
			arr[top]=val;
			System.out.println("Val pushed on stack"+val);
		}else {
			System.out.println("Stack is full");
		}
		
	}
	public int pop() {
		if(!isEmpty()) {
			int n=arr[top];
			top--;
			System.out.println("popped :"+n);
			return n;
		}
		System.out.println("Stack is Empty");
		return -1;
	}
}
