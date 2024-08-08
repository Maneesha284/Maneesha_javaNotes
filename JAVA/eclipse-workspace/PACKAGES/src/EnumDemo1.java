enum Department{
	Account(12),HR(20),Finanace(22);
	private int deptId;
	public int getDeptId() {
		return deptId;
	}
	Department(int deptId){
		this.deptId=deptId;
	}
}
public class EnumDemo1 {

	public static void main(String[] args) {
		System.out.println("Acc deptno = " + Department.Account.getDeptId());
		System.out.println("HR deptno = " + Department.HR.getDeptId());
		System.out.println("Finanace deptno = " + Department.Finanace.getDeptId());
	}

}
