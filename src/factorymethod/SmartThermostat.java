package factorymethod;

public class SmartThermostat implements Device {
    private boolean active = false;

    @Override
    public void turnOn() {
        this.active = true;
        System.out.println("[Thermostat] Climate control active. Target temperature: 22.0°C.");
    }

    @Override
    public void performSelfTest() {
        System.out.println("[Thermostat] Calibrating temp sensor and heating valve... OK.");
    }

    @Override
    public String getStatus() {
        return active ? "Thermostat Active (Holding 22.0°C)" : "Thermostat Standby";
    }
}