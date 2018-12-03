package Practice1;

public class PC extends Computer {

    private String RAM;
    private String HardDisk;
    private String CPU;

    PC(String ram, String hardDisk, String cpu){
        this.RAM=ram;
        this.HardDisk=hardDisk;
        this.CPU=cpu;
    }

    @Override
    public String getRAM(){
        return RAM;
    }

    @Override
    public String getHardDisk(){
        return HardDisk;
    }

    @Override
    public String getCPU(){
        return CPU;
    }


}
