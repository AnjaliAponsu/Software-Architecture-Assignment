package Task3;

public class Square implements Shape{
    @Override
    public void draw() {
        int i;
        int j;
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
