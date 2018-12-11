package Practice3;

public class RedShapeDecorator extends ShapeDecorator  {

    protected RedShapeDecorator(Shape shape){super(shape);}
    @Override
    public void draw(){
        super.draw();
        setBorder();
    }
    void setBorder(){
        System.out.println(" of red border");
    }
}
