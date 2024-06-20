package IOstream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//Filewrite.txt");
		writer.write("Hello, world \n");
		writer.write("This is writer example \n");
		writer.write("Java I/O is best for IO Streams \n");
		writer.close();
		System.out.println("Data written to fiels");
	}

}
