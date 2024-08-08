import java.util.Scanner;

class Node {
	int data;
	Node link;

	Node() {
		this.link = null;
	}
}

public class LinkedList {
	static Node head = null;

	public static void create(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (head == null) {
			head = temp;
		} 
		else {
			Node p = head;
			while (p.link != null) {
				p = p.link;
			}
			p.link = temp;
		}
	}

	public static void print() {
		Node temp = head;
		if (temp == null) {
			System.out.println("No elements are present in Linked list");
		} 
		else {
			while (temp.link != null) {
				System.out.println(temp.data);
				temp = temp.link;
			}
			System.out.println(temp.data);
		}
	}

	public static int length() {
		int count = 0;
		Node temp = head;
		if (temp == null) {
			System.out.println("No elements are present in Linked list");
		} 
		else {
			while (temp.link != null) {
				count++;
				temp = temp.link;
			}
			count++;
		}
		return count;
	}

	public static void addAtBegin(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (head == null) {
			head = temp;
		} 
		else {
			temp.link = head;
			head = temp;
		}
	}

	static void menu() {
		String m = "Menu Driven Application\n";
		m += "1.Add Element\n";
		m += "2.Display Element\n";
		m += "3.No.of Elements\n";
		m += "4.Add at begin\n";
		m += "5.Delete Element\n";
		m += "6.Add at specific location\n";
		m += "7.Exit\n";
		m += "Select any option?";
		System.out.println(m);
	}

	public static void delete(int loc) {
		Node temp = head;
		if (loc > length()) {
			System.out.println("invalid location");
		} 
		else if (loc == 1) {
			temp = head;
			head = temp.link;
			temp.link = null;
			System.out.println("Delete ele is: " + temp.data);
		} 
		else {
			Node p, q;
			p = head;
			int i = 1;
			while (i < loc--) {
				p = p.link;
				i++;

			}
			q = p.link;
			p.link = q.link;
			q.link = null;
			System.out.println("Delete ele is: " + q.data);
		}
	}

	public static void accept() {
		System.out.println("Enter any value");
	}

	public static void addAfter(int loc, int data) {
		Node p;
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if (loc > length()) {
			System.out.println("invalid location");
		} 
		else {
			int i = 1;
			p = head;
			while (i < loc--) {
				p = p.link;
				i++;
			}
			temp.link = p.link;
			p = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		//System.out.println("Enter you choice");
		while (true) {
			menu();
			int ch = sr.nextInt();
			switch (ch) {
			case 1:
				accept();
				create(sr.nextInt());
				break;
			case 2:
				print();
				break;
			case 3:
				System.out.println(length());
				break;
			case 4:
				accept();
				addAtBegin(sr.nextInt());
				break;
			case 5:
				System.out.println("Enter any value");
				delete(sr.nextInt());
				break;
			case 6:
				System.out.println("Enter location, data");
				addAfter(sr.nextInt(), sr.nextInt());
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

}
