import Interfaces.DeviceFactory;
import observers.KuzetAlarm;
import observers.XiaomiLight;
import observers.XiaomiThermostat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartSensor sensor = new SmartSensor();
        XiaomiLight light = new XiaomiLight();
        XiaomiThermostat thermostat = new XiaomiThermostat();
        KuzetAlarm alarm = new KuzetAlarm();

        sensor.addObserver(light);
        sensor.addObserver(thermostat);
        sensor.addObserver(alarm);

        XiaomiFactory XiaomiFactory = new XiaomiFactory();
        DeviceFactory KuzetFactory = new KuzetFactory();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter sensor event ('motion', 'temperature', 'walk in') or 'exit' to quit:");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Smart Home Automation System.");
                break;
            }

            switch (userInput.toLowerCase()) {
                case "motion":
                    sensor.notifyObservers("Motion Detected");
                    break;
                case "temperature":
                    sensor.notifyObservers("Temperature Change Detected");
                    break;
                case "walk in":
                    sensor.notifyObservers("Owner Detected");
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
    }
}
