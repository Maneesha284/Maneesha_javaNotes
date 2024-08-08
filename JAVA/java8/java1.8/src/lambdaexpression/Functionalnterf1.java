package lambdaexpression;
@FunctionalInterface
interface interf3 {
	void say(String msg);

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class Functionalnterf1 implements interf3 {

	public static void main(String[] args) {

		interf3 in = (msg) -> {
			System.out.println("lambda " + msg);
		};
		in.say("hi");
		/*
		 * Functionalnterf1 i = new Functionalnterf1(); i.say("hi");
		 */
	}

	@Override
	public void say(String msg) {
		System.out.println("Override " + msg);

	}

}
