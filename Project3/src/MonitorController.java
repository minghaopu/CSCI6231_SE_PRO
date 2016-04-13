
import java.util.logging.Level;
import java.util.logging.Logger;


public class MonitorController extends Controller {

	public MonitorGUI monitorgui;
	public WholeSystem wholesystem;
	private Thread monitorThread;

	public MonitorController(WholeSystem wholesystem) {
		this.wholesystem = wholesystem;
		this.monitorgui = new MonitorGUI(this);
	}

	public void awakeMonitor() {
		this.monitorThread = new Thread(new Runnable() {
			public void run() {
				try {
					monitor();
				} catch (InterruptedException ex) {
					Logger.getLogger(MonitorController.class.getName()).log(Level.SEVERE, null, ex);
					System.err.println("stopped");
				}
			}
		});
		monitorThread.start();
	}

	public void stopMonitor() {
		monitorThread.interrupt();
	}
	
	public void updateData (Sensor sensor) {
		temperature = sensor.getValue("temperature");
		humidity = sensor.getValue("humidity");
		oxygen = sensor.getValue("oxygen");
		pressure = sensor.getValue("pressure");
		etemperature = sensor.getValue("etemperature");
		otemperature = sensor.getValue("otemperature");
		smoke = sensor.getValue("smoke");
		gas = sensor.getValue("gas");
	}

	private void monitor() throws InterruptedException {
		while (true) {
			updateData (this.wholesystem.sensor);
			Thread.sleep(1000);
		}
	}
}