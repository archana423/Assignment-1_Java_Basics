package myproject;
import java.util.*;
public class GradesAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int s=0;
	    int numStudents;
	    Scanner sc=new Scanner(System.in);
	   
	    System.out.println("enter the number of students");
	    
	    numStudents=sc.nextInt();
	   int grades[]=new int[numStudents];
	    System.out.println("enter the grades");
	   for(int i=0;i<grades.length;i++)
	   {
	       grades[i]=sc.nextInt();
	       if(grades[i]<0 || grades[i]>100)
	       System.out.println("invalid,try again");
	       else
	       s=s+grades[i];
	       
	   }
	   double a=s/numStudents;
	   System.out.println("avg"+a);
	}
}




