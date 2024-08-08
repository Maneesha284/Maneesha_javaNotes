import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUsingList3 {

	public static void main(String[] args) throws Exception {
		String fname="details.txt";
		
		Path path = Paths.get(fname);
		Files.lines(path).forEach(x->displayDetails(x));
		
	}

	 static void displayDetails(String x) {
		
		String parts[] = x.split(",");
		if((parts.length)<2) {
			return;
		}
		System.out.println(parts[0] +":"+parts[1]);
	}

}
