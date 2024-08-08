import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CountFilesFolders {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\mr21204\\eclipse-workspace\\IOStream");
		CountFolder cf = new CountFolder();
		Files.walkFileTree(path, cf);
		System.out.printf("Folders = %d, Files = %d",cf.getFolders(),cf.getFiles());
		
	}
	static class CountFolder extends SimpleFileVisitor<Path>{
		int folders, files;

		public int getFolders() {
			return folders;
		}

		public int getFiles() {
			return files;
		}
		public FileVisitResult visitFile(Path p, BasicFileAttributes arg) throws IOException{
			files++;
			return FileVisitResult.CONTINUE;
		}
		public FileVisitResult preVisitDirectory(Path p, BasicFileAttributes arg) throws IOException{
			folders++;
			return FileVisitResult.CONTINUE;
		}
		

		
		
	}

}
