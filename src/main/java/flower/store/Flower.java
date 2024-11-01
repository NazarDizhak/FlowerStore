package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public abstract class Flower {
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}
