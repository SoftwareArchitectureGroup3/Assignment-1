import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Apple_1 implements Apple {


    //The first variant Apple_1 implements the Apple interface 
    //The setApplePrice() method is overridden and the price of Apple 1 is stored
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
