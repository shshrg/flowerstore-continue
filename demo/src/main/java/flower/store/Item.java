package flower.store;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Item {
    private String description;

    private Integer price;
    private String name;


    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
