package Practice2;

public class LuxuryCar extends CarDecorator{

    protected LuxuryCar(Car car){
       super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
    }
    @Override
    public String getParts(){
        return super.getParts()+", Extendable Chairs";
    }
    @Override
    public int getCost(){
        return super.getCost()+250;

    }
}
