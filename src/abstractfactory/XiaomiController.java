package abstractfactory;

public class XiaomiController implements Controller {
    @Override
    public void executeCommand(String command) {
        System.out.println("[Xiaomi Gateway] Relaying command: '" + command + "' via Mi Home Cloud.");
    }

    @Override
    public void syncWith(Sensor sensor) {
        System.out.println("[Xiaomi Gateway] Paired with sensor using protocol: " + sensor.getProtocol());
    }
}