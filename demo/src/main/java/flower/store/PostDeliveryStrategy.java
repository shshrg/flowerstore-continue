package flower.store;

public class PostDeliveryStrategy implements Delivery{
    private String address;

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String DeliveryNotification() {
        return "Delivered with simple Post";
    }
}

