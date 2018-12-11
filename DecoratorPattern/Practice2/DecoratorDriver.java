package Practice2;

public class DecoratorDriver {

    public static void main(String[] args){

        Car basicCar=new BasicCar();
        System.out.println("Basic car"+"\nCost: "+basicCar.getCost()+"\nParts: "+basicCar.getParts());
        basicCar=new SportsCar(basicCar);
        System.out.println("Basic+Sports car"+"\nCost: "+basicCar.getCost()+"\nParts: "+basicCar.getParts());
        basicCar=new LuxuryCar(basicCar);
        System.out.println("Basic+SPorts+Luxury car"+"\nCost: "+basicCar.getCost()+"\nParts: "+basicCar.getParts());
    }
}
