package observers;

import Interfaces.Observer;
public class KuzetAlarm implements Observer{
    public void update(String event) {
        if(event.equals("Motion Detected")) {
            activeAlarm();
        }
    }

    public void activeAlarm(){
        System.out.println("Sir, Someone at home");
    }
}
