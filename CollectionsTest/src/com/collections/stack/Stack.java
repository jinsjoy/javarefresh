package com.collections.stack;

public class Stack {
	
	int a[] = new int[100];
	int top = 0;
	
	public void push(int element) {
		a[top++] = element;		
	}
	
	public int pop() {
		
		if(top == -1) {
			System.out.println("underflow error");
			return -1;
		} else {
			int element = a[top];
			top--;
			return element;
		}	
	}
	
	   boolean isEmpty()  
       { 
           return (top == -1) ? true : false; 
       } 
	
	public void printStack() {
		for(int i=0;i<top;i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String args[]) {
		Stack stack = new Stack();
		stack.push(100);
		stack.push(190);
		stack.push(389);
		stack.push(677);
		stack.push(88);
		stack.printStack();
		stack.pop();
		stack.printStack();
	}

}
