package w5_d3;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack);
		System.out.println("The Top element is:"+stack.peek());
		System.out.println("The Stack Size is:"+stack.size());
		stack.pop();
		System.out.println(stack);
		if(stack.isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack is not Empty");
		}

	}

}
