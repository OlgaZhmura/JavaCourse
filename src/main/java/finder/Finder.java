package finder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Finder {
    public void find(String path, String expression) {
        try {
            Files.walkFileTree(Paths.get(path), new ExpressionSearcher(expression));
        } catch(IOException io) {
            System.out.println("Oops, something went wrong! " + io);
        }
    }

    public static void main(String[] args) {
        Finder finder = new Finder();

        if (args.length != 2) {
            System.out.println("Sorry, but you should write a path and/or an expression! Please, try again");
            return;
        }
        if (!Files.isReadable(Paths.get(args[0]))) {
            System.out.println("The path isn't correct, pleas, try again!");
        }
        finder.find(args[0], args[1]);
    }
}
