package pl.javastart.task;

public class Math {
    public final double pi = 3.1415;

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public double circleField(double r) {
        return pi * r * r;
    }

    public int power(int number) {
        return number * number;
    }
}
