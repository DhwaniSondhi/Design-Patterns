package Practice1;

public class Shelter {
	private String roof;
	private String floor;
	private String structure;
	
	public String getRoof() {
		return this.roof;
	}
	public void setRoof(String roof) {
		this.roof=roof;
	}
	public String getFloor() {
		return this.floor;
	}
	public void setFloor(String floor) {
		this.floor=floor;
	}
	public String getStructure() {
		return this.structure;
	}
	public void setStructure(String structure) {
		this.structure=structure;
	}	
	public String toString() {
		return "Roof: "+this.getRoof()+" Floor: "+this.getFloor()+" Structure: "+this.getStructure();
	}
}
