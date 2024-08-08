import java.util.ArrayList;
import java.util.List;

class Aithmetic<Add> {
	Number b;
	String str;

	public Aithmetic(Number b) {

		this.b = b;
	}

	public Aithmetic(String string) {
		this.str = string;
	}

	public Number add() {

		return b;

	}

	public String add1() {

		return str;

	}

}
class Animal1<USerType extends Number>{
	USerType Number;
	Number a;
	public Animal1(Number b) {
		this.a = b;
	}
	public Number add1() {

		return a;

	}
	
}

public class Generic1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(29);
		// list.size();
		list.add("amni");
		list.add(null);
		list.add(2, "jdj");
		list.add("34");
//		System.out.println(list.size());
		// System.out.println(list);

		Aithmetic<Number> a = new Aithmetic<Number>(222);
		Number res = a.add();
		System.out.println(res);

		Aithmetic<String> b = new Aithmetic<String>("mani");
		String res1 = b.add1();
		System.out.println(res1);
		
		Animal1<Integer> al1=new Animal1<Integer>(10);
		System.out.println(al1);
		//Animal1<String> al2=new Animal1<String>("Dog");
//J.l.String is not within its bound 
	}

}
