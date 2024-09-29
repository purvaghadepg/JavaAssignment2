/*
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
*/

public class Main {
    
	public static void main(String[] args)
	 {
        // Outer loop for each row (numbers 1 to 5)
       
		 for (int i = 1; i <= 5; i++)
		 {
            // Inner loop to print the same number 5 times
      
		      for (int j = 1; j <= 5; j++) 
		     {
 
		               System.out.print(i + " ");
       
		     }
            // Move to the next line after printing each row
            		System.out.println();

	                 }

    	}

}