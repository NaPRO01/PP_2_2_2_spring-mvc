package web.models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model S", "White", 280));
        cars.add(new Car("Model X", "Black", 240));
        cars.add(new Car("Model L", "Green", 180));
        cars.add(new Car("Model M", "Yellow", 210));
        cars.add(new Car("Model Y", "Red", 305));
        return cars;
    }

}
