package IOstream;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//Fileinput.txt");
		int charact;
		while((charact=reader.read())!=-1) {
			System.out.print((char) charact);
		}
		reader.close();
	}

}
