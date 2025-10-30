package Bai2.Bai3;

public class dongVat {
    private String name;
    private double wieght;
    public dongVat()
    {

    }

    public dongVat(String name, double wieght) {
        this.name = name;
        this.wieght = wieght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }

    @Override
    public String toString() {
        return "dongVat{" +
                "name='" + name + '\'' +
                ", wieght=" + wieght +
                '}';
    }
}
