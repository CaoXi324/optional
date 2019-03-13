package goods;

import java.util.Optional;

public class Goods {

    private Optional<String> id;
    private Optional<String> name;
    private Optional<Double> price;

    public Goods(String id, String name, Double price) {
        Optional<String> newId = Optional.ofNullable(id);
        Optional<String> newName = Optional.ofNullable(name);
        Optional<Double> newPrice = Optional.ofNullable(price);
        this.id = newId;
        this.name = newName;
        this.price = newPrice;
    }

    public Goods() {
        Optional<String> id = Optional.empty();
        Optional<String> name = Optional.empty();
        Optional<Double> price = Optional.empty();
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public void setName(String name) {
        Optional<String> newName = Optional.ofNullable(name);
        this.name = newName;
    }

    public void setId(String id) {
        Optional<String> newId = Optional.ofNullable(id);
        this.id = newId;
    }

    public void setPrice(double price) {
        Optional<Double> newPrice = Optional.ofNullable(price);
        this.price = newPrice;
    }

    public Optional<String> getId() {
        return id;
    }

    public Optional<Double> getPrice() {
        return price;
    }

    public Optional<String> getName() {
        return name;
    }
}
