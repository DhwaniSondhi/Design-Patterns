package Practice6;

public class ToyInjectionSelecter {
	
	public InjectionMold getToyInjection(String injectionMold){
		if("Duck".equalsIgnoreCase(injectionMold)) {
			return new DuckInjectionMold();
		}else if("Plane".equalsIgnoreCase(injectionMold)) {
			return new PlaneInjectionMold();
		}
		return null;
	} 
}
