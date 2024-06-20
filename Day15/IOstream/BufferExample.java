package IOstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter brw = new BufferedWriter(new FileWriter("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//BufferReadWrite.txt"))
			){
			
			System.out.println("Enter exit to quit");
			String line;
			while(true) {
				line = br.readLine();
				if(line.equalsIgnoreCase("exit")) {
					break;
				}
				brw.write(line);
				brw.newLine();
				//System.out.println("Entered Line : "+line);
			}
		}

		catch(IOException e) {
			System.out.println(e);
		}
	}

}
