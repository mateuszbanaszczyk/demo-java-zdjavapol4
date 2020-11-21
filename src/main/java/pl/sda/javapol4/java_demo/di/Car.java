package pl.sda.javapol4.java_demo.di;

public class Car {

    private Engine engine;
    private String color;

    public Car(Engine engine, String color) {
        this.engine = engine;
        this.color = color;
    }
public Car(){
        engine = new Engine(1_500);
        color = "blue";
}

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", color='" + color + '\'' +
                '}';
    }
}
