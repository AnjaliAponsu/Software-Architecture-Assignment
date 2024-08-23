package Task2;

public class Coffee extends Beverages{
    @Override
    public void brew(){
        System.out.println("Dripping coffee through filter");

    }
    @Override
    public void addCondiments() {
        System.out.println("Adding suger and milk");

    }
    @Override
    public void addExtras() {
        System.out.println("Adding vanilla syrup");
    }
}
