package first;
import java.util.Scanner;
public class GradeStudent {

	public static void main(String[] args) {
		  int score;
	        char grade;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Test Score of a Student:");
	        score = sc.nextInt();
	        
	        if (score >= 90)  
	            grade = 'A'; 
	         else if (score >= 80) 
	            grade = 'B'; 
	         else if (score >= 70)  
	            grade = 'C'; 
	         else if (score >= 60)  
	            grade = 'D'; 
	         else 
	            grade = 'F'; 
	         
	        System.out.println("According to "+score+" Grade is: " + grade); 
	    
	        
	    }
	    


		}

	


