package cmd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ListCommand implements Command {

    @Override
    public void execute(Context context) throws IOException {
        List<Path> files = Files.list(context.getPath()).collect(Collectors.toList());

        for (Path file : files) {
//            if (Files.isDirectory(file)) {
//                System.out.printf("\t<dir>: %s\n", file.getFileName());
//            } else {
//                System.out.printf("\t<file>: %s\n", file.getFileName());
//            }
            System.out.printf("\t<%s>: %s\n", Files.isDirectory(file) ? "dir" : "file", file.getFileName());
        }
    }
}
