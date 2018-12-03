package Practice3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Helicopter implements Toy {

    @Override
    public void doWork(){
        System.out.println("In Helicopter");
    }
}
