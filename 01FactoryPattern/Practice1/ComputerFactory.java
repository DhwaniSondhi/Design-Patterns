package Practice1;

public class ComputerFactory {

    public static Computer getComputer(String ram, String hardDisk, String cpu, String typeComputer){
        if(typeComputer.equalsIgnoreCase("PC")){
            return new PC(ram,hardDisk,cpu);
        }else if(typeComputer.equalsIgnoreCase("Server")){
            return new Server(ram,hardDisk,cpu);
        }
        return null;
    }
}
