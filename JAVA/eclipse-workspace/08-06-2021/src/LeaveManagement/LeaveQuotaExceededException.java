package LeaveManagement;

public class LeaveQuotaExceededException extends Exception{
	public LeaveQuotaExceededException(String msg) {
		super(msg);
	}
}
