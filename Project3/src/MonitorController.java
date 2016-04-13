
import java.util.logging.Level;
import java.util.logging.Logger;


public class MonitorController extends Controller {

	public MonitorGUI monitorgui;
	public WholeSystem wholesystem;
	private Thread monitorThread;

	public MonitorController(WholeSystem wholesystem) {
		this.wholesystem=wholesystem;
		this.monitorgui = new MonitorGUI(this);
		this.monitorgui.setVisible(true);
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

	private void monitor() throws InterruptedException {
		while (true) {
			System.out.println("37");
			Thread.sleep(1000);
		}
	}
}