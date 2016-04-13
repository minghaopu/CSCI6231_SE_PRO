
public class SimulatorController extends Controller {
    
    private Database db;
    private SimulatorGUI simulatorgui;
    
    /**
     * @param args the command line arguments
     */
    
    public SimulatorController(SimulatorGUI simulatorgui){
        this.simulatorgui = simulatorgui;
        db = new Database();
    }
}
