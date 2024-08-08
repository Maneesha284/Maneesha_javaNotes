import java.util.Scanner;

public class StudentFee8 {
	private static int calculateHalfYearFee(int tutionFee, int trasportationFee, int examinationFee) {
		int totalfee = (tutionFee + trasportationFee + examinationFee) / 2;
		return totalfee;
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sr.next();
		System.out.println("Enter Tution fee");
		int tutionFee = sr.nextInt();
		System.out.println("Enter Trasportation fee");
		int trasportationFee = sr.nextInt();
		System.out.println("Enter examination fee");
		int examinationFee = sr.nextInt();
		System.out.println(name + " student payable half year Fee: "
				+ calculateHalfYearFee(tutionFee, trasportationFee, examinationFee));

	}

}
