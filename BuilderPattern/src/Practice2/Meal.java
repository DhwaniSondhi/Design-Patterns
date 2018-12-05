package Practice2;
import java.util.ArrayList;

public class Meal {
	ArrayList<Item> items;
	
	Meal(){
		items=new ArrayList<>();
	}
	
	public void addItems(Item item){
		items.add(item);
	}
	
	public int getPrice() {
		int totalPrice=0;
		for(Item item:this.items) {
			totalPrice+=item.getPrice();
		}
		return totalPrice;
	}
	
	public ArrayList<Item> checkItems(){
		return this.items;
	}
	public String toString() {
		String str="Meals: ";
		for(Item item:items) {
			str+=(item.getName()+", ");
		}
		return str;
	}
}
