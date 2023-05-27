package PracticsSem2.practice08.Command;

public class Invoker {
    private Command TurnON;
    private Command TurnOFF;
    public Invoker(Command TurnON, Command TurnOFF){
        this.TurnON=TurnON;
        this.TurnOFF=TurnOFF;
    }
    public void Turn_on(){
        TurnON.execute();
    }
    public void Turn_off(){
        TurnOFF.execute();
    }
}
