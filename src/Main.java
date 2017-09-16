import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		StudentGroup sg=new StudentGroup(n);
		Student[] s=new Student[n];
		for(int i=0;i<n;i++)
		{	System.out.println("Enter Student data:");
			int id=sc.nextInt();
			String name=sc.next();
			Date d=new Date(sc.next());
			double avg=sc.nextDouble();
			s[i]=new Student(id,name,d,avg);
		}
		sg.setStudents(s);
		Student res[]=sg.getStudents();
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i].getId()+" "+res[i].getFullName()+" "+res[i].getBirthDate()+" "+res[i].getAvgMark());
		}
	}
	

}
