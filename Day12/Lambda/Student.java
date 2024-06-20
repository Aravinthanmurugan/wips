package Lambda;

public class Student {
	int halticket;
	String name;
	int subj1;
	int subj2;
	int subj3;
	int subj4;
	int subj5;
	int total;
	double avg;
	@Override
	public String toString() {
		return "Student [halticket=" + halticket + ", name=" + name + ", subj1=" + subj1 + ", subj2=" + subj2
				+ ", subj3=" + subj3 + ", subj4=" + subj4 + ", subj5=" + subj5 + ", total=" + total + ", avg=" + avg
				+ ", res=" + res + "]";
	}
	public int getHalticket() {
		return halticket;
	}
	public void setHalticket(int halticket) {
		this.halticket = halticket;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSubj1() {
		return subj1;
	}
	public void setSubj1(int subj1) {
		this.subj1 = subj1;
	}
	public int getSubj2() {
		return subj2;
	}
	public void setSubj2(int subj2) {
		this.subj2 = subj2;
	}
	public int getSubj3() {
		return subj3;
	}
	public void setSubj3(int subj3) {
		this.subj3 = subj3;
	}
	public int getSubj4() {
		return subj4;
	}
	public void setSubj4(int subj4) {
		this.subj4 = subj4;
	}
	public int getSubj5() {
		return subj5;
	}
	public void setSubj5(int subj5) {
		this.subj5 = subj5;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	String res;
	public Student() {
		
	}
	public Student(int halticket, String name, int subj1, int subj2, int subj3, int subj4, int subj5) {
		super();
		this.halticket = halticket;
		this.name = name;
		this.subj1 = subj1;
		this.subj2 = subj2;
		this.subj3 = subj3;
		this.subj4 = subj4;
		this.subj5 = subj5;
	}
}
