package HW1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight() {

        double sum = 0.0;

        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public void moveAllToAnotherBox(Box<T> anotherBox) {

        for (T fruit : fruits) {
            anotherBox.add(fruit);
        }
        fruits.clear();
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getBoxWeight() - anotherBox.getBoxWeight()) < 0.0001;
    }

}