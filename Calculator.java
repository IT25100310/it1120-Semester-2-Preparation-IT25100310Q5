public class Calculator{
	
public static int add (int a,int b){
	return a+b;
}	

public static int multiply (int a,int b){
	return a*b;
}

public static int square (int a){
	return a*a;
	
}

public static void main (String[]args){

   System.out.println( "(3*4+5*7)\u00B2 = "+square( add(multiply(3,4),multiply(5,7))));
    System.out.print( "(4+7)\u00B2 +(8+3)\u00B2 = "+add(square( add (4,7)), square(add(8,3))));	
	
 }

}

