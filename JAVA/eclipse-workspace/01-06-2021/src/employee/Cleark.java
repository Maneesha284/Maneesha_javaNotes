package employee;

public class Cleark extends Employee  {
	int speed;
	int accuracy;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public Cleark(String ename, int empid, double salary, int speed, int accuracy) {
		super(ename, empid, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}
	double setSalary() {
		double sal =0;
		if(speed > 70 && accuracy > 80) {
			sal = salary+1000;
		}
		else if(speed > 75 && accuracy > 85) {
			sal = salary+2000;
		}
		else {
			sal=salary;
		}
		return sal;
		
	}

	@Override
	public String toString() {
		return "Cleark [speed=" + speed + ", accuracy=" + accuracy + ", ename=" + ename + ", empid=" + empid
				+ ", salary=" + salary + "]";
	}
	
}
