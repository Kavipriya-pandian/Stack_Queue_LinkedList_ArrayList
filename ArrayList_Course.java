package Week3_Assignment;

import java.util.ArrayList;

public class ArrayList_Course
	{
		private String courseName;
		//private String[] students = new String[100];
		ArrayList<String> students=new ArrayList<String>();
		private int numberOfStudents;
		public void Course(String courseName) 
		{
		this.courseName = courseName;
		}
		
		 public void addStudent(String student) 
		 { 
			 students.add(student);
		 }
		
		 public String[] getStudents() { 
		return students.toArray(new String[students.size()]);
		}
		
		 public int getNumberOfStudents() { 
		 return students.size();
		 }
		
		 public String getCourseName() {
		 return courseName;
		 }
		
		 public void dropStudent(String student) { 
		 // Left as an exercise in Programming Exercise 
			 students.clear();
		 }
}


{

}
