import java.util.Scanner;

public class Graph {

 private int adj[][];
private int numVertices;

 Graph(int numVertices) {
this.numVertices = numVertices;
adj = new int[numVertices][numVertices];
}

 void addEdge(int source, int destination) {
adj[source][destination] = 1;
adj[destination][source] = 1;
}

 void removeEdge(int source, int destination) {
adj[source][destination] = 0;
adj[destination][source] = 0;
}

 void display() {
for (int i = 0; i < numVertices; i++) {
System.out.print(i + "--->");
for (int j = 0; j < numVertices; j++) {
System.out.print(adj[i][j] + " ");
}
System.out.println();
}
System.out.println("**********************************************");
}

 static String menu() {
String menu = "Graph OPERATIONS\n";
menu += "1.Add Edge\n";
menu += "2.Delete Edge\n";
menu += "3.Display Graph\n";
menu += "4.Exit\n";
menu += "Choose any Option:";
return menu;
}

 public static void main(String[] args) {
Scanner s = new Scanner(System.in);

 System.out.println("Enter Number of Vertices for the graph");
int n = s.nextInt();
Graph g = new Graph(n);

 while (true) {
System.out.print(menu());
int ch = s.nextInt();

 switch (ch) {
case 1:
System.out.println("Enter source vertex:");
int source = s.nextInt();
System.out.println("Enter Destination vertex:");
int destination = s.nextInt();
g.addEdge(source, destination);
break;
case 2:
System.out.println("Enter source vertex:");
int source1 = s.nextInt();
System.out.println("Enter Destination vertex:");
int destination1 = s.nextInt();
g.removeEdge(source1, destination1);
break;
case 3:
g.display();
break;
case 4:
System.exit(0);
break;
}
}
}

}