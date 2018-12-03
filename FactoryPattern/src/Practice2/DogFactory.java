package Practice2;

public class DogFactory {

    public static Dog getDog(String dogType){
        if("Poodle".equalsIgnoreCase(dogType)){
           return new Poodle();
        }else if("Rottweiler".equalsIgnoreCase(dogType)){
            return new Rottweiler();
        }else if("SiberianHusky".equalsIgnoreCase(dogType)){
            return new SiberianHusky();
        }
        return null;
    }
}
