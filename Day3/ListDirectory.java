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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter directory path start with 'C:/' ");
        String directory = scan.nextLine();
        return directory;
    }

    public static void main(String[] args) {

        File scan = new File(getPath());
        String[] files = scan.list();
        System.out.println("Here are the files in that directory: ");

        for (String file : files) {
            System.out.println(file);
        }
    }

}

