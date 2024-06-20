package IOstream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFileReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//nioread.txt");
		try {
			List<String> data = Files.readAllLines(path);
			data.forEach(System.out::println);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
