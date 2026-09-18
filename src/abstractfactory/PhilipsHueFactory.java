package abstractfactory;

public class PhilipsHueFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new PhilipsSensor();
    }

    @Override
    public Controller createController() {
        return new PhilipsController();
    }
}