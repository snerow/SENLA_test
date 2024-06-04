package Lab5;

public class Object {
    long volume;
    long value;

    Object(long volume, long value)
    {
        this.volume = volume;
        this.value = value;
    }
    Object() {}

    public void setVolume(long volume) {
        this.volume = volume;
    }
    public void setValue(long value) {
        this.value = value;
    }

    public long getVolume() {
        return volume;
    }
    public long getValue() {
        return value;
    }

    public void printObject()
    {
        System.out.println("\nОбъём:\t\t" + volume + "\nЦенность:\t" + value);
    }
}
