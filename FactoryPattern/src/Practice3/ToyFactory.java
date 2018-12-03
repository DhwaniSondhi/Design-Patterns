package Practice3;

public class ToyFactory {

    public static Toy getToy(String toyName){
        if("Car".equalsIgnoreCase(toyName)){
            return new Car();
        }else if("Helicopter".equalsIgnoreCase(toyName)){
            return new Helicopter();
        }else if("JumpingFrog".equalsIgnoreCase(toyName)){
            return new JumpingFrog();
        }
        return null;
    }
}
