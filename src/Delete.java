import java.io.File;
public class Delete {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Zaiyn\\Desktop\\Coding\\example2.txt");
        if(f.delete()){
            System.out.println("Deleted the file: " + f.getName());
        } else System.out.println("Failed to delete the file!");

    }

}
