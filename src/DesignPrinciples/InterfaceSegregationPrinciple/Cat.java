package DesignPrinciples.InterfaceSegregationPrinciple;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat can Eat Fish");
    }

    // Necessary to
    @Override
    public void fly() {
        System.out.println("Cat can't Fly");
    }
}
