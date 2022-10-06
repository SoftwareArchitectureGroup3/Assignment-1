import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Banana_1 implements Banana{

    @Override
    public void setBananaPrice() {
        String line="";
        try {
            line = Files.readAllLines(Paths.get("src/File1.txt")).get(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

    }
    public String toString(){
        return "Banana1";

    }
}
