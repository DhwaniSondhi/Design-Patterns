package Practice4;

public class ShapeGetter {

    public static Shape getShape(String shapeName){
        if("Circle".equalsIgnoreCase(shapeName)){
            return new Circle();
        }else if("Rectangle".equalsIgnoreCase(shapeName)){
            return new Rectangle();
        }else if("Square".equalsIgnoreCase(shapeName)){
            return new Square();
        }
        return null;
    }
}
