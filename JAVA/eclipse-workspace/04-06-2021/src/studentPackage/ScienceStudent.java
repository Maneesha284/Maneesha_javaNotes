package studentPackage;

public class ScienceStudent extends Student {
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	public int getPercentage() {
		System.out.println("Enter physicsMarks, chemistryMarks and mathsMarks");
		physicsMarks=sr.nextInt();
		chemistryMarks=sr.nextInt();
		mathsMarks=sr.nextInt();
		int total = physicsMarks+chemistryMarks+mathsMarks;
		int percentage = total/3;
		return percentage;
		
	}
	
	
}
