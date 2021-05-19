package refactoring.command.after;

public class Button {
    private Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command command) {
        this.theCommand = command;
    }

    public void pressed() {
        theCommand.execute();
    }
}
