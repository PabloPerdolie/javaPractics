package PracticsSem2.practice08.Command;

public class Command_TurnON implements Command {
    private Light light;

    public Command_TurnON(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnON();
    }
}
