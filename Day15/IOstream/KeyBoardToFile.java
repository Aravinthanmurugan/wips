package IOstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyBoardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter # to stop ");
		FileWriter filewirte=new FileWriter("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//output.txt");
		String line;
		while(true) {
			line=in.nextLine();
			if(line.equals("#")) {
				break;
			}
			filewirte.write(line+ System.lineSeparator());
		}
		System.out.println("Data Written to File");
	    filewirte.close();
		in.close();
	}

}
