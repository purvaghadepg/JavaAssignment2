/*
• 1 2 3 4 
• 1 2 3 4 
• 1 2 3 4 
• 1 2 3 4
*/

public class Main 
{
   
 	public static void main(String[] args)
	 {
        // Loop for each row
       
 		for (int i = 0; i < 4; i++) 
		{
            // Print the bullet point
           
		      System.out.print("• ");
	     
            // Loop to print numbers 1 to 4
   
		         for (int j = 1; j <= 4; j++)
 		           {
              
			  System.out.print(j + " ");
		
            }
            // Move to the next line after printing each row
            		System.out.println();

        	}	

    }

}