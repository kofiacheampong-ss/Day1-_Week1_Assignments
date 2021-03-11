import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner; 

public class CharCount {

    public static int charcount(String data, char searched, int index) {
        if (index >= data.length()){
            return 0;
        }

        int count = data.charAt(index) == searched ? 1 : 0;
        return count + charcount(data, searched, index + 1);

    }

    public static void main(String[] args) {
        try {
            File file = new File("/Users/acheam/filename.txt");
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Character To Count: ");
                String character = scan.nextLine();
                char c = character.charAt(0);

                int occur = charcount(data, c, 0);
                System.out.println(occur);
                }
                myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}