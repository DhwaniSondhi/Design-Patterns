package Practice3;

public class JumpingFrog extends Toy {

    private String price;
    private String location;
    private String name;

    public JumpingFrog(String price,
               String location){
        this.price=price;
        this.location=location;
        this.name="Jumping Frog";
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
