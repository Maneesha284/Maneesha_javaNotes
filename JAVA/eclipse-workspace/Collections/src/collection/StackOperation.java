package collection;

import java.util.Scanner;

public class StackOperation {
	int top;
	int size = 6;
	int stack[] = new int[size];

	boolean isEmpty() {
		return (top < 0);
	}
	boolean isFull() {
		return (top == size-1);
	}

	StackOperation() {
		top = -1;
	}

	void push(Scanner sr) {
		if (isFull()) {
			System.out.println("stack is overflow...");
		} 
		else {
			System.out.println("Enter element into a stack");
			int value = sr.nextInt();
			top++;
			stack[top] = value;
			System.out.println("Element is inserted into stack...");
		}
	}

	void peek() {
		if (isEmpty()) {
			System.out.println("stack is underflow...");
		} 
		else {
			System.out.println("Element display at top..." + stack[top]);
		}
	}

	void pop() {
		if (isEmpty()) {
			System.out.println("stack is underflow...");
		} 
		else {
			System.out.println("Element deleted..." + stack[top]);
			top--;
		}
	}

	void display() {
		if (isEmpty()) {
			System.out.println("stack is underflow...");
		} 
		else {
			System.out.println("elements in stack");
			for (int i = top; i >= 0; i--) {
				System.out.print(stack[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		StackOperation s = new StackOperation();
		int ch = 0;
		while (ch != 5) {
			String menu = "STACK APPLICATION\n";
			menu += "1.push\n";
			menu += "2.peek\n";
			menu += "3.pop\n";
			menu += "4.display\n";
			menu += "5.exit\n";
			menu += "Enter you choice:";
			System.out.println(menu);
			ch = sr.nextInt();
			switch (ch) {
			case 1: {
				s.push(sr);
				break;
			}
			case 2: {
				s.peek();
				break;
			}
			case 3: {
				s.pop();
				break;
			}
			case 4: {
				s.display();
				break;
			}
			case 5: {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid choice");
			}
			}
		}
	}
}

