package stack;

public class StaticStack {
	private int[] arr;
	private int top;
	
	public StaticStack() {
		this.arr = new int[5];
		top = -1;
	}
	
	public StaticStack(int size) {
		this.arr = new int[size];
		top = -1;
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
	}
	
	public boolean isStackFull() {
		return (top == (arr.length - 1));
	}
	
	public void push(int data) {
		top++;
		arr[top] = data;
	}
	
	public void pop() {
		top--;
	}
	
	public int peek() {
		return (arr[top]);
	}
}
