import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AttachDirectoryText {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/achea/filename.txt");
            FileWriter myWriter = new FileWriter(file, true);
            myWriter.write(" " + "You just wrote to this file!");
            System.out.println("Thanks! Append complete. ... Good Bye");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("You Made an Error.");
            e.printStackTrace();
        }
    }


}