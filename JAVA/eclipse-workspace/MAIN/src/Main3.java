
public class Main3 {

	public static void main(String[] args) {
		/*class Inner{
			public String name;
			public Inner(String s) {
				name = s;
			}
		}
		Object obj=new Inner("InnerTest1");
		Inner t=(Inner)obj;
		System.out.println(t.name);*/
		
		int n=1234, j=0;
		System.out.println(j);
		do {
			
			j=j+(n%10);
			
		}while((n=n/10) != 0);
		
		System.out.println(j);
		

	}

}
