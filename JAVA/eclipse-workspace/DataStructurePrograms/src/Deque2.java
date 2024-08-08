import java.util.Scanner;

 

public class Deque2 {

 

    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size;

 

    public Deque2(int size) {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

 

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

 

    boolean isEmpty() {
        return (front == -1);
    }

 

    void insertfront(int key) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

 

        if (front == -1) {
            front = 0;
            rear = 0;
        }

 

        else if (front == 0)
            front = size - 1;

 

        else
            front = front - 1;

 

        arr[front] = key;
    }

 

    void insertrear(int key) {
        if (isFull()) { 
            System.out.println(" Overflow ");
            return;
        }

 

        if (front == -1) {
            front = 0;
            rear = 0;
        } 
        else if (rear == size - 1)
            rear = 0;

 

        else
            rear = rear + 1;

 

        arr[rear] = key;
    }

 

    void deletefront() {
        if (isEmpty()) {
            System.out.println(" Underflow\n");
            return;
        }

 

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1)
            front = 0;

 

        else
            front = front + 1;
    }

 

    void deleterear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

 

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

 

    int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

 

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque dq = new Deque(MAX);

 

        System.out.println("Insert element at rear end ");
        int insEnd1 = scanner.nextInt();
        dq.insertrear(insEnd1);
        int insEnd2 = scanner.nextInt();
        dq.insertrear(insEnd2);
        System.out.println("This are Elements which are Inserted from rear end \n" + insEnd1 + " " + insEnd2);
        System.out.println("This is the rear element : " + dq.getRear());
        System.out.println("Now We deleting rear end element : "+ + dq.getRear());
        dq.deleterear(); 
        System.out.println("After delete rear element new rear become : " + dq.getRear());

 

        System.out.println("Now Inserting element at front end");
        int insFront1 = scanner.nextInt();
        dq.insertfront(insFront1);
        int insFront2 = scanner.nextInt();
        dq.insertfront(insFront2);
        System.out.println("This are Elements which are Inserted from front end : \n" + insFront2 + " " + insFront1);
        System.out.println("This is the front element: " + dq.getFront());
        System.out.println("Now We deleting front end element : "+ dq.getFront() );
        dq.deletefront();
        System.out.println("After delete front element new front become : " + +dq.getFront());

 

        scanner.close();

 

    }
}
 