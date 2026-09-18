package abstractfactory;

public class PhilipsController implements Controller {
    @Override
    public void executeCommand(String command) {
        System.out.println("[Hue Bridge Pro] Executing localized scene command: '" + command + "'.");
    }

    @Override
    public void syncWith(Sensor sensor) {
        System.out.println("[Hue Bridge Pro] Paired with sensor using protocol: " + sensor.getProtocol());
    }
}