package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private Long id;
    private String name;
    private Double price;
    public Item() {
        this.id=0L;
        this.name="";
    this.price=0.01;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item(Long id, String name, Double price) {
        this.price=price;
        this.name=name;
        this.id=id;

    }


}
