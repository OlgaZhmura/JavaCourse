package cmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ChangeDir implements Command {

    private Path path;

    public ChangeDir(Path path) {
        this.path = path;
    }

    @Override
    public void execute(Context context) throws IOException {
        Path newPath;
        if (path.isAbsolute()) {
            newPath = path;
        } else {
            newPath = context.getPath().resolve(path).toAbsolutePath();
        }
        if (Files.isDirectory(newPath)) {
            context.setPath(newPath);
        } else {
            System.out.println("This path isn't exist " + newPath.toString());
        }
    }
}
