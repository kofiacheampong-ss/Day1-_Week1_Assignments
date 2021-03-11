// import java.io.File;
// import java.util.Arrays;

import java.io.File;
import java.util.Scanner;

/******
/**
 * 
 * @author Kofi Acheampong
 *
 */

public class ListDirectory {

    public static String getPath() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter directory path start with 'C:/' ");
        String directory = myObj.nextLine();
        return directory;
    }

    public static void main(String[] args) {

        File myObj = new File(getPath());
        String[] files = myObj.list();
        System.out.println("Here are the files in this directory: ");

        for (String file : files) {
            System.out.println(file);
        }
    }

}






