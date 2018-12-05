package Practice6;

public class FactoryDriver {

	public static void main(String[] args){
		ToyInjectionSelecter toyInjectionSelector=new ToyInjectionSelecter();
		InjectionMold injectionMold=toyInjectionSelector.getToyInjection("Plane");
		injectionMold.injectionMold();
	}
}
