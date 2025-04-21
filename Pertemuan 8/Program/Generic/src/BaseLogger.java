import java.util.HashMap;
import java.util.Map;

public class BaseLogger<T, ID> {
    protected Map<ID, SensorData<T>> log = new HashMap<>();

    public void save(ID id, SensorData<T> data) {
        log.put(id, data);
    }

    public SensorData<T> get(ID id) {
        return log.get(id);
    }
}
