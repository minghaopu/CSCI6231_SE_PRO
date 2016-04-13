
public class SimulatorController extends Controller {

	private Database db;
	public WholeSystem wholesystem;
	public SimulatorGUI simulatorgui;

	/**
	 * @param args the command line arguments
	 */

	public SimulatorController(WholeSystem wholesystem){
		this.wholesystem = wholesystem;
		this.simulatorgui = new SimulatorGUI(this);
		db = new Database();
	}
}
