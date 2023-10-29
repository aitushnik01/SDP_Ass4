import Interfaces.DeviceFactory;
import Interfaces.SmartDevice;

public class KuzetCamera implements SmartDevice {
    public void doSomething() {
        System.out.println("Sir, Kuzet camera is connected");
    }
}
class KuzetFactory implements DeviceFactory {
    public SmartDevice createDevice() {
        return new KuzetCamera();
    }
}