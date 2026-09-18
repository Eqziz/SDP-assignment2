package abstractfactory;

public class XiaomiHomeFactory implements SmartHomeFactory {
    @Override
    public Sensor createSensor() {
        return new XiaomiSensor();
    }

    @Override
    public Controller createController() {
        return new XiaomiController();
    }
}