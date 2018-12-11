package Practice2;

public abstract class CarDecorator extends Car {

    protected final Car car;
    protected CarDecorator(Car car){
        this.car=car;
    }
    @Override
    public void assemble(){
        car.assemble();
    }
    @Override
    public String getParts(){
        return car.getParts();
    }
    @Override
    public int getCost(){
        return car.getCost();

    }
}
