package abstractfactory;

public class PhilipsSensor implements Sensor {
    @Override
    public void readData() {
        System.out.println("[Philips Hue Sensor] Reading temperature and daylight level via Thread.");
    }

    @Override
    public String getProtocol() {
        return "Philips-Matter/Thread";
    }
}