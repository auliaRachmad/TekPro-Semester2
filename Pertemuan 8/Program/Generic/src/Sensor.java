public interface Sensor<T> {
    String getId();
    SensorData<T> readData();
}