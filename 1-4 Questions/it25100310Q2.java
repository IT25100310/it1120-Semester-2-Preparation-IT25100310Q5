public class it25100310Q2{
	public static void main (String[]args){
		
		//Define 
		int[] A =  {10, 20, 30, 40, 50};
		int[] B =  {34, 67, 12, 89, 12};
		int[] C = new int[5];
		
		//add sum to each index
		for (int i =0; i<5; i++){
			C[i] = A[i]+B[i];
			}
		
		//print C Arry
		System.out.print("Array - [");
		for (int i=0; i<5;i++){
			System.out.print(C[i]);
			if (i<(5-1)){
				System.out.print(",");
			}
		}
	System.out.print("]");
		
	}
}