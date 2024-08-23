package Task3;

public class Circle implements Shape{
    @Override
    public void draw() {


        float r = 10F;
            float diameter = 2 * r + 1;
            for (int i = 0; i < diameter; i++) {
                for (int j = 0; j < diameter; j++) {
                    float x = i - r;
                    float y = j - r;
                    if (x * x + y * y <= r * r + r * 0.8) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
    }
}
