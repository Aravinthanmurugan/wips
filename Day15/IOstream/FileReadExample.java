package IOstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream filein=new FileInputStream("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//output.txt");
		int charct;
		while((charct=filein.read())!=-1) {
			System.out.print((char)charct);
		}
		filein.close();
	}

}
