import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintSourceList {

    public void printSourceList(){
        Path path = Paths.get("src/todolist.txt");

        try {
            List<String> list = Files.readAllLines(path);
            if (list.isEmpty()) {
                System.out.println("No todos for today! :)");
            } else {
                for (int line = 0; line < list.size(); line++) {
                    System.out.println(line + 1 + " - " + list.get(line));
                }
            }

        } catch (IOException ex) {
            System.out.println("file not found");
        }
    }
}
