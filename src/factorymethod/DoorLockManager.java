package factorymethod;

public class DoorLockManager extends DeviceManager {
    @Override
    public Device createDevice() {
        return new SmartDoorLock();
    }
}