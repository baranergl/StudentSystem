
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class main {
	public static void main(String arg[]) {
		System.out.println("Enter number of students to enroll ");
		Scanner in = new Scanner(System.in);
		int numberOfStundents = in.nextInt();
		StudentSystem[] students = new StudentSystem[numberOfStundents];
		
		for(int i = 0; i < numberOfStundents; i++) {
			
			students[i] = new StudentSystem();
			students[i].enrollment();
			students[i].payTuition();
			students[i].showInfo();
			
		}
		
	}
}
