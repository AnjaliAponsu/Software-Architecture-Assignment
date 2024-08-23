package Task1;

public class LightDimCommand implements Command{
    private Light light;
    private int brightness;


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    public LightDimCommand(Light light, int newBrightness){
        this.light=light;
        light.dim(newBrightness);
    }
}
