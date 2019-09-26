package cmd;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class CommandLine {
    private CommandFactory commandFactory = new CommandFactory();
    private Context context = new Context();

    public void run(Scanner scanner) {
        context.setPath(Paths.get("").toAbsolutePath()); //current path
        do {
            System.out.printf("<%s> ", context.getPath());
            String input = scanner.nextLine();
            try {
                commandFactory.getCommand(input).execute(context);
            } catch (IOException ex) {
                System.out.println("Something went wrong " + ex.getMessage());
            }
        } while (true);
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();
        commandLine.run(new Scanner(System.in));
    }
}
