package project.curd.model;

public class Products {
	int pid;
	String pname;
	int qunatity;
	double price;
	public Products() {
		
	}
	public Products(int pid, String pname, int qunatity, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qunatity = qunatity;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
