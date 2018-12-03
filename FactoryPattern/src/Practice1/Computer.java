package Practice1;

public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHardDisk();
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM: "+this.getRAM()+"GB HardDisk: "+this.getHardDisk()+"TB CPU: "+this.getCPU()+"GHz";
    }

}
