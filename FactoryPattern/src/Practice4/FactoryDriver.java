package Practice4;

public class FactoryDriver {

    public static void main(String[] args){
        Shape shape;

        shape=ShapeGetter.getShape("Circle");
        shape.draw();

        shape=ShapeGetter.getShape("Rectangle");
        shape.draw();

        shape=ShapeGetter.getShape("Square");
        shape.draw();
    }
}
