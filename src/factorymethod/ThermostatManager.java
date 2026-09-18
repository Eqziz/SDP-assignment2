package factorymethod;

public class ThermostatManager extends DeviceManager {
    @Override
    public Device createDevice() {
        return new SmartThermostat();
    }
}