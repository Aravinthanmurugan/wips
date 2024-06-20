package IOstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadPersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ObjectInputStream instream = 
				new ObjectInputStream(new FileInputStream("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//person.txt"))){
			
			
			Person p = (Person) instream.readObject();
			System.out.println(p);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
