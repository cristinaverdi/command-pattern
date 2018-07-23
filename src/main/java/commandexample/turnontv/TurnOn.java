package commandexample.turnontv;

import commandexample.Command;

public class TurnOn implements Command {

    private Tv tv;

    public TurnOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
