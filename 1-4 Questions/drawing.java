public class drawing {
    public static void main(String[] args) {

        int i, j, s;

        // Using while loop 
        i = 0;
        while (i < 5) {
            j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println(); // empty line between patterns

        

        //Usinf for loop
		int row = 5;
		for (i=0;i<=5;i++){
			
			for (s=0;s<=row-i;s++){
				System.out.print(" ");
			}
			
			for (j=0;j<i;j++){
				System.out.print("* ");
			}
			System.out.println(); // next line
		}
        
    }
}

    

