import java.util.Scanner;
public class Deque1
{
    static int size = 5;
    static int deque[] = new int[size];
    static int front = -1; 
    static int rear = -1;
    
    static boolean isFull() 
    {
        boolean b = false;
        if((front == 0 && rear == size - 1) || (front == rear + 1))
        {
            b = true;
        }
        return b;
    }
    
    static boolean isEmpty()
    {
         boolean b = false;
         if((front == -1) && (rear == -1))
         {
             b = true;
         }
         return b;
     }
    
    static void insertAtFront(int value) 
    {
        if (isFull()) 
        {
            System.out.println(("Deque is full"));
        } 
        else if(isEmpty())
        {
            front = rear = 0;
            deque[front] = value;
        }
        else if (front == 0)
        {
            front = size - 1;
            deque[front] = value;
        } 
        else
        {
            front = front - 1;
            deque[front] = value;
        }
    }
    
    static void insertAtRear(int value)
    {
        if (isFull()) 
        {
            System.out.println(("Deque is full"));
        } 
        else if(isEmpty()) 
        {
            rear = 0;
            deque[rear] = value;
        } 
        else if (rear == size - 1) 
        {
            rear = 0;
            deque[rear] = value;
        } 
        else 
        {
            rear++;
            deque[rear] = value;
        }
    }

 

    static void displayQue()
    {
        int i = front;
        System.out.println(("\nElements in the Deque are : "));
        System.out.println("****************");
        while (i != rear)
        {
            System.out.print(deque[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(deque[rear] + " ");
        System.out.println("****************");

 

    }
   
    static void getFront()
    {
        if (isEmpty())
        {
            System.out.println(("Deque is empty"));
        } 
        else
        {
            System.out.println(("\nThe value of the front is: " + deque[front]));
        }
    }

 

    static void getRear()
    {
        if (isEmpty()) 
        {
            System.out.println(("Deque is empty"));
        } 
        else
        {
            System.out.println(("\nThe value of the rear is: " + deque[rear]));
        }
    }

 

    static void deleteAtFront()
    {
        if (isEmpty())
        {
            System.out.println(("Deque is empty"));
        } 
        else if (front == rear) 
        {
            System.out.print(("\nThe element that is deleted at Front end : " + deque[front]));
            front = -1;
            rear = -1;
        }
        else if (front == (size - 1)) 
        {
            System.out.print(("\nThe element that is deleted at Front end : " + deque[front]));
            front = 0;
        } 
        else
        {
            System.out.print(("\nThe element that is deleted at Front end : " + deque[front]));
            front = front + 1;
        }
    }

 

    static void deleteAtRear()
    {
        if (isEmpty()) 
        {
            System.out.println(("Deque is empty"));
        } 
        else if(front == rear)
        {
            System.out.print(("\nThe element that is deleted at Rear end : " + deque[rear]));
            front = -1;
            rear = -1;
        } 
        else if (rear == 0)
        {
            System.out.print(("\nThe element that is deleted at Rear end : " + deque[rear]));
            rear = size - 1;
        }
        else
        {
            System.out.print(("\nThe element that is deleted at Rear end : " + deque[rear]));
            rear = rear - 1;
        }
    }

 

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("**DEQueue Operations**");
        System.out.println("Enter an element to insert at Front end ");
        insertAtFront(sc.nextInt());
        displayQue();
        
        System.out.println("Enter an element to insert at Front end ");
        insertAtFront(sc.nextInt());
        displayQue();
        
        System.out.println("Enter an element to insert at Rear end");
        insertAtRear(sc.nextInt());
        displayQue();
        
        System.out.println("Enter an element to insert at Rear end");
        insertAtRear(sc.nextInt());
        displayQue();
        
        System.out.println("Enter an element to insert at Front end");
        insertAtFront(sc.nextInt());
        displayQue();
           
        getFront();
        getRear();
        
        System.out.println("Press any key for Deletion at both ends : ");
        sc.next();
        
        deleteAtFront();
        displayQue();
        
        deleteAtRear();
        displayQue();
    }
}
 





