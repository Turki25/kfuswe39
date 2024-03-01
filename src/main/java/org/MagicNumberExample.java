package org;

public class MagicNumberExample {

    public double calculateCircleArea(int radius) {
        // Magic number: 3.1415
        return 3.1415 * radius * radius;
    }

    public static void main(String[] args) {
        MagicNumberExample example = new MagicNumberExample();
        double circleArea = example.calculateCircleArea(5);
        System.out.println("Circle Area: " + circleArea);
    }
}
