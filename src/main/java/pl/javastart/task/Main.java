package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Math math = new Math();
        boolean even = math.isEven(3);
        System.out.println(even);
        boolean odd = math.isOdd(3);
        System.out.println(odd);
        double circle = math.circleField(3);
        System.out.println(circle);
        int power = math.power(3);
        System.out.println(power);
    }
}
