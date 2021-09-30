import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddNewTask {

    public void addNewTask(String arg) {


        Path path = Paths.get("src/todolist.txt");

        try {
            try {
                File file = new File(path.toString());
                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write("\n" + "[ ] " + arg);
                fileWriter.close();
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Unable to add: no task provided");
            }

        } catch (
                IOException e) {
            System.out.println("file not found");
        }
    }
}