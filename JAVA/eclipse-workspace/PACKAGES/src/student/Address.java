package student;

public class Address {
	private String hno;
	private String colname;
	private String cityname;

	public Address(String hno, String colname, String cityname) {

		this.hno = hno;
		this.colname = colname;
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colname=" + colname + ", cityname=" + cityname + "]";
	}

}
