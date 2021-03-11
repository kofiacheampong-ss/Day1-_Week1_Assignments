import java.util.Scanner;
/******
/**
 * 
 * @author Kofi Acheampong
 *
 */



public class MultiVal {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hi! How many values would you like to add? ");

        int amount = user.nextInt();
        int total = 0;

        for (int i=0; i < amount; i++) {
            try {
                System.out.println("Value: ");
                int val = user.nextInt();
                total += val;
                
            }  catch(NumberFormatException e){
                System.out.println("Invalid Input: " + e);
            
            }
        }

            System.out.println("Thanks! Here's the sum of those values " + total + " ... Good Bye");

        }

    }



