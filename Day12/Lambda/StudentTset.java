package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class StudentTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Student> c1 = s -> {
			System.out.println("Student hallticket : "+s.getHalticket());
			System.out.println("Name of Student : "+s.getName());
			System.out.println("Subject-1 : "+s.getSubj1());
			System.out.println("Subject-2 : "+s.getSubj2());
			System.out.println("Subject-3 : "+s.getSubj3());
			System.out.println("Subject-4 : "+s.getSubj4());
			System.out.println("Subject-5 : "+s.getSubj5());
			System.out.println("Total : "+s.getTotal());
			System.out.println("Average : "+s.getAvg());
			System.out.println("Result : "+s.getRes());
			
		};
		Function<Student, Student> f = s -> {
			s.total = s.subj1 + s.subj2 + s.subj3+s.subj4+s.subj5;
			s.avg = s.total / 5;
			if (s.avg >=85)
				s.res="Topper";
			else if (s.avg >= 70 && s.avg <= 85)
				s.res = "First Class";
			else if (s.avg >= 60 && s.avg < 70)
				s.res = "Second class";
			else if (s.avg >= 50 && s.avg < 60)
				s.res = "Third Class";
			else
				s.res = "Fail";

			return s;
		};
		
	Student s1 = new Student(1001,"kumar",79,71,74,88,67);
	Student s2 = new Student(1002,"sunil",63,67,64,98,73);
	Student s3 = new Student(1003,"anil",59,57,54,77,60);
	
	c1.accept(f.apply(s1));
	c1.accept(f.apply(s2));
	c1.accept(f.apply(s3));
	}

}
