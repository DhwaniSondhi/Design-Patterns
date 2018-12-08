package Practice3;

public abstract class Toy {

    public abstract String getName();
    public abstract String getLocation();
    public abstract String getPrice();
    void prepare(){
        System.out.println(this.getName()+" is prepared at "+this.getLocation());
    }
    void price(){
        System.out.println(this.getName()+" is priced at "+this.getPrice());
    }
}
