import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Banana_1 implements Banana{
    
    //The first variant Banana_1 implements the Banana interface 
    //The setBananaPrice() method is overridden and the price of Banana 1 is stored
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
