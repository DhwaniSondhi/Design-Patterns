public class ShapeGetter {

    public void getShape(String shapeInput){
        Shape shape;
        if(shapeInput.equalsIgnoreCase("Circle")){
            shape=new Circle();
        }else if(shapeInput.equalsIgnoreCase("Square")){
            shape=new Square();
        }else{
            shape=new Rectangle();
        }
        shape.draw();
    }
}
