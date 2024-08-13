package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 80;
        double BodyMass = service.calculate(weight, height);
        System.out.println("Index mass body" + BodyMass);
    }
}