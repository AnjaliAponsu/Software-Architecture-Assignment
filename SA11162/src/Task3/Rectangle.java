package Task3;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        int x;
        int y;
        for (x=0; x<4; x++){
            for (y=0; y<6; y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
