package Task1;

public class RemoteControl{
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undo;


    public RemoteControl(int slots) {
        this.onCommand = new Command[slots];
        this.offCommand = new Command[slots];

    }

    public void setCommand(int slot,Command lightOn, Command lightOff) {
        onCommand[slot] =lightOn;
        offCommand[slot] =lightOff;
    }

    public void onButtonWasPressed(int slot) {
        onCommand[slot].execute();
        undo=offCommand[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommand[slot].execute();
        undo =onCommand[slot];

    }

    public void undoButtonWasPressed() {
        undo.execute();

    }
}
