
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Database {

    public ArrayList<Map<String, String>> event;
    public Map<String, String> row;

    public Database() {
        event = new ArrayList<Map<String, String>>();
        row = new HashMap<String, String>();
        row.put("c1", "1");
        row.put("c2", "temperature 70 F");
        row.put("c3", "living cell");
        row.put("c4", "70");
        event.add(row);
    }

    public void insert(String eventID, String eventName, String eventLoc, String sensorVal) {
        row.put("c1", eventID);
        row.put("c2", eventName);
        row.put("c3", eventLoc);
        row.put("c4", sensorVal);
        event.add(row);
    }
}