package factorymethod;

public class SmartLamp implements Device {
    private boolean enabled = false;

    @Override
    public void turnOn() {
        this.enabled = true;
        System.out.println("[Lamp] Light bulb illuminated with warm white color.");
    }

    @Override
    public void performSelfTest() {
        System.out.println("[Lamp] Checking LED diodes... OK. Brightness set to 100%.");
    }

    @Override
    public String getStatus() {
        return enabled ? "Lamp is ON (5000K)" : "Lamp is OFF";
    }
}