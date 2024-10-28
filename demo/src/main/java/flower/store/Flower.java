package flower.store;

public class Flower extends Item {
    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }


    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }

    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public double getSepalLength() {
        return this.sepalLength;
    }


    public FlowerType getFlowerType() {
        return this.flowerType;
    }

    public String getColor() {
        return color.toString();
    }
}
