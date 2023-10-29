package observers;

import Interfaces.Observer;
public class XiaomiLight implements Observer {
    public void update(String event) {
        if (event.equalsIgnoreCase("Owner detected")) {
            turnOnLight();
        }
    }

    public void turnOnLight() {
        System.out.println("Sir, Lights Turned On");
    }
}