package Task1;

public class KitchenRoomLight implements Light{
    private int brightness;

    @Override
    public void on() {
        System.out.println("Kitchen Room Light is ON at full brightness");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room light is OFF");
    }

    @Override
    public void dim(int level) {
        this.brightness=level;
        System.out.println("Kitchen Room  light dimmed to "+ level+"%.");
        System.out.println("Kitchen Room light dimmed to 100%.");
    }

    public int getBrightness() {
        return brightness;
    }
}
