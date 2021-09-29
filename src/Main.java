public class Main {
    public static void main(String[] args) {

        PrintUsage printUsage = new PrintUsage();
        AddNewTask addNewTask = new AddNewTask();
        PrintSourceList printSourceList = new PrintSourceList();
        RemoveTask removeTask = new RemoveTask();

        if (args.length == 0) {

            printUsage.printUsageArguments();

        } else {
            switch (args[0]) {
                case "-l":
                    printSourceList.printSourceList();
                    break;

                case "-a":

                    String arg = args[1];
                    addNewTask.addNewTask(arg);

                    break;

                case "-r":

                    try {
                        try {
                            int argNumber = Integer.parseInt(args[1]);
                            removeTask.removeTask(argNumber);
                        } catch (NumberFormatException exception) {
                            System.out.println("Unable to remove: index is not a number.");
                        }

                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Unable to remove: no index provided.");
                    }

                    break;

                case "-c":
                    System.out.println("Completes a task");
                    break;

                default:
                    printUsage.printUsageArguments();
                    break;
            }
        }
    }
}
