package IOstream;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directPath ="C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//";
		Path direct = Paths.get(directPath);
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(direct)){
			
			for(Path entry:stream) {
				System.out.println(entry.getFileName());
			}
			
		}
		catch(Exception e) {
			
		}
	}

}
