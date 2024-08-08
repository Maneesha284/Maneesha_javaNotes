package autowire.xml;

public class College {
	String clgName;
	Student std;
	
	public College(Student std) {
		super();
		this.std = std;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "College [clgName=" + clgName + ", std=" + std + "]";
	}
	
}
