import java.io.File;
import java.sql.SQLOutput;

public class ExistingFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Zaiyn\\Desktop\\Coding\\example.txt");
        if(!f.exists()) {
            System.out.println("The file does not exist");
        } else System.out.println("File found!");

    }
}

