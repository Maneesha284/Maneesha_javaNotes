public class DequeExample {

 

    static int size = 5;
    static int f = -1; //front end
    static int r = -1; //rear end

 

    static int deque[] = new int[size];

 

    // enqueue_front function will insert the value from the front
    static void enqueue_front(int x) {
        if ((f == 0 && r == size - 1) || (f == r + 1)) {
            System.out.println(("deque is full"));
        } else if ((f == -1) && (r == -1)) {
            f = r = 0;
            deque[f] = x;
        } else if (f == 0) {
            f = size - 1;
            deque[f] = x;
        } else {
            f = f - 1;
            deque[f] = x;
        }
    }

 

    // enqueue_rear function will insert the value from the rear
    static void enqueue_rear(int x) {
        if ((f == 0 && r == size - 1) || (f == r + 1)) {
            System.out.println(("deque is full"));
        } else if ((f == -1) && (r == -1)) {
            r = 0;
            deque[r] = x;
        } else if (r == size - 1) {
            r = 0;
            deque[r] = x;
        } else {
            r++;
            deque[r] = x;
        }

 

    }

 

    // display function prints all the value of deque.
    static void display() {
        int i = f;
        System.out.println(("\n Elements in a deque : "));

 

        while (i != r) {
            System.out.print(deque[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(deque[r] + " ");
    }

 

    // getfront function retrieves the first value of the deque.
    static void getfront() {
        if ((f == -1) && (r == -1)) {
            System.out.println(("Deque is empty"));
        } else {
            System.out.println(("\nThe value of the front is: " + deque[f]));
        }

 

    }

 

    // getrear function retrieves the last value of the deque.
    static void getrear() {
        if ((f == -1) && (r == -1)) {
            System.out.println(("Deque is empty"));
        } else {
            System.out.println(("\nThe value of the rear is: " + deque[r]));
        }

 

    }

 

    // dequeue_front() function deletes the element from the front
    static void dequeue_front() {
        if ((f == -1) && (r == -1)) {
            System.out.println(("Deque is empty"));
        } else if (f == r) {
            System.out.println(("\nThe deleted element is " + deque[f]));
            f = -1;
            r = -1;

 

        } else if (f == (size - 1)) {
            System.out.println(("\nThe deleted element is " + deque[f]));
            f = 0;
        } else {
            System.out.println(("\n The deleted element is " + deque[f]));
            f = f + 1;
        }
    }

 

    // dequeue_rear() function deletes the element from the rear
    static void dequeue_rear() {
        if ((f == -1) && (r == -1)) {
            System.out.println(("Deque is empty"));
        } else if (f == r) {
            System.out.println(("\nThe deleted element is " + deque[r]));
            f = -1;
            r = -1;

 

        } else if (r == 0) {
            System.out.println(("\nThe deleted element is " + deque[r]));
            r = size - 1;
        } else {
            System.out.println(("\nThe deleted element is " + deque[r]));
            r = r - 1;
        }
    }

 

    public static void main(String[] args) {

 

        // inserting a value from the front.
        enqueue_front(2);
        // inserting a value from the front.
        enqueue_front(1);
        // inserting a value from the rear.
        enqueue_rear(3);
        // inserting a value from the rear.
        enqueue_rear(5);
        // inserting a value from the rear.
        enqueue_rear(8);
        // Calling the display function to retrieve the values of deque
        display();
        // Retrieve the front value
        getfront();
        // Retrieve the rear value.
        getrear();
        // deleting a value from the front
        dequeue_front();
        // deleting a value from the rear
        dequeue_rear();
        // Calling the display function to retrieve the values of deque
        display();

 

    }

 

}