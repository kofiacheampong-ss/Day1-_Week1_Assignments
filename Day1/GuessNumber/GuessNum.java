import java.util.Scanner;  // Import the Scanner class
import java.util.Random; 

/***** 

Author: Kofi Acheampong

Description: 

1) User is asked a question to guess a number (may be between 1-100)

2) if the number he guesses is within 10 numbers plus or minus of the number the java program has, then exit out and give the answer

3) if the number he guesses is not within 10 numbers, ask the user to keep trying and give him more chances.

4) if he is not able to guess within 5 chances, exit and display 'Sorry’ with the number.
5) Example: Random # generated is 63

6) User’s guess must be between 53 to 73.

****/

  
public class GuessNum { 

    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int ranNum = (int)(Math.random() * (max - min + 1) + min);
        int upperTen = ranNum + 10;
       	int lowerTen = ranNum - 10;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        
        while(count < 5) {
        	System.out.println("Pick a number between 1-50: ");
            int guess = scan.nextInt();
            
            if (guess < 1 || guess > 50) {
                System.out.println("You need to pick a number between 1-50!");
            } else {
                if (guess > lowerTen && guess < upperTen) {
                    System.out.printf("Pretty Close! The random number is %d\n" , ranNum );
                    break;
                } else {
                    count++;
                    if (count >= 5) {
                        System.out.printf("Sorry, not correct!  The random number is: %d\n", ranNum);
                    } else {
                        System.out.println("You are far off! Try again.");    
                    }                   
                }
            }
        }
        

        scan.close();
    }

}






  
           
        	
        
   		

