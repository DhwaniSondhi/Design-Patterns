package Practice3;

public class FactoryDriver {

    public static void main(String[] args){
        Toy toy;

        toy=ToyFactory.getToy("Car");
        toy.doWork();

        toy=ToyFactory.getToy("Helicopter");
        toy.doWork();

        toy=ToyFactory.getToy("JumpingFrog");
        toy.doWork();
    }
}
