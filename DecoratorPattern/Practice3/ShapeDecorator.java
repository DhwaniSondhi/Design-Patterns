package Practice3;

public abstract class ShapeDecorator extends Shape  {

    protected final Shape shape;
    protected ShapeDecorator(Shape shape){this.shape=shape;}
    @Override
    public void draw(){
        shape.draw();
    }
}
