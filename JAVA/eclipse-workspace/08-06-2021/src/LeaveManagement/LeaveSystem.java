package LeaveManagement;

import java.util.Scanner;

public class LeaveSystem {
	int totalLeaves;

	public LeaveSystem(int totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	String checkLeaves() throws LeaveQuotaExceededException {
		String result = "";
		int takenLeaves = 15;
		int grantLeaves = 20;
		if ((totalLeaves + takenLeaves) < grantLeaves) {
			result = "Your leave is sanction";
		} 
		else {
			throw new LeaveQuotaExceededException("Leave Quota is Exceeded");
		}
		return result;
	}

	public static void main(String args[]) throws LeaveQuotaExceededException {
		Scanner sr = new Scanner(System.in);
		System.out.println("How many leaves do you want");

		LeaveSystem obj = new LeaveSystem(sr.nextInt());
		String res = obj.checkLeaves();
		System.out.println(res);
	}

}
