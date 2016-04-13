
public class WholeSystem {
    public SimulatorController simulatorCtr;
    public MonitorController monitorCtr;
    public Alarm alarm;
    public Sensor sensor;
    
    public WholeSystem() {
        this.simulatorCtr = new SimulatorController(this);
        this.monitorCtr = new MonitorController(this);
        this.alarm = new Alarm();
        this.sensor = new Sensor();
    }
    
    public static void main(String[] args) {
        WholeSystem app = new WholeSystem();
    }
}
