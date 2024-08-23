package Task3;

public class ShapeFactory {
    public ShapeFactory() {

    }

    public Shape getShape(String shapeType) {
        if (shapeType == "SQUARE") {
            return new Square();
        } else if (shapeType == "CIRCLE") {
            return new Circle();
        } else if (shapeType == "RECTANGLE") {
            return new Rectangle();
        } else if (shapeType == "TRIANGLE") {
            return new Triangle();
        } else if (shapeType == "PENTAGON") {
            return null;
        }else {
            System.out.println("Invalid shape type provided");
        }
        return null;
    }
}






