package Practice2;

public class FactoryDriver {

    public static void main(String[] args){
        Dog dog;

        dog=DogFactory.getDog("Poodle");
        dog.speak();
        dog=DogFactory.getDog("Rottweiler");
        dog.speak();
        dog=DogFactory.getDog("SiberianHusky");
        dog.speak();
    }
}
