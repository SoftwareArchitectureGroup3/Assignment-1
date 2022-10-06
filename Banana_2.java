import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Banana_2 implements Banana {

    @Override
    public void setBananaPrice() {
        String line="";
        try {
            line = Files.readAllLines(Paths.get("src/File1.txt")).get(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);
    }
    public String toString(){
        return "Banana2";

    }
}
