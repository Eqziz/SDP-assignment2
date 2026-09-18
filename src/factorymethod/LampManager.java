package factorymethod;

public class LampManager extends DeviceManager {
    @Override
    public Device createDevice() {
        return new SmartLamp();
    }
}