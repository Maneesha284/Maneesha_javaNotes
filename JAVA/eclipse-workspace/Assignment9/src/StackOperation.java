import java.util.Scanner;
public class StackOperation {
	int top;
	int size=5;
	int stack[]=new int[size];
	boolean isEmpty() {
		return (top<0);
	}
	StackOperation(){
		top=-1;
	}
	boolean push(Scanner sr) {
		if(top==size-1){
			System.out.println("stack is overflow...");
			return false;
		}
		else{
			System.out.println("Enter element in stack");
			int value=sr.nextInt();
			top++;
			stack[top]=value;
			System.out.println("Element inserted...");
			return true;
		}
	}
	boolean display() {
		if(top==-1){
			System.out.println("stack is underflow...");
			return false;
		}
		else{
			System.out.println("elements in stack");
			for(int i=top;i>=0;i--) {
				System.out.print(stack[i]+" ");
			}
			return true;
		}
	}
	boolean delete() {
		if(top==-1){
			System.out.println("stack is underflow...");
			return false;
		}
		else{
			System.out.println("Element deleted..."+stack[top]);
			top--;
			return true;
		}	
	}
	boolean pop() {
		if(top==-1){
			System.out.println("stack is underflow...");
			return false;
		}
		else{
			System.out.println("Element display at top..."+stack[top]);
			return true;
		}
		
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		StackOperation s=new StackOperation();
		int ch=0;
		while(ch!=4) {
			System.out.println("Enter you choice: ");
			System.out.println("1.push \n 2.pop \n 3.delete \n 4.display \n 5.exit");
			ch=sr.nextInt();
			switch(ch) {
				case 1: {
					s.push(sr);
					break;
				}	
				case 2: {
					s.pop();
					break;
				}
				case 3: {
					s.delete();
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
					System.out.println("wrong option");
				}
			};
		}
	}
}
