public class SensorLogger<T, ID> extends BaseLogger<T, ID> {
    public void printLog(ID id) {
        SensorData<T> data = get(id);
        if (data != null) {
            System.out.println("Sensor " + id + ": " + data);
        } else {
            System.out.println("No data for sensor " + id);
        }
    }
}
