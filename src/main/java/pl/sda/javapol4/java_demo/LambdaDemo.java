package pl.sda.javapol4.java_demo;

import java.util.stream.Stream;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("From MyRunnable class");
    }
}

abstract class MyClass {
    abstract void m1();

    abstract void m2();
}

interface MyInterface {
    void justDoIt();
}

@FunctionalInterface
interface StringToInt {
    public abstract int nameLength(String name);

    default int nameAndSurnameLength(String name, String surname) {
        return -1;
    }

    ;
}

public class LambdaDemo {

    public static void main(String[] args) {
        Runnable job = new MyRunnable();
        job.run();

        Runnable job3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("From anonymous Runnable");
            }
        };
        job3.run();

        MyClass myClass = new MyClass() {
            @Override
            void m1() {
            }

            @Override
            void m2() {
            }

            ;
        };

        Runnable job2 = () -> {
            System.out.println("hello from runnable lambda!!!");
        };

        MyInterface nike = new MyInterface() {
            @Override
            public void justDoIt() {

            }
        };
        MyInterface nike2 = () -> {
            System.out.println("hello from lambda!!!");
        };

        StringToInt hack = (String s) -> 4;
        StringToInt better = arg -> {
            System.out.println("calculations....");
            return arg.length();
        };
        StringToInt best = arg -> arg.length();
        System.out.println("using best: " + best.nameLength("mariusz"));
        System.out.println("using best: " + best.nameAndSurnameLength("mariusz", "p."));

        Stream<Object> objects = Stream.of("mariusz", "marek", "adrianna", "zenon", "rysiek", "halina", 1, 2);
        Stream<String> names = Stream.of("mariusz", "marek", "adrianna", "zenon", "rysiek", "halina");

//        names
//        1. filter (names.len -> 6)
//        2. sout - names lens
//        3. expmple

        names.filter(string -> string.length() > 6)
                .map(s -> s.length())
                .forEach(integer -> System.out.println("from Stream<String> name len: " + integer));

        objects.filter(o -> o instanceof String)
                .map(o -> (String) o)
                .map(s -> s.length())
                .forEach(integer -> System.out.println("name len: " + integer));
    }

}