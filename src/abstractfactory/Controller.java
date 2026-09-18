package abstractfactory;

public interface Controller {
    void executeCommand(String command);
    void syncWith(Sensor sensor);
}