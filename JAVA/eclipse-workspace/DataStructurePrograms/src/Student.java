import java.util.*;

 

public class Student implements Comparable<Student>{
    private int rank;
    private String name;
    
    public Student(String name, int rank) { // constructor to set name and rank
        this.rank = rank;
        this.name = name;
        
    }

 

    @Override
    public int compareTo(Student st) { // compare  rank of the student with onther Student
        int res = 0;
        if(rank < st.rank) {
            res += -1;
        }
        else if(rank > st.rank) {
            res += 1;
        }
        return res;
    }
    @Override
    public String toString() {
        String result = " Student name: " + name + ", rank :" + rank;
        return result;
    }

 

    public static void main(String[] args) {
        // Creating an empty PriorityQueue by
        // creating an object of Student
        
        PriorityQueue<Student> sq = new PriorityQueue<>();
        
        //insert students into the priority queue
        sq.add(new Student ("santhosh", 5) );
        sq.add(new Student (" mahi ", 4) );
        sq.add(new Student (" Samu ", 1) );
        sq.add(new Student (" Raju ", 2) );
        sq.add(new Student (" Ramu ", 3) );
        
        System.out.println(" Size of the queue : " + sq.size());
    
        
        Iterator<Student> it = sq.iterator(); // iterator to iterate through queue
        while(it.hasNext()) {
            //delete and display the first elements from the queue
            System.out.println("The item of the queue : " + sq.poll().toString());
        }
    }

 

}