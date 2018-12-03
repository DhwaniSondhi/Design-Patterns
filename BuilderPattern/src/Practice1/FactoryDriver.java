package Practice1;

public class FactoryDriver {

    public static void main(String[] args){
        Computer computer;

        computer=ComputerFactory.getComputer("8","1","2.5", "PC");
        System.out.println(computer.toString());
        computer=ComputerFactory.getComputer("16","2","4.0", "PC");
        System.out.println(computer.toString());

    }
}
