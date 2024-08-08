import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ProcessFile extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
		if (file.toString().endsWith(".java")) {
			System.out.println(file);
		}
		return FileVisitResult.CONTINUE;
	}
}

public class FileUsingPath {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\mr21204\\eclipse-workspace\\IOStream");
		Files.walkFileTree(path, new ProcessFile());
	}

}
