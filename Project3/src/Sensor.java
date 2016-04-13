
public class Sensor {
    public double temperature;
    public double humidity;
    public double oxygen;
    public double pressure;
    public double etemperature; //external wall temperature
    public double otemperature;  //outside temperature
    public double smoke;       //0 is no smoke, 1 is smoke
    public double gas;         //0 is no gas, 1 is gas
    
    
    public double getValue (String type) {
    	double data = 0.0;
    	switch (type) {
	    	case "temperature":
	    		temperature = 35.0 + Math.random() * 55.0;
	    		data = temperature;
	    		break;
	    	case "humidity":
	    		humidity = 45.0 * (0.9 + Math.random() * 0.2);
	    		data = humidity;
	    		break;
	    	case "oxygen":
	    		oxygen = 21.0 * (0.9 + Math.random() * 0.2);
	    		data = oxygen;
	    		break;
	    	case "pressure":
	    		pressure = 14.5 * (0.9 + Math.random() * 0.2);
	    		data = pressure;
	    		break;
	    	case "etemperature":
	    		etemperature = 28.0 * (0.9 + Math.random() * 0.2);
	    		data = etemperature;
	    		break;
	    	case "otemperature":
	    		otemperature = -243.0 + Math.random() * 311.0;
	    		data = otemperature;
	    		break;
	    	case "smoke":
	    		smoke = Math.random() > 0.5 ? 1.0:0.0;
	    		data = smoke;
	    		break;
	    	case "gas":
	    		gas = Math.random() > 0.5 ? 1.0:0.0;
	    		data = gas;
	    		break;
    	}
    	return data;
    }
}
