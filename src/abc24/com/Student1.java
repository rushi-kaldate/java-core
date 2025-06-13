package abc24.com;

public class Student1 {
	public static void main(String[] args) {
		
		Student s1= new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.id = 100;s1.name = "Rushi";s1.course = "Java";s1.cgpa = 7.45f;
		s2.id = 101;s2.name = "ram";s2.course = "python";s2.cgpa = 6.45f;
		s3.id = 102;s3.name = "sam";s3.course = "c";s3.cgpa = 5.45f;
		s4.id = 103;s4.name = "sita";s4.course = "c++";s4.cgpa = 8.45f;
		
		Student t[] = new Student[4];
		t[0] = s1;
		t[1] = s2;
		t[2] = s3;
		t[3] = s4;
		
		//for(int i=0;i<t.length;i++)
		int i = 0;
		while(i < t.length) {
			System.out.println(t[i].id+" "+t[i].name+" "+t[i].course+" "+t[i].cgpa);
			++i;
		
		}
		//System.out.println(t[i].id+" "+t[i].name+" "+t[i].course+" "+t[i].cgpa);
//		System.out.println(t[1].id+" "+t[1].name+" "+t[1].course+" "+t[1].cgpa);
//		System.out.println(t[2].id+" "+t[2].name+" "+t[2].course+" "+t[2].cgpa);
//		System.out.println(t[3].id+" "+t[3].name+" "+t[3].course+" "+t[3].cgpa);
	}

}
