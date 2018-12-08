package Practice3;

public class Helicopter extends Toy {

    private String price;
    private String location;
    private String name;

    public Helicopter(String price,
               String location){
        this.price=price;
        this.location=location;
        this.name="Helicopter";
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
