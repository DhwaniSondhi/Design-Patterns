package Practice3;

public class ToyFactory {

    public static Toy getToy(String price, String location,  String toyName){
        if("Car".equalsIgnoreCase(toyName)){
            return new Car( price, location);
        }else if("Helicopter".equalsIgnoreCase(toyName)){
            return new Helicopter(price, location);
        }else if("JumpingFrog".equalsIgnoreCase(toyName)){
            return new JumpingFrog(price, location);
        }
        return null;
    }
}
