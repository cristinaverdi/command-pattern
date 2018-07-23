package commandexample.turnontv;

import commandexample.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressPowerButton() {
        this.command.execute();
    }
}
