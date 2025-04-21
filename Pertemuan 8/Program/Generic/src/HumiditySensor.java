public class HumiditySensor implements Sensor<Integer> {
    private String id;

    public HumiditySensor(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public SensorData<Integer> readData() {
        int value = 40 + (int)(Math.random() * 20);
        return new SensorData<>(value, System.currentTimeMillis());
    }
}
