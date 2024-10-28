package flower.store.demo;

public class DHLDeliveryStrategy implements Delivery{
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
        return "Delivered with DHL";
    }
}
