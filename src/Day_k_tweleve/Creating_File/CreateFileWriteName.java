package Day_k_tweleve.Creating_File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFileWriteName {
    public static void main(String[] args) {
        String fileName="name.txt";
        String name="kalaiyarasan";
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Admin\\IdeaProjects\\Back_End\\src\\Day_k_tweleve\\Creating_File\\name.txt"+fileName))){
            bw.write(name);
            System.out.println("Name Written in a Created File");
        } catch (IOException e) {
            System.out.println("Some Error Occured:");
            e.printStackTrace();
        }
    }
}
