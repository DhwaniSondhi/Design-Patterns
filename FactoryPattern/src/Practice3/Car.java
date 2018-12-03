package Practice3;

public class Car extends Toy {

    private String price;
    private String location;
    private String name;

    public Car(String price,
             String location){
        this.price=price;
        this.location=location;
        this.name="Car";
    }

    @Override
    public String getPrice(){
        return this.price;
    }

    @Override
    public String getLocation(){
        return this.location;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
