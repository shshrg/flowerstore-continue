package flower.store.demo;

public class Flower extends Item {
    private String name;
    private String color;
    
    public Flower(String somename, String somecolor) {
        name = somename;
        color = somecolor;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
