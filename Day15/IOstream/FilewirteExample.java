package IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FilewirteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileOutputStream filewirte=new FileOutputStream("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//output.txt");
		String str = "Hello, welcome to World";
		filewirte.write(str.getBytes());
		System.out.println("Data written to file");
		filewirte.close();
	}

}
