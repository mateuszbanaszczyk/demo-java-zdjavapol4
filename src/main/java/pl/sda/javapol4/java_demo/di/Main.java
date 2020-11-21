package pl.sda.javapol4.java_demo.di;

public class Main {
    public static void main(String[] args) {
        Engine small = new Engine(800);
        String color = "pink";

        Car myFavouriteCar = new Car(small, color);


    }
}
