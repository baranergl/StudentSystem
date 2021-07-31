import java.util.Scanner;

public class StudentSystem {
	private String firstName;
	private String lastName;
	private String studentID;
	private int gradeYear;
	private String courseName = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	public StudentSystem() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first name: ");
		this.firstName = in.nextLine();
		System.out.println("Enter the last name: ");
		this.lastName = in.nextLine();
		System.out.println("1 - Freshman \n2 - Sophmore \n3 - Junior \n4 - Senior \n Enter student class number");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
	
		setStudentId();
		
	}
	
	private void setStudentId() {
		id++; 
		this.studentID = gradeYear + "" + id; 
		
	}
	public void enrollment() {
		do{
			System.out.print("Enter the course name to enroll (Enter Q if you want to quit) ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")){
				courseName = courseName  +course;
				tuitionBalance = tuitionBalance + costOfCourse;
				System.out.println(course);
			}
			else {
				break;	
			}
		} while (1 != 0);
	
		
	} 
	public void viewBalance(){
		System.out.println("Your balance is " + tuitionBalance + "$");
	}
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of " + payment + "$");
		viewBalance();
		
	}
	public void showInfo() {
		System.out.println("Name : " + firstName + " " + lastName +
				" \nGrade Level : " + gradeYear + " \nSutdent ID: " + studentID +
				" \nCourses Enrolled : " + courseName + 
				" \nBalance : " + tuitionBalance + "$"); 
	}
}