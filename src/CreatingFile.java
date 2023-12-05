import java.io.File;
import java.io.IOException;


public class CreatingFile {
    public static void main(String[] args) {
        File f = new File("Desktop\\Coding\\example2.txt");
        try {
            if(f.createNewFile()){
                System.out.println("File Created!");
            } else System.out.println("File could NOT be created!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
