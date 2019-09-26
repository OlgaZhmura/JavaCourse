package cmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChangeDirCommand implements Command {

    private String[] args;

    public ChangeDirCommand(String[] args) {
        this.args = args;
    }

    @Override
    public void execute(Context context) throws IOException {
        if (args.length != 2) {
            System.out.println("ChangeDirCommand expected 1 argument");
            return;
        }
        Path newPath = Paths.get(args[1]);
        if (!newPath.isAbsolute()) {
            newPath = context.getPath()
                             .resolve(newPath)
                             .normalize()
                             .toAbsolutePath();
        }
        if (Files.isDirectory(newPath)) {
            context.setPath(newPath);
        } else {
            System.out.println("This path isn't exist " + newPath);
        }
    }
}