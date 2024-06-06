package Lab5;

public class Object {

    private String name;
    private int volume;
    private int price;

    public Object(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setvolume(int volume) {
        this.volume = volume;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public int getPrice() {
        return price;
    }
}