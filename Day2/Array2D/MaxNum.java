import java.util.*;

public class MaxNum {
    
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] data = new int[5][5]; // empty 2D array
        
        // fill the array with random numbers
        for(int i = 0; i < data.length; i++) { // column
            for(int j = 0; j < data.length; j++) { // row
                data[i][j] = rand.nextInt(100);

                // print matrix
                System.out.print(data[i][j] + " ");
            }

            System.out.println();

        }


        // calculate the max number
        int counter = 0;
        int sum = 0;
        int max = data[0][0];

        for(int i = 0; i < data.length; i++) { // column
            for(int j = 0; j < data.length; j++) { // row
                if (max < data[i][j]) {
                    max = data[i][j];
            
            }

            // calculate the sum and average
            sum = sum + data[i][j];
            counter++;

            }
        }
        
        System.out.println();
        System.out.println("Max number is: " + max);

    }
}
    




