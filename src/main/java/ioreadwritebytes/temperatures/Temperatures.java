package ioreadwritebytes.temperatures;

public class Temperatures {

    private byte[] data;

    public Temperatures(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }

    public double getYearAverage() {
        double sum = 0;
        for (double temp : data) {
            sum = sum + temp;
        }
        double yearAverage = sum / data.length;
        return yearAverage;
    }

    public double getMonthAverage() {
        double sum = 0;
        for (int i = data.length - 30; i < data.length; i++) {
            sum = sum + data[i];
        }
        double monthAverage = sum / 30;
        return monthAverage;
    }
}
