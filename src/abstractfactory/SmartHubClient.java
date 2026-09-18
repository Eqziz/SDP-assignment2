package abstractfactory;

public class SmartHubClient {
    private final Sensor sensor;
    private final Controller controller;

    public SmartHubClient(SmartHomeFactory factory) {
        this.sensor = factory.createSensor();
        this.controller = factory.createController();
    }

    public void runAutomationRoutine() {
        System.out.println("--- Running Vendor Ecosystem Routine ---");
        sensor.readData();
        controller.syncWith(sensor);
        controller.executeCommand("ACTIVATE_NIGHT_MODE");
        System.out.println("--- Routine Finished ---\n");
    }
}