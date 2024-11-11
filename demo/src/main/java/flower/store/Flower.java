package flower.store;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Flower extends Item {

    @Id
    private Long id;

    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

}
