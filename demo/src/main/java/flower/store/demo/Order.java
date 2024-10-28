package flower.store.demo;
import java.util.List;

public class Order {
    
    private List<Flower> flowers;
    private Delivery delivery;

    public Order(List<Flower> flowers, Delivery delivery) {
        this.flowers = flowers;
        this.delivery = delivery;
    }

    public List<Flower> getItems() {
        return flowers;
    }

    public void setItems(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }


}
