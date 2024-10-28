package flower.store.demo;
import java.util.List;

public class Order {
    
    private List<Item> items;
    private Delivery delivery;

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }


}
