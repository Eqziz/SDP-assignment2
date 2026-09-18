package abstractfactory;

// Abstract Factory
public interface SmartHomeFactory {
    Sensor createSensor();
    Controller createController();
}