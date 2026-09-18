package factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
        DeviceManager lampDeployer = new LampManager();
        lampDeployer.deployDevice();

        DeviceManager climateDeployer = new ThermostatManager();
        climateDeployer.deployDevice();

        DeviceManager securityDeployer = new DoorLockManager();
        securityDeployer.deployDevice();
    }
}