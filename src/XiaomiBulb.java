import Interfaces.DeviceFactory;
import Interfaces.SmartDevice;
public class XiaomiBulb  implements SmartDevice{
    public void doSomething() {
        System.out.println("Sir, Xiaomi Bulb is connected");
    }
}
class XiaomiFactory implements DeviceFactory {
    public SmartDevice createDevice() {
        return new XiaomiBulb();
    }
}

