package Now08072024;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class FunctionalInterfacesExample {
	public static void main(String[] args) {
		Consumer<String> con=s->System.out.println(s);
		con.accept("manee");
		
		Function<String,Integer> fun=s->s.length();
		System.out.println(fun.apply("manee"));
		
		Supplier<String> sup=()->"maneesha";
		System.out.println(sup.get());
		
		Predicate<Integer> pre=n->n%3==2;
		System.out.println(pre.test(11));
		
		BiPredicate<Integer,Integer> biPre=(a,b)->a-b==1;
		System.out.println(biPre.test(5, 4));
		
		Runnable r=()->System.out.println("run metod");
		r.run();
		
	}
}
