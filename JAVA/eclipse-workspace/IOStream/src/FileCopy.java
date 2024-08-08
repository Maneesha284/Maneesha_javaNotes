import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) {
		Path source = Paths.get("details.txt");
		Path target = Paths.get("result1.txt");
		try {
			Files.copy(source, target,
			StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println("I/O error");
		}
	}

}
