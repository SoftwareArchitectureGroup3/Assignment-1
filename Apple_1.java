import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Apple_1 implements Apple {


    @Override
    public void setApplePrice() {
        String line="";
        try {
            line = Files.readAllLines(Paths.get("src/File1.txt")).get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);

    }
    public String toString(){
        return "Apple1";

    }
}
