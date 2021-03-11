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
        System.out.println("Here are the files in that directory: ");

        for (String file : files) {
            System.out.println(file);
        }
    }

}





/*

public class ListDirectory
{
  public static void main(String[] args)
  {
    // create a file that is really a directory
    File aDirectory = new File("C:/");

    // get a listing of all files in the directory
    String[] filesInDir = aDirectory.list();

    // sort the list of files (optional)
    // Arrays.sort(filesInDir);

    // have everything i need, just print it now

    for ( int i=0; i<filesInDir.length; i++ )
    {
      System.out.println( "file: " + filesInDir[i] );


    }
  }
}
*/


