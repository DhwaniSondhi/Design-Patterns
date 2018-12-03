package Practice3;

public class FactoryDriver {

    public static void main(String[] args){
        Toy toy;

        toy=ToyFactory.getToy("35cad","Delhi", "Car");
        toy.price();
        toy.prepare();

        toy=ToyFactory.getToy("40cad","Canada", "Helicopter");
        toy.price();
        toy.prepare();

        toy=ToyFactory.getToy("20cad","Harayana", "JumpingFrog");
        toy.price();
        toy.prepare();
    }
}
