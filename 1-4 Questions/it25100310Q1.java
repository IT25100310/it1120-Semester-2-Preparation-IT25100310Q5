//Question 1

public class it25100310Q1{
	public static void main (String[]args){
		
		//Declare variables
		int miles = 26;
		int yards = 385;
		double kilometers = 0;
		
	kilometers = (miles*1.609) + (yards/1760.0)*1.609;
	System.out.print("\n26m 385y equal to : "+kilometers+" KM\n");	
		
	}
}
