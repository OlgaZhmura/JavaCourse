package cmd;

public class ExitCommand implements Command {

    @Override
    public void execute(Context context) {
        System.exit(0);
    }
}
