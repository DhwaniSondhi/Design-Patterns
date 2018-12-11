package Practice2;

public class BasicCar extends Car {

    @Override
    public void assemble(){
    }
    @Override
    public String getParts(){
        return "WHeels, body";
    }
    @Override
    public int getCost(){
        return 1000;

    }
}
