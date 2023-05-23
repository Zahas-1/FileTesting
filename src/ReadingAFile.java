import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingAFile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Zaiyn\\Desktop\\Coding\\example2.txt");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Error - can't find anything to read");
            e.printStackTrace();
        }

        }
}
