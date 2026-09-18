package factorymethod;

// Abstract Creator
public abstract class DeviceManager {

    public abstract Device createDevice();

    public void deployDevice() {
        System.out.println("--- Starting Device Provisioning ---");
        Device device = createDevice();
        device.turnOn();
        device.performSelfTest();
        System.out.println("System Log: " + device.getStatus());
        System.out.println("--- Device Successfully Deployed ---\n");
    }
}