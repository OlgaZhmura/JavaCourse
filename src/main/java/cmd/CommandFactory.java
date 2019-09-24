package cmd;

public class CommandFactory {
    public Command getCommand (String input) {
        String[] str = input.split(" ");
        switch (str[0]){
            case "chdir":
                break;
            case "ls":
                break;
            case "exit":
                break;
        }
        return null;
    }
}
