package factorymethod;

public class SmartDoorLock implements Device {
    private boolean locked = true;

    @Override
    public void turnOn() {
        this.locked = false;
        System.out.println("[DoorLock] Biometric scanner ready. Lock engaged in safe mode.");
    }

    @Override
    public void performSelfTest() {
        System.out.println("[DoorLock] Testing deadbolt mechanism and battery level (98%)... OK.");
    }

    @Override
    public String getStatus() {
        return locked ? "Door is LOCKED" : "Door is UNLOCKED";
    }
}