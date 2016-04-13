
public class Controller {

    public double temperature;
    public double humidity;
    public double oxygen;
    public double pressure;
    public double etemperature; //external wall temperature
    public double otemperature;  //outside temperature
    public double smoke;       //0 is no smoke, 1 is smoke
    public double gas;         //0 is no gas, 1 is gas


    public double getTemp() {
        return this.temperature;
    }

    public double getHum() {
        return this.humidity;
    }

    public double getOxy() {
        return this.oxygen;
    }

    public double getPressure() {
        return this.pressure;
    }

    public double geteTemp() {
        return this.etemperature;
    }

    public double getoTemp() {
        return this.otemperature;
    }

    public double getSmoke() {
        return this.smoke;
    }

    public double getGas() {
        return this.gas;
    }

    public String getTempStatus() {
        if (72.0 * 1.07 <= this.temperature || this.temperature <= 72.0 * 0.93) {
            return "alarm";
        } else if (72.0 * 1.05 <= this.temperature || this.temperature <= 72.0 * 0.95) {
            return "red";
        } else if (72.0 * 1.02 <= this.temperature || this.temperature <= 72.0 * 0.98) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public String getHumStatus() {
        if (0.45 * 1.07 <= this.humidity || this.humidity <= 0.45 * 0.93) {
            return "alarm";
        } else if (0.45 * 1.05 <= this.humidity || this.humidity <= 0.45 * 0.95) {
            return "red";
        } else if (0.45 * 1.02 <= this.humidity || this.humidity <= 0.45 * 0.98) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public String getOxyStatus() {
        if (0.21 * 1.07 <= this.oxygen || this.oxygen <= 0.21 * 0.93) {
            return "alarm";
        } else if (0.21 * 1.05 <= this.oxygen || this.oxygen <= 0.21 * 0.95) {
            return "red";
        } else if (0.21 * 1.02 <= this.oxygen || this.oxygen <= 0.21 * 0.98) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public String getPreStatus() {
        if (14.5 * 1.07 <= this.pressure || this.pressure <= 14.5 * 0.93) {
            return "alarm";
        } else if (14.5 * 1.05 <= this.pressure || this.pressure <= 14.5 * 0.95) {
            return "red";
        } else if (14.5 * 1.02 <= this.pressure || this.pressure <= 14.5 * 0.98) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public String geteTempStatus() {
        if (28.0 * 1.07 <= this.etemperature || this.etemperature <= 28.0 * 0.93) {
            return "alarm";
        } else if (28.0 * 1.05 <= this.etemperature || this.etemperature <= 28.0 * 0.95) {
            return "red";
        } else if (28.0 * 1.02 <= this.etemperature || this.etemperature <= 28.0 * 0.98) {
            return "yellow";
        } else {
            return "green";
        }
    }

    public String getSmokeStatus() {
        if (smoke == 0){
            return "green";
        }
        else
            return "alarm";
    }

    public String getGasStatus() {
        if (gas == 1){
            return "green";
        }
        else
            return "alarm";
    }
}