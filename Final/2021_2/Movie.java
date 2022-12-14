public class Movie implements MovieComponent {
    private String name;
    private int year;
    private double price;
    private String resolution;

    public Movie(String name, int year, double price, String resolution) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.resolution = resolution;
    }

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String toString() {
        return "영화: " + getName() + ", 가격: " + price + " 원, 해상도: " + resolution;
    }
}