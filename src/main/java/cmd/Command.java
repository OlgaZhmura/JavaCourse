package cmd;

import java.io.IOException;

public interface Command {
    void execute(Context context) throws IOException;
}
