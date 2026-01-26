import java.util.Scanner;
public class demo{
	public static void main (String[]args){
		
		//Scanner object created
		Scanner input = new Scanner (System.in);
		
		//get user input
		System.out.print("Enter a number:- ");
		int num = input.nextInt();
		
		//EvenOddNumber Class Object Created
		EvenOddNumber link = new EvenOddNumber ();
	
		
		if (link.findEvenOrOdd(num))  // true or false
			System.out.print(num+" is Even Number"); //when true
	
	    else 
		    System.out.print(num + " is Odd Number"); //when false
	}
}
