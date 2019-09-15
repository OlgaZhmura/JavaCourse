package finder;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.MalformedInputException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class ExpressionSearcher extends SimpleFileVisitor<Path> {
    private final String expression;

    public ExpressionSearcher(String expression) {
        this.expression = expression;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException
    {
        try(BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            int countLines = 0;
            boolean isNotPrintFileName = true;

            while ((line = reader.readLine()) != null) {
                if (line.contains(expression)) {
                    if (isNotPrintFileName) {
                        System.out.println(file.toAbsolutePath().toString());
                        isNotPrintFileName = false;
                    }
                    System.out.printf("\t\n%d: %s", countLines, line);
                }
                countLines++;
            }
        } catch(CharacterCodingException ex) {
            //do nothing
        }
        return FileVisitResult.CONTINUE;
    }
}
