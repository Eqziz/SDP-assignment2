package factorymethod;

// Product Interface
public interface Device {
    void turnOn();
    void performSelfTest();
    String getStatus();
}