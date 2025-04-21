public class TemperatureSensor implements Sensor<Double> {
    private String id;

    public TemperatureSensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public SensorData<Double> readData() {
        double value = 25.0 + Math.random() * 5; // simulasi
        return new SensorData<>(value, System.currentTimeMillis());
    }
}
