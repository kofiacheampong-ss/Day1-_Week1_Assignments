public class StarPatterns {
	
	public static void main(String[] args) {	
		
		/******  First Pattern  */
		System.out.print("1)");
		
		/* R*/
		for(int i = 0; i < 5; i++) {
			/*  Column */
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		
			}
		
		    /*  Line  */
			for(int j = 0; j < 9; j++) {
				System.out.print("-");
			}
	
			/******  Second Pattern  */
			System.out.println();
			System.out.println();
			System.out.println("2)");
			
			
			/*  Line  */
			for(int j = 0; j < 10; j++) {
				System.out.print("-");
			}
			
			System.out.println();
			/* Row */			
			for(int i = 5; i > 0; i--) {
				/*  Column */
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				
				}
				
				System.out.println();
				
			}
			
			/******  Third Pattern  */
			System.out.println();
			System.out.println("3)");
			
			int rows = 4, k = 0, c = 10;
			
		
			 for (int i=1; i <= rows; i++) { //outer
		          for(int j=1; j <= (c/2-i); j++)
		          System.out.print(" "); // space
		          
		          for(int k1=1; k1 <= (2*i-1); k1++)
		          System.out.print("*"); // star
		 	 
		          // new line
		          System.out.println();
				      
			      
				  }
			      
			      /*  Line  */
			      for(int j = 1; j < 11; j++) {
					System.out.print("-");
			      }
			      
					
		    /******  Fourth Pattern  */
			System.out.println();	 
			System.out.println();
			System.out.println("4)");
			
			 /*  Line  */
		      for(int j = 1; j < 12; j++) {
				System.out.print("-");
		      }
		      System.out.println();	
				
			 /* Row */
		     for (int i=1; i <= rows; i++) { //outer
		         for(int j=-1; j < 2*rows; j++) //inner
		         if(j < i)
		         System.out.print(" "); // spaces
		         else if(j <= 2*rows-i)
		         System.out.print("*"); // stars
		 	 
		         // new line
		         System.out.println();
		 	 
				      
				 }		      
			}
				      					  
		}



				
	
		
		
				

		
	
	

