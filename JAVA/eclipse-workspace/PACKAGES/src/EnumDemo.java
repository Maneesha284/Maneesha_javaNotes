enum Operations {
	ADD, SUB, MUL, DIV
}

public class EnumDemo {
	int firstNum, SecondNum;
	Operations ch;

	public EnumDemo(int firstNum, int secondNum, Operations ch) {
		super();
		this.firstNum = firstNum;
		SecondNum = secondNum;
		this.ch = ch;
	}

	String getOperation() {
		String result = "";
		switch(ch){
			case ADD:
				result = "SUM=" +(firstNum+ SecondNum);
				break;
			case SUB:
				result = "SUB=" +(firstNum+ SecondNum);
				break;
			case MUL:
				result = "MUL=" +(firstNum+ SecondNum);
				break;
			case DIV:
				result = "DIV=" +(firstNum+ SecondNum);
				break;
		}
		return result;
		
	}

	public static void main(String[] args) {
		EnumDemo obj=new EnumDemo(32,13,Operations.ADD);
		System.out.println(obj.getOperation());

	}

}
