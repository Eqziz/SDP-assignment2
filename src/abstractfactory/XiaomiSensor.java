package abstractfactory;

public class XiaomiSensor implements Sensor {
    @Override
    public void readData() {
        System.out.println("[Xiaomi Sensor] Reading motion and ambient light via Zigbee 3.0");
    }

    @Override
    public String getProtocol() {
        return "Xiaomi-Zigbee";
    }
}