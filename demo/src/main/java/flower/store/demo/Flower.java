package flower.store.demo;

public class Flower {
    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public double getSepalLength() {
        return this.sepalLength;
    }

    public double getPrice() {
        return this.price;
    }

    public FlowerType getFlowerType() {
        return this.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
