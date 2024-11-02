


//TASK(ii)- STUDENT GRADE CALCULATOR
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//getting no. of subs
		System.out.print("Enter the no. of subjects: ");
		int noOfSub = sc.nextInt();
		int totalMarks=0;
		//all necessary variables
		double avgPercent;
		char Grade;
		int n;
		//saving a copy
		n = noOfSub;
		System.out.println();
		//getting sub marks
		System.out.print("Enter the marks(out of 100):");
		int [] marks = new int[100];
		while(noOfSub != 0 ) {
			marks[noOfSub] = sc.nextInt();
			//calculating total score
			totalMarks += marks[noOfSub];
			noOfSub--;
		}
		//calculating percentage
		avgPercent = (double) totalMarks/n;

		//assigning grades
		if(avgPercent >= 90) {
			Grade ='A';
		}
		else if(avgPercent>=80) {
			Grade ='B';
		}
		else if(avgPercent>=70) {
			Grade ='C';
		}
		else if(avgPercent>=60) {
			Grade = 'D';
		}
		else if(avgPercent>=50) {
			Grade = 'E';
		}
		else {
			Grade ='F';
		}

		//displaying details
		System.out.println();
		System.out.println("*****************************");
		System.out.println("         DETAILS             ");
		System.out.println("*****************************");
		System.out.println("Total marks scored: "+totalMarks);
		System.out.println("Percentage: "+avgPercent);
		System.out.println("Grade: "+Grade);
		sc.close();
	}
}
