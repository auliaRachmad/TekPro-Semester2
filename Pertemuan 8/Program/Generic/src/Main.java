public class Main {
    public static void main(String[] args) {
        Sensor<Double> tempSensor = new TemperatureSensor("T1");
        Sensor<Integer> humSensor = new HumiditySensor("H1");

        SensorLogger<Double, String> tempLogger = new SensorLogger<>();
        SensorLogger<Integer, String> humLogger = new SensorLogger<>();

        // Baca dan simpan data suhu
        SensorData<Double> tempData = tempSensor.readData();
        tempLogger.save(tempSensor.getId(), tempData);

        // Baca dan simpan data kelembaban
        SensorData<Integer> humData = humSensor.readData();
        humLogger.save(humSensor.getId(), humData);

        // Tampilkan log
        tempLogger.printLog("T1");
        humLogger.printLog("H1");
    }
}
