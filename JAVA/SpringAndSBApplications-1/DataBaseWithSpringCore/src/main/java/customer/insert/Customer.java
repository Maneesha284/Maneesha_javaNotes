package customer.insert;

public class Customer{
	private int cid;
	private String cname;
	private String address;
	private int age;
	CustomerDaoImpl daoimpl;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
	}
	public Customer(int cid, String cname, String address, int age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + ", age=" + age + "]";
	}
	
	
	
	
}
