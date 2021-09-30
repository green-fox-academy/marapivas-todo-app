import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CheckTask {
    public void checkTask(int argNumber) {


        Path path = Paths.get("src/todolist.txt");

        try {
            try {
                List<String> list = Files.readAllLines(path);
                if (list.size() != 0) {
                    String temp = "[X" + list.get(argNumber - 1).substring(2);
                    list.add(argNumber - 1, temp);
                    list.remove(argNumber);
                    Files.write(path, list);
                } else {
                    System.out.println("No todos for today! :)");
                }
            }catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound.");
            }
        } catch (
                IOException e) {
            System.out.println("file not found");
        }
    }
}
