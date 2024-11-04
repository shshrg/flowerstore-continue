package flower.store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Flower extends Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }


    public void setFlowerType(FlowerType flowerType) {
        this.flowerType = flowerType;
    }


    public double getSepalLength() {
        return this.sepalLength;
    }


    public FlowerType getFlowerType() {
        return this.flowerType;
    }

    public String getColor() {
        return color.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
