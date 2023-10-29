package observers;

import Interfaces.Observer;
public class XiaomiThermostat implements Observer{
    public void update(String event) {
        if (event.equals("Temperature Change Detected")) {
            adjustTemperature();
        }
    }
    public void adjustTemperature() {
        System.out.println("Sir, Temperature adjusted");
    }
}
