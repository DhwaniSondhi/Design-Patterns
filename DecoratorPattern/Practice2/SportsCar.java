package Practice2;

public class SportsCar extends CarDecorator{

    protected SportsCar(Car car){
        super(car);
    }
    @Override
    public void assemble(){
        super.assemble();
    }
    @Override
    public String getParts(){
        return super.getParts()+", Racing Tyres";
    }
    @Override
    public int getCost(){
        return super.getCost()+200;

    }
}
