package Practice3;

public class DecoratorDriver  {

    public static void main(String[] args){

        Shape circle=new Circle();
        Shape rectangle=new Rectangle();

        System.out.println("............Circle With no color");
        circle.draw();
        System.out.println("\n............Circle With red color");
        circle=new RedShapeDecorator(circle);
        circle.draw();

        System.out.println("\n............rectangle With no color");
        rectangle.draw();
        System.out.println("\n............rectangle With red color");
        rectangle=new RedShapeDecorator(rectangle);
        rectangle.draw();
    }
}
