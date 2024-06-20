package IOstream;

import java.io.Serializable;

public class Person  implements Serializable{
	String name;
	String hobbies;
	String address;
	public Person(String name, String hobbies, String address) {
		super();
		this.name = name;
		this.hobbies = hobbies;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", hobbies=" + hobbies + ", address=" + address + "]";
	}

}
