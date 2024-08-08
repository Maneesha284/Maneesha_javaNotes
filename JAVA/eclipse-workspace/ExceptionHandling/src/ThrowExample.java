//
//class Notenough extends Exception {
//
//	 Notenough(String string) {
//		super(string);
//	}
//
//}
//
//public class ThrowExample {
//
//	public static void main(String[] args) throws Notenough {
//		int wid=10000,bal=1000;
//		if(bal >= wid) {
//			bal=bal-wid;
//			System.out.println("withdraw done now bal is: "+bal);
//		}else {
//			throw new Notenough("Not enough");
//		}
//
//	}
//
////	public static void main(String[] args) {
////		try {
////			int wid = 10000, bal = 1000;
////			if (bal >= wid) {
////				bal = bal - wid;
////				System.out.println("withdraw done now bal is: " + bal);
////			} else {
////				throw new Notenough("Not enough");
////			}
////
////		} catch (Notenough e) {
////			System.out.println(e.getMessage());
////		}
////	}
//}





class Notenough {

	 Notenough() {
		
		System.out.println("sub cls cons");
	}
	

}

public class ThrowExample extends Notenough{
	ThrowExample(int i){
		super();
		System.out.println("cons call "+i);
		
	}

	public static void main(String[] args)  {
		ThrowExample a =new ThrowExample(2);
	}	
}

