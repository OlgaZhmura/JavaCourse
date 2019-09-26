package cmd;

import java.io.IOException;

public class UnknownCommand implements Command {

    @Override
    public void execute(Context context) throws IOException {
        System.out.println("It's an unknown command");
    }
}
