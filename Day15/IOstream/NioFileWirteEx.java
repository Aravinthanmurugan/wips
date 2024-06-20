package IOstream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class NioFileWirteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//niowrite.txt");
		try {
			Files.write(path,  Arrays.asList("hello ","Welcome to world"));
			System.out.println("data written");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
