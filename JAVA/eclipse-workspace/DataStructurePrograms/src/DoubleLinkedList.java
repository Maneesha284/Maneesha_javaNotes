import java.util.Scanner;

class Link {
    private int data;
    public Link previous;
    public Link next;
    public Link(int data) {
        previous = null;
        this.data = data;
        next = null;
    }
    public Link(Link previous, int data, Link next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
    public int data() {
        return data;
    }
}

 


public class DoubleLinkedList {
    private Link head;
    private int size;
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        return size;
    }
    public void addFirst(int data) {
        if(head == null) {
            head = new Link(null, data, null);
        }
        else {
            Link newLink = new Link(null, data, head);
            head.previous = newLink;
            head = newLink;
        }
        size++;
    }
    public void addRear(int data) {
        if(head == null) {
            head = new Link(null,data, null);
        }
        else {
            Link current = head;
            while(current.next != null){
                current = current.next;
            }
            Link newLink = new Link(current, data, null);
            current.next = newLink;
        }
        size++;
    }
    public void removeFirst() {
        if(head == null) {
            return;
        }
        else {
            head =head.next;
            head.previous = null;
            size--;
        
        }
    }
    public void removeRear() {
        if(head == null) {
            return;
        }
        Link current = head;
        while(current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    
    public void display() {
        Link current =  head;
        while(current != null) {
            System.out.println(current.data());
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        DoubleLinkedList ddl = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements into the list : ");
        ddl.addFirst(sc.nextInt());
        ddl.addFirst(sc.nextInt());
        ddl.addFirst(sc.nextInt());
        ddl.addFirst(sc.nextInt());
        System.out.println("Adding elements into the list : ");
        ddl.display();
        System.out.println("adding the element at first :");
        ddl.addFirst(sc.nextInt());
        ddl.display();
        System.out.println("removing the element at first :");
        ddl.removeFirst();
        ddl.display();
        System.out.println("removing the element at last");
        ddl.removeRear();
        ddl.display();
        
    }

 

}