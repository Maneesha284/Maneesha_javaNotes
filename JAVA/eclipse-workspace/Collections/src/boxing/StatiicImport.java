package boxing;
import static java.lang.Integer.*;
import static java.lang.System.*;
public class StatiicImport {

	public static void main(String[] arg) {
		int no1=Integer.parseInt(arg[0]);
		int no2=Integer.parseInt(arg[1]);
		sum(no1,no2);
	}

	static void sum(int a, int b) {
		out.println(a+b);
	}

}
