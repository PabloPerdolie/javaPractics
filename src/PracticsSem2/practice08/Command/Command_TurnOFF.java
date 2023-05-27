package PracticsSem2.practice08.Command;

public class Command_TurnOFF implements Command {
    private Light light;

    public Command_TurnOFF(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOFF();
    }
}
