import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimulatorGUI extends javax.swing.JFrame {

	private SimulatorController simulatorcontroller;

	public SimulatorGUI(SimulatorController simulatorcontroller) {
		initComponents();
		setBounds(100, 100, 902, 591);
		this.simulatorcontroller = simulatorcontroller;
		getContentPane().setLayout(null);

		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				OpenMonitorConsole();
			}
		});
		btnExit.setBounds(60, 317, 89, 23);
		getContentPane().add(btnExit);
	}
                   
	private void initComponents() {

	}                 
	public void test(){

	}
	public void OpenMonitorConsole(){
		this.setVisible(false);
		this.simulatorcontroller.wholesystem.monitorCtr.monitorgui.setVisible(true);
	}
}
