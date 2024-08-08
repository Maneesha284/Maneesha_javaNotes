import java.io.*;

public class DataOutputStream1 {

	

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("primitivedata.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(10);
		dos.writeBoolean(true);
		dos.writeChar('c');
		dos.writeDouble(23.34);
		System.out.println("hello");
		
		try {
			FileInputStream fis = new FileInputStream("primitive.dat");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			
		}
		catch(Exception e) {
			
		}
		
	}

}
