import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {
    public void removeTask(int argNumber){
        Path path = Paths.get("src/todolist.txt");

        try {
            List<String> list = Files.readAllLines(path);
            if (argNumber <= list.size()){
                list.remove(argNumber - 1);
                Files.write(path, list);
            }else{
                System.out.println("Unable to remove: index is out of bound.");
            }


        } catch (IOException e) {
            System.out.println("file not found");
        }

    }
}
