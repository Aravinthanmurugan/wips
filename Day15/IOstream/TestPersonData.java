package IOstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestPersonData {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("Aravinthan","Kabbadi", "Chennai, Tamil Nadu");		// ObjectOutputStream---> writing the stream
		System.out.println(p);
		

		
		try(ObjectOutputStream outstream = 
				new ObjectOutputStream(new FileOutputStream("C://Users//Administrator//Desktop//Aravinthan/Daily Tasks//Day15//data//person.txt"))){
			
			
			outstream.writeObject(p);// ObjectInputStream ---> reading the stream
			System.out.println("Person object data is written to file...");
			
		}
		catch(Exception e) {
			
		}
	}
}
