
public class Alarm {
	private Boolean isOn = false;
	private String message = "The Alarm is off!";
	
	public String turnOnAlarm () {
		if (isOn == false) {
			isOn = true;
			message = "The Alarm is on!";
		}
		return message;
	}
	
	public String turnOffAlarm () {
		if (isOn == false) {
			isOn = true;
			message = "The Alarm is off!";
		}
		return message;
	}
}
