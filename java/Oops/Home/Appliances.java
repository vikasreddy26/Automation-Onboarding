package Oops.Home;

public class Appliances implements Comparable <Appliances>{
    public int fan;
    public int light;
    public int tv;
    public int laptop;

    public Appliances(int fan, int light, int tv, int laptop) {
        this.fan = fan;
        this.laptop = laptop;
        this.tv = tv;
        this.light = light;
    }

    @Override
    public String toString() {
        return "[" +
                "fan=" + fan +
                ", light=" + light +
                ", tv=" + tv +
                ", laptop=" + laptop +
                ']';
    }
    @Override
    public int compareTo(Appliances appliances) {
        return this.tv - appliances.tv;
    }

}
