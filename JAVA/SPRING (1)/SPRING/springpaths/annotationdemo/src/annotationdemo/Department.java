package annotationdemo;

public class Department {
	
	private String deptId;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private String deptName;
	
	@MyAnnotation(name1="this is method for processing employee salaries", value="IT")
	public void processEmployeeSalaries(){
		System.out.println("processing emp salaries");
	}
			

}
