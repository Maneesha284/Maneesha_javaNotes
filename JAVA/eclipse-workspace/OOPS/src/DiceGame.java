import java.util.*;

class Dice {
	int faceValue;

	public void roll() {
		Random r = new Random();
		faceValue = r.nextInt(6) + 1;

	}
}

class Player {
	String pName;

	int pValue;

	void accept(String pName) {
		this.pName = pName;
	}

	void throwDice(Dice d1, Dice d2) {
		d1.roll();
		d2.roll();
		pValue = d1.faceValue + d2.faceValue;
		System.out.println(pValue + "=" + d1.faceValue + "+" + d2.faceValue);
	}
}

public class DiceGame {

	public static void main(String[] args) {
		String Player1;
		String Player2;
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Player p1 = new Player();
		Player p2 = new Player();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first player name ?");
		p1.accept(sc.next());
		System.out.println("Enter second player name ?");
		p2.accept(sc.next());
		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		String res = "";
		if (p1.pValue > p2.pValue) {
			res = p1.pName + " wins the game";
		} else if (p2.pValue > p1.pValue) {
			res = p2.pName + " wins the game";
		} else {
			res = "Plz try again";
		}
		System.out.println(res);

	}

}