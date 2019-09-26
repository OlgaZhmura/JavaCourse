package cmd;

import java.io.IOException;

public class EchoCommand implements Command {
    private String[] args;

    public EchoCommand(String[] args) {
        this.args = args;
    }

    @Override
    public void execute(Context context) throws IOException {
        if (args.length == 2) {
            System.out.println(args[1]);
        } else {
            System.out.println("");
        }
    }
}
