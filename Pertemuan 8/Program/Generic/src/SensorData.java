public class SensorData<T> {
    private T value;
    private long timestamp;

    public SensorData(T value, long timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public T getValue() {
        return value;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] -> " + value;
    }
}
