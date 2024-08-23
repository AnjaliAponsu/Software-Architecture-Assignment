package Task3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        for (int i=0; i<6; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
